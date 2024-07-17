package extend.phone;

public interface Phone {
	// public static finalが省略されている。必ず定数
	int MAX_NUMBER_DIGITS = 11;
	
	// public abstractが省略されている
	void call(String number);

}
