/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3hge;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kstam
 */
public class ReadCSV{
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

    private static List<Country> ReadCSV() {

        //Store the file path
        String filePath = "D:\\NetbeansProjects\\Econometrica\\iso-countries.csv";
        //List creation to host Country list
        List<Country> countries = new ArrayList<>();
        //Paths class
        //https://docs.oracle.com/javase/tutorial/essential/io/pathClass.html
        //"A Path object contains the file name and directory list used to 
        //construct the path, and is used to examine, locate, and manipulate files."
        Path pathToFile = (Path) Paths.get(filePath);

        // BufferedReader to handle the character input stream
        try (BufferedReader buff = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {

            // Ορίζω ένα String και του εισάγω την 1η Γραμμή του Αρχείου
            String line = buff.readLine();

            //loop through all lines
            while (line != null) {
                //Separate next line with ';'
                String[] info = line.split(";");
                //Store Name and ISO in String array
                String Name = info[0];
                String ISOcode = info[2];
                // Create a new Country object with the 2 variables
                Country country = new Country(Name, ISOcode);
                countries.add(country);
                //Διαβάζω την επόμενη γραμμή του αρχείου
                line = buff.readLine();
            }
        } catch (IOException ioe) {
        }
        
        return countries;
    }



}
        