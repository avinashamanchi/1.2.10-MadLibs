import java.util.Scanner;

public class AmanchiBhutaniMadLibs {
    
    // Helper method to prompt the user for a word type and return the input.
    public static String getWord(Scanner input, String wordType) {
        System.out.print("Enter a " + wordType + ": ");
        return input.nextLine();
    }

    // Method to construct and return the final Mad Libs story using the collected words.
    public static String createStory(String noun1, String verb1, String adjective1, String noun2, String verb2, String adjective2, String noun3) {
        String story = "";
        // First part of the story, using noun1, verb1, and adjective1.
        story += "The " + noun1 + " " + verb1 + " across the " + adjective1 + " ocean.\n";
        
        // Second and third parts, introducing noun2, verb2, and adjective2.
        story += "I went to the mickey mouse club house to see " + noun2 + ". ";
        story += "Minnie, toodles, goofy, and pete were " + verb2 + " around the door ";
        
        // Final part of the story, concluding with adjective2 and noun3.
        story += "which made the " + adjective2 + " " + noun3 + " go crazyyyyyyy!";
        return story;
    }

    public static void main(String[] args) {
        // Initialize Scanner object for reading user input
        Scanner input = new Scanner(System.in);
        
        // print or display the welcome message.
        System.out.println("Welcome to the Avi's and Hrihaans Mad Libs Generator!");
        System.out.println("You'll be asked to enter types of words to complete a story.\n");

        //  collect all seven words that are required for the story from the user
        String noun1 = getWord(input, "noun");
        String verb1 = getWord(input, "verb");
        String adjective1 = getWord(input, "adjective");
        String noun2 = getWord(input, "noun");
        String verb2 = getWord(input, "verb");
        String adjective2 = getWord(input, "adjective");
        String noun3 = getWord(input, "noun");

        // generate the final story by calling the createStory method
        String finalStory = createStory(noun1, verb1, adjective1, noun2, verb2, adjective2, noun3);

        // print/ display the completed story 
        System.out.println("\nHere’s your completed Mad Lib:\n");
        System.out.println(finalStory);

        // close scanner 
        input.close();
    }
}
