package ch.bbw.pr.helloworldfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainViewController {

    //Test
// hello

    @FXML
    public Button button_1;
    @FXML
    public Button button_2;
    @FXML
    public Button button_3;
    @FXML
    public Button button_4;
    @FXML
    public Button button_5;
    @FXML
    public Button button_6;
    @FXML
    public Button button_7;
    @FXML
    public Button button_8;
    @FXML
    public Button button_9;
    @FXML
    public Button button_hash;
    @FXML
    public Button button_0;
    @FXML
    public Button button_star;
    @FXML
    public TextField text_field;



    public void setText1(ActionEvent event){
        text_field.setText(text_field.getText() + "1");
    }

    public void setText2(ActionEvent event){
        text_field.setText(text_field.getText() + "2");
    }

    public void setText3(ActionEvent event){
        text_field.setText(text_field.getText() + "3");
    }

    public void setText4(ActionEvent event){
        text_field.setText(text_field.getText() + "4");
    }

    public void setText5(ActionEvent event){
        text_field.setText(text_field.getText() + "5");
    }

    public void setText6(ActionEvent event){
        text_field.setText(text_field.getText() + "6");
    }

    public void setText7(ActionEvent event){
        text_field.setText(text_field.getText() + "7");
    }

    public void setText8(ActionEvent event){
        text_field.setText(text_field.getText() + "8");
    }

    public void setText9(ActionEvent event){
        text_field.setText(text_field.getText() + "9");
    }

    public void setText0(ActionEvent event){
        text_field.setText(text_field.getText() + "0");
    }
    public void setTextHash(ActionEvent event){
        text_field.setText(text_field.getText() + "#");
    }

    public void setTextStar(ActionEvent event){
        text_field.setText(text_field.getText() + "*");
    }


}