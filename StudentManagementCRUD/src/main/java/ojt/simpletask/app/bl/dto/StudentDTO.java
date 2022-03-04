package ojt.simpletask.app.bl.dto;

import java.io.Serializable;

import ojt.simpletask.app.persistence.entity.Student;

/**
 * <h2>StudentDTO Class</h2>
 * <p>
 * Process for Displaying StudentDTO
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class StudentDTO implements Serializable {
	/**
	 * <h2>serialVersionUID</h2>
	 * <p>
	 * serialVersionUID
	 * </p>
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <h2>Id</h2>
	 * <p>
	 * Id
	 * </p>
	 */
	Integer Id;
	/**
	 * <h2>name</h2>
	 * <p>
	 * name
	 * </p>
	 */
	String name;
	/**
	 * <h2>roll</h2>
	 * <p>
	 * roll
	 * </p>
	 */
	String roll;
	/**
	 * <h2>age</h2>
	 * <p>
	 * age
	 * </p>
	 */
	Integer age;
	/**
	 * <h2>gender</h2>
	 * <p>
	 * gender
	 * </p>
	 */
	String gender;

	/**
	 * <h2>getId</h2>
	 * <p>
	 * Get id.
	 * </p>
	 *
	 * @return
	 * @return Integer
	 */
	public Integer getId() {
		return Id;
	}

	/**
	 * <h2>setId</h2>
	 * <p>
	 * Set Id
	 * </p>
	 *
	 * @param id Integer
	 * @return void
	 */
	public void setId(Integer id) {
		Id = id;
	}

	public StudentDTO(Student std) {
		super();
		this.Id = std.getId();
		this.name = std.getName();
		this.roll = std.getRoll();
		this.age = std.getAge();
		this.gender = std.getGender();
	}

	/**
	 * <h2>getName</h2>
	 * <p>
	 * Get name
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * <h2>setName</h2>
	 * <p>
	 * Set name.
	 * </p>
	 *
	 * @param name String
	 * @return void
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <h2>getRoll</h2>
	 * <p>
	 * Get roll.
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public String getRoll() {
		return roll;
	}

	/**
	 * <h2>setRoll</h2>
	 * <p>
	 * Set roll
	 * </p>
	 *
	 * @param roll String
	 * @return void
	 */
	public void setRoll(String roll) {
		this.roll = roll;
	}

	/**
	 * <h2>getAge</h2>
	 * <p>
	 * Get age.
	 * </p>
	 *
	 * @return
	 * @return Integer
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * <h2>setAge</h2>
	 * <p>
	 * Set age.
	 * </p>
	 *
	 * @param age Integer
	 * @return void
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * <h2>getGender</h2>
	 * <p>
	 * Get gender
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * <h2>setGender</h2>
	 * <p>
	 * Set gender.
	 * </p>
	 *
	 * @param gender String
	 * @return void
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
}
