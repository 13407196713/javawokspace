package ch23code;

public class Teacher {
	private String name;                   			
	private String code;
	private String sexy;
	private String birthday;
	private String address;
	private String age;
	private String salary;
	private String major;
	private String duty;
	public Teacher(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public String getname() {
		return name;
	}
	public String getcode() {
		return code;
	}
	public void setsexy(String sexy) {
		this.sexy = sexy;
	}
	public void setbirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setage(String age) {
		this.age = age;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public void setsalary(String salary) {
		this.salary = salary;
	}
	public void setmajor(String major) {
		this.major = major;
	}
	public void setduty(String duty) {
		this.duty = duty;
	}
	public String getsexy() {
		return sexy;
	}
	public String getbirthday() {
		return birthday;
	}
	public String getage() {
		return age;
	}
	public String getaddress() {
		return address;
	}
	public String getsalary() {
		return salary;
	}
	public String getmajor() {
		return major;
	}
	public String getduty() {
		return duty;
	}
}
