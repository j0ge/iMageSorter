package controller;

import java.io.*;

/**
 * Created by jgerlich on 12.01.2017.
 */
public class MetadataProcessor {

    // attributes
    private String metadataDate;

    // getter
    public String getMetadataDate() {
        return metadataDate;
    }

    // constructor
    public MetadataProcessor() {

    }

    // methods

    /**
     * this method is reading metadata from an image using exiftool
     *
     * @param imageFile Current Image from which metadata is getting extracted
     * @return returns a String containing the extracted metadata
     */
    public String readMetadata(File imageFile) {

        // Starting Exiftool, which is used for Reading Metadata
        try {

            Process exifTool = new ProcessBuilder("C:/Users/jgerlich/Desktop/exiftool.exe", "-s", "-S", "-createdate",
                    "-filecreatedate", imageFile.getAbsolutePath()).start();

            exifTool.waitFor();

            InputStream inputExiftool = exifTool.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputExiftool));
            metadataDate = br.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return metadataDate;
    }
}
