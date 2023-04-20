// パッケージの宣言
package Ensyu7_12;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu7_12
 * 概要：演習7-12クラス
 * 作成者：S.Saito
 * 作成日：2023.04.20
 */
public class Ensyu7_12 {
	
	/*
	 * 関数名：rRotate
	 * 概要：整数xを右にnビット回転した値を返す。関数名・引数名は指定のものを使う。
	 * 引数：x … 整数
	 *       n … 整数ビットの回転数
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static void rRotate(int x, int n) {
		// ビット数の32の値を入れる。
		final int BITSCOUNT = 32;
		// nの値の32の剰余をあらわす
		int remainderInteger = n % BITSCOUNT;
		// もともと値の入っているビットのみ表示する。
		for (int loopNumber = remainderInteger - 1;loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
		}
		// 回転した値を表示する。
		for (int loopNumber = 31 ;loopNumber >= remainderInteger; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
		}
	}
	
	/*
	 * 関数名：lRotate
	 * 概要：整数xを左にnビット回転した値を返す。関数名・引数名は指定のものを使う。
	 * 引数：x … 整数
	 *       n … 整数ビットの回転数
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static void lRotate(int x, int n) {
		// ビット数の32の値を入れる。
		final int BITSCOUNT = 32;
		// nの値の32の剰余をあらわす
		int remainderInteger = n % BITSCOUNT;
		// もともと値の入っているビットのみ表示する。
		for (int loopNumber = 31 - remainderInteger;loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
		}
		// 回転した値を表示する。
		for (int loopNumber = 31 ;loopNumber > 31 - remainderInteger; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名：printBits
	 * 概要：int型の整数のbitの内容を表示する。
	 * 引数：integerNumber … int型の整数値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static void printBits(int integerNumber) {
		// int型(32bit)の全てを確認する。
		for (int loopNumber = 31;loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((integerNumber >>> loopNumber & 1) == 1) ? '1' : '0');
		}
	}
	
	/*
	 * 関数名：inputInteger
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int inputInteger(String outputWord) {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		integerNumber = standardInput.nextInt();
		// 入力した値を返す。
		return integerNumber;
	}

	
	/*
	 * 関数名：plusInteger
	 * 概要：「(引数の文字)：」と表示し、その後に正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int plusInteger(String outputWord) {
		
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
	
	/*
	 * 関数名：main
	 * 概要：入力した整数値をもとに、左右それぞれに入力した回数だけビット回転した値を求める。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	public static void main(String[] args){
		
		// 整数値の入力を行う。
		int integerNumber = inputInteger("整数値");
		// 整数値のビット回転する数の入力を行う。
		int bitsRotate = plusInteger("ビット回転する回数");
		
		// 整数値そのままのビット構成を表示することを示す。
		System.out.println("整数値のもとのビット構成");
		// ビット構成を示す。
		printBits(integerNumber);
		
		// 整数値の右にビット回転した時のビット構成。
		System.out.println("\n整数値の右にビット回転した時の値");
		// 整数値の右にビット回転した時のビット構成を表示する
		rRotate(integerNumber, bitsRotate);
		
		// 整数値の左にビット回転した時のビット構成。
		System.out.println("\n整数値の左にビット回転した時の値");
		/// 整数値の右にビット回転した時のビット構成を表示する
		lRotate(integerNumber, bitsRotate);
	}
}
