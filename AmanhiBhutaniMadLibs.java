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
            "In a galaxy far, far away, there lived a lonely %s named %s.\n" +
            "They dreamt of finding a large, %s ship that could take them to the beautiful planet %s.\n" +
            "One day, while exploring the asteroid belt, they saw a group of %s\n" +
            "that began to %s loudly. The %s named %s quickly climbed into a rusty escape pod and flew away at top speed.",
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
