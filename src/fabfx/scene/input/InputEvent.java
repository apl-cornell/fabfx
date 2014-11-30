package fabfx.scene.input;

import fabfx.event.Event;
import fabric.lang.security.Label;

public class InputEvent extends Event {

	public InputEvent(Label m) {
		super(m);
	}

	@Override
	public javafx.scene.input.InputEvent _impl() {
		return (javafx.scene.input.InputEvent) super._impl();
	}

	public static boolean jif$Instanceof(Label m, Object o) {
		return (o instanceof InputEvent) && Event.jif$Instanceof(m, o);
	}

}
