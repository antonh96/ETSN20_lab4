import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {

    public static void main(String[] args) throws FileNotFoundException {
        Search search = new Search();
        search.searchPattern(args[0], args[1]);
    }

    private void searchPattern(String pattern, String filepath) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filepath));
        int i=1;
        while (input.hasNext()) {
            String line = input.nextLine();
            if(line.contains(pattern)) {
                System.out.println("The pattern was found at line: " + i);
            }
            i++;
        }
    }

}