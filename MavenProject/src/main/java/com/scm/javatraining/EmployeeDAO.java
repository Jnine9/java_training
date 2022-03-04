package com.scm.javatraining;

import java.util.HashMap;
import java.util.List;

/**
 * <h2> EmployeeDAO Class</h2>
 * <p>
 * Process for Displaying EmployeeDAO
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public interface EmployeeDAO
{
    /**
     * <h2> saveEmployee</h2>
     * <p>
     *  Save Employee
     * </p>
     *
     * @param employee Employee
     * @return void
     */
    public void saveEmployee(Employee employee);
    /**
     * <h2> getEmployeeById</h2>
     * <p>
     * Get employee
     * </p>
     *
     * @param id int
     * @return
     * @return Employee
     */
    public Employee getEmployeeById(int id);
    /**
     * <h2> updateEmployee</h2>
     * <p>
     * Update employee
     * </p>
     *
     * @param employee Employee
     * @return void
     */
    public void updateEmployee(Employee employee);
    /**
     * <h2> deleteEmployee</h2>
     * <p>
     * Delete employee
     * </p>
     * 
     * @param id int
     * @return void
     */
    public void deleteEmployee(int id);
    /**
     * <h2> getAllEmployees</h2>
     * <p>
     * Get all employee list
     * </p>
     *
     * @return
     * @return List<Employee>
     */
    public List<Employee> getAllEmployees();
    /**
     * <h2> getNullData</h2>
     * <p>
     * Null of data
     * </p>
     *
     * @return
     * @return List<String>
     */
    public HashMap<String, String> getNullData(Employee employee);
}