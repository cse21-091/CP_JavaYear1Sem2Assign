// import classes
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;
import static java.nio.file.StandardOpenOption.CREATE;

 class WordSelection {
     static   {
        Path outputFile = Paths.get("output.txt");
         ArrayList<String> randomWords1 = null;
         try {
             randomWords1 = randomWordsFromFile("C:\\Users\\cse21-091\\IdeaProjects\\javaAssign\\Array.txt", 20);
         } catch (FileNotFoundException e) {
             e.printStackTrace();

         }
            //An output stream accepts output bytes and sends them to some sink.
         try {
             OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(outputFile, CREATE));
         } catch (IOException e) {
             e.printStackTrace();
         }
         System.out.println("THE 20 RANDOM WORDS ARE:");
         out.println(randomWords1);

         //flushing data to a destination.


         FileWriter writer = null;
         try {
             writer = new FileWriter("output.txt");
         } catch (IOException e) {
             e.printStackTrace();
         }

         for(String str: randomWords1) {
             try {
                 writer. write(str + System. lineSeparator());
             } catch (IOException e) {
                 e.printStackTrace();
             }

        }

         try {
             writer. close();
         } catch (IOException e) {
             e.printStackTrace();
         }
         // outputStream.flush();
       // for (int i = 0; i < randomWords1.size(); i++) {
          //  outputStream.write(randomWords1.get(i).getBytes());
          //  out.write(" ".getBytes());
        }
         //closing of a source or a destination of data
      //  outputStream.close();
   // }
// see again ..
     static ArrayList<String> randomWordsFromFile(String fileName, int count) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        ArrayList<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());

        }
        return randomFromWords(words, count);
    }

    static  ArrayList<String> randomFromWords(ArrayList<String>     words, int count) {
        ArrayList<String> randomWords = new ArrayList<>();
        for (int i = 0; i < count; ) {
            int random = new Random().nextInt(words.size());
            if (randomWords.add(words.get(random))) {
                i++;

            }
        }
        return randomWords;

    }


    }