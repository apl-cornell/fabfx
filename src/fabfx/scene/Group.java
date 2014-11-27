package fabfx.scene;

import javafx.collections.ObservableList;
import fabric.lang.security.Label;

public class Group extends Parent {

	public Group(Label L, Label M) {
		super(L, M);
		this._impl = new javafx.scene.Group();
	}

	public Group fabfx$scene$Group$() {
		return this;
	}

	public Group fetch() {
		return this;
	}

	@Override
	public javafx.scene.Group _impl() {
		return (javafx.scene.Group) this._impl;
	}

	public ObservableList getChildren() {
		return _impl().getChildren();
	}

}
