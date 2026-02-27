import java.util.Scanner;
public class palindromecheckerapp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String word = sc.nextLine();
        String reversed = "";
        for(int i=word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        if(word.equals(reversed)){
            System.out.println("The string \" " + word + "\" is a palindrome");
        }
        else{
            System.out.println("The string \" " + word + "\" is not a palindrome");
        }
    }
}
