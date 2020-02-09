import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button start;

    @FXML
    private Button setLocation;

    @FXML
    private TextField adress;

    @FXML
    void initialize(){
        start.setOnAction(event -> {
            WriteExcel.saveInfo(Parsing.getInfo());
        });
    }

    public static void show(){
        System.out.println("done");
    }
}
