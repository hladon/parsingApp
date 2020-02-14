import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
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
    private TextField address;

    @FXML
    private Text info;

    public void initialize(){
       String curLocation=System.getProperty("user.dir");
       WriteExcel.setFileName(curLocation);
       address.setText(WriteExcel.getFileName());
    }

    public void onClickMethod(ActionEvent actionEvent) {

        info.setText("Done");

    }

    public void chooseLocation(ActionEvent actionEvent){
        DirectoryChooser directoryChooser=new DirectoryChooser();
        directoryChooser.setTitle("Select directory");
        Stage stage=(Stage)address.getScene().getWindow();
        File file=directoryChooser.showDialog(stage);
        WriteExcel.setFileName(file.getAbsolutePath());
        address.setText(WriteExcel.getFileName());
    }

}
