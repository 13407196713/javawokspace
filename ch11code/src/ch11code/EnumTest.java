package ch11code;

public class EnumTest {
	public static void main(String[] args) {       //主方法
		WeekDay today = WeekDay.SAT;                      //定义today变量
		System.out.println("今天是"+today);
		System.out.println("今天是"+today.name());
		System.out.println("今天是"+today.ordinal());
		System.out.println("-----------------------");
		System.out.println("今天是"+WeekDay.valueOf("SAT"));
		System.out.println("-----------------------");
		WeekDay[] days=WeekDay.values();            //定义一个数组days
		System.out.println("星期中包含"+days.length+"天");	
		for(WeekDay day:days){                     		     //循环遍历
			System.out.println("星期里包含"+day);
		}
	}
	public enum WeekDay{                            	   //定义了关于星期的枚举
		SUN,MON,TUE,WED,THU,FN ,SAT 
	}

}
