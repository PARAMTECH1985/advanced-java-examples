package com.jts.bean;

public class RegistrationBean {
	public String studentName;
	public String getStudentName() {
		return studentName;
	}
	public RegistrationBean(String studentName, String emailId,
			String mobileNumber) {
		super();
		this.studentName = studentName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String emailId;
	public String mobileNumber;

}
