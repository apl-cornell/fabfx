package fabfx.scene;

import fabfx.Wrapper;
import fabric.lang.security.Label;
import javafx.collections.ObservableList;

public abstract class Group extends Parent {

	public Group (Label L, Label M, javafx.scene.Group jgroup) {
		super(L, M, jgroup);
	}

	@Override
	protected javafx.scene.Group jnode() {
		return (javafx.scene.Group) this.jnode;
	} 

	public ObservableList getChildren() {
		return jnode().getChildren();
	}

} 
