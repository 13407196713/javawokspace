package ch06code;

public class Str17 {

	public static void main(String[] args) {
		String str = "administrator";
		String str1 = "administrator";
		if (str.equals(str1)) {
			System.out.println("密码正确，请登录系统");
		} else {
			System.out.println("密码不正确，请重新输入密码");
		}
	}
}
