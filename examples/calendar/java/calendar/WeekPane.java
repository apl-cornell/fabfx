package calendar;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.Text;

class WeekPane extends Pane {

	final CalendarView calendarView;

	// final List<DayPane> dayPanes;

	/**
	 * This constructor defines how the WeekPane widget is constructed.
	 */
	public WeekPane(CalendarView calendarView) {
		this.calendarView = calendarView;
		// this.dayPanes = new ArrayList<DayPane>(7);

		getStyleClass().add("Week");

		// draw hours
		for (int hour = 0; hour < 24; hour++) {
			// hour line
			drawHourLine(hour);
			// half hour line
			drawHalfHourLine(hour);
			// hour text
			drawHourText(hour);
		}

		// // 7 days per week
		// for (int i = 0; i < 7; i++) {
		// DayPane lDayPane = new DayPane();
		// lDayPane.setId("dayPane" + i);
		// lDayPane.layoutXProperty().bind(
		// dayWidthProperty.multiply(i).add(dayFirstColumnXProperty));
		// lDayPane.layoutYProperty().set(0.0);
		// lDayPane.prefWidthProperty().bind(dayWidthProperty);
		// lDayPane.prefHeightProperty().bind(dayHeightProperty);
		// getChildren().add(lDayPane);
		//
		// // remember
		// dayPanes.add(lDayPane);
		// }
	}

	private void drawHourLine(int hour) {
		Line l = new Line();
		l.setId("hourLine" + hour);
		l.getStyleClass().add("HourLine");
		l.startXProperty().set(0.0);
		l.startYProperty().bind(
				Util.snapXY(calendarView.hourHeightProperty.multiply(hour)));
		l.endXProperty().bind(Util.snapXY(widthProperty()));
		l.endYProperty().bind(Util.snapXY(l.startYProperty()));
		getChildren().add(l);
	}

	private void drawHalfHourLine(int hour) {
		Line l = new Line(0, 10, 100, 10);
		l.setId("halfHourLine" + hour);
		l.getStyleClass().add("HalfHourLine");
		l.startXProperty().bind(Util.snapXY(calendarView.timeWidthProperty));
		l.endXProperty().bind(Util.snapXY(widthProperty()));
		l.startYProperty().bind(
				Util.snapXY(calendarView.hourHeightProperty
						.multiply(hour + 0.5)));
		l.endYProperty().bind(Util.snapXY(l.startYProperty()));
		getChildren().add(l);
	}

	private void drawHourText(int hour) {
		Text t = new Text(hour + ":00");
		t.xProperty().bind(
				calendarView.timeWidthProperty.subtract(
						t.getBoundsInParent().getWidth()).subtract(
						calendarView.timeColumnWhitespace / 2));
		t.yProperty().bind(calendarView.hourHeightProperty.multiply(hour));
		t.setTranslateY(t.getBoundsInParent().getHeight());
		// move it under the line
		t.getStyleClass().add("HourLabel");
		t.setFontSmoothingType(FontSmoothingType.LCD);
		getChildren().add(t);
	}

}
