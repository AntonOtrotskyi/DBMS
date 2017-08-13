package com.otr.dbms;

import com.otr.dbms.db.DAO;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class DBMSStarter extends Application{

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        String fxmlFile = "/fxml/start.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        DAO dao = new DAO();
        dao.setup();
        stage.setOnHiding(event -> Platform.runLater(() -> {
            dao.close();
            System.exit(0);
        }));
        stage.setTitle("Data Base Management System");
        stage.setScene(new Scene(root));
        stage.show();
    }
}