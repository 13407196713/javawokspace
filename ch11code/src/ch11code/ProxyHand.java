package ch11code;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHand implements InvocationHandler{
	private Object target;         			//目标对象
	private IAdvice advice;     			//拦截方法对象
	public ProxyHand(IAdvice advice) {		//带参构造函数
		super();                                //调用super()方法
		this.advice = advice;                 //参数值赋值给成员变量
	}
	public Object bind(Object target) {	//获取动态代理类的实例对象
		this.target = target;				//对目标对象进行赋值
		//通过Proxy类的静态方法newProxyInstance()获取实例对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}
	@Override
	//实现invoke()方法
	public Object invoke(Object proxy, Method method, Object[] obj)
			throws Throwable {
		advice.beforMethod();     					//调用相应的拦截方法
		Object result = method.invoke(target, obj);	           //调用目标对象的相应方法
		advice.afterMethod();       				      //调用相应的拦截方法
		return result;                               //返回result
	}

}
