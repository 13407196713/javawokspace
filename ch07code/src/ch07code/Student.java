package ch07code;

public class Student {
	String name = "";
			String code = "";
			String sexy = "";
			String duty = "";
			double achievement;
			public Student(String name) {               			 
				this.name = name;                            
			}
			void set(String name, String code, String sexy, String duty) {    
				this.name = name;
				this.code = code;
				this.sexy = sexy;
				this.duty = duty;
			}
			public String getname()                   	      //定义一个getname方法返回姓名
			{
				return name;                                 //返回姓名name
			}
			public String getcode()                    	    //定义一个getcode方法返回学号
			{
				return code;                                 //返回学号code
			}
			public String getsexy()                      	//定义一个getsexy方法返回性别
			{
				return sexy;                                 //返回性别sexy
			}
			public String getduty()                     	 //定义一个getduty方法返回职务
			{
				return duty;                                  //返回职务duty
			}
			public void setachi(double achievement)     	 //定义一个setachi方法设置成绩
			{
				this.achievement = achievement;           //将参数值赋给类中的成员变量
			}
			public double getachi()                 		//定义一个getachi方法返回成绩
			{
				return achievement;                        //返回成绩achievement
			}
			public void print()                   		    //定义一个print方法实现输出方法
			{
				System.out.println("学生" + name + "的成绩是：" + achievement);//输出name和achievement
			}
			public String tostring() {               			   //定义一个tostring方法输出方法
				String infor = "学生姓名：" + name + ";" + "学生学号：" + code + ";" + "学生性别："
						+ sexy + ";" + "学生职务：" + duty;  //定义字符串infor并赋值
				return infor;                              //返回infor的值
			}
			public static void main(String[] args) {  			    //主方法
				//构造出学生对象
				Student st1 = new Student("王浩");
				Student st2 = new Student("李敏");
				Student st3 = new Student("李杰");
				Student st4 = new Student("王杰");
				Student st5 = new Student("王超");
			    Student st6 = new Student("赵浩");
				Student st7 = new Student("钱浩");
				Student st8 = new Student("王松");
				Student st9 = new Student("朱涛");
				Student st10 = new Student("张杰");
				Student st11 = new Student("王敏");
				Student st12 = new Student("孙洁");
				Student st13 = new Student("赵丽");
				Student st14 = new Student("王丽");
				Student st15 = new Student("钱珍");
				Student st16 = new Student("王珍");
				Student st17 = new Student("王萍");
				Student st18 = new Student("钱萍");
				Student st19 = new Student("王燕");
				Student st20 = new Student("赵燕");
				Student st21 = new Student("孙燕");
				Student st22 = new Student("孙丽");
				Student st23 = new Student("林丽");
				Student st24 = new Student("张丽");
				Student st25 = new Student("郑丽");
				//构造一个学生类的对象数组，将所有的对象放到数组内
				Student[] st = new Student[] { st1, st2, st3, st4, st5, st6, st7, st8,
						st9, st10, st11, st12, st13, st14, st15, st16, st17, st18,
						st19, st20, st21, st22, st23, st24, st25 };
				//通过设置器对几个对象进行赋值
				st1.set("王浩", "1", "男", "班员");
				st2.set("李敏", "2", "男", "班员");
				st3.set("李杰", "3", "男", "班员");
				st4.set("王杰", "4", "男", "班员");
				st5.set("王超", "5", "男", "班员");
				st6.set("赵浩", "6", "男", "班员");
				st7.set("钱浩", "7", "男", "班员");
				st8.set("王松", "8", "男", "班员");
				st9.set("朱涛", "9", "男", "班员");
				st10.set("张杰", "10", "男", "班长");
				st11.set("王敏", "11", "女", "班员");
				st12.set("孙洁", "12", "女", "班员");
				st13.set("赵丽", "13", "女", "班员");
				st14.set("王丽", "14", "女", "班员");
				st15.set("钱珍", "15", "女", "班员");
				st16.set("王珍", "16", "女", "班员");
				st17.set("王萍", "17", "女", "班员");
				st18.set("钱萍", "18", "女", "班员");
				st19.set("王燕", "19", "女", "班员");
				st20.set("赵燕", "20", "女", "班员");
				st21.set("孙燕", "21", "女", "班员");
				st22.set("孙丽", "22", "女", "班员");
				st23.set("林丽", "23", "女", "班员");
			    st24.set("张丽", "24", "女", "班员");
				st25.set("郑丽", "25", "女", "班员");
			    System.out.println(st1.tostring());
	  		    System.out.println(st2.tostring());
	      		System.out.println(st3.tostring());
				System.out.println(st4.tostring());
				System.out.println(st5.tostring());
			    System.out.println(st6.tostring());
				System.out.println(st7.tostring());
				System.out.println(st8.tostring());
				System.out.println(st9.tostring());
			    System.out.println(st10.tostring());
			    System.out.println(st11.tostring());
				System.out.println(st12.tostring());
				System.out.println(st13.tostring());
				System.out.println(st14.tostring());
				System.out.println(st15.tostring());
				System.out.println(st16.tostring());
				System.out.println(st17.tostring());
				System.out.println(st18.tostring());
				System.out.println(st19.tostring());
				System.out.println(st20.tostring());
				System.out.println(st21.tostring());
				System.out.println(st22.tostring());
				System.out.println(st23.tostring());
				System.out.println(st24.tostring());
				System.out.println(st25.tostring());
				//通过设置器给几个对象进行赋值
				st1.setachi(87.5);
				st2.setachi(98);
				st3.setachi(78);
				st4.setachi(90);
				st5.setachi(84);
				st6.setachi(78);
				st7.setachi(91);
				st8.setachi(99.5);
				st9.setachi(64);
				st10.setachi(100);
				st11.setachi(98);
				st12.setachi(76);
				st13.setachi(88);
				st14.setachi(64);
				st15.setachi(97);
				st16.setachi(68);
				st17.setachi(90);
				st18.setachi(99);
				st19.setachi(77);
				st20.setachi(78);
				st21.setachi(67);
				st22.setachi(99);
				st23.setachi(97.5);
				st24.setachi(92);
				st25.setachi(88);
				st1.print();
				st2.print();
			    st3.print();
			 	st4.print();
				st5.print();
				st6.print();
				st7.print();
				st8.print();
				st9.print();
				st10.print();
				st11.print();
				st12.print();
				st13.print();
				st14.print();
				st15.print();
				st16.print();
				st17.print();
			    st18.print();
				st19.print();
				st20.print();
				st21.print();
				st22.print();
				st23.print();
				st24.print();
				st25.print();
						//通过循环语句对数组元素进行排序
				for (int i = 0; i < st.length; i++) {
					for (int j = 0; j < st.length; j++) {
	 				// 通过比较两个元素的大小，如果前面比后面元素大的话，那么进行排序
	 				   if (st[i].achievement < st[j].achievement) {
							Student x;
						x = st[j];
							st[j] = st[i];
							st[i] = x;
						}
					}
				}
						//输出相应信息
				System.out.println("成绩最好的是：" + st[24].name + ",成绩是："
						+ st[24].achievement);
				         //输出相应信息
				System.out.println("成绩最差的是：" + st[0].name + ",成绩是：" + st[0].achievement);
			}

}
