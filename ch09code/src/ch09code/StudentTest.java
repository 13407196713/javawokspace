package ch09code;

public class StudentTest {
	public static void main(String[] args) {  
					StudentClass sc = new StudentClass();
					StudentMen sm = new StudentMen();
					StudentClass sc1 = new StudentMen();
					//通过set设置器来设置3个对象的参数
					sc.set("王浩", "1", "男");
					sc.set(90.5);
					sm.set("张杰", "2", "男");
					sm.set(99.0);
					sm.set("班长");
					//通过toString方法来让3个对象以字符串形式输出
					System.out.println(sc.toString());
					System.out.println(sm.toString());
					//修改对象sc1的相应属性
					sc1.set("赵丽", "3", "女");
					sc1.set(100);
					//sc1.set("学习委员");
					System.out.println(sc1.toString());//通过toString方法来让对象以字符串形式输出
				}

}
