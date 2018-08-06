package ui.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminUiController implements Initializable {

    @FXML
    private AnchorPane containerPane;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            AnchorPane load = FXMLLoader.load(getClass().getResource("/ui/admin/admin_activity_overview_ui.fxml"));

            if(load != null)
                if(containerPane == null) System.out.println("NULL POINTER");
                else containerPane.getChildren().setAll(load);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showActivityOverview(ActionEvent event) {


        try {
            AnchorPane load = FXMLLoader.load(getClass().getResource("/ui/admin/admin_activity_overview_ui.fxml"));

            if(load != null)
                if(containerPane == null) System.out.println("NULL POINTER");
                else containerPane.getChildren().setAll(load);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showAdminProfile(ActionEvent event) {

    }

    @FXML
    void showEmployeeBioData(ActionEvent event) {

        try {
            AnchorPane load = FXMLLoader.load(getClass().getResource("/ui/admin/admin_employee_bio.fxml"));

            if(load != null)
                if(containerPane == null) System.out.println("NULL POINTER");
                else containerPane.getChildren().setAll(load);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showPreferences(ActionEvent event) {

    }

    @FXML
    void signout(ActionEvent event) {

    }
}
