package sample.music;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.util.Duration;

public class Selection {
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



    private TranslateTransition Button;
    public Selection (){
       Button = new TranslateTransition(Duration.millis(70), null);
       Button.setByX(100f);
       Button.setFromX(100f);
       Button.setByY(100f);
       Button.setCycleCount(3);
       Button.setAutoReverse(true);
    }
    public void playAnim() {Button.playFromStart();}
}
