package fabfx.scene;

import fabric.lang.security.Label;

public abstract class Parent extends Node {

	public Parent(Label L, Label M) {
		super(L, M);
	}

	public static boolean jif$Instanceof(Label l, Label e, Object o) {
		return (o instanceof Parent) && Node.jif$Instanceof(l, e, o);
	}

}
