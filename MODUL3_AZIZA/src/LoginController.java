import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML 
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    void LoginFunction(ActionEvent event) throws IOException {

        String username = usernameField.getText();
        String password = passwordField.getText();

        Parent inventoryParent = FXMLLoader.load(getClass().getResource("InventoryPage.fxml"));
        Scene inventoryScene = new Scene(inventoryParent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        if (username.equals("jioxy") && password.equals("apalahw4k")) {
            stage.setScene(inventoryScene);
            stage.show();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Username atau Password salah");
            alert.setContentText("Silahkan cek data yang anda masukkan");

            alert.showAndWait();
        }       
    }
}

