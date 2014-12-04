package calendar;

import javafx.collections.ObservableList;

public class CalendarModel {

	protected final ObservableList<Appointment> appointments;

	public CalendarModel() {
		// Create the collection that contains all appointments.
		// The appointments can be constructed from persistent storage.
		appointments = javafx.collections.FXCollections.observableArrayList();
	}

}
