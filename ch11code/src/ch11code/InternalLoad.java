package ch11code;

public class InternalLoad {
	public static void main(String[] args) {        //主方法
		System.out.println("----------------------");
		// InternalLoad类加载器的名字
		System.out.println("InternalLoad类加载器的名字:"
				+ InternalLoad.class.getClassLoader().getClass().getName());
		System.out.println("----------------------");
		// System类加载器的名字
		System.out.println("System类加载器的名字:" + System.class.getClassLoader());
		// 获取InternalLoad类加载器
		ClassLoader load = InternalLoad.class.getClassLoader();
		System.out.println("----------------------");
		//遍历InternalLoad类加载器
		while (load != null) {
			System.out.println(load.getClass().getName());
			load = load.getParent();
		}
		System.out.println(load);
	}

}
