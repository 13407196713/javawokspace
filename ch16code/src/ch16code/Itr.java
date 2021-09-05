package ch16code;

public class Itr  implements Iterator{
	int cursor = 0;
			int lastRet = -1;
			int expectedModCount = modCount;
			public boolean hasNext() {             			//重写方法hasNext()
				return cursor != size();
			}
			public Object next() {                     		//重写方法next()
				checkForComodification();
				try {
					Object next = get(cursor);
					lastRet = cursor++;
					return next;
				} catch (IndexOutOfBoundsException e) {
					checkForComodification();
					throw new NoSuchElementException();
				}
			}
			public void remove() {                            		//重写方法remove()
				if (lastRet == -1)
					throw new IllegalStateException();
				checkForComodification();
				try {
					AbstractList.this.remove(lastRet);
					if (lastRet < cursor)
						cursor--;
					lastRet = -1;
					expectedModCount = modCount;
				} catch (IndexOutOfBoundsException e) {
					throw new ConcurrentModificationException();
				}
			}
			//设计方法checkForComodification()
			final void checkForComodification() { 
				if (modCount!= expectedModCount)
					throw new ConcurrentModificationException();
			}


}
