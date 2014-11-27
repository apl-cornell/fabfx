package fabfx.scene;

import fabfx.Wrapper;
import fabric.lang.security.Label;

public abstract class Node implements Wrapper {

	final public Label L;
	final public Label M;

	final public javafx.scene.Node jnode;

	@Override
	public Object _impl() {
		return this.jnode;
	}

	public Node(Label L, Label M, javafx.scene.Node jnode) {
		this.L = L;
		this.M = M;
		this.jnode = jnode;
	}

}
