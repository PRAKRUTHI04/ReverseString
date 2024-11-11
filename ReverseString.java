import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = s.nextLine();
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            reversed += ch;
        }
        System.out.println("reversed string is: "+ reversed);
    }
}
