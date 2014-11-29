package fabricated.util;

import fabric.lang.security.Label;

public class ArrayList implements List {

	final protected Label L;

	public ArrayList(Label L) {
		this.L = L;
		makeImpl();
	}

	protected void makeImpl() {
		this._impl = new java.util.ArrayList<>();
	}

	protected java.util.ArrayList<Object> _impl;

	public java.util.ArrayList<Object> _impl() {
		return this._impl;
	}

	@Override
	public Object get(int i) {
		return _impl().get(i);
	}

	@Override
	public boolean add(Object o) {
		return _impl().add(o);
	}

	@Override
	public boolean isEmpty() {
		return _impl().isEmpty();
	}

}
