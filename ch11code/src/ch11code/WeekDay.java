package ch11code;

public class WeekDay {
	private WeekDay(){                               //私有构造函数
	}
	//定义关于星期的静态变量
	public final static WeekDay SUN = new WeekDay();          //星期日常量
	public final static WeekDay MON = new WeekDay();         //星期一常量
	public final static WeekDay TUE = new WeekDay();      	//星期二常量
	public final static WeekDay WED = new WeekDay();      	//星期三常量
	public final static WeekDay THU = new WeekDay();      	//星期四常量
	public final static WeekDay FN = new WeekDay();       	//星期五常量
	public final static WeekDay SAT = new WeekDay();     	//星期六常量
	//获取下一天的方法
	public WeekDay nextDay() {
		if (this == SUN) {
			return MON;
		} else if (this == MON) {
			return TUE;
		} else if (this == TUE) {
			return WED;
		} else if (this == WED) {
			return THU;
		} else if (this == THU) {
			return FN;
		} else if (this == FN) {
			return SAT;
		} else {
			return SUN;
		}
	}
	//重载toString()方法
	public String toString(){
		if (this == SUN) {
			return "星期日";
		} else if (this == MON) {
			return "星期一";
		} else if (this == TUE) {
			return "星期二";
		} else if (this == WED) {
			return "星期三";
		} else if (this == THU) {
			return "星期四";
		} else if (this == FN) {
			return "星期五";
		} else {
			return "星期六";
		}
	}

}
