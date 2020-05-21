public class Hitung<T extends Comparable>   {
	private T x;
	private T y;

	public Hitung (T x, T y){	
		this.x = x;
		this.y = y;
	}
	public T maksimal() {
		if (x.compareTo(y)>=0)
			return x;
		else
			return y;
	}

	public static <T> T cekKesamaan (T x, T y) {
		if (x.equals(y))
			return x;
		else
			return y;

	}
}