package calendar;

import java.util.Calendar;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class CalendarModel {

	protected ObjectProperty<Calendar> calendarProperty = new SimpleObjectProperty<>(
			this, "calendar");
	protected final ObservableList<Appointment> appointments;

	public CalendarModel() {
		// Create the collection that contains all appointments.
		// The appointments can be constructed from persistent storage.
		appointments = javafx.collections.FXCollections.observableArrayList();
	}

}
