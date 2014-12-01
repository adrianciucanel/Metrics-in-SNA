package com.fii.taip.msn.ap;

import com.fii.taip.msn.dbmodel.Container;
import com.fii.taip.msn.dbmodel.Iterator;
// Iterator pattern

public class DictionarRepository implements Container {

	public String positiveWords[] = { "good", "super" };
	public String negativeWords[] = { "bad", "stupid" };

	public Iterator getIterator(int flag) {
		if (flag == 0)
			return new NegativeIterator();
		else
			return new PositiveIterator();
	}

	private class NegativeIterator implements Iterator {
		int index;
		
		public boolean hasNext() {
			if (index < negativeWords.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
				return negativeWords[index++];
			}
			return null;
		}

	}

	private class PositiveIterator implements Iterator {
		int index;

		public boolean hasNext() {
			if (index < positiveWords.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
				return positiveWords[index++];
			}
			return null;
		}

	}

    public Iterator getIterator() {
        // TODO Auto-generated method stub
        return null;
    }

}
