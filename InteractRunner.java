import java.util.Scanner;

/**
 Класс для запуска калькулятора. Поддерживает ввод пользователя.
 */
public class InteractRunner{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			String operation = "+";
			while(!exit.equals("yes")) {
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				System.out.println("Choose operation: - / + - / * / /");
				operation = reader.next();
				if(operation.equals("-"))
					calc.minus(Integer.valueOf(first), Integer.valueOf(second));
				else if(operation.equals("+"))
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
				else if(operation.equals("*"))
					calc.umnoz(Integer.valueOf(first), Integer.valueOf(second));
				else if(operation.equals("/"))
					calc.divide(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result: " + calc.getResult());
				System.out.println("Clean result?: y/n");
				String clean = reader.next();
				if(clean.equals("y")) {
					calc.cleanResult();
				}
				System.out.println("Exit : yes/no");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}