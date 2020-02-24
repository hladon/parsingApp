import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

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
        WriteExcel.saveInfo(Parsing.getInfo());
        info.setText("Saved");

    }

    public void chooseLocation(ActionEvent actionEvent){
        DirectoryChooser directoryChooser=new DirectoryChooser();
        directoryChooser.setTitle("Select directory");
        Stage stage=(Stage)address.getScene().getWindow();
        File file=directoryChooser.showDialog(stage);
        if (file==null)
            return;
        WriteExcel.setFileName(file.getAbsolutePath());
        address.setText(WriteExcel.getFileName());
    }

}
