package ojt.simpletask.app.web.controller.student;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ojt.simpletask.app.bl.dto.StudentDTO;
import ojt.simpletask.app.bl.service.student.StudentService;
import ojt.simpletask.app.web.form.StudentForm;

@Controller
public class StudentController {
	/**
	 * <h2>stdService</h2>
	 * <p>
	 * Student service.
	 * </p>
	 */
	@Autowired
	private StudentService studentService;

	/**
	 * <h2>messageSource</h2>
	 * <p>
	 * messageSource
	 * </p>
	 */
	@Autowired
	private MessageSource messageSource;

	/**
	 * <h2>homePage</h2>
	 * <p>
	 * Home page
	 * </p>
	 *
	 * @param std Student
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/students")
	public ModelAndView homePage(@ModelAttribute("student") StudentForm std) {
		ModelAndView model = new ModelAndView("students");
		studentService.setDefaultModelView(model, "add/student");
		return model;
	}

	/**
	 * <h2>addStudent</h2>
	 * <p>
	 * Add new Student
	 * </p>
	 *
	 * @param std Student
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = "add/student", method = RequestMethod.POST)
	public ModelAndView addStudent(@Valid @ModelAttribute("student") StudentForm std, BindingResult binder) {
		ModelAndView model = new ModelAndView();
		if (!binder.hasErrors()) {
			System.out.println("no error");
			model.setViewName("redirect:/students");
			studentService.doAddStudent(std);
		} else {
			System.out.println("error");
			model.addObject("systemMessage", messageSource.getMessage("M_ER_CONFIRM_DENINED", null, null));
			studentService.setDefaultModelView(model, "add/student");
		}
		return model;
	}

	/**
	 * <h2>editStudent</h2>
	 * <p>
	 * Edit student.
	 * </p>
	 *
	 * @param std Student
	 * @param id  Integer
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = "edit/{id}")
	public ModelAndView editStudent(@ModelAttribute("student") StudentForm std, @PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("students");
		if (studentService.doGetSrudentById(id) == null) {
			model.setViewName("students");
			model.addObject("systemMessage", messageSource.getMessage("M_ER_ACCESS_DENINED", null, null));
		} else {
			StudentDTO stdto = studentService.doGetSrudentById(id);
			model.addObject("student", stdto);
			model.addObject("refId", id);
			studentService.setDefaultModelView(model, "edit/student");
		}
		return model;
	}

	/**
	 * <h2>updateEdit</h2>
	 * <p>
	 * Update edit student.
	 * </p>
	 *
	 * @param std    Student
	 * @param binder BindingResult
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = "edit/student", method = RequestMethod.POST)
	public ModelAndView updateEdit(@Valid @ModelAttribute("student") StudentForm std, BindingResult binder) {
		ModelAndView model = new ModelAndView();
		if (!binder.hasErrors()) {
			model.setViewName("redirect:/students");
			studentService.doUpdateStudent(std);
		} else {
			model.addObject("student", std);
			model.addObject("systemMessage", messageSource.getMessage("M_ER_CONFIRM_DENINED", null, null));
			model.addObject("refId", std.getId());
			studentService.setDefaultModelView(model, "edit/student");
		}
		return model;
	}

	/**
	 * <h2>deleteStudent</h2>
	 * <p>
	 * Delete student.
	 * </p>
	 *
	 * @param std Student
	 * @param id  Integer
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = "delete/{id}")
	public ModelAndView deleteStudent(@ModelAttribute("student") StudentForm std, @PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView();
		if (studentService.doGetSrudentById(id) != null) {
			studentService.doDeleteStudent(id);
		}
		model.setViewName("redirect:/students");
		return model;
	}

}
