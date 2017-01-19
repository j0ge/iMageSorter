package controller;

import java.io.File;

/**
 * Created by jgerlich on 12.01.2017.
 */
public class Sorter {

    private File imageFile;
    private String month;
    private String year;
    private String imageDate;
    private File sortedDirectory;

    public Sorter(File imageFile, String imageDate) {

        this.imageFile = imageFile;
        this.imageDate = imageDate;

    }

    public File getSortedDirectory() {
        return sortedDirectory;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }


    public File createSortedFolder(){

        this.year = this.imageDate.substring(0,4);
        this.month = this.imageDate.substring(5,7);
        this.sortedDirectory = new File(imageFile.getParentFile().getPath() +"/" + year + "/" + month);

        System.out.println(this.sortedDirectory.getPath());

        if(sortedDirectory.mkdirs())
        {
            System.out.println("Directory created!");
        }
        else {
            System.out.println("Directory already exists!");
        }

        return sortedDirectory;
    }






}
