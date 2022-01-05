package com.github.hyagomv.application.controller;

import com.github.hyagomv.application.util.Scenes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AboutController {

	@FXML
	private Button btnHome;

	public void initialize() {
		btnHome.setOnAction(event -> {
			Scenes.changeScene(btnHome.getScene(), "home");
		});
	}

}
