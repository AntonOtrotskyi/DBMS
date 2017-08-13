package com.otr.dbms.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartController {

    private void openStage(String filename){
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        try {
            root = (Parent) loader.load(getClass().getResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("Data Base Management System");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void openRead(ActionEvent actionEvent) {
        openStage("/fxml/read.fxml");
    }

    public void openWrite(ActionEvent actionEvent) {
        openStage("/fxml/write.fxml");
    }

}

