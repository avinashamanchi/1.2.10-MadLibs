import java.util.Scanner;

public class AmanchiBhutaniMadLibs {

    public static String getWord(Scanner input, String wordType) {
        System.out.print("Enter a " + wordType + ": ");
        return input.nextLine();
    }

    public static String createStory(String noun1, String verb1, String adjective1, String noun2, String verb2, String adjective2, String noun3) {
        String story = "";
        story += "The " + noun1 + " " + verb1 + " across the " + adjective1 + " ocean.\n";
        story += "I went to the mickey mouse club house to see " + noun2 + ". ";
        story += "There was minnie, toodles, goofy, pete and  " + verb2 + " around the door ";
        story += "which made the " + adjective2 + " " + noun3 + " go crazyyyyyyy!";
        return story;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Avi's and Hrihaans Mad Libs Generator!");
        System.out.println("You'll be asked to enter types of words to complete a story.\n");

        String noun1 = getWord(input, "noun");
        String verb1 = getWord(input, "verb");
        String adjective1 = getWord(input, "adjective");
        String noun2 = getWord(input, "noun");
        String verb2 = getWord(input, "verb");
        String adjective2 = getWord(input, "adjective");
        String noun3 = getWord(input, "noun");

        String finalStory = createStory(noun1, verb1, adjective1, noun2, verb2, adjective2, noun3);

        System.out.println("\nHere’s your completed Mad Lib:\n");
        System.out.println(finalStory);

        input.close();
    }
}
