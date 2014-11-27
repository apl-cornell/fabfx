package fabfx.scene.layout;

import fabric.lang.security.Label;

public class Pane extends Region {

	public Pane(Label L, Label M) {
		super(L, M);
	}

	public Pane fabfx$scene$layout$Pane$() {
		return this;
	}

	@Override
	public javafx.scene.layout.Pane _impl() {
		return (javafx.scene.layout.Pane) super._impl();
	}

	@Override
	protected void makeImpl() {
		this._impl = new javafx.scene.layout.Pane();
	}
}