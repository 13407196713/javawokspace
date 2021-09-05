package ch11code;

public class AdviceImp implements IAdvice{
	@Override
	public void afterMethod() {              			//实现afterbeforMethod()方法
		System.out.println("before....");
	}
	@Override
	public void beforMethod() {            			//实现beforafterMethod()方法
		System.out.println("after....");
	}
}
