package com.xworkz.jobRegistratiton.entity;

public class JobEntity {
	
	private String name;
	private String email;
	private String phno;
	private String gender;
	private String qualification;
	private String yop;
	private String university;
	private String adress;
	private String skill;
	private String salary;
	private String experience;
	private String idProof;
	
	public JobEntity() {
		System.out.println("created jobEntity const");
	}
	
	
	

	public JobEntity(String name, String email, String phno, String gender, String qualification, String yop,
			String university, String adress, String skill, String salary, String experience, String idProof) {
		super();
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.gender = gender;
		this.qualification = qualification;
		this.yop = yop;
		this.university = university;
		this.adress = adress;
		this.skill = skill;
		this.salary = salary;
		this.experience = experience;
		this.idProof = idProof;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}




	@Override
	public String toString() {
		return "JobEntity [name=" + name + ", email=" + email + ", phno=" + phno + ", gender=" + gender
				+ ", qualification=" + qualification + ", yop=" + yop + ", university=" + university + ", adress="
				+ adress + ", skill=" + skill + ", salary=" + salary + ", experience=" + experience + ", idProof="
				+ idProof + "]";
	}
	
	
	

}
