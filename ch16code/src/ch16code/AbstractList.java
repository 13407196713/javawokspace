package ch16code;

import java.util.Iterator;
import java.util.List;

public abstract class AbstractList implements List<Object>{
	public java.util.Iterator iterator(){
		return (Iterator) new Itr();
	}

}
