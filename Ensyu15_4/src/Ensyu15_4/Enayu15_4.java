// パッケージの宣言
package Ensyu15_4;

//入力操作の呼び出し
import java.util.Scanner;

/**
 * クラス名：Ensyu15_4
 * 概要：演習15-4クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.15
 * @author S.Saito
 *
 */
public class Enayu15_4 {
	
	/**
	 * 関数名：inputInteger<Br>
	 * 概要：整数値の入力を求め、その値を返却する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：integerNumber … 整数値として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @return integerNumber … 整数値として返却する。
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

	/**
	 * 関数名：inputInteger<Br>
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。<Br>
	 * 引数：outputWord … String型の表示に使う文字列。<Br>
	 * 戻り値：integerNumber … 整数値として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @param outputWord
	 * @return integerNumber … 整数値として返却する。
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
	
	/**
	 * 関数名：inputDoubla<Br>
	 * 概要：実数値の入力を求め、その値を返却する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：doubleNumber … 実数値として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @return doubleNumber … 実数値として返却する。
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

	/**
	 * 関数名：inputDouble<Br>
	 * 概要：「(引数の文字)：」と表示し、その後に実数値の入力を求め、その値を返却する。<Br>
	 * 引数：outputWord … String型の表示に使う文字列。<Br>
	 * 戻り値：doubleNumber … 実数値として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @param outputWord … String型の表示に使う文字列。
	 * @return doubleNumber … 実数値として返却する。
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
	
	/**
	 * 関数名：inputPlus<Br>
	 * 概要：「(引数の文字)：」と表示し、その後に正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。<Br>
	 * 引数：outputWord … String型の表示に使う文字列。<Br>
	 * 戻り値：integerNumber … 正の整数値として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @param outputWord … String型の表示に使う文字列。
	 * @return integerNumber … 正の整数値として返却する。
	 */
	static int inputPlus(String outputWord) {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 正の整数値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger(outputWord);
			// 正の整数値ではないときに分岐する。
			if (integerNumber <= 0) {
				// 正の整数値を入力するように促す。
				System.out.println("正の整数値を入力してください。");
			}
		// 入力した値が0以下ならループする。
		} while( integerNumber <= 0 );
		// 最後に入力した値を返す。
		return integerNumber;
	}
	
	/**
	 * 関数名：inpurMore<Br>
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求める。最小値となる引数の値以上の整数値が入れられるまでループし、最終的な値を返却する。<Br>
	 * 引数：outputWord … String型の表示に使う文字列。<Br>
	 *       lowerNumber … 入力する値の最小値<Br>
	 * 戻り値：integerNumber … 最小値以上の入力した整数値を返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @param outputWord … String型の表示に使う文字列。
	 * @param lowerNumber … 入力する値の最小値
	 * @return integerNumber … 最小値以上の入力した整数値を返却する。
	 */
	static int inputMore(String outputWord, int lowerNumber) {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 最小値より大きい値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger(outputWord);
			// 入力範囲の整数値ではないときに分岐する。
			if (integerNumber < lowerNumber) {
				// 正しい整数値を入力するように促す。
				System.out.println(lowerNumber + "以上の値を入力してください。");
			}
		// 入力した値が適さないならループする。
		} while( integerNumber < lowerNumber );
		// 最後に入力した値を返す。
		return integerNumber;
	}
	
	/**
	 * 関数名：printfFormatDouble<Br>
	 * 概要：小数点以下の精度と全体の最小の桁数の決まったdouble型の値を入れられる文字列を返す。<Br>
	 * 引数：decimalNumber … 小数点以下の精度。<Br>
	 *       totalNumber … 全体の最小の桁数。<Br>
	 * 戻り値：doubleFormat … printf文で引数通りの表記のdouble/froat型を入れられる文字列を返す。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @param decimalNumber … 小数点以下の精度。
	 * @param totalNumber … 全体の最小の桁数。
	 * @return doubleFormat … printf文で引数通りの表記のdouble/froat型を入れられる文字列を返す。
	 */
	static String printfFormatDouble (int decimalNumber, int totalNumber) {
		// 全体の最小の桁数や小数点以下の桁数を入れた文字列をつくる。
		String doubleFormat = String.format("%%%d.%df", totalNumber, decimalNumber);
		// 戻り値を返す。
		return doubleFormat;
	}
	
	/**
	 * 関数名：printDouble<Br>
	 * 概要：double型の引数を、小数点以下の桁数が引数で、全体も最小の桁数が引数となる文字列を表示する。関数名・引数名は指定のものを用いる<Br>
	 * 引数：x … 表示したいdouble型の値<Br>
	 *       p … 小数点以下の桁数<Br>
	 *       w … 全体の最小の桁数<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @param x … 表示したいdouble型の値
	 * @param p … 小数点以下の桁数
	 * @param w … 全体の最小の桁数
	 */
	static void printDouble (double x, int p, int w) {
		// 小数点以下の桁数と全体の最小の桁数を入力可能な文字列をつくる。
		String doubleFormat = printfFormatDouble (p, w);
		// 文字列をもとに桁数を調整した文字列
		System.out.printf(doubleFormat + "\n", x);
	}

	/**
	 * 関数名：main<Br>
	 * 概要：メソッド[printDoubleを用いてdouble型変数を好きな桁数での表示を行えるか確認する。<Br>
	 * 引数：args … コマンドライン引数<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @param args … コマンドライン引数
	 */
	public static void main(String[] args){
		// 最低の桁数を小数点以下の桁数以上(小数点を含めるため2以上)にするための2のfinal変数
		final int DECIMAL_MORE = 2;
		// 表示するdouble型の変数をつくる。
		double doubleNumber = inputDouble("表示するdouble型の値を入れてください");
		// 表示するdouble型の小数以下の部分の桁数を入力する。
		int decimalNumber = inputPlus("表示する小数点以下の桁数");
		// 表示するdouble型の全体の最小の桁数を入力する。小数点(1)と小数点以下の桁数を加えた値よりも大きい桁数にする。
		int totalNumber = inputMore("表示する最小の全体の桁数", decimalNumber + DECIMAL_MORE);
		// 桁数をもとにprintDoubleメソッドの動きを確認する。
		printDouble (doubleNumber, decimalNumber, totalNumber);
	}

	
	
	
}
