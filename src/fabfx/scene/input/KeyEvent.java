package fabfx.scene.input;

import javafx.event.EventType;
import javafx.scene.input.KeyCode;
import fabric.lang.security.Label;

public class KeyEvent extends InputEvent {

	public KeyEvent(Label M, javafx.scene.input.KeyEvent e) {
		super(M, e);
	}

	@Override
	public javafx.scene.input.KeyEvent _impl() {
		return (javafx.scene.input.KeyEvent) super._impl();
	}

	public static boolean jif$Instanceof(Label M, Object o) {
		return (o instanceof KeyEvent) && InputEvent.jif$Instanceof(M, o);
	}

	public static final EventType KEY_PRESSED = javafx.scene.input.KeyEvent.KEY_PRESSED;

	public final KeyCode getCode() {
		return _impl().getCode();
	}

}
