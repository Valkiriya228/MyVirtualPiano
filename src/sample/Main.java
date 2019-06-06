package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.awt.*;




public class Main extends Application  {

    public Main() throws AWTException {
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("piano.fxml"));
        primaryStage.setTitle("Virtual Piano");
        Scene scene = (new Scene(root, 719, 630));
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        Controller controller = new Controller();
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case Z:
                    controller.pressNote("src/sample/music/Z.wav");
                    break;
                case X:
                    controller.pressNote("src/sample/music/X.wav");
                    break;
                case C:
                    controller.pressNote("src/sample/music/C.wav");
                    break;
                case V:
                    controller.pressNote("src/sample/music/V.wav");
                    break;
                case B:
                    controller.pressNote("src/sample/music/B.wav");
                    break;
                case A:
                    controller.pressNote("src/sample/music/A.wav");
                    break;
                case S:
                    controller.pressNote("src/sample/music/S.wav");
                    break;
                case D:
                    controller.pressNote("src/sample/music/D.wav");
                    break;
                case L:
                    controller.pressNote("src/sample/music/aa.wav");
                    break;
                case K:
                    controller.pressNote("src/sample/music/bb.wav");
                    break;
                case P:
                    controller.pressNote("src/sample/music/cc.wav");
                    break;
                case M:
                    controller.pressNote("src/sample/music/dd.wav");
                    break;
                case O:
                    controller.pressNote("src/sample/music/ee.wav");
                    break;
                case U:
                    controller.pressNote("src/sample/music/ff.wav");
                    break;
                case N:
                    controller.pressNote("src/sample/music/gg.wav");
                    break;

                case F:
                    controller.pressNote("src/sample/music/F.wav");
                    break;
                case G:
                    controller.pressNote("src/sample/music/G.wav");
                    break;
                case Q:
                    controller.pressNote("src/sample/music/Q.wav");
                    break;
                case W:
                    controller.pressNote("src/sample/music/W.wav");
                    break;
                case E:
                    controller.pressNote("src/sample/music/E.wav");
                    break;
                case R:
                    controller.pressNote("src/sample/music/R.wav");
                    break;
                case T:
                    controller.pressNote("src/sample/music/X.wav");
                    break;
                case Y:
                    controller.pressNote("src/sample/music/S.wav");
                    break;
                case H:
                    controller.pressNote("src/sample/music/H.wav");
                    break;
            }

        });
    }


    public static void main(String[] args) {
        launch(args);
    }

}
