package com.scm.javatraining;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <h2> EmployeeController Class</h2>
 * <p>
 * Process for Displaying EmployeeController
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
@Controller
public class EmployeeController
{
    /**
     * <h2> employeeDAO</h2>
     * <p>
     * employeeDAO
     * </p>
     */
    @Autowired
    private EmployeeDAO employeeDAO;

    
    /**
     * <h2> saveEmployee</h2>
     * <p>
     * Save employee
     * </p>
     *
     * @param employee Employee 
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/employee",method=RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute("employee") Employee employee)
    {
        
        ModelAndView model = new ModelAndView();
        if(employee.isDataNull()) {
        	model = this.dataMissing(employee);
        }else {
        	model.setViewName("redirect:/employees");
        	try
            {
            	if(employee.getId() != null) {
            		if(employeeDAO.getEmployeeById(employee.getId()) != null);
                    employeeDAO.updateEmployee(employee);
            	}   
            }
            catch(EmptyResultDataAccessException e)
            {
                System.out.println("inside catch : " + employee);
                if(!employee.isDataNull())
                	employeeDAO.saveEmployee(employee);
            }
        }
        return model;
    }
    
    /**
     * <h2> editEmployee</h2>
     * <p>
     * Edit employee
     * </p>
     *
     * @param employee Employee
     * @param id int
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/edit/{id}")
    public ModelAndView editEmployee(@ModelAttribute("employee") Employee employee,@PathVariable("id") int id)
    {
        ModelAndView model = new ModelAndView("employees");
        
        employee = employeeDAO.getEmployeeById(id);
        List<Employee> employeeList = employeeDAO.getAllEmployees();
        
        model.addObject("employee",employee);        
        model.addObject("employeeList",employeeList);
        
        return model;
    }
    
    /**
     * <h2> deleteEmployee</h2>
     * <p>
     * Delete employee
     * </p>
     *
     * @param employee Employee
     * @param id int
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/delete/{id}")
    public ModelAndView deleteEmployee(@ModelAttribute("employee") Employee employee,@PathVariable("id") int id)
    {
        employeeDAO.deleteEmployee(id);
        
        return new ModelAndView("redirect:/employees");
    }

    /**
     * <h2> listEmployees</h2>
     * <p>
     * List of employee
     * </p>
     *
     * @param employee Employee
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/employees")
    public ModelAndView listEmployees(@ModelAttribute("employee") Employee employee)
    {
        ModelAndView model = new ModelAndView("employees");
        List<Employee> employeeList = employeeDAO.getAllEmployees();
        model.addObject("employeeList", employeeList);
        
        return model;
    }
    /**
     * <h2> dataMissing</h2>
     * <p>
     * Redirect missing data.
     * </p>
     *
     * @param employee Employee
     * @return
     * @return ModelAndView
     */
    public ModelAndView dataMissing(Employee employee) {
    	ModelAndView model = new ModelAndView("employees");
    	List<Employee> employeeList = employeeDAO.getAllEmployees();
        model.addObject("employee", employee);
        model.addObject("employeeList", employeeList);
        HashMap<String, String> map = employeeDAO.getNullData(employee);
        model.addObject("nullData", map);
    	return model;
    }
}