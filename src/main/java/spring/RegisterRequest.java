package spring;

import org.springframework.beans.factory.annotation.Autowired;

public class RegisterRequest {
	private String name;
	private String password;
	private String confirmPassword;
	private String email;
	
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	@Autowired
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	@Autowired
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getEmail() {
		return email;
	}
	@Autowired
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isPasswordEqualToConfirmPassword(){
		return password.equals(confirmPassword);
	}
}
