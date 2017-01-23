package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import view.Main;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.stage.FileChooser.*;

public class Controller implements Initializable{


    @FXML
    private void searchforPictures(){
        FileChooser fc = new FileChooser();
        fc.setTitle("Bildsuche");
        fc.getExtensionFilters().addAll(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif", "*.tiff","*.raw"));

        MetadataProcessor mp = new MetadataProcessor();

        File selectedFile = fc.showOpenDialog(null);
        mp.readMetadata(selectedFile);
    }


    @FXML
    private void sortPictures(){
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
