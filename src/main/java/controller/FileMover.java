package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;

/**
 * Created by jgerlich on 12.01.2017.
 */
public class FileMover {

    File imageFile;
    File sortedFolder;

    public FileMover (File imageFile, File sortedFolder){
        this.imageFile = imageFile;
        this.sortedFolder = sortedFolder;
    }


    public void moveFile ()  {
        File movedFile = new File(sortedFolder,imageFile.getName());

        try {
            Files.move(imageFile.toPath(), movedFile.toPath(), StandardCopyOption.ATOMIC_MOVE);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to move File");
        }


    }


}
