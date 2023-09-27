import javax.swing.*;
import java.io.*;

public class WordCount /*extends JButton*/ {
     static {

        long startTime; // Starting time of program, in milliseconds.
        long endTime; // Time when computations are done, in milliseconds.
        double time; // Time difference, in seconds.
        startTime = System.currentTimeMillis();

        // The input file
        File file = new File("C:\\Users\\cse21-091\\IdeaProjects\\javaAssign\\poem.txt");
        // Initialize the array of words
        String[] words = null;
        // Initializes the counter of word to zero
        int count = 0;
        // Create the File Reader object
            FileReader fr = null;

        //exception on assignment ,indicates conditions that a reasonable application might want to catch.
            try {
                fr = new FileReader(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            // Create the BufferedReader object
        BufferedReader br = new BufferedReader(fr);
        String str = "";
        // Read the contents of the file
        while (true) {
            try {
                if (!((str = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            // Split the word using space
            words = str.split(" ");
            // Increment the number of words
            count = count + words.length;
        }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("There are :" + count + " " + "words in this file");

        endTime = System.currentTimeMillis();
        time = (endTime - startTime) / 1000.0;
        System.out.print("\nWORDCOUNT Run time in seconds was: ");
        System.out.println(time);
    }
    }
