import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            //scanner.next() only takes the direct next word, so if you put in add subtract, it will only take add
            String command = scanner.next();
            
            if (command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")){
                System.out.print("Word: ");
                String word = scanner.next();
                System.out.print("Translation: ");
                String translation = scanner.next();
                simpleDictionary.add(word, translation);
            } else if (command.equals("search")){
                System.out.print("Word to be translated: ");
                String toTranslate = scanner.next();
                if (simpleDictionary.translate(toTranslate) == null) {  
                    System.out.println("Word " + toTranslate + " was not found");
                } else {
                    System.out.println("Translation: " + simpleDictionary.translate(toTranslate));
                }
            } else {
                System.out.println("Unkown command");
            }
            

        }

    }
    
}
