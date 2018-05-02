import java.util.Arrays;
import java.util.ArrayList;

public class Grades {

	public static void main(String[] args) {

		int[] Noten = { 1, 1, 3, 2, 4, 5, 5, 4, 4, 3, 2, 2, 1, 1, 3, 2, 4, 5, 4, 3, 2, 1, 4, 4, 3, 2, 1, 1, 5, 3 };

		System.out.println(Arrays.toString(Noten));
		System.out.println(NotenDurchschnitt(Noten));
		ArrayList<Integer> notenSpiegel = new ArrayList<Integer>();
		notenSpiegel.add(AnzahlNote(Noten, 1));
		notenSpiegel.add(AnzahlNote(Noten, 2));
		notenSpiegel.add(AnzahlNote(Noten, 3));
		notenSpiegel.add(AnzahlNote(Noten, 4));
		notenSpiegel.add(AnzahlNote(Noten, 5));
		System.out.println(notenSpiegel);
	}

	public static double NotenDurchschnitt(int[] a) {
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			b = b + a[i];
		}
		return b / a.length;
	}

	public static int AnzahlNote(int[] a, int note) {
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == note) {
				b++;
			}
		}
		return b;

	}
}