import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the string:");
        String inputString=scanner.nextLine();
        if(checkPattern(inputString)){
            System.out.println("Pattern matched");
        }
        else{
            System.out.println("Pattern mismatch");
        }
    }
    public static boolean checkPattern(String inputString){
        return Pattern.matches("[A-Z][a-zA-Z\\s]*[.]",inputString);
    }
}
