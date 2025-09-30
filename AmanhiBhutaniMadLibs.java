import java.util.HashMap;
import java.util.Scanner;

public class AmanchiBhutaniMadLibs {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Mad Libs Generator! ---");
        HashMap<String, String> wordSubstitutions = collectInputs();
        generateStory(wordSubstitutions);
        scanner.close();
    }

    public static HashMap<String, String> collectInputs() {
        HashMap<String, String> words = new HashMap<>();
        
        System.out.println("\nPlease provide the following words:");
        System.out.print("1. Enter a NOUN (singular object): ");
        
        words.put("NOUN_S", scanner.nextLine().trim().toLowerCase());
        
        System.out.print("2. Enter a PLURAL NOUN: ");
        words.put("NOUN_P", scanner.nextLine().trim().toLowerCase());

        System.out.print("3. Enter an ADJECTIVE: ");
        words.put("ADJECTIVE_1", scanner.nextLine().trim().toLowerCase());

        System.out.print("4. Enter a VERB (present tense, e.g., 'run'): ");
        words.put("VERB_P", scanner.nextLine().trim().toLowerCase());

        System.out.print("5. Enter a PLACE (e.g., city, planet): ");
        words.put("PLACE", scanner.nextLine().trim());

        System.out.print("6. Enter an ADJECTIVE (describing speed/size): ");
        words.put("ADJECTIVE_2", scanner.nextLine().trim().toLowerCase());

        System.out.print("7. Enter a proper NAME (person or character): ");
        words.put("NAME", scanner.nextLine().trim());
    
        return words;
    }

    public static void generateStory(HashMap<String, String> substitutions) {
        String storyTemplate = String.format(
            "\n*** Your Completed Mad Lib ***\n" +
            "In the universe 216 of the MCU there was a %s named %s.\n" +
            "They dreamt of finding all of the %s infinity stones that could gain them power and rule the world %s.\n" +
            "One day, while exploring the universe, they saw a group of %s\n" +
            "that began to %s loudly. The %s named %s quickly fought them and then the universe was protected and they gaiend the inifnity stones",
            substitutions.get("NOUN_S"),      
            substitutions.get("NAME"),        
            substitutions.get("ADJECTIVE_1"), 
            substitutions.get("PLACE"),       
            substitutions.get("NOUN_P"),      
            substitutions.get("VERB_P"),      
            substitutions.get("ADJECTIVE_2"),
            substitutions.get("NAME")        
        );

        System.out.println(storyTemplate);
        System.out.println("\n-----------------------------------------");
    }
}
