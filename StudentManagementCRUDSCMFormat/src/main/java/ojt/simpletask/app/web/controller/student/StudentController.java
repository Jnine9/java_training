package ojt.simpletask.app.web.controller.student;

import java.util.List;

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
		model.addObject("student", new StudentForm());
		this.setDefaultModelView(model, "add/student");
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
	@RequestMapping(value = "add/student", method = { RequestMethod.POST, RequestMethod.GET})
	public ModelAndView addStudent(@Valid @ModelAttribute("student") StudentForm std, BindingResult binder) {
		ModelAndView model = new ModelAndView();
		if (!binder.hasErrors()) {
			model.addObject("systemMessage", messageSource.getMessage("M_SUCCESS_ADD", null, null));
			model.addObject("changes", "Student <b>"+std.getName()+"</b> has been added in our system.");
			model.setViewName("changes");
			studentService.doAddStudent(std);
		} else {
			model.addObject("systemMessage", messageSource.getMessage("M_ER_CONFIRM_DENINED", null, null));
			this.setDefaultModelView(model, "add/student");
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
		if (studentService.doGetStudentById(id) == null) {
			model.setViewName("changes");
			model.addObject("changes", "Student dosn't match in our system!");
			model.addObject("systemMessage", messageSource.getMessage("M_ER_ACCESS_DENINED", null, null));
		} else {
			StudentDTO stdto = studentService.doGetStudentById(id);
			model.addObject("student", stdto);
			this.setDefaultModelView(model, "edit/student");
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
	@RequestMapping(value = "edit/student", method = { RequestMethod.POST, RequestMethod.GET})
	public ModelAndView updateEdit(@Valid @ModelAttribute("student") StudentForm std, BindingResult binder) {
		ModelAndView model = new ModelAndView();
		if (!binder.hasErrors()) {
			model.addObject("changes", "Student <b>"+std.getName()+"</b> has been updated.");
			model.addObject("systemMessage", messageSource.getMessage("M_SUCCESS_EDIT", null, null));
			model.setViewName("changes");
			studentService.doUpdateStudent(std);
		} else {
			model.addObject("student", std);
			model.addObject("systemMessage", messageSource.getMessage("M_ER_CONFIRM_DENINED", null, null));
			this.setDefaultModelView(model, "edit/student");
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
	@RequestMapping(value = "delete/{id}",method = { RequestMethod.POST, RequestMethod.GET})
	public ModelAndView deleteStudent(@ModelAttribute("student") StudentForm std, @PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView();
		if (studentService.doGetStudentById(id) != null) {
			model.addObject("changes", "Student <b>"+studentService.doGetStudentById(id).getName()+"</b> has been deleted from our system.");
			model.addObject("systemMessage", messageSource.getMessage("M_SUCCESS_DELETE", null, null));
			studentService.doDeleteStudent(id);
		}else {
			model.addObject("changes", "Student donsn't match in our system.");
			model.addObject("systemMessage", messageSource.getMessage("M_ER_ACCESS_DENINED", null, null));
		}
		model.setViewName("changes");
		return model;
	}
	/**
	 * <h2>setDefaultModelView</h2>
	 * <p>
	 * Set default model and view, to view all default list and it's specified
	 * action.
	 * </p>
	 *
	 * @param model  ModelAndView
	 * @param action String
	 * @return void
	 */
	public void setDefaultModelView(ModelAndView model, String action) {
		List<StudentDTO> list = studentService.doGetAllStudent();
		model.addObject("studentList", list);
		model.addObject("action", action);
		model.setViewName("students");
	}
}
