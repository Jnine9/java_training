package ojt.simpletask.app.web.form;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * <h2>Student Class</h2>
 * <p>
 * Process for Displaying Student
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class StudentForm {
	/**
	 * <h2>id</h2>
	 * <p>
	 * id
	 * </p>
	 */
	@Column(insertable = false)
	private Integer id;
	/**
	 * <h2>name</h2>
	 * <p>
	 * name
	 * </p>
	 */
	@Size(min = 4, max = 100)
	private String name;
	/**
	 * <h2>roll</h2>
	 * <p>
	 * roll
	 * </p>
	 */

	@NotBlank
	private String roll;
	/**
	 * <h2>age</h2>
	 * <p>
	 * age
	 * </p>
	 */
	@NotNull
	private Integer age;
	/**
	 * <h2>gender</h2>
	 * <p>
	 * gender
	 * </p>
	 */

	@NotBlank
	private String gender;

	/**
	 * <h2>getId</h2>
	 * <p>
	 * Get Id
	 * </p>
	 *
	 * @return
	 * @return Integer
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <h2>setId</h2>
	 * <p>
	 * Set id
	 * </p>
	 *
	 * @param id Integer
	 * @return void
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <h2>getName</h2>
	 * <p>
	 * get Name
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
	 * Set name
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
	 * Get roll number.
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
	 * Set roll number
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
	 * Get age
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
	 * Set age
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
	 * Set gender
	 * </p>
	 *
	 * @param gender String
	 * @return void
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
}
