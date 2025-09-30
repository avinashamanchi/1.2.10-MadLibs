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

        // Word Substitution 1
        System.out.print("1. Enter a NOUN (singular): ");
        words.put("NOUN_S", scanner.nextLine().trim());

        // Word Substitution 2
        System.out.print("2. Enter a PLURAL NOUN: ");
        words.put("NOUN_P", scanner.nextLine().trim());

        // Word Substitution 3
        System.out.print("3. Enter an ADJECTIVE: ");
        words.put("ADJECTIVE_1", scanner.nextLine().trim());

        // Word Substitution 4
        System.out.print("4. Enter a VERB (present tense): ");
        words.put("VERB_P", scanner.nextLine().trim());

        // Word Substitution 5
        System.out.print("5. Enter a PLACE: ");
        words.put("PLACE", scanner.nextLine().trim());

        // Word Substitution 6
        System.out.print("6. Enter an ADJECTIVE (another one): ");
        words.put("ADJECTIVE_2", scanner.nextLine().trim());

        // Word Substitution 7
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
            "that began to %s loudly. %s quickly climbed into a rusty %s\n" +
            "escape pod and flew away at top speed.",
            substitutions.get("NOUN_S"),        // 1. NOUN_S
            substitutions.get("NAME"),          // 7. NAME
            substitutions.get("ADJECTIVE_1"),   // 3. ADJECTIVE_1
            substitutions.get("PLACE"),         // 5. PLACE
            substitutions.get("NOUN_P"),        // 2. NOUN_P
            substitutions.get("VERB_P"),        // 4. VERB_P
            substitutions.get("NAME"),          // (Repeat of NAME)
            substitutions.get("ADJECTIVE_2")    // 6. ADJECTIVE_2
        );

        System.out.println(storyTemplate);
        System.out.println("\n-----------------------------------------");
    }
}
