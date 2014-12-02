package fabfx.event;

import javafx.event.EventType;
import fabric.lang.security.Label;
import fabric.lang.security.LabelUtil;

public class Event {

	final Label M;

	javafx.event.Event _impl;

	public Event(Label M, javafx.event.Event e) {
		this.M = M;
		this._impl = e;
	}

	public javafx.event.Event _impl() {
		return this._impl;
	}

	public static boolean jif$Instanceof(Label M, Object o) {
		if (o instanceof Event) {
			Event that = (Event) o;
			return LabelUtil._Impl.equivalentTo(that.M, M);
		}
		return false;
	}

	public EventType getEventType() {
		return _impl().getEventType();
	}

	public void consume() {
		_impl().consume();
	}

}
