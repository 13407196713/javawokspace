package ch23code;

public class Leader {
	private String name;             				//关于领导的姓名属性
	private String code;                   			//关于领导的工号属性
	private String sexy;                     		//关于领导的性别属性
	private String birthday;                  		//关于领导的生日属性
	private String address;                  		//关于领导的地址属性
	private String age;                       		//关于领导的年龄属性
	private String salary;                     		//关于领导的薪资属性
	private String major;                       	//关于领导的专业属性
	private String duty;                         	//关于领导的职务属性
	public Leader(String name, String code) {		//构造函数
		this.name = name;
		this.code = code;
	}

	//关于属性的getter和setter方法
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
