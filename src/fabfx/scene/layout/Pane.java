package fabfx.scene.layout;

import fabric.lang.security.Label;

public class Pane extends Region {

	public Pane(Label L, Label M) {
		super(L, M);
	}

	@Override
	public javafx.scene.layout.Pane _impl() {
		return (javafx.scene.layout.Pane) super._impl();
	}

	@Override
	protected void makeImpl() {
		this._impl = new javafx.scene.layout.Pane();
	}

	public static boolean jif$Instanceof(Label l, Label e, Object o) {
		return (o instanceof Pane) && Region.jif$Instanceof(l, e, o);
	}

}