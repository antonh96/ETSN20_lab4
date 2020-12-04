import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {

    public static void main(String[] args)  {
        Search search = new Search();
        try {
            search.searchPattern(args[0], args[1]);
        } catch (FileNotFoundException e) {
            System.out.println("File couldn't be found!");
        }
    }

    private void searchPattern(String pattern, String filepath) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filepath));
        while (input.hasNext()) {
            String line = input.nextLine();
            if(line.contains(pattern)) {
                System.out.println("The pattern was found at line: " + line);
            }
        }
        input.close();
    }

}