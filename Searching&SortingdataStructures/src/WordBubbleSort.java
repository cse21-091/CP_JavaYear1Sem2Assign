import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileWriter;

import static java.lang.System.out;


public class WordBubbleSort
{

   static {
         long startTime; // Starting time of program, in milliseconds.
         long endTime; // Time when computations are done, in milliseconds.
         double time; // Time difference, in seconds.
         startTime = System.currentTimeMillis();
        File file = new File("C:\\Users\\cse21-091\\IdeaProjects\\javaAssign\\output.txt");
        String[]arr = new String[0];
       try {
           arr = input(file);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       System.out.println("SORTED WORDS ARE:");
       sort(arr);
       try {
           output(file,arr);
       } catch (IOException e) {
           e.printStackTrace();
       }
       endTime = System.currentTimeMillis();
         time = (endTime - startTime) / 1000.0;
         out.print("\nSORTING Run time in seconds was: ");
         out.println(time);

    }

    public static String[]input (File file) throws FileNotFoundException {
        String[]arr = new String[20];
        Scanner sc = new Scanner(file);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLine();

        }
        return arr;

    }

    public static void output(File file, String[] info) throws IOException {
        FileWriter writer = new FileWriter( "sorted.txt" );
        for (String aString : info) {
            writer.write( aString + System.lineSeparator() );
            out.println(aString);
        }

        writer.close();

    }

    public static void sort(String[]info){
        String temp;
        for (int j = 0; j < info.length; j++) {
            for (int i = j + 1; i < info.length; i++) {
                if (info[i].compareTo(info[j]) < 0) {
                    temp = info[j];
                    info[j] = info[i];
                    info[i] = temp;

                    //System.out.println(info);
                }


            }

        }
    }

}