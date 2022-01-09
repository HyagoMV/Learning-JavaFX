package com.github.hyagomv.application;

import java.util.Locale;

import com.github.hyagomv.application.util.Scenes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

	private Scene scene;

	@Override
	public void init() throws Exception {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
//		Locale.setDefault(Locale.forLanguageTag("en-US"));
		scene = Scenes.loadScene("about");
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.getIcons().add(new Image("icon.png"));
		stage.setTitle("Title");
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.show();
	}

}
