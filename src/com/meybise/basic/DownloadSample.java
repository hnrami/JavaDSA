package com.meybise.basic;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadSample {
    public static void main(String[] args) {
        String fileURL = "https://link.testfile.org/PDF10MB";
        String saveFilePath = "D:\\PDF10MB.zip";
        long startByte = 0;
        long endByte = 500 * 1024 * 1024 - 1; // 500 MB in bytes

        try {
            // Open a connection to the URL
            URL url = new URL(fileURL);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();

            // Set the Range header
            String rangeHeader = "bytes=" + startByte + "-" + endByte;
            httpConn.setRequestProperty("Range", rangeHeader);

            // Connect to the server
            httpConn.connect();

            // Check if the server response is OK
            int responseCode = httpConn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_PARTIAL) {
                // Get the input stream
                InputStream inputStream = httpConn.getInputStream();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

                // Open an output stream to save the downloaded file
                FileOutputStream fileOutputStream = new FileOutputStream(saveFilePath);

                byte[] buffer = new byte[8086];
                int bytesRead = -1;
                while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                    System.out.println("bytesRead"+bytesRead);
                    
                }

                // Close streams
                fileOutputStream.close();
                bufferedInputStream.close();

                System.out.println("File downloaded successfully!");
            } else {
                System.out.println("Server responded with: " + responseCode);
            }

            // Disconnect the connection
            httpConn.disconnect();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

