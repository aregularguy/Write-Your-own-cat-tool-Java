import java.io.File;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        File fs = null;
        if( 0 < args.length)
        {
            fs = new File(args[0]);

        }
        else {
            System.err.println("Invalid arguments count:" + args.length);

        }
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        String userinput = sc.nextLine();
        String command = userinput.split(" ")[1];
        System.out.println("command is " + command);


    }
}