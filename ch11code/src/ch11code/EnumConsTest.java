package ch11code;

public class EnumConsTest {
	public static void main(String[] args) {          
			WeekDay today = WeekDay.SAT;                              
		}
		public enum WeekDay {                          				
			SUN, MON, TUE, WED, THU, FRI("星期五"), SAT();	
			private WeekDay() {                      				
				System.out.println("没有参数构造函数");
			}
			private WeekDay(String s) {              				
				System.out.println(s + "有参数构造函数");
			}
		}

}
