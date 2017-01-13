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

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public Sorter(File imageFile, String imageDate) {

        this.imageFile = imageFile;
        this.imageDate = imageDate;

    }

    public void extractMonth(){

    }

    public void extractYear(){

    }

}
