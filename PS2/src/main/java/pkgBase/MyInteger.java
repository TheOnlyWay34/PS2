package pkgBase;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven() {
		double x = getiValue() % 2;
		return x == 0;
	}

	public boolean isOdd() {
		double y = getiValue() % 2;
		return y != 0;
	}

	public boolean isPrime() {
		for (int z = 2; z <= (getiValue() / 2); z += 1) {
			if (getiValue() % z == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int var1) {
		double x = var1 % 2;
		return x == 0;
	}

	public static boolean isOdd(int var2) {
		double y = var2 % 2;
		return y != 0;
	}

	public static boolean isPrime(int var3) {
		for (int z = 2; z <= (var3 / 2); z += 1) {
			if (var3 % z == 0) {
				return false;
			}
		}
		return true;
	}
	
}
