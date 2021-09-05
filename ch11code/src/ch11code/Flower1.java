package ch11code;

public class Flower1 {
	private String name;
			private String color1;
			private String location;
			//通过设置器来设置花对象的属性
			public void setname(String name) {
				this.name = name;
			}
			public void setcolor(String color1) {
				this.color1 = color1;
			}
			public void setlocation(String location) {
				this.location = location;
			}
			//通过访问器来获得花对象的属性
			public String getname() {
				return name;
			}
			public String getcolor() {
				return color1;
			}
			public String getlocation() {
				return location;
			}
			private void print() {               				//创建输出方法
				System.out.println("这个就是" + name);
			}
			public String tostring() {            			//重写方法tostring()
				String information = "花的名称：" + name + ";" + "  " + "花的颜色：" + color1
						+ ";" + "" + "花的出产地：" + location + "  ";
				print();                            			//调用方法print()
				return information;
			}


}
