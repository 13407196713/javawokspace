package ch11code;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
public class ProxyDirectInstan {
	public static void main(String[] args) {
		//通过调用newProxyInstance()方法实例化动态代理类
		Collection proxy1 = (Collection) Proxy.newProxyInstance(Collection.class.getClassLoader(),new Class[] { Collection.class }, new InvocationHandler() {
					@Override           		//重写方法invoke()
		public Object invoke(Object proxy, Method method,
					Object[] args) throws Throwable {
				return null;            //返回null
			}
		});
		System.out.println(proxy1); 			//输出proxy1对象
	}
}
