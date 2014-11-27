package fabfx.scene;

import fabfx.Wrapper;
import fabric.lang.security.Label;
import fabric.worker.Store;

public abstract class Node implements Wrapper {

	final public Label L;
	final public Label M;

	public javafx.scene.Node _impl;

	@Override
	public Object _impl() {
		return this._impl;
	}

	public Node(Label L, Label M) {
		this.L = L;
		this.M = M;
	}

	public fabric.worker.Store $getStore() {
		return fabric.worker.Worker.getWorker().getLocalStore();
	}

}
