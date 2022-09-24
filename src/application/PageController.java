package application;

import javafx.scene.control.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.stage.*;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class PageController implements Initializable{

	@FXML Button book_login;
	@FXML Button acc_login;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	// 버튼 클릭시 하는 행동 
		public void movePage() {
		
			try {
				// 컨트롤 + 레이아웃 
				Parent sub = FXMLLoader.load(getClass().getResource("Register.fxml"));
				
				// 씬에 추가
				Scene scene = new Scene(sub);
				// 씬을 스테이지에 추가 
				//Stage stage = (Stage) btn.getScene().getWindow();
				Stage stage = new Stage();
				stage.setScene(scene);
				// 스테이지 설정 
				stage.setTitle("Register");
				stage.setResizable(false);
				// 스테이지 보여주기
				stage.show();

				Stage root = (Stage) book_login.getScene().getWindow(); //현재 윈도우를 가져온다는 뜻 
				root.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		public void move() {
			
			try {
				// 컨트롤 + 레이아웃 
				Parent sub = FXMLLoader.load(getClass().getResource("page.fxml"));
				
				// 씬에 추가
				Scene scene = new Scene(sub);
				// 씬을 스테이지에 추가 
				//Stage stage = (Stage) btn.getScene().getWindow();
				Stage stage = new Stage();
				stage.setScene(scene);
				// 스테이지 설정 
				stage.setTitle("Page");
				stage.setResizable(false);
				// 스테이지 보여주기
				stage.show();

				Stage root = (Stage) acc_login.getScene().getWindow(); //현재 윈도우를 가져온다는 뜻 
				root.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

	
	}
