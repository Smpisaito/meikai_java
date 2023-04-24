// パッケージの宣言
package Ensyu7_22;

import java.util.Scanner;

/*
* クラス名：Ensyu7_22
* 概要：演習7-22クラス
* 作成者：S.Saito
* 作成日：2023.04.24
*/
public class Ensyu7_22 {
	
	/*
	 * 関数名：inputInteger
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
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
	 * 関数名：inputPlus
	 * 概要：「(引数の文字)：」と表示し、その後に正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
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
	
	/*
	 * 関数名：inputArray
	 * 概要：int型の配列の全要素に値を入れる。
	 * 引数：arrayNumber[] … 値を入れるint型の配列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static void inputArray(int[] arrayNumber){
		// 配列の値の入力であることを示す表示。
		System.out.println("各要素に値を入れてください。");
		// 配列の要素数をもとにループする。
		for (int loopNumber = 0; loopNumber < arrayNumber.length; loopNumber++) {
			// 全ての要素の値を合計する。
			arrayNumber[loopNumber] = inputInteger("[" + loopNumber + "]");
		}
	}
	
	/*
	 * 関数名：inpurRange
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求める。最小値となる引数の値以上の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 *       lowerNumber … 入力する値の最小値
	 *       higherNumber … 入力する値の最大値
	 * 戻り値：integerNumber … 最小値以上最大値以下の入力した整数値を返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int inputRange(String outputWord, int lowerNumber, int higherNumber) {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 最小値より大きい値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger(outputWord);
			// 入力範囲の整数値ではないときに分岐する。
			if (integerNumber < lowerNumber || integerNumber > higherNumber) {
				// 正しい整数値を入力するように促す。
				System.out.println(lowerNumber + "以上" + higherNumber + "以下の値を入力してください。");
			}
		// 入力した値が適さないならループする。
		} while( integerNumber < lowerNumber || integerNumber > higherNumber);
		// 最後に入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：printArray
	 * 概要：int型の配列の全ての値を表示する。
	 * 引数：arrayNumber … int型の配列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static void printArray(int[] arrayNumber) {
		// 「｛ 」を表示する。
		System.out.print("{ ");
		// 末尾以外全ての要素を確認する。
		for (int loopNumber = 0;loopNumber < arrayNumber.length - 1; loopNumber++) {
			// 要素の値を表示する。
			System.out.print(arrayNumber[loopNumber] + ", ");
		}
		// 末尾と「 } 」を表示する。
		System.out.println(arrayNumber[arrayNumber.length - 1] +" }");
	}
	
	/*
	 * 関数名：arrayClone
	 * 概要：引数の配列と同じ要素数で全ての要素の値が同じ配列を返却する。変数名・引数名は指定されたものを用いる。
	 * 引数：a[] … コピー元となる配列
	 * 戻り値：copyArray[] … コピーした配列
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static int[] arrayClone(int[] a) {
		// 引数の配列の要素数を出す。
		int copyElements = a.length;
		// 要素数から戻り値となる配列をつくる。
		int[] copyArray = new int[copyElements];
		// 戻り値となる配列に引数の配列の値を入れるループ。
		for (int loopNumber = 0; loopNumber < copyElements; loopNumber++) {
			// 各要素の値を移す。
			copyArray[loopNumber] = a[loopNumber];
		}
		// 戻り値である配列を返す。
		return copyArray;
	}
	
	/*
	 * 関数名：main
	 * 概要：配列をつくり、その配列の要素数と全ての要素の値がまったく同じ配列をつくる。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	public static void main(String[] args){
		/// 要素数の入力を行う。(1以上)
		int arrayElements = inputPlus("要素数");
		// 要素数をもとに配列をつくる。
		int[] arrayNumber = new int[arrayElements];
		// 要素に入力を行う。(整数値自由)
		inputArray(arrayNumber);
		
		// つくった配列のコピーをつくる。
		int[] copyArray = arrayClone(arrayNumber);
		// 結果をわかりやすいように改行を入れる。
		System.out.println();
		// 元の配列の表示であることを示す。
		System.out.print("コピー元の配列 = ");
		// 配列の値を表示する
		printArray(arrayNumber);
		// 元の配列の表示であることを示す。
		System.out.print("コピー先の配列 = ");
		// 配列の値を表示する
		printArray(copyArray);
		
		
	}
	
}
