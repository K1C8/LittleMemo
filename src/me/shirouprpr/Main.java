package me.shirouprpr;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXToolbar;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        FlowPane flowPane = new FlowPane();
        flowPane.setVgap(20);
        flowPane.setHgap(20);

        JFXButton jfxButton = new JFXButton("Hello world!");
        flowPane.getChildren().add(jfxButton);

        JFXButton button = new JFXButton("Raised Button".toUpperCase());
        button.getStyleClass().add("button-raised");
        flowPane.getChildren().add(button);

        JFXToolbar toolBar = new JFXToolbar();
        toolBar.setMaxHeight(64);

        StackPane pane = new StackPane();
        pane.getChildren().addAll(toolBar, flowPane);
        pane.setStyle("-fx-background-color:WHITE");

        StackPane.setMargin(flowPane, new Insets(32));


        Scene testScene = new Scene(pane, 800, 400);
        testScene.getStylesheets().add(Main.class.getResource("/resources/css/jfoenix-components.css").toExternalForm());
        primaryStage.setTitle("HW");
        primaryStage.setScene(testScene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
