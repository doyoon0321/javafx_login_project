package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


@SuppressWarnings("unused")
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
            //컨트롤 + 레이아웃
		      Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));   
		      Scene scene = new Scene(root);
		     //Scene scene = new Scene(root,400,400);
            // 씬을 스테이지에 추가 
			primaryStage.setScene(scene);
            // 씬을 보여주기 
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}