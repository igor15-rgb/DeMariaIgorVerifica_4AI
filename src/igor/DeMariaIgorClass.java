package igor;

/**
 * <b>DeMariaIgor</b> <u>4AI</u> <i>14/03/2024</i>
 */
public class DeMariaIgorClass {
	/**
	 * Costruttore
	 */
	public DeMariaIgorClass() {
	};

	/**
	 * 
	 * @param s indice iniziale
	 * @param f indice finale
	 * @return valore restituito
	 */
	public int DeMariaMet(int s, int f) {
		int r = 0;
		for (int i = 1; i < f; i++) {
			r = r * r;
		}
		return r;
	}

	/**
	 * 
	 * @param args a
	 */
	public static void main(String[] args) {
		DeMariaIgorClass a = new DeMariaIgorClass();
		System.out.println(a.DeMariaMet(2, 3));
	}

}
