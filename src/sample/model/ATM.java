package sample.model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ATM {

    public  CheckData checkData = new CheckData();
    public String address;
    public String bankName;
    private Card card; // агрегация
    public List<Transaction> transactionList = new ArrayList<>(); // композиция

    public ATM(Stage primaryStage) throws IOException {
        try {
        Parent root = FXMLLoader.load(Main.class.getResource("view/changeLanguage.fxml"));
       // primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
       primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button rusButton;

    @FXML
    private Button belButton;

    @FXML
    private Button engButton;

    @FXML
     void initialize() {
        rusButton.setOnAction(actionEvent -> {

        });

        belButton.setOnAction(actionEvent -> {

        });

        engButton.setOnAction(actionEvent -> {

        });
    }
}/*
 */