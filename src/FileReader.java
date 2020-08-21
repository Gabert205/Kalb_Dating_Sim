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

            if (next.equals("μ")) {
                String[] line = yeet.nextLine().split(" ");
                objs.add(new GameObject(Double.parseDouble(line[1]), Double.parseDouble(line[2])));
                // line[0] = character name
                // line[3] and line[4] = scaling for the x and y
            } else if (next.equals("Ω")) {
                background = yeet.nextLine();
            } else if (next.equals("ア")) { // Might not need this one if we don't add names to the class or might just not need it in general
                // String name = yeet.nextLine()
                // search through objs and remove the object with that name
            } else if (next.equals("^")) { // Will probably have to change if we arent adding names
                talking = yeet.nextLine();
                // Resets our out text
                for (int i = 0; i < 5; i++) {
                    out[i] = "";
                }
                index = 0;
            } else if (next.equals("/")) {
                // Resets our out text
                for (int i = 0; i < 5; i++) {
                    out[i] = "";
                }
                index = 0;
            } else if (next.equals("~")) {

            } else if (next.equals("\\")) {

            } else if (next.equals("*")) {
                while (!StdDraw.isKeyPressed(88)) { // Waits to progress until you give it another input
                    continue;
                }
            } else if (next.equals("\n")) { // Checks to see if we move onto a new line.
                index++;
            } else { // Fails to recognize any key characters so it adds the text to the output
                out[index] += next;
            }

            // draws the things
        }
    }


}
