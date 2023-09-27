import java.io.*;
import java.util.Scanner;

public class FileWordSearch {
     static  {
        //delclaration of variables
        String word;
        int val = 0;

        //use scanner to read word searched for
        {
            System.out.println("Enter the word to be searched for: ");
            Scanner input = new Scanner(System.in);
            word = input.next();

            //use scanner to detect/ search word in the file
            Scanner file = null;
            try {
                file = new Scanner(new File("C:\\Users\\cse21-091\\IdeaProjects\\javaAssign\\sorted.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            //while(!word.("quit"))
            while (file.hasNextLine()) {
                String line = file.nextLine();
                if (line.indexOf(word) != -1) {
                    System.out.println("The Word" + " " + word+ " " + "EXISTS in the Sorted file");
                    val = 1;
                    break;
                } else {
                    val = 0;
                    continue;
                }
            }
            if (val == 0) {
                System.out.println("The Word" + " " + word + " " + "does NOT EXIST in the Sorted file");
            }

        }
    }
}