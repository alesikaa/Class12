package Class12;

public class StringDemo3 {
    public static void main(String[] args) {
        String firstName="Olesea";
        String lastName="Chetraru";
        String fullName=firstName+ " "+lastName;//most widely used
        System.out.println(fullName);
        System.out.println(firstName+ " "+lastName);
        System.out.println(firstName.concat(" "+lastName));
    }
}
