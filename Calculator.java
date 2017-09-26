/** класс реализует калькулятор
 */
public class Calculator {
	/** результат вычесления
	 */
	private int result;

	/** суммируем аргументы
	 @param params Аргументы суммирования
	 */
	public void add(int ... params) {
		for(Integer param: params) {
			this.result += param;
		}
	}


	public void minus(int first, int second) {

			this.result = first - second;
		}


	/** умножаем аргументы

	 */
	public void umnoz(int first, int second) {
		this.result = first * second;
		}


	/** делим аргументы

	 */
	public void divide(int first, int second) {

			this.result = first / second;

	}


	/** Получить результат.
	 @return результат вычисления.
	 */
	public int getResult() {
		return this.result;
	}

	/** Очистить результат вычисления.
	 */
	public void cleanResult() {
		this.result = 0;
	}

}