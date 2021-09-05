package ch11code;

public class Thread44 {
	public static void main(String[] args) {   		//主方法
					//创建三个对象f1、f2和f3
					Flower f1 = new Flower();
					Flower f2 = new Flower();
					Flower f3 = new Flower();
					//通过私有变量来设置参数值
					f1.name="牡丹";;
					f2.name="玫瑰";
					f3.name="月季";
					f1.color1="红色";
					f2.color1="黄色";
					f3.color1="蓝色";
					f1.location="云南";
					f2.location="北京";;
					f3.location="上海";
					//输出相应信息
					System.out.println(f1.tostring());
					System.out.println(f2.tostring());
					System.out.println(f3.tostring());
				}


}
