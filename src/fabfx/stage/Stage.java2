package fabfx.stage;

import fabric.lang.security.Label;
import fabfx.scene.Scene;

public class Stage {

    final Label L;
    final Label M;

    private final javafx.stage.Stage jstage;

    public Stage (Label L, Label M, javafx.stage.Stage jstage) {
		this.L = L;
		this.M = M;
		this.jstage = jstage;
    }

    public void show () {
		jstage.show();
    }

    public void setScene (Label sL, Label sM, Scene s) {
		jstage.setScene((javafx.scene.Scene) s.getJavaFXImpl());
    }

}
