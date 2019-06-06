package sample;


import java.io.IOException;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


import javafx.fxml.FXML;
import javafx.scene.control.Button;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;




public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Z;

    @FXML
    private Button X;

    @FXML
    private Button C;

    @FXML
    private Button V;

    @FXML
    private Button B;

    @FXML
    private Button A;

    @FXML
    private Label label_file;

    @FXML
    private Button S;

    @FXML
    private Button D;

    @FXML
    private Button file_button;

    @FXML
    private Button F;

    @FXML
    private Button G;

    @FXML
    private Button Q;

    @FXML
    private Button W;

    @FXML
    private Button E;

    @FXML
    private Button R;

    @FXML
    private Button T;

    @FXML
    private Button Y;

    @FXML
    private Button H;


    @FXML
    private TextField fileField;


    @FXML
    private Label error_label;


    public void pressNote(String file) {
        Media music = new Media(new File(file).toURI().toString());
        MediaPlayer player = new MediaPlayer(music);
        player.play();
    }

    public String getFile() {
        return fileField.getText();
    }

    public void playFromFile(String text) throws IOException, InterruptedException {
        FileReader fileReader = new FileReader(text);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            for (String i : scanner.nextLine().split(" ")) {
                switch (i) {
                    case "z":
                        Z.fire();
                        break;

                    case "x":
                        X.fire();
                        break;

                    case "c":
                        C.fire();
                        break;

                    case "v":
                        V.fire();
                        break;

                    case "b":
                        B.fire();
                        break;

                    case "a":
                        A.fire();
                        break;

                    case "s":
                        S.fire();
                        break;

                    case "d":
                        D.fire();
                        break;

                    case "f":
                        F.fire();
                        break;

                    case "g":
                        G.fire();
                        break;

                    case "q":
                        Q.fire();
                        break;

                    case "w":
                        W.fire();
                        break;

                    case "e":
                        E.fire();
                        break;

                    case "r":
                        R.fire();
                        break;

                    case "t":
                        T.fire();
                        break;

                    case "y":
                        Y.fire();
                        break;

                    case "h":
                        H.fire();
                        break;

                    default:
                        error_label.setText("Неверный формат данных");
                }
            }
        }
        fileReader.close();

    }



    @FXML
    public void initialize() {
        Z.setOnAction(event -> pressNote("src/sample/music/Z.wav"));
        X.setOnAction(event -> pressNote("src/sample/music/X.wav"));
        C.setOnAction(event -> pressNote("src/sample/music/C.wav"));
        V.setOnAction(event -> pressNote("src/sample/music/V.wav"));
        B.setOnAction(event -> pressNote("src/sample/music/B.wav"));
        A.setOnAction(event -> pressNote("src/sample/music/A.wav"));
        S.setOnAction(event -> pressNote("src/sample/music/S.wav"));
        D.setOnAction(event -> pressNote("src/sample/music/D.wav"));
        F.setOnAction(event -> pressNote("src/sample/music/F.wav"));
        G.setOnAction(event -> pressNote("src/sample/music/G.wav"));
        Q.setOnAction(event -> pressNote("src/sample/music/Q.wav"));
        W.setOnAction(event -> pressNote("src/sample/music/W.wav"));
        E.setOnAction(event -> pressNote("src/sample/music/E.wav"));
        R.setOnAction(event -> pressNote("src/sample/music/R.wav"));
        T.setOnAction(event -> pressNote("src/sample/music/T.wav"));
        Y.setOnAction(event -> pressNote("src/sample/music/Y.wav"));


    }
}
