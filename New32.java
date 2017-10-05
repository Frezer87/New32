import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class New32  extends Application {
    @Override
    public  void start(Stage primaryStage) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setHeaderText("Input width and height of the recangleseparated by space");
        Optional<String> input = dialog.showAndWait();
        String [] side = input.get().split(" ");
        double width=Double.parseDouble(side[0]);
        double height = Double.parseDouble(side[1]);
        double perimeter = 2*width + 2*height;
        double area = width * height;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("The perimeter of the recangle is " + perimeter + "\n  The area of the rectangle is " + area );
        alert.showAndWait();







    }
}
