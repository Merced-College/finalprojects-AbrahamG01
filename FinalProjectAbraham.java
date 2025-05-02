import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    static HashMap<String, String>englishToSpanish = new HashMap<>();
    static HashMap<String, String>englishToJapanese = new HashMap<>();


public static void setupLanguageData() {
  englishToSpanish.put("hello","hola");
  englishToSpanish.put("goodbye","aidos");
  englishToSpanish.put("Thank","gracias");
  englishToSpanish.put("Hey","oye, oiga");
  englishToSpanish.put("yes","si'");
  englishToSpanish.put("can i help you","te puedo ayuda?'");
  
  englishToJapanese.put("hello","konnichiwa");
  englishToJapanese.put("goodbye","ya nesayanara (forever)");
  englishToJapanese.put("Thank","arigatou, arigatogozaimasu");
  englishToJapanese.put("Hey","nee, oi");
  englishToJapanese.put("yes","hai");
  englishToJapanese.put("can i help you","otetsudai shimashou ka?");
  
}

public static void displayAnyAvailableWords(HashMap<String, String> dict, String language) {
    System.out.println("Available " + language + "translations");
    for (String key : dict.keySet()) {
        System.out.println(" " + key + " > " + dict.get(key));
    }
  } 

public static void displayMenu() {
    System.out.println("Translator ");
    System.out.println("1. Translate to Spanish ");
    System.out.println("2. Translate to Japanese");
    System.out.println("3. Exit");
    System.out.println("Choose an option: ");
    
    
}


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    setupLanguageData();

    while(true){
        displayMenu();
        String input = scanner.nextLine();
        int choice;

        try {
            choice = Integer.parseInt(input);
        }  catch (NumberFormatException e) {
            System.out.println("Please enter a number (1, 2, or 3). ");
            continue;
        


    } if (choice == 1) {
        displayAnyAvailableWords( englishToSpanish, "Spanish");
        System.out.println("Enter English word: ");
        String word = scanner.nextLine().toLowerCase();
        System.out.println("Spanish: " + englishToSpanish.getOrDefault(word, " Not found "));
    

    } else if (choice == 2) {
          displayAnyAvailableWords( englishToJapanese, "Japanese");
        System.out.print("Enter English word: ");
        String word = scanner.nextLine().toLowerCase();
        System.out.println("Japanese (Romaji): " +  englishToJapanese.getOrDefault(word, " Not found "));
    } else if (choice == 3) { 
        System.out.println("Exiting..... Goodbye");
        break;
    }else {
        System.out.println("Invalid Operation. Try again.");

        }
    }
    scanner.close();
   }
}



