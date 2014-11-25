package fabfx.application;

import com.sun.javafx.application.LauncherImpl;

import fabric.lang.security.Label;

abstract public class Application extends javafx.application.Application {

	public void fabfx$application$Application$() {
	}

	abstract public void run(fabfx.stage.Stage primaryStage);

	@Override
	public void start(javafx.stage.Stage jstage) {
		fabfx.stage.Stage fstage = new fabfx.stage.Stage(jstage);
		this.run(fstage);
	}

	public void launchApp() {
		LauncherImpl.launchApplication(this.getClass(), new String[0]);
	}

}
