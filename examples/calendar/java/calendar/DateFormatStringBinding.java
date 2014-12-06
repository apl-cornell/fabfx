package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javafx.beans.binding.StringBinding;
import javafx.beans.property.ObjectProperty;

public class DateFormatStringBinding extends StringBinding {

	protected final ObjectProperty<Calendar> date;
	String datePattern;

	public DateFormatStringBinding(ObjectProperty<Calendar> date) {
		this.date = date;
		datePattern = "MM/dd E";
	}

	@Override
	protected String computeValue() {
		return new SimpleDateFormat(datePattern, Locale.US).format(date
				.getValue().getTime());
	}

}
