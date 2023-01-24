package Class12;

import java.time.chrono.JapaneseChronology;

public class Task6 {
    public static void main(String[] args) {
        String [][] countries= {{"USA", "Canada", "Mexico" },
                {"Brazil", "Argentina", "Peru", "Columbia", "Chile" },
                {"Germany", "United Kingdom", "France", "Spain" },
                {"China", "India", "Japan", "Russia" },
                {"Egypt", "Nigeria", "South Africa", "Ethiopia" }
        };
        System.out.println(countries[3].length);

        int counter=0;
        // using normal for loop
        for (int i=0;i<countries.length;i++){
            for (int j=0; j<countries[i].length; j++){
                System.out.println(countries[i][j]+ " ");
                counter++;
            }
            System.out.println();
        }
        // using enhanced for loop
        for (String[] country : countries){
            for (String s : country){
                System.out.print(s + " ");
                counter++;
            }
            System.out.println();
        }


        System.out.println("Total countries "+counter);
    }
}
