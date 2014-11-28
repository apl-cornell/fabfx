package fabfx.scene;

import fabfx.Wrapper;
import fabric.lang.security.Label;
import fabric.lang.security.LabelUtil;

public abstract class Node implements Wrapper {

	final public Label L;
	final public Label M;

	public javafx.scene.Node _impl;

	@Override
	public javafx.scene.Node _impl() {
		return this._impl;
	}

	public Node(Label L, Label M) {
		this.L = L;
		this.M = M;
		this.makeImpl();
	}

	/**
	 * This method is supposed to be selectively implemented by subclasses.
	 */
	protected void makeImpl() {
		throw new UnsupportedOperationException();
	}

	public static boolean jif$Instanceof(Label l, Label e, Object o) {
		if (o instanceof Node) {
			Node that = (Node) o;
			return LabelUtil._Impl.equivalentTo(that.L, l)
					&& LabelUtil._Impl.equivalentTo(that.M, e);
		}
		return false;
	}

}
