package ch11code;

public class Thread45 {
	public static void main(String[] args) { 			     //主方法
					//创建三个对象f1、f2和f3
					Flower1 f1 = new Flower1();
					Flower1 f2 = new Flower1();
					Flower1 f3 = new Flower1();
					//通过设置器来设置参数值
					f1.setname("牡丹");
					f1.setcolor("红色");
					f1.setlocation("云南");
					f2.setname("玫瑰");
					f2.setcolor("黄色");
					f2.setlocation("北京");
					f3.setname("月季");
					f3.setcolor("蓝色");
					f3.setlocation("上海");
					//输出相应信息
					System.out.println(f1.tostring());
					System.out.println(f2.tostring());
					System.out.println(f3.tostring());
				}


}
