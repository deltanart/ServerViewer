package run;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ServerViewer.fxml"));
        primaryStage.setTitle("ServerViewer");
        primaryStage.setMinHeight(450);
		primaryStage.setMinWidth(675);
        Scene scene = new Scene(root, 650, 400);
        scene.getStylesheets().add("/run/base.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}