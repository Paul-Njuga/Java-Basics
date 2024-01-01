import java.util.Random;

public class RandomSentenceGenerator {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "grape", "pineapple"};
        Random random = new Random();
        StringBuilder sentence = new StringBuilder();
	
	for (int i = 0; i < 5; i++) { // You can change the loop limit based on the desired sentence length
            int randomIndex = random.nextInt(words.length); // Generates a random index between 0 and words.length - 1
            sentence.append(words[randomIndex]).append(" "); // Appends the randomly selected word to the sentence
        }

        // Capitalize the first letter of the sentence and add a period at the end
        String finalSentence = sentence.toString().trim();
        finalSentence = Character.toUpperCase(finalSentence.charAt(0)) + finalSentence.substring(1) + ".";
        System.out.println(finalSentence);
    }
}
