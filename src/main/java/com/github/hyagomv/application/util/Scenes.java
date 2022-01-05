package com.github.hyagomv.application.util;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Scenes {

	public static Parent loadParent(String view) throws Exception {
		var fxml = Scenes.class.getResource("/view/" + view + "/scene.fxml");
		var properties = ResourceBundle.getBundle("view." + view + ".i18n." + Locale.getDefault() + ".strings");

		return FXMLLoader.load(fxml, properties);
	}

	public static Scene loadScene(String view) throws Exception {
		var scene = new Scene(loadParent(view));
		var css = Scenes.class.getResource("/view/" + view + "/style.css");

		scene.getStylesheets().add(css.toExternalForm());

		return scene;
	}

	public static void changeScene(Scene scene, String view) {
		try {
			scene.setRoot(Scenes.loadParent(view));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
