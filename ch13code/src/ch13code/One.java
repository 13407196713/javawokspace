package ch13code;

public class One {
	public static void main(String[] args) throws ServerTimedOutException {
		try {                                                     //捕获异常
			//抛出异常对象
			throw new ServerTimedOutException("Could not connect", 80);
		} catch (ServerTimedOutException e) {	            //处理异常
			System.out.println("异常信息是：" + e.toString());
		}
	}
}
class ServerTimedOutException extends Exception {      /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//定义一个ServerTimedOutException类继承Exception类
	//创建成员变量
	private String reason;
	private int port;
	//创建构造函数
	public ServerTimedOutException(String reason, int port) {
		this.reason = reason;
		this.port = port;
	}
	public String getReason() {       			//关于变量reason的设置器
		return reason;
	}
	public int getPort() {           			//关于变量port的设置器
		return port;
	}
}
