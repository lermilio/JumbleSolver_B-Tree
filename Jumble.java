package prog09;

import java.io.File;
import java.util.Scanner;

import prog02.UserInterface;
import prog02.ConsoleUI;
import prog02.GUI;
import java.util.Map;
import java.util.TreeMap;

public class Jumble {
    /**
     * Sort the letters in a word.
     * @param word Input word to be sorted, like "computer".
     * @return Sorted version of word, like "cemoptru".
     */
    public static String sort (String word) {
        char[] sorted = new char[word.length()];
        for (int n = 0; n < word.length(); n++) {
            char c = word.charAt(n);
            int i = n;

            while (i > 0 && c < sorted[i-1]) {
                sorted[i] = sorted[i-1];
                i--;
            }

            sorted[i] = c;
        }

        return new String(sorted, 0, word.length());
    }

    public static void main (String[] args) {
        UserInterface ui = new GUI("Jumble");
        // UserInterface ui = new ConsoleUI();

        //Map<String,String> map = new TreeMap<String,String>();
        //Map<String,String> map = new PDMap();
        //Map<String,String> map = new LinkedMap<String,String>();
        //Map<String,String> map = new SkipMap<String,String>();
        Map<String,String> map = new BTree(128);

        Scanner in = null;
        do {
            String fileName = null;
            try {
                fileName = ui.getInfo("Enter word file.");
                if (fileName == null)
                    return;
                in = new Scanner(new File(fileName));
            } catch (Exception e) {
                ui.sendMessage(fileName + " not found.");
                System.out.println(e);
                System.out.println("Try again.");
            }
        } while (in == null);

        int n = 0;
        while (in.hasNextLine()) {
            String word = in.nextLine();
            if (n++ % 1000 == 0)
                System.out.println(word + " sorted is " + sort(word));

            // EXERCISE: Insert an entry for word into map.
            map.put(sort(word), word);
            //map.remove(word);
            //map.get(word);
            //map.put(sort(word), word);
            // What is the key?  What is the value?
            ///

            ///
        }

        String removing = ui.getInfo("Enter word to remove: ");
        System.out.println("removing the word "+ removing);
        String removed = map.remove(removing);
        if(removed != null){
            System.out.println("Failed");
        }
        else{
            System.out.println("Passed");
        }

        while (true) {
            String jumble = ui.getInfo("Enter jumble.");
            if (jumble == null)
                return;

            String word = null;
            // EXERCISE:  Look up the jumble in the map.
            word = map.get(sort(jumble));
            // What key do you use?
            ///

            ///

            if (word == null)
                ui.sendMessage("No match for " + jumble);
            else
                ui.sendMessage(jumble + " unjumbled is " + word);
        }
    }
}





