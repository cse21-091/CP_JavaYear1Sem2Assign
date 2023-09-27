// import necessary packages
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class WordsToArray {

   static {
            

        // list that holds strings of a file
        List<String> listOfStrings
                = new ArrayList<String>();

        // load data from file
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\cse21-091\\IdeaProjects\\javaAssign\\poem.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Created a string to store each character
        // to form word
        String s = new String();
        char ch = 0;

        // checking for EOF You have to test something against EOF(-1) , such as the result of a getchar() call.
        while (true) {
            try {
                if (!fr.ready()) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ch = (char)fr.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Used to specify the delimiters
            if (ch == '\n' || ch == ' ' || ch == ',') {

                // Storing each string in arraylist
                listOfStrings.add(s.toString());

                // clearing content in string
                s = new String();
            }
            else {
                // appending each character to string if the
                // current character is not delimiter
                s += ch;
            }
        }
        if (s.length() > 0) {

            // appending last line of strings to list
            listOfStrings.add(s.toString());
        }
        // storing the data in arraylist to array
        String[] array
                = listOfStrings.toArray(new String[0]);
        //store array in the ArrayFile
        FileWriter writer = null;
        try {
            writer = new FileWriter("Array.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //separation of array str line by line
        for(String str: array) {
            try {
                if (writer != null) {
                    writer. write(str + System. lineSeparator());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            assert writer != null;
            writer. close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // printing each line of file which is stored in
        // array
        System.out.println("ARRAYED WORDS ARE:");
        for (String str : array) {
            System.out.println( str);
        }
    }
}
