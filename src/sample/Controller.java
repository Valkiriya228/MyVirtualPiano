package sample;



import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.awt.event.ActionEvent;
import java.io.*;
import java.net.URL;
import java.util.*;


public class Controller<event> {
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
    private Button Train;

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
    private TextField fileField;


    @FXML
    private Label error_label;

    private boolean isTrainingMode = false;

    private int noteCounter = 0;

    private String noteLine = "";


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
                        checkIfTraining(i);
                        Z.fire();
                        break;

                    case "x":
                        checkIfTraining(i);
                        X.fire();
                        break;

                    case "c":
                        checkIfTraining(i);
                        C.fire();
                        break;

                    case "v":
                        checkIfTraining(i);
                        V.fire();
                        break;

                    case "b":
                        checkIfTraining(i);
                        B.fire();
                        break;

                    case "a":
                        checkIfTraining(i);
                        A.fire();
                        break;

                    case "s":
                        checkIfTraining(i);
                        S.fire();
                        break;

                    case "d":
                        checkIfTraining(i);
                        D.fire();
                        break;

                    case "f":
                        checkIfTraining(i);
                        F.fire();
                        break;

                    case "g":
                        checkIfTraining(i);
                        G.fire();
                        break;

                    case "q":
                        checkIfTraining(i);
                        Q.fire();
                        break;

                    case "w":
                        checkIfTraining(i);
                        W.fire();
                        break;

                    case "e":
                        checkIfTraining(i);
                        E.fire();
                        break;

                    case "r":
                        checkIfTraining(i);
                        R.fire();
                        break;

                    case "t":
                        checkIfTraining(i);
                        T.fire();
                        break;

                    case "y":
                        checkIfTraining(i);
                        Y.fire();
                        break;

                    case "h":
                        checkIfTraining(i);
                        H.fire();
                        break;

                    default:
                        error_label.setText("Неверный формат данных");
                }
            }
        }
        fileReader.close();
        Train.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                Notes.setText(str.toString());
            }
        });

    }


    @FXML
    private void checkIfTraining(String i) {
        startTraining(MouseEvent.MOUSE_CLICKED);
        if (isTrainingMode) {
            if (!isCorrectKey(i)) {
                stopTrainingWithError();
            } else {
                continueTraining();
            }
        }
    }

    @FXML
    private void continueTraining() {
        noteCounter++;
        if (isLastKey()) {
            stopTrainingWithCongratulations();
        }
    }

    @FXML
    private void stopTrainingWithError() {
        isTrainingMode = false;
        noteCounter = 0;
        noteLine = "";
        System.out.println("User pressed the wrong key");
    }

    @FXML
    private void stopTrainingWithCongratulations() {
        isTrainingMode = false;
        noteCounter = 0;
        noteLine = "";
        System.out.println("Well done!");
    }

    @FXML
    public void startTraining(EventType<MouseEvent> mouseEvent) {
        Train.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent1 -> Notes.setText(str.toString()));
        isTrainingMode = true;
    }

    @FXML
    private boolean isCorrectKey(String i) {
        //берет элемент из noteLine под номером noteCounter и сравнивает с поступившей "i"
        for (int j = 0; j < str.length; j++) {
            if (str[noteCounter].equals(i)) noteCounter++;
            return true;
        }
        return false;
    }

    @FXML
    private boolean isLastKey() {
        //Смотрит чтобы noteCounter не выходил за размер noteLine

        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1)
                return true;
            else break;
        }
        return false;
    }


    String[] str = new String[]{"a", "c", "n"};


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
