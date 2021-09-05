package ch21code;

public class Student1 {
	private String trname1;        					
	private String trcode1;     					
	private String trsexy1;       					
	private String trmajor1;     					
	private String trbirthday1;   					
    private String traddress1;      				
	public Student1(String name, String code) {		
		trname1 = name;
		trcode1 = code;
	}
	public String getteachername() {
		return trname1;
}
	public String getteachercode() {
		return trcode1;
	}
	public String getteachersex() {
		return trsexy1;
	}
public String getteachermajor() {
		return trmajor1;
	}
	public String getteacherbirthday() {
		return trbirthday1;
	}
	public String getteacheraddress() {
		return traddress1;
	}
	public void setteachermajor(String major) {
		trmajor1 = major;
	}
	public void setteachersex(String sexy) {
		trsexy1 = sexy;
	}
	public void setteacherbirthday(String birthday) {
		trbirthday1 = birthday;
	}
	public void setteacheraddress(String address) {
		traddress1 = address;
	}
	public String toString() {     					//重写toString()方法
		String information = "学生姓名：" + trname1 + "学号：" + trcode1 + "性别："
				+ trsexy1 + "出生年月：" + trbirthday1 + "专业：" + trmajor1 + "\n";
		return information;
	}

}
