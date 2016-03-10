
public class PrintMulTab {

	public static void main(String[] arg) {
		int n = In.readInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				Out.print(i * j);
				Out.print(" ");
			}
			Out.println();
		}
	}

}
