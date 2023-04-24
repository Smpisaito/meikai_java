// パッケージの宣言
package Ensyu7_21;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：
* 概要：
* 作成者：S.Saito
* 作成日：
*/
public class Ensyu7_21 {
	
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
	 * 関数名：checkLower
	 * 概要：二つの整数値の小さいほうを返す。
	 * 引数：firstNumber … 比べる整数値の一つ目
	 *       secondNumber … 比べる整数値の二つ目
	 * 戻り値：lowerNumber … 整数値の低いほうの値
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static int checkLower(int firstNumber, int secondNumber) {
		// 戻り値を設定する。
		int lowerNumber = 0;
		// firstNumberの値のほうが低いときの分岐。
		if (firstNumber < secondNumber) {
			// 戻り値にfirstNumberの値を入れる。
			lowerNumber = firstNumber;
		// secondNumberの値のほうが低いか同値のときの分岐。
		} else {
			// 戻り値にsecondNumberの値を入れる。
			lowerNumber = secondNumber;
		}
		// 戻り値を返す。
		return lowerNumber;
	}
	
	/*
	 * 関数名：aryExchng
	 * 概要：二つの配列の全要素を入れ替える。入れ替える配列の要素数が異なる場合は小さい方の要素数分の要素を交換する。関数名・引数名は指定のものを使う。
	 * 引数：a[] … 配列の一つ目
	 *       b[] … 配列の二つ目
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static void aryExchng(int[] a, int[] b){
		
		// 配列の要素数の少ないほうの値を出す。
		int lowerElements = checkLower(a.length, b.length);
		// 配列の要素を入れ替えるループ。
		for (int loopNumber = 0; loopNumber < lowerElements; loopNumber++) {
			// int型の変数に配列aの要素の値を移す。
			int changeNumber = a[loopNumber];
			// 配列aの要素に配列bの要素の値を入れる。
			a[loopNumber] = b[loopNumber];
			// 配列bに変数に移した配列aの元の値を入れる。
			b[loopNumber] = changeNumber;
		}
	}

	/*
	 * 関数名：main
	 * 概要：二つの配列をつくり、その値の全要素を入れ替えたことを確認する。要素数が違う場合は小さいほうの要素数分の交換を行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	public static void main(String[] args){
		
		// 配列a(表記)の要素数の入力を行う。(1以上)
		int firstElements = inputPlus("配列aの要素数");
		// 配列a(表記)の要素数をもとに配列をつくる。
		int[] arrayFirst = new int[firstElements];
		// 配列a(表記)の要素に入力を行う。(整数値自由)
		inputArray(arrayFirst);
		
		// 配列b(表記)の要素数の入力を行う。(1以上)
		int secondElements = inputPlus("配列bの要素数");
		// 配列b(表記)の要素数をもとに配列をつくる。
		int[] arraySecond = new int[secondElements];
		// 配列b(表記)の要素に入力を行う。(整数値自由)
		inputArray(arraySecond);
		
		// 二つの配列の全要素の入れ替えを行う。
		aryExchng(arrayFirst, arraySecond);
		// 結果がわかりやすいように改行を入れる。
		System.out.println();
		// 配列a(表記)であることを示すような表示をする。
		System.out.print("配列a = ");
		// 入れ替え後の配列a(表記)を表示する。
		printArray(arrayFirst);
		// 配列b(表記)であることを示すような表示をする。
		System.out.print("配列b = ");
		// 入れ替え後の配列b(表記)を表示する。
		printArray(arraySecond);
		
	}
}
