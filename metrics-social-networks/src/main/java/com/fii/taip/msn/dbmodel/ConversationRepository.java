package com.fii.taip.msn.dbmodel;

public class ConversationRepository implements Container {

	public Conversation conversations[];
	
	public String username;

	public Iterator getIterator() {
		return new ConversationIterator();
	}

	private class ConversationIterator implements Iterator {

		int index;

		public boolean hasNext() {
			if (index < conversations.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
				return conversations[index++];
			}
			return null;
		}
	}

}
