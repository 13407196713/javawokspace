package ch11code;

public class Flower {
	private String name;
	private String color1;
	private String location;
	//关于属性的设置器
	public void setname(String name) {
		this.name = name;
	}
	public void setcolor(String color1) {
		this.color1 = color1;
	}
	public void setlocation(String location) {
		this.location = location;
	}
	//关于属性的访问器
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color1;
	}
	public String getlocation() {
		return location;
	}
	public String tostring() {               			//重写tostring()方法
		String information = "花的名称：" + name + ";" + "  " + "花的颜色：" + color1
				+ ";" + "" + "花的出产地：" + location + "  ";
		return information;
	}
}
