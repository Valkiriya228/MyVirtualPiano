package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;



import java.io.*;
import java.net.URL;
import java.util.*;


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
    private Button train;

    @FXML
    private Button F;

    @FXML
    private Button G;

    @FXML
    private Button Q;

    @FXML
    public Label Notes;

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
    private Label labelTrain;

    @FXML
    private TextField fileField;

    @FXML
    private Label error_label;

    private boolean isTrain = false;
    private Trainer coach = new Trainer();

    @FXML
    public void checkKey(char key) {
        coach.checkKey(key);
        switch (coach.getStatus()) {
            case FAULT:
                labelTrain.setText("FAULT");
                coach.reset();
                break;
            case SUCCESS:
                labelTrain.setText("OK");
                coach.reset();
                break;
        }
    }

    @FXML
    public void initialize() {
        Z.setOnAction(event -> {
            pressNote("resources/music/Z.wav");
            if (isTrain) {
                checkKey('Z');
            }
        });
        X.setOnAction(event -> {
            pressNote("resources/music/X.wav");
            if (isTrain) {
                checkKey('X');
            }
        });
        C.setOnAction(event -> {
            pressNote("resources/music/C.wav");
            if (isTrain) {
                checkKey('C');
            }
        });
        V.setOnAction(event -> {
            pressNote("resources/music/V.wav");
            if (isTrain) {
                checkKey('V');
            }
        });
        B.setOnAction(event -> {
            pressNote("resources/music/B.wav");
            if (isTrain) {
                checkKey('B');
            }
        });;
        A.setOnAction(event -> pressNote("resources/music/A.wav"));
        S.setOnAction(event -> pressNote("resources/music/S.wav"));
        D.setOnAction(event -> pressNote("resources/music/D.wav"));
        F.setOnAction(event -> pressNote("resources/music/F.wav"));
        G.setOnAction(event -> pressNote("resources/music/G.wav"));
        Q.setOnAction(event -> pressNote("resources/music/Q.wav"));
        W.setOnAction(event -> pressNote("resources/music/W.wav"));
        E.setOnAction(event -> pressNote("resources/music/E.wav"));
        R.setOnAction(event -> pressNote("resources/music/R.wav"));
        T.setOnAction(event -> pressNote("resources/music/T.wav"));
        Y.setOnAction(event -> pressNote("resources/music/Y.wav"));
        train.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            labelTrain.setText(coach.getSeq());
            isTrain = true;
        });

    }



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






}
