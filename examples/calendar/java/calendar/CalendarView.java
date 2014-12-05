package calendar;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.control.Control;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class CalendarView extends Control {

	/**
	 * This constructor defines how the Control widget is constructed
	 */
	public CalendarView() {
		setPrefSize(1000, 800);

		setSkin(new CalendarViewSkin(this));

		// setup the CSS
		// the -fx-skin attribute in the CSS sets which Skin class is used
		this.getStyleClass().add(this.getClass().getSimpleName());

		// Create a transparent pane where dragging an appointment is visualized
		Pane dragPane = new Pane();
		dragPane.prefWidthProperty().bind(widthProperty());
		dragPane.prefHeightProperty().bind(heightProperty());

		// A BorderPane is placed in the drag pane and sized to match
		BorderPane borderPane = new BorderPane();
		dragPane.getChildren().add(borderPane);
		borderPane.prefWidthProperty().bind(dragPane.widthProperty());
		borderPane.prefHeightProperty().bind(dragPane.heightProperty());

		// The borderPane's center
		ScrollPane weekScrollPane = new ScrollPane();
		borderPane.setCenter(weekScrollPane);
		weekScrollPane.setHbarPolicy(ScrollBarPolicy.NEVER);
		weekScrollPane.setFitToWidth(true);
		weekScrollPane.setPannable(false);
		// panning would conflict with creating a new appointment
		// bind to the scrollpane's viewport
		weekScrollPane.viewportBoundsProperty().addListener(observable -> {
			calculateSizes();
			// nowUpdateRunnable.run();
			});

		WeekPane weekPane = new WeekPane(this);
		weekScrollPane.setContent(weekPane);

		this.getChildren().add(dragPane);
	}

	@Override
	protected String getUserAgentStylesheet() {
		return this.getClass()
				.getResource(this.getClass().getSimpleName() + ".css")
				.toExternalForm();
	}

	protected DoubleProperty textHeightProperty = new SimpleDoubleProperty(0);
	protected DoubleProperty hourHeightProperty = new SimpleDoubleProperty(0);
	protected DoubleProperty timeWidthProperty = new SimpleDoubleProperty(0);
	protected double timeColumnWhitespace;

	protected void calculateSizes() {
		timeColumnWhitespace = 10;
		textHeightProperty.set(new Text("X").getBoundsInParent().getHeight());
		hourHeightProperty.set((2 * textHeightProperty.get()) + 10);
		// 10 is padding
		timeWidthProperty.set(new Text("88:88").getBoundsInParent().getWidth()
				+ timeColumnWhitespace);
	}

}
