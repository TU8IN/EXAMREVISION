
import java.util.Scanner;
public class input
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
String temp;
System.out.print("What is your name? ");
temp = keyboard.nextLine();
System.out.print("Hello " + temp);
}
}
