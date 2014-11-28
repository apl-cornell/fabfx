package fabfx.collections;

import fabfx.Wrapper;
import fabfx.scene.Node;
import fabric.lang.security.Label;

public class ObservableList implements Wrapper {
	final Label L;
	final Label M;

	private javafx.collections.ObservableList jlist;

	// TODO
	public ObservableList(Label L, Label M) {
		this.L = L;
		this.M = M;
	}

	public void makeImpl(javafx.collections.ObservableList jlist) {
		this.jlist = jlist;
	}

	public boolean add(Label cL, Label cM, Node node) {
		return jlist.add(node._impl());
	}

	@Override
	public javafx.collections.ObservableList _impl() {
		return this.jlist;
	}

//	public fabric.worker.Store $getStore() {
//		return fabric.worker.Worker.getWorker().getLocalStore();
//	}

	public ObservableList fetch() {
		return this;
	}
}
