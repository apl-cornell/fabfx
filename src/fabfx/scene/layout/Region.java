package fabfx.scene.layout;

import fabfx.scene.Parent;
import fabric.lang.security.Label;

public class Region extends Parent {

	public Region(Label L, Label M) {
		super(L, M);
	}

	@Override
	protected void makeImpl() {
		this._impl = new javafx.scene.layout.Region();
	}

	public static boolean jif$Instanceof(Label l, Label e, Object o) {
		return (o instanceof Region) && Parent.jif$Instanceof(l, e, o);
	}

}
