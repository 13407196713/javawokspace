package ch11code;

abstract class School {
	String schoolname;
	String classname;
	String location;
	//通过设置器来设置学校名称、班级名称
	public void setschoolname(String schoolname) 
	{
		this.schoolname = schoolname;
	}
	public void setclassname(String classname) {
		this.classname = classname;
	}
	//通过设置器来设置学校名称、班级名称
	public String getschoolname() {
		return schoolname;
	}
	public String getclassname() {
		return classname;
	}
	//设计抽象方法
	abstract void setlocation(String location);
	abstract String getlocation();
	//重写tostring()方法
	public String tostring() {
		String infor = "学校名称：" + schoolname + ";" + "  " + "班级名称：" + classname+ ";" + "  ";
		return infor;            //返回infor的内容
	}

}
