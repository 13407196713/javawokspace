package ch10code;

public class SchoolTest12 {
	public static void main(String[] args) {            //主方法
					//从学生类中创建出几个对象
					Student2 st1 = new Student2();
					Student2 st2 = new Student2();
					//从教师类中创建出几个对象
					Teacher2 te1 = new Teacher2();
					Teacher2 te2 = new Teacher2();
					//通过设置器设置对象st1各个参数
					st1.setschoolname("重庆大学");
					st1.setclassname("计算机二班");
					st1.setname("王浩");
					st1.setcode("951034");
					st1.setsexy("男");
					st1.setbirthday("1975-07-21");
					st1.setfamilyaddress("上海市浦东新区");
					//通过设置器设置对象st2各个参数
					st2.setschoolname("重庆大学");
					st2.setclassname("计算机三班");
					st2.setname("赵丽");
					st2.setcode("951068");
					st2.setsexy("女");
					st2.setbirthday("1975-10-09");
					st2.setfamilyaddress("北京海淀区");
					//通过设置器设置对象te1各个参数
					te1.setschoolname("四川大学");
					te1.setclassname("计算机二班");
					te1.setname("孙敏");
					te1.setcode("00123");
					te1.setsexy("女");
					te1.setbirthday("1968-04-20");
					te1.setfamilyaddress("重庆市沙坪坝区");
					//通过设置器设置对象te2各个参数
					te2.setschoolname("四川大学");
					te2.setclassname("机械系三班");
					te2.setname("赵为民");
					te2.setcode("11233");
					te2.setsexy("男");
					te2.setbirthday("1961-02-13");
					te2.setfamilyaddress("成都市区");
					//以字符串形式输出这些对象的字符串
					System.out.println(st1.tostring());
					System.out.println(st2.tostring());
					System.out.println(te1.tostring());
					System.out.println(te2.tostring());
				}

}
