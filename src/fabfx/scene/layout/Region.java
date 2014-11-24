package fabfx.scene.layout;

import fabfx.scene.Parent;
import fabric.lang.security.Label;
import javafx.scene.layout.Pane;

public class Region extends Parent {

    public Region (Label L, Label M) {
	super(L, M, new javafx.scene.layout.Region()); 
	System.out.println("--In Region.java's constructor");
    }

}
