package ch15code;

import java.util.Arrays;

public class File7 {
	public static void main(String[] args)               		//主方法
	  {
	    int[] a=new int[]{2,34,21,11,23,56,65,33,89,90};     	//创建数组对象a
	    Arrays.sort(a);                                         //实现排序功能
	    for(int i=0;i<a.length;i++)                        	    //通过循环进行遍历
	    {
	      System.out.print(a[i]+"  ");
	    }
	    System.out.println("\n56的位置为："+Arrays.binarySearch(a,56));
	    System.out.println("33的位置为："+Arrays.binarySearch(a,33));
	  }


}
