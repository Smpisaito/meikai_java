// パッケージの宣言
package Ensyu7_32;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu7_32
* 概要：演習7-32クラス
* 作成者：S.Saito
* 作成日：2023.04.26
*/
public class Ensyu7_32 {
	
	/*
	 * 関数名：inputByte
	 * 概要：整数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：byteNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static byte inputByte() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		byte byteNumber = 0;
		// 整数値の入力を行う。
		byteNumber = standardInput.nextByte();
		// 入力した値を返す。
		return byteNumber;
	}

	/*
	 * 関数名：inputByte
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：byteNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static byte inputByte(String outputWord) {
		// 入力を行う変数をつくる。
		byte byteNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		byteNumber = inputByte();
		// 入力した値を返す。
		return byteNumber;
	}
	
	/*
	 * 関数名：inputShort
	 * 概要：整数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：shortNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static short inputShort() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		short shortNumber = 0;
		// 整数値の入力を行う。
		shortNumber = standardInput.nextShort();
		// 入力した値を返す。
		return shortNumber;
	}

	/*
	 * 関数名：inputShort
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：shortNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static short inputShort(String outputWord) {
		// 入力を行う変数をつくる。
		short shortNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		shortNumber = inputShort();
		// 入力した値を返す。
		return shortNumber;
	}
	
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
	 * 関数名：printBits
	 * 概要：byte型の整数のビット構造の内容を表示する。関数名・引数名は指定のものを使う。
	 * 引数：x … byte型の整数値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static void printBits(byte x) {
		// byte型のビット数を示すfinal変数。
		final byte BYTE_BITS = 8;
		// byte型(8bit)の全てを確認する。
		for (byte loopNumber = BYTE_BITS - 1; loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
		}
	}
	
	/*
	 * 関数名：printBits
	 * 概要：short型の整数のビット構造の内容を表示する。関数名・引数名は指定のものを使う。
	 * 引数：x … short型の整数値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static void printBits(short x) {
		// short型のビット数を示すfinal変数。
		final short SHORT_BITS = 16;
		// short型(16bit)の全てを確認する。
		for (short loopNumber = SHORT_BITS - 1;loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
		}
	}
	
	/*
	 * 関数名：printBits
	 * 概要：int型の整数のビット構造の内容を表示する。関数名・引数名は指定のものを使う。
	 * 引数：x … int型の整数値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static void printBits(int x) {
		// int型のビット数を示すfinal変数。
		final int INT_BITS = 32;
		// int型(32bit)の全てを確認する。
		for (int loopNumber = INT_BITS - 1;loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
		}
	}
	
	/*
	 * 関数名：printBits
	 * 概要：long型の整数のビット構造の内容を表示する。関数名・引数名は指定のものを使う。
	 * 引数：x … long型の整数値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static void printBits(long x) {
		// long型のビット数を示すfinal変数。
		final long LONG_BITS = 64;
		// long型(64bit)の全てを確認する。
		for (long loopNumber = LONG_BITS - 1;loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
		}
	}
	
	/*
	 * 関数名：main
	 * 概要：byte型、short型、int型、long型の値をそれぞれ入力し、その内部のビットを表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.
	 */
	public static void main(String[] args){
		
		// byte型の変数に入力を行う。
		byte byteNumber = inputByte("byte型の値");
		// short型の変数に入力を行う。
		short shortNumber = inputShort("short型の値");
		// int型の変数に値を入力する。
		int integerNumber = inputInteger("int型の値");
		// long型の変数に値を入力する。
		long longNumber = inputLong("long型の値");
		// 入力の内容と結果の内容を分けるための改行
		System.out.println();
		
		// byte型の値のビット数であることを示す表示をする
		System.out.println("byte型の値のビット数");
		// byte型の変数のビット数を示す。
		printBits(byteNumber);
		// 結果の改行
		System.out.println();
		// short型の値のビット数であることを示す表示をする
		System.out.println("short型の値のビット数");
		// short型の変数のビット数を示す。
		printBits(shortNumber);
		// 結果の改行
		System.out.println();
		// int型の値のビット数であることを示す表示をする
		System.out.println("int型の値のビット数");
		// int型の変数のビット数を示す。
		printBits(integerNumber);
		// 結果の改行
		System.out.println();
		// long型の値のビット数であることを示す表示をする
		System.out.println("long型の値のビット数");
		// long型の変数のビット数を示す。
		printBits(longNumber);
		// 結果の改行
		System.out.println();
	}
}
