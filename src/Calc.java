
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws IOException {
        double x;
        double y;
        double sum=0;

  //6      String operation ="";

    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: " );
        x = scanner.nextInt();
        System.out.print("Enter first number: " );
        y = scanner.nextInt();

        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.print("chose what do you want todo: + , - , * , /");

        String operation=br.readLine();

        if (operation.equals("+")){sum = x+y; }
        if (operation.equals("-")){sum = x-y; }
        if (operation.equals("*")){sum = x*y; }
        if (operation.equals("/")){sum = x/y; }
        System.out.println("resultatas: "+ sum);
    }
}
