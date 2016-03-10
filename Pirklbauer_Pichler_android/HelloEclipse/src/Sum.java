
public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;
		Out.println("Bitte Zahlen eingeben:"); 
		number = In.readInt();
		while (number > 0) { 
			sum = sum + number;
			number = In.readInt();
			}
		Out.print("Die Summe ist: ");
		Out.println(sum);
	}
}
