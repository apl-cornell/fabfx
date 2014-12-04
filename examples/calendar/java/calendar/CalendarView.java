package calendar;

import javafx.scene.control.Control;

public class CalendarView extends Control {

	public CalendarView() {
		setPrefSize(1000, 800);
		// setup the CSS
		// the -fx-skin attribute in the CSS sets which Skin class is used
		this.getStyleClass().add(this.getClass().getSimpleName());
	}

	@Override
	protected String getUserAgentStylesheet() {
		return super.getUserAgentStylesheet();
	}

}
