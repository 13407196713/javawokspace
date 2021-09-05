package ch11code;

public class Point {
	private int x;
			public int y;
			public String s1="abababab";
			public String s2="aaaabbbb";
			public Point(int x, int y) {      					//构造函数
				super();
				this.x = x;
				this.y = y;
			}
			public Point(int x, int y, String s1, String s2) {	         //构造函数
				super();
				this.x = x;
				this.y = y;
				this.s1 = s1;
				this.s2 = s2;
			}
			public String toString(){               			  //重写toString()函数
				return "s1的值为"+s1+":"+"s2的值为"+s2;
			}

}
