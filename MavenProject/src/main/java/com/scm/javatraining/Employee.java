package com.scm.javatraining;
import java.io.Serializable;

/**
 * <h2> Employee Class</h2>
 * <p>
 * Process for Displaying Employee
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Employee implements Serializable 
{
    /**
     * <h2> serialVersionUID</h2>
     * <p>
     * serialVersionUID
     * </p>
     */
    private static final long serialVersionUID = -1280037900360314186L;
    /**
     * <h2> id</h2>
     * <p>
     * id
     * </p>
     */
    private Integer id;
    /**
     * <h2> name</h2>
     * <p>
     * name
     * </p>
     */
    private String name;
    /**
     * <h2> age</h2>
     * <p>
     * age
     * </p>
     */
    private Integer age;
    /**
     * <h2> dept</h2>
     * <p>
     * department
     * </p>
     */
    private String dept;
    /**
     * <h2> Constructor for Employee </h2>
     * <p>
     * Constructor for Employee
     * </p>
     */
    public Employee()
    {
        super();
    }
    /**
     * <h2> Constructor for Employee </h2>
     * <p>
     * Constructor for Employee
     * </p>
     * @param id Integer
     * @param name String
     * @param age Integer
     * @param dept String
     */
    public Employee(Integer id, String name, Integer age, String dept)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    /**
     * <h2> getId</h2>
     * <p>
     * Get Id
     * </p>
     *
     * @return
     * @return Integer
     */
    public Integer getId()
    {
        return id;
    }
    /**
     * <h2> setId</h2>
     * <p>
     * Set Id
     * </p>
     *
     * @param id Integer
     * @return void
     */
    public void setId(Integer id)
    {
        this.id = id;
    }
    /**
     * <h2> getName</h2>
     * <p>
     * Get Name
     * </p>
     *
     * @return
     * @return String
     */
    public String getName()
    {
        return name;
    }
    /**
     * <h2> setName</h2>
     * <p>
     * Set Name
     * </p>
     *
     * @param name String
     * @return void
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * <h2> getAge</h2>
     * <p>
     * Get Age
     * </p>
     *
     * @return
     * @return Integer
     */
    public Integer getAge()
    {
        return age;
    }
    /**
     * <h2> setAge</h2>
     * <p>
     * Set Age
     * </p>
     *
     * @param age String
     * @return void
     */
    public void setAge(Integer age)
    {
        this.age = age;
    }
    /**
     * <h2> getDept</h2>
     * <p>
     * Get department
     * </p>
     *
     * @return
     * @return String
     */
    public String getDept()
    {
        return dept;
    }
    /**
     * <h2> setDept</h2>
     * <p>
     * Set Department
     * </p>
     *
     * @param dept String
     * @return void
     */
    public void setDept(String dept)
    {
        this.dept = dept;
    }
    /**
     * <h2> isDataNull</h2>
     * <p>
     * Check data.
     * </p>
     *
     * @return
     * @return boolean
     */
    public boolean isDataNull() {
    	boolean data = false;
    	data = this.getId() == null || 
    			this.getName() == "" || 
    			this.getAge() == null || 
    			this.getDept() == ""? true : false;
    	return data;
    }
    /**
     * <h2> hashCode </h2>
     * <p>
     * Hash code.
     * </p>
     * 
     * @return
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        result = prime * result + ((dept == null) ? 0 : dept.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    /**
     * <h2> equals </h2>
     * <p>
     * Equals
     * </p>
     * 
     * @param obj Object
     * @return
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (age == null)
        {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
        if (dept == null)
        {
            if (other.dept != null)
                return false;
        } else if (!dept.equals(other.dept))
            return false;
        if (id == null)
        {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null)
        {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    /**
     * <h2> toString </h2>
     * <p>
     * Convert employee data to String 
     * </p>
     * 
     * @return
     */
    @Override
    public String toString()
    {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
    }
}
