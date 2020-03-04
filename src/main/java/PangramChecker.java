import java.util.HashSet;
public class PangramChecker {

    String phrase;

    public boolean isPangram(String input) {

        if (input.isEmpty()) return false;

        phrase = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        HashSet<Character> characters = new HashSet<Character>();

        for (int i = 0; i<phrase.length(); i++) {
            char currentChar = phrase.charAt(i);
            characters.add(currentChar);
        }

        return characters.size() == 26;
    }
}