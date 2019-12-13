package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * Ejecutable MainRocket
 * @author porteroFitness
 * @version 1.0
 * @see ControlRocket
 */

public class MainRocket extends Application {
	/**
	 * Visualiza Mars.fxml
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader =new FXMLLoader(getClass().getResource("../view/Mars.fxml"));
	        AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
