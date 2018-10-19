package domain;

import javax.servlet.http.HttpServletRequest;

public class ConferenceApplication {
	private String name;
	private String surname;
	private String email;
	private String employment;
	private String advertisment;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmployment() {
		return employment;
	}
	public void setEmployment(String employment) {
		this.employment = employment;
	}
	public String getAdvertisment() {
		return advertisment;
	}
	public void setAdvertisment(String advertisment) {
		this.advertisment = advertisment;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
