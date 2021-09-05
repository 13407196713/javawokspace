package ch04code;

public class Control2 {

	public static void main(String[] args) {
		int achievement = 85;                   
		if (achievement == 100) {
		System.out.println("奖励一台笔记本电脑");
		} else if ((achievement >= 90) && (achievement < 100)) {
			System.out.println("奖励一个MP4");
		} else if ((achievement >= 80) && (achievement < 90)) {
			System.out.println("奖励一块网卡");
		} else if ((achievement >= 60) && (achievement < 80)) {
			System.out.println("不给予任何奖励");
		} else {
			System.out.println("放假回学校补习");
		}
	}
}
