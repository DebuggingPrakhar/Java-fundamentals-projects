package Projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessTheNumber {
   public static void main(String[] args) throws IOException {
      Game player = new Game();
      int totalGuesses = 0;    // Tracks score for the final win message
      int intervalCount = 0;   // Tracks the 5-guess limit for the prompt

      while(true) {
         try {
            player.takeUserInput();
            totalGuesses++;
            intervalCount++;
            player.setNoOfGuesses(totalGuesses);
         } catch (Exception e) {
            System.out.println(e.getMessage());
            continue; 
         }

         // Condition 1: Check for Win
         if (player.isCorrectNumber()) {
            System.out.println("🎉 Guessed right!");
            System.out.println("Total Guesses you took: " + totalGuesses);
            break; 
         } 

         // Condition 2: Provide hints
         if (player.userGenerated > player.compGenerated && player.userGenerated - player.compGenerated <= 7) {
            System.out.println("Try something little smaller");
         } else if (player.userGenerated > player.compGenerated && player.userGenerated - player.compGenerated >= 8) {
            System.out.println("Try something quite smaller");
         } else if (player.userGenerated < player.compGenerated && player.compGenerated - player.userGenerated <= 7) {
            System.out.println("Try something little larger");
         } else {
            System.out.println("Try something quite larger");
         }

         // Condition 3: Check for "Continue" every 5 guesses
         if (intervalCount == 5) {
            System.out.println("Do you want to continue? (Y/N)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String ans = br.readLine();
            
            if (ans != null && (ans.equalsIgnoreCase("Y"))) {
               intervalCount = 0; // Reset only the interval, keep the totalGuesses!
            } else {
               System.out.println("Game Over! The number was: " + player.compGenerated);
               System.exit(0);
            }
         }
      }
   }
}
