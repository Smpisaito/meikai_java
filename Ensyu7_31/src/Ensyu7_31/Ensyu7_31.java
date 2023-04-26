// パッケージの宣言
package Ensyu7_31;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu7_31
* 概要：演習7-31クラス
* 作成者：S.Saito
* 作成日：2023.04.26
*/
public class Ensyu7_31 {
	
	/*
	 * 関数名：inputInteger
	 * 概要：整数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：integerNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int inputInteger() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 整数値の入力を行う。
		integerNumber = standardInput.nextInt();
		// 入力した値を返す。
		return integerNumber;
	}

	/*
	 * 関数名：inputInteger
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int inputInteger(String outputWord) {
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		integerNumber = inputInteger();
		// 入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：inputLong
	 * 概要：整数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：longNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static long inputLong() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		long longNumber = 0;
		// 整数値の入力を行う。
		longNumber = standardInput.nextLong();
		// 入力した値を返す。
		return longNumber;
	}

	/*
	 * 関数名：inputLong
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：longNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static long inputLong(String outputWord) {
		// 入力を行う変数をつくる。
		long longNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		longNumber = inputLong();
		// 入力した値を返す。
		return longNumber;
	}
	
	/*
	 * 関数名：inputFloat
	 * 概要：実数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：floatNumber … 実数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static float inputFloat() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		float floatNumber = 0;
		// 整数値の入力を行う。
		floatNumber = standardInput.nextFloat();
		// 入力した値を返す。
		return floatNumber;
	}

	/*
	 * 関数名：inputFloat
	 * 概要：「(引数の文字)：」と表示し、その後に実数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：floatNumber … 実数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static float inputFloat(String outputWord) {
		// 入力を行う変数をつくる。
		float floatNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		floatNumber = inputFloat();
		// 入力した値を返す。
		return floatNumber;
	}
	
	/*
	 * 関数名：inputDoubla
	 * 概要：実数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：doubleNumber … 実数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static double inputDouble() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		double doubleNumber = 0;
		// 整数値の入力を行う。
		doubleNumber = standardInput.nextDouble();
		// 入力した値を返す。
		return doubleNumber;
	}

	/*
	 * 関数名：inputDouble
	 * 概要：「(引数の文字)：」と表示し、その後に実数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：doubleNumber … 実数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static double inputDouble(String outputWord) {
		// 入力を行う変数をつくる。
		double doubleNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		doubleNumber = inputDouble();
		// 入力した値を返す。
		return doubleNumber;
	}
	
	/*
	 * 関数名：absolute
	 * 概要：int型の引数の絶対値を求める。関数名・引数名は指定のものを使う。
	 * 引数：x … int型の引数
	 * 戻り値：absoluteValue … 絶対値
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int absolute(int x) {
		// 戻り値を初期値xとしてつくる。
		int absoluteValue = x;
		// int型で-1のfinal変数をつくる。
		final int MINUS_NUMBER = -1;
		// 戻り値が負の値のときの分岐。
		if (absoluteValue < 0) {
			// 戻り値に-1をかけて正にする
			absoluteValue *= MINUS_NUMBER;
		}
		// 戻り値を返す。
		return absoluteValue;
	}
	
	/*
	 * 関数名：absolute
	 * 概要：long型の引数の絶対値を求める。関数名・引数名は指定のものを使う。
	 * 引数：x … long型の引数
	 * 戻り値：absoluteValue … 絶対値
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static long absolute(long x) {
		// 戻り値を初期値xとしてつくる。
		long absoluteValue = x;
		// long型で-1のfinal変数をつくる。
		final int MINUS_NUMBER = -1;
		// 戻り値が負の値のときの分岐。
		if (absoluteValue < 0) {
			// 戻り値に-1をかけて正にする
			absoluteValue *= MINUS_NUMBER;
		}
		// 戻り値を返す。
		return absoluteValue;
	}
	
	/*
	 * 関数名：absolute
	 * 概要：float型の引数の絶対値を求める。関数名・引数名は指定のものを使う。
	 * 引数：x … float型の引数
	 * 戻り値：absoluteValue … 絶対値
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static float absolute(float x) {
		// 戻り値を初期値xとしてつくる。
		float absoluteValue = x;
		// int型で-1のfinal変数をつくる。
		final int MINUS_NUMBER = -1;
		// 戻り値が負の値のときの分岐。
		if (absoluteValue < 0) {
			// 戻り値に-1をかけて正にする
			absoluteValue *= MINUS_NUMBER;
		}
		// 戻り値を返す。
		return absoluteValue;
	}
	
	/*
	 * 関数名：absolute
	 * 概要：double型の引数の絶対値を求める。関数名・引数名は指定のものを使う。
	 * 引数：x … double型の引数
	 * 戻り値：absoluteValue … 絶対値
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static double absolute(double x) {
		// 戻り値を初期値xとしてつくる。
		double absoluteValue = x;
		// int型で-1のfinal変数をつくる。
		final int MINUS_NUMBER = -1;
		// 戻り値が負の値のときの分岐。
		if (absoluteValue < 0) {
			// 戻り値に-1をかけて正にする
			absoluteValue *= MINUS_NUMBER;
		}
		// 戻り値を返す。
		return absoluteValue;
	}
	
	/*
	 * 関数名：main
	 * 概要：int型、long型、float型、double型の四つの変数を入力し、それぞれの値の絶対値を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	public static void main(String[] args){
		
		// int型の変数に値を入力する。
		int integerNumber = inputInteger("int型の値");
		// long型の変数に値を入力する。
		long longNumber = inputLong("long型の値");
		// float型の変数に値を入力する。
		float floatNumber = inputFloat("float型の値");
		// double型の変数に値を入力する。
		double doubleNumber = inputDouble("double型の値");
		
		// int型の値の絶対値を求める。
		int absoluteInteger = absolute(integerNumber);
		// long型の値の絶対値を求める。
		long absoluteLong = absolute(longNumber);
		// float型の値の絶対値を求める。
		float absoluteFloat = absolute(floatNumber);
		// double型の値の絶対値を求める。
		double absoluteDouble = absolute(doubleNumber);
		
		// int型の絶対値を表示する。
		System.out.println("int型の値の絶対値：" + absoluteInteger);
		// long型の絶対値を表示する。
		System.out.println("long型の値の絶対値：" + absoluteLong);
		// float型の絶対値を表示する。
		System.out.println("float型の値の絶対値：" + absoluteFloat);
		// double型の絶対値を表示する。
		System.out.println("double型の値の絶対値：" + absoluteDouble);
		
	}
}
