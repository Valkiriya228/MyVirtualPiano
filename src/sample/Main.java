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
        Parent root = FXMLLoader.load(getClass().getResource("/piano.fxml"));
        primaryStage.setTitle("Virtual Piano");
        Scene scene = (new Scene(root, 1296, 630));
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();


          Controller controller = new Controller();
               scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
           case Z:
               controller.pressNote("resources/music/Z.wav");
               break;
           case X:
               controller.pressNote("resources/music/X.wav");
               break;
           case C:
               controller.pressNote("resources/music/C.wav");
               break;
           case V:
               controller.pressNote("resources/music/V.wav");
               break;
           case B:
               controller.pressNote("resources/music/B.wav");
               break;
           case A:
               controller.pressNote("resources/music/A.wav");
               break;
           case S:
               controller.pressNote("resources/music/S.wav");
               break;
           case D:
               controller.pressNote("resources/music/D.wav");
               break;
           case L:
               controller.pressNote("resources/music/aa.wav");
               break;
           case K:
               controller.pressNote("resources/music/bb.wav");
               break;
           case P:
               controller.pressNote("resources/music/cc.wav");
               break;
           case M:
               controller.pressNote("resources/music/dd.wav");
               break;
           case O:
               controller.pressNote("resources/music/ee.wav");
               break;
           case U:
               controller.pressNote("resources/music/ff.wav");
               break;
           case N:
               controller.pressNote("resources/music/gg.wav");
               break;
           case F:
               controller.pressNote("resources/music/F.wav");
               break;
           case G:
               controller.pressNote("resources/music/G.wav");
               break;
           case Q:
               controller.pressNote("resources/music/Q.wav");
               break;
           case W:
               controller.pressNote("resources/music/W.wav");
               break;
           case E:
               controller.pressNote("resources/music/E.wav");
               break;
           case R:
               controller.pressNote("resources/music/R.wav");
               break;
           case T:
               controller.pressNote("resources/music/X.wav");
               break;
           case Y:
               controller.pressNote("resources/music/S.wav");
               break;
           case H:
               controller.pressNote("resources/music/H.wav");
               break;
       }
   });
    }


    public static void main(String[] args) {
        launch(args);
    }

}
