package ch11code;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException,	InstantiationException, IllegalAccessException {    //主方法
		String s1= "1234";                               //创建一个字符串变量s1
		//获取关于s1和String类的字节码
		Class c1 = s1.getClass();
		Class c2 = String.class;
		Class c3 = Class.forName("java.lang.String");
		//比较字节码是否相同
		System.out.println("-------------------------");
		System.out.println("c1与c2是否是同一个对象"+(c1==c2));
		System.out.println("c1与c3是否是同一个对象"+(c1==c3));
		System.out.println("-------------------------");
		//检测是否为基本类型
		System.out.println("String是否是基本类型"+String.class.isPrimitive());
		System.out.println("int是否是基本类型"+int.class.isPrimitive());
		//检测int和Integer是否指向同一字节码
		System.out.println("int与Integer的字节码是否是同一个对象	"+(int.class==Integer.class));
		System.out.println("int与Integer.TYPE的字节码是否是同一个对象	"+(int.class==Integer.TYPE));
		//关于数组方面的字节码
		System.out.println("-------------------------");
		System.out.println("int[]是否是基本类型"+int[].class.isPrimitive());
		System.out.println("int[]是否是数组类型"+int[].class.isArray());
		
	}

}
