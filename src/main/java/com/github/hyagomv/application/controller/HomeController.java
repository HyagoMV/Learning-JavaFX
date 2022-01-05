package com.github.hyagomv.application.controller;

import com.github.hyagomv.application.util.Scenes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {

	@FXML
	private Button btnAbout;

	public void initialize() {
		btnAbout.setOnAction(event -> {
			Scenes.changeScene(btnAbout.getScene(), "about");
		});
	}

}
