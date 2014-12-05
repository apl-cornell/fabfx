package calendar;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.value.ObservableNumberValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Util {
	/**
	 * This method prevents blurry horizontal or vertical lines, use snapXY(x)
	 * instead of x.
	 * 
	 * @param position
	 *            (x or y)
	 * @return
	 */
	public static double snapXY(double position) {
		return ((int) position) + .5;
	}

	/**
	 * This is the snapXY method for using in a binding, for example: p1.bind(
	 * snapXY( p2.multiply(0.1) ));
	 * 
	 * @param position
	 *            (x or y)
	 * @return
	 */
	public static DoubleBinding snapXY(final ObservableNumberValue position) {
		return new DoubleBinding() {
			{
				super.bind(position);
			}

			@Override
			public void dispose() {
				super.unbind(position);
			}

			@Override
			protected double computeValue() {
				return Util.snapXY(position.doubleValue());
			}

			@Override
			public ObservableList<?> getDependencies() {
				return FXCollections.singletonObservableList(position);
			}
		};
	}

}
