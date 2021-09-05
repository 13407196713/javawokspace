package ch11code;

public class VirualEnumTest {
	public static void main(String[] args) {            //主方法
		WeekDay today = WeekDay.SAT;                           //定义today变量
		System.out.println(today+"的下一天是"+today.nextDay());  //输出今天的下一天
		}

}
