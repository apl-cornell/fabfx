package fabfx.scene;

import fabfx.Wrapper;
import fabric.lang.security.Label;

public class Scene implements Wrapper {
	final Label L;
	final Label M;

	private javafx.scene.Scene jscene;

	public Scene(Label L, Label M) {
		this.L = L;
		this.M = M;
	}

	public Scene fabfx$scene$Scene$(Label rL, Label rM, Parent root) {
		this.jscene = new javafx.scene.Scene((javafx.scene.Parent) root._impl());
		return this;
	}

	public Scene fabfx$scene$Scene$(Label rL, Label rM, Parent root,
			double width, double height) {
		this.jscene = new javafx.scene.Scene(
				(javafx.scene.Parent) root._impl(), width, height);
		return this;
	}

	@Override
	public javafx.scene.Scene _impl() {
		return this.jscene;
	}

}
