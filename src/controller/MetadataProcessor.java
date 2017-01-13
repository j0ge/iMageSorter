package controller;

import java.io.*;

/**
 * Created by jgerlich on 12.01.2017.
 */
public class MetadataProcessor {



    public String readMetadata(File imageFile)  {

        String metadataDate = null;

        // Starting Exiftool, which is used for Reading Metadata
        try {
            Process exifTool = new ProcessBuilder("C:/Users/jgerlich/Desktop/exiftool.exe","-s", "-S", "-createdate",
                    "-filecreatedate", imageFile.getAbsolutePath()).start();

            exifTool.waitFor();

            InputStream inputExiftool = exifTool.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputExiftool));
            metadataDate= br.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return metadataDate;
    }
}
