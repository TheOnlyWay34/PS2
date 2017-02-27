package pkgBase;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		setiValue(iValue);
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven() {
		return (getiValue() % 2) == 0;
	}

	public boolean isOdd() {
		return (getiValue() % 2) != 0;
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
		return (var1 % 2) == 0;
	}

	public static boolean isOdd(int var2) {
		return (var2 % 2) != 0;
	}

	public static boolean isPrime(int var3) {
		for (int a = 2; a <= (var3 / 2); a += 1) {
			if (var3 % a == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger i) {
		return (i.iValue % 2) == 0;
	}

	public static boolean isOdd(MyInteger j) {
		return (j.iValue % 2) != 0;
	}

	public static boolean isPrime(MyInteger k) {
		for (int b = 2; b <= (k.iValue / 2); b += 1) {
			if (k.iValue % b == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(int d) {
		return d == getiValue();
	}

	public boolean equals(MyInteger e) {
		return e.iValue == getiValue();
	}
}
