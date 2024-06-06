/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.createfilemethod;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author kamau
 */
public class CreateFileMethod {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\kamau\\Documents\\output2");

        //create the file
        if (file.createNewFile()) {
            System.out.println("File is created");
        } else {
            System.out.println("File already exists");
        }

        //write on the file
        FileWriter writer = new FileWriter(file);
        writer.write("This is another way of creating a file");
        writer.close();

        //read from the file
        FileReader reader = new FileReader(file);
        int c;
        while ((c = reader.read()) != -1) {
            System.out.print((char)c);
        }
    }
}
