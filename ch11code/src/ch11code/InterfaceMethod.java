package ch11code;
import java.lang.reflect.*;
import java.util.*;
public class InterfaceMethod {
	public static void main(String[] args) throws SecurityException,NoSuchMethodException, IllegalArgumentException,InstantiationException, IllegalAccessException,InvocationTargetException {      //主方法
	    Class<?> proxy1 = Proxy.getProxyClass(Collection.class.getClassLoader(),Collection.class); 					// 获取动态类字节码
	    Constructor constructor = proxy1.getConstructor(InvocationHandler.class);	           //获取相关参数构造函数
	// 关于InvocationHandler类型的类
	    class MyInvocationHander1 implements InvocationHandler {ArrayList target = new ArrayList();  		                //创建ArrayList类型对象
		@Override
		//编写invoke()方法
		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {
			//获取系统的当前时间
			long beginTime = System.currentTimeMillis();
			System.out.println("开始时间" + beginTime);
			//调用target对象的相应方法
			Object ret = method.invoke(target, args);
			//获取系统的当前时间
			long endTime = System.currentTimeMillis();
			System.out.println("结束时间" + endTime);
			return ret;                        //返回ret
		}
	}
	Collection collection = (Collection) constructor
			.newInstance(new MyInvocationHander1());	//实例化动态代理类
	//调用相应方法
	collection.add("124");
	collection.add("123");
	System.out.println("集合中的元素数"+collection.size());

}
}
