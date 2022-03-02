package com.scm.javatraining.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;


/**
 * <h2>Student Class</h2>
 * <p>
 * Process for Displaying Student
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
@Entity
@Table(name = "Student")
public class Student implements Serializable {

	/**
	 * <h2>serialVersionUID</h2>
	 * <p>
	 * serialVersionUID
	 * </p>
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <h2>id</h2>
	 * <p>
	 * id
	 * </p>
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(insertable = false)
	private Integer id;
	/**
	 * <h2>name</h2>
	 * <p>
	 * name
	 * </p>
	 */
	@Column
	@Size(min = 4, message = "Name is too short")
	private String name;
	/**
	 * <h2>roll</h2>
	 * <p>
	 * roll
	 * </p>
	 */
	@Column
	@NotBlank(message = "Please enter Roll No.")
	private String roll;
	/**
	 * <h2>age</h2>
	 * <p>
	 * age
	 * </p>
	 */
	@Column
	@NotNull(message="Please enter age.")
	@Range(min = 6,message="Student age must greater than 6.")
	private Integer age;
	/**
	 * <h2>gender</h2>
	 * <p>
	 * gender
	 * </p>
	 */
	@Column
	@NotBlank(message = "Please enter gender.")
	private String gender;

	/**
	 * <h2>getId</h2>
	 * <p>
	 * Get student id.
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
	 * Set student id.
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
	 * Get student name.
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
	 * Set student name.
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
	 * Get student roll no.
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
	 * Set student roll no.
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
	 * Get student age.
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
	 * Set student age.
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
	 * Get gender.
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
	 * @param gender
	 * @return void
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * <h2>isDataNull</h2>
	 * <p>
	 * Check null data.
	 * </p>
	 *
	 * @return
	 * @return boolean
	 */
	public boolean isDataNull() {
		return this.name == "" || this.roll == "" || this.age == null || this.gender == "" ? true : false;
	}
}
