package fabfx.scene;

import fabfx.Wrapper;
import fabric.lang.security.Label;

public abstract class Node implements Wrapper {

    Label L;
    Label M;

    javafx.scene.Node jnode;

    @Override
    public Object getJavaFXImpl() {
	return this.jnode;
    }

}
