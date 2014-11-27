package fabfx.scene;

import fabfx.Wrapper;
import fabric.lang.security.Label;

public class Scene implements Wrapper {
	final Label L;
	final Label M;

	private final javafx.scene.Scene jscene;

	public Scene(Label L, Label M, Label rL, Label rM, Parent root) {
		this.L = L;
		this.M = M;
		this.jscene = new javafx.scene.Scene((javafx.scene.Parent) root._impl());
	}

	public Scene(Label L, Label M, Label rL, Label rM, Parent root,
			double width, double height) {
		this.L = L;
		this.M = M;
		this.jscene = new javafx.scene.Scene(
				(javafx.scene.Parent) root._impl(), width, height);
	}

	@Override
	public Object _impl() {
		return this.jscene;
	}

}
