package sample;

import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.util.Random;

public class Trainer {

    private boolean isTrainingMode = false;

    private int noteCounter = 0;
    private String seq;
    private int keysCounter = -1;
    private Status status = Status.PLAYING;


    public String getSeq() {
        return seq;
    }

    public Status getStatus() {
        return status;
    }

    public Trainer() {
        seq = generateSeq();
    }


    Character[] allowedKeys = {'Z', 'X', 'C', 'V', 'B'};

    private String generateSeq() {
        StringBuilder res = new StringBuilder();
        int numOfKeys = new Random().nextInt(2) + 3;
        for (int i = 0; i < numOfKeys; ++i) {
            int curNum = new Random().nextInt(allowedKeys.length);
            res.append(allowedKeys[curNum]);
        }
        return res.toString();
    }

    public void checkKey(char a) {
        keysCounter++;
        if (seq.charAt(keysCounter) != a) {
            status = Status.FAULT;
            return;
        }
        if (keysCounter == seq.length() - 1) {
            status = Status.SUCCESS;
        }

    }

    void reset() {
        seq = generateSeq();
        keysCounter = -1;
        status = Status.PLAYING;
    }


//    @FXML
//    private void checkIfTraining(String i) {
//        startTraining(MouseEvent.MOUSE_CLICKED);
//        if (isTrainingMode) {
//            if (!isCorrectKey(i)) {
//                stopTrainingWithError();
//            } else {
//                continueTraining();
//            }
//        }
//        stopTrainingWithCongratulations();
//    }
//    @FXML
//    private void continueTraining() {
//        noteCounter++;
//        if (isLastKey()) {
//            stopTrainingWithCongratulations();
//        }
//    }
//
//    @FXML
//    private void stopTrainingWithError() {
//        isTrainingMode = false;
//        noteCounter = 0;
//        System.out.println("User pressed the wrong key");
//    }
//
//    @FXML
//    private void stopTrainingWithCongratulations() {
//        isTrainingMode = false;
//        noteCounter = 0;
//        System.out.println("Well done!");
//    }
//
//    @FXML
//    public void startTraining(EventType<MouseEvent> mouseEvent) {
//      //.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent1 -> Notes.setText(str.toString()));
//        isTrainingMode = true;
//    }

//    @FXML
//    private boolean isCorrectKey(String i) {
//        //берет элемент из noteLine под номером noteCounter и сравнивает с поступившей "i"
//        for (int j = 0; j < str1.length; j++) {
//            if (str1[noteCounter].equals(i)) noteCounter++;
//            return true;
//        }
//        return false;
//    }
//
//    @FXML
//    private boolean isLastKey() {
//        //Смотрит чтобы noteCounter не выходил за размер noteLine
//
//        for (int i = 0; i < str1.length; i++) {
//            if (i == str1.length - 1)
//                return true;
//            else break;
//        }
//        return false;
//    }

}
