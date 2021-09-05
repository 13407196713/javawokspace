package ch11code;

public class AbstractTest {
	public static void main(String[] args) {                    //主方法
		//创建对象s1和s3
		Student1 s1 = new Student1();
		Student3 s3 = new Student3();
		//设置对象s1的相关属性
		s1.setschoolname("重庆大学");
		s1.setclassname("计算机三班");
		s1.setlocation("沙坪坝");
		s1.setstudentname("王浩");
		s1.setstudentcode("95012");
		s1.setstudentsexy("男");
		s1.setstudentbirthday("1976-07-14");
		s1.setstudentaddress("重庆市解放碑");
		//设置对象s3的相关属性
		s3.setschoolname("四川大学");
		s3.setclassname("机械系一班");
		s3.setlocation("成都市");
		s3.setstudentname("董洁");
		s3.setstudentcode("33012");
		s3.setstudentsexy("女");
		s3.setstudentbirthday("1974-08-21");
		s3.setstudentaddress("成都市区");
		//输出对象s1和s3的相关属性
			System.out.println(s1.tostring());
			System.out.println(s3.tostring());
		}

}
