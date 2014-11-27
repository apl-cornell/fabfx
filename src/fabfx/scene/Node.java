package fabfx.scene;

import fabfx.Wrapper;
import fabric.lang.security.Label;

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

	public fabric.worker.Store $getStore() {
		return fabric.worker.Worker.getWorker().getLocalStore();
	}

	/**
	 * This method is supposed to be selectively implemented by subclasses.
	 */
	protected void makeImpl() {
		throw new UnsupportedOperationException();
	}

}
