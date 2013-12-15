package fabfx.application;

import fabric.lang.security.Label;

abstract public class Application extends javafx.application.Application {
    final Label L;
    final Label M;
    
    abstract public void start (fabfx.stage.Stage primaryStage);

    public void launchApp (String[] args) {
	launch(args);
    }

    public Application (Label L, Label M) {
	this.L = L;
	this.M = M;
    }

    @Override
    public void start (javafx.stage.Stage jstage) {
	fabfx.stage.Stage fstage = new fabfx.stage.Stage(this.L, this.M, jstage);
	this.start(fstage);
    }

}
