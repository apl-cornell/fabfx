package fabfx.application;

import fabric.lang.security.Label;

abstract public class Application extends javafx.application.Application {
    final Label L;
    final Label M;
    
    abstract public void run (fabfx.stage.Stage primaryStage);

    public void launchApp (String[] args) {
	launch(args);
    }

    public void launchApp () {
	launch(new String[]{});
    }

    public Application (Label L, Label M) {
	this.L = L;
	this.M = M;
    }

    @Override
    public void start (javafx.stage.Stage jstage) {
	fabfx.stage.Stage fstage = new fabfx.stage.Stage(this.L, this.M, jstage);
	this.run(fstage);
    }

}
