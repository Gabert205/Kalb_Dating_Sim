import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    final String file;

    FileReader(String f) {
        file = f; // Relative address to the .txt file we are reading
    }


    // Method to read the file and execute the keywords
    public void read() throws FileNotFoundException {
        // Create the scanner object
        Scanner yeet;

        // Makes sure that the file is something that can be read
        try {
            yeet = new Scanner(new File(file));
        } catch (Exception e) {
            System.out.println("File not found");
            return;
        }

        // Local variables used
        ArrayList<GameObject> objs = new ArrayList<>(); // Holds all the game objects in the cutscene
        yeet.useDelimiter(""); // Used so that the scanner searches every character
        String talking = ""; // Used to tell who is currently talking
        String background = ""; // Used to hold what the current background is
        String[] out = new String[5]; // Used to hold the text that appears on the screen with a max of 5 rows
        int index = 0; // Used to see what index of text we are adding to

        // While the scanner hasn't reached the end of the file
        while (yeet.hasNext()) {
            String next = yeet.next();

            if (next.equals("Ω")) {

            } else if (next.equals("~")) {

            } else if (next.equals("μ")) {

            }
        }
    }


}
