package ch11code;

public class Student3  extends Student2{
	void setlocation(String location) {
		this.location = location;
	}
	String getlocation() {
		return location;
	}
	//重写tostring()方法
	public String tostring() {
		String infor = super.tostring() + ";" + "  "+ "学校地址：" + location;
		return infor;          //返回infor的内容
	}

}
