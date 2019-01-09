package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("darkknight.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane, 440, 627);
            primaryStage.setTitle("Dark Knight");

            primaryStage.setScene(scene);
            primaryStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        launch(args);
    }
}
