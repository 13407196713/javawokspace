package ch17code;

import java.util.HashSet;
import java.util.LinkedList;

public class Test4{
	 public static void main(String[] args)                           //主方法
	 	    {
	 	        long time=0;
		        HashSet<Integer> hs=new HashSet<Integer>();           //创建HashSet对象hs
	 	        LinkedList<Integer> ll=new LinkedList<Integer>();     //创建LinkedList对象ll
	 	        long starttime=System.currentTimeMillis();	          //获取当前时间
		        for(int i=0;i<10000;i++)                 		      //循环
	 	        {
		            hs.add(new Integer(i));                	//添加整数到对象hs
	 	        }
	 	        System.out.println(System.currentTimeMillis()-starttime);
	 	        for(int i=0;i<10000;i++)                    		//循环
	 	        {
	 	            ll.add(new Integer(i));                  //添加整数到对象ll
	 	        }
	 	        System.out.println(System.currentTimeMillis()-starttime);   
	 	    }


}
