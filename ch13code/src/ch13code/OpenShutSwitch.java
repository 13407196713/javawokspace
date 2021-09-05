package ch13code;
class Switch{
	boolean state = false;
	boolean read(){return state;}
	void open(){state = true;}
	void shut(){state = false;}
}

class OpenShutException1 extends Exception{}
class OpenShutException2 extends Exception{}

//public class OpenShutSwitch {
//	//创建一个静态开关模型对象，该对象在类中可以不通过对象实例而直接调用
//	static Switch sw = new Switch();
//    //创建静态方法f()，该方法抛出两个自定义异常
//	static void f() throws OpenShutException1,OpenShutException2{}
//	public static void main(String[] args){
//    //try区块内代码执行开关模型的打开操作，然后调用方法f()，最后关闭打开资源
//		try{
//			sw.open();
//			f();
//			sw.shut();
//		}
//        //一旦异常OpenShutException1发生，则关闭打开资源
//		catch(OpenShutException1 e1){
//			System.err.println("OpenShutException1");
//			sw.shut();
//		}
//        //一旦异常OpenShutException2发生，也要关闭打开资源
//		catch(OpenShutException2 e2){
//			System.err.println("OpenShutException2");
//			sw.shut();
//		}
//	}
//
//}
public class OpenShutSwitch{
	static Switch sw = new Switch();
	static void f() throws OpenShutException1,OpenShutException2{}
	public static void main(String[] args){
	try{
		sw.open();
		f();
	}catch(OpenShutException1 e1){
		System.err.println("OpenShutException1");
	}catch(OpenShutException2 e2){
		System.err.println("OpenShutException2");
	//将关闭资源操作放在finally子句内，且该子句内的代码总会获得执行
	}finally{
		sw.shut();
	}
}
}
