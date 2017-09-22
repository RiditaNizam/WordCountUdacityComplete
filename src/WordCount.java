/**
 * Created by ridita on 9/22/17.
 */
import java.io.File;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws Exception{
        File file = new File("src/pg38488.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while(scanner.hasNextLine()){  //Read the file line by line
            String line = scanner.nextLine();
            words+= line.split(" ").length;
        }

        System.out.println("The file contains: " + words + " words.");

    }

}