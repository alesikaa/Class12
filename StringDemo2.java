package Class12;

public class StringDemo2 {
    public static void main(String[] args) {
        // only converts the Upper case letters to the lower case
         String str= "Java is FUN 2545%#";
         String newStr= str.toLowerCase();
        System.out.println(newStr);

        String str2="I love Java";
        String upperCaseLetter= str2.toUpperCase();
        System.out.println(upperCaseLetter);
    }
}
