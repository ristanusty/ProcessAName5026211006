import java.util.Scanner;

public class ProcessAName5026211006 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Type your full name!");
        String FullName = scan.nextLine();
        int SpaceId = FullName.lastIndexOf(" ");
        String LastName = FullName.substring(SpaceId+1);
        System.out.println("Your name is " +LastName+ ", " +FullName.charAt(0)+ ".");

    }
}
