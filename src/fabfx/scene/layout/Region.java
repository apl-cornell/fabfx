package fabfx.scene.layout;

import fabfx.scene.Parent;
import fabric.lang.security.Label;
import javafx.scene.layout.Pane;

public class Region extends Parent {

    public Region (Label L, Label M) {
		super(L, M, null);//new javafx.scene.layout.Region()); 
		Pane p = new Pane();
    }

}
