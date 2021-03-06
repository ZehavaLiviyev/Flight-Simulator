package View;
import Model.Model;
import ViewModel.ViewModel;
import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        FXMLLoader fxml = new FXMLLoader();
        AnchorPane root = fxml.load(getClass().getResource("sample.fxml").openStream());
        primaryStage.setTitle("GUI");
        primaryStage.setScene(new Scene(root, 1000, 600));
        ViewController vc = fxml.getController();
        Model model = new Model(new SimpleIntegerProperty(0));
        ViewModel vm = new ViewModel(model);


        vc.init(vm);
        model.connect();
        primaryStage.show();


    }

    public static void main(String[] args) {

        launch(args);
    }
}
