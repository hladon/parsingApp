import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Controller  {

    @FXML
    private Button start;

    @FXML
    private Button setLocation;

    @FXML
    private TextField adress;


    public void onClickMethod(ActionEvent actionEvent) {

        System.out.println("done");


    }
}
