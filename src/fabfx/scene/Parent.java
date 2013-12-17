package fabfx.scene;

import fabfx.Wrapper;
import fabric.lang.security.Label;

public abstract class Parent extends Node {
    public Parent (Label L, Label M, javafx.scene.Parent jparent) {
	super(L, M, jparent);
    }
} 
