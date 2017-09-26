import java.util.Scanner;

/**
 * Created by Alpha on 26.09.2017.
 */
public class ArgRunner {
    public static void main(String[] args) {
        String choise;
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Choose operation: + ; - ; * ; /");
        choise = sc.nextLine();
        if(choise.equals("+"))
            calc.add(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        else if(choise.equals("-"))
            calc.minus(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        else if(choise.equals("/"))
            calc.divide(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        else if(choise.equals("*"))
            calc.umnoz(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        System.out.println("Result: " + calc.getResult());
    }
}
