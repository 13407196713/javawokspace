package ch11code;
public class Thread42 {
	public static void main(String[] args) {  		//主方法
		//创建三个对象f1、f2和f3
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		Flower f3 = new Flower();
		//设置对象f1
		f1.setname("牡丹");
		f1.setcolor("红色");
		f1.setlocation("云南");
		//设置对象f2
		f2.setname("玫瑰");
		f2.setcolor("黄色");
		f2.setlocation("北京");
		//设置对象f3
		f3.setname("月季");
		f3.setcolor("蓝色");
		f3.setlocation("上海");
		 //输出相应信息
		System.out.println(f1.tostring());
		System.out.println(f2.tostring());
		System.out.println(f3.tostring());
	}
}
