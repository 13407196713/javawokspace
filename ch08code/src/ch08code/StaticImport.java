package ch08code;
import static com.cjg.StaticImport.StaticClass.*;                //导入StaticClass类中的所有内容
import static java.lang.Math.abs;   
 class StaticImport {
	public static void main(String[] args) {
		System.out.println(MAX12);      	                 //调用StaticClass类下的静态变量MAX12
		daying(5);                        		             //调用StaticClass类下的静态方法daying
		System.out.println(abs(-4));
	}

}
