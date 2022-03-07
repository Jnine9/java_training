package ojt.simpletask.app.web.form;

import javax.validation.constraints.NotBlank;

/**
 * <h2> LoginForm Class</h2>
 * <p>
 * Process for Displaying LoginForm
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class LoginForm {
	
	@NotBlank
	private String username="";
	@NotBlank
	private String password="";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
