// パッケージの宣言
package Ensyu7_23;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu7_23
* 概要：演習7-23クラス
* 作成者：S.Saito
* 作成日：2023.04.23
*/
public class Ensyu7_23 {
	
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
	 * 関数名：arrayEqualCount
	 * 概要：配列から検索する値が要素の値と一致した数を返す
	 * 引数：firstArray[] … 検索対象の配列。
	 *       searchNumber … 検索する値
	 * 戻り値：checkCount … 一致した数
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static int arrayEqualCount(int[] firstArray, int searchNumber) {
		// 配列から引数と値が一致した個数を示す変数をつくる。
		int checkCount = 0;
		// 配列の要素数の数だけループする。
		for (int loopNumber = 0; loopNumber < firstArray.length; loopNumber++) {
			// 要素の値と検索する値が一致したときの分岐。
			if (firstArray[loopNumber] == searchNumber) {
				// 変数の値を1増やす。
				checkCount++;
			}
		}
		// 戻り値である変数を返す。
		return checkCount;
		
	}
	
	/*
	 * 関数名：arraysEqual
	 * 概要：二つの配列が等しいかどうかを示す。
	 * 引数：firstArray[] … 比べる配列の一つ目
	 *       secondArray[] … 比べる配列の二つ目
	 * 戻り値：equalCheck … boolean型の結果を示す
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static boolean arraysEqual(int[] firstArray, int[] secondArray) {
		// 	戻り値を設定する。
		boolean equalCheck = true;
		// 配列から引数と値が一致した個数を示す変数をつくる。
		if (firstArray.length != secondArray.length) {
			// falseに変える。
			equalCheck = false;
			// 結果を返す。
			return equalCheck;
		}
		// 全要素を調べるループ。
		for (int loopNumber = 0; loopNumber < firstArray.length; loopNumber++) {
			// 同じインデックスの要素の値が一致しなかった時の分岐。
			if (firstArray[loopNumber] != secondArray[loopNumber]) {
				// falseに変える。
				equalCheck = false;
				// 結果を返す。
				return equalCheck;
			}
		}
		
		// 戻り値である変数をtrueのまま返す。
		return equalCheck;
	}
	
	/*
	 * 関数名：arrayCopy
	 * 概要：引数の配列と同じ要素数で全ての要素の値が同じ配列を返却する。
	 * 引数：arrayNumber[] … コピー元となる配列
	 * 戻り値：copyArray[] … コピーした配列
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static int[] arrayCopy(int[] arrayNumber) {
		// 引数の配列の要素数を出す。
		int copyElements = arrayNumber.length;
		// 要素数から戻り値となる配列をつくる。
		int[] copyArray = new int[copyElements];
		// 戻り値となる配列に引数の配列の値を入れるループ。
		for (int loopNumber = 0; loopNumber < copyElements; loopNumber++) {
			// 各要素の値を移す。
			copyArray[loopNumber] = arrayNumber[loopNumber];
		}
		// 戻り値である配列を返す。
		return copyArray;
	}
	
	/*
	 * 関数名：arraySrchIdx
	 * 概要：配列の中から指定された値と一致する要素を探し、その要素のインデックスを先頭から順に格納した配列を返す。関数名・引数名は指定のものを使う。
	 * 引数：a[] … 検索対象となる配列
	 *       x … 検索する値
	 * 戻り値：indexArray[] … 検索結果で得たインデックスの情報を格納した配列
	 *         a[] … 検索で一致する値が一つもないときに引数そのままの配列を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static int[] arraySrchIdx(int[] a, int x) {
		
		// 配列から値が検索する値と一致した要素の数を出す。
		int checkNumber = arrayEqualCount(a,x);
		// 一致した要素の数が0の時の分岐。
		if (checkNumber == 0) {
			// 元の配列をそのまま返す。
			return a;
		}
		
		// 変数の値をもとに配列をつくる。
		int[] indexArray = new int[checkNumber];
		// インデックスの値を入れる用に配列のコピーをする。
		int[] copyArray = arrayCopy(a);
		// 配列に検索する値と一致したインデックスを入れるループ。
		for (int firstLoop = 0; firstLoop < checkNumber; firstLoop++) {
			// 目的の要素のインデックスを末尾から探して入れるループ。
			for (int secondLoop = 0; secondLoop < a.length; secondLoop++) {
				// コピーの要素と検索する値が一致した場合
				if (copyArray[secondLoop] == x) {
				// インデックスの値を入れる。
				indexArray[firstLoop] = secondLoop;
				// コピーの要素の値を1増やして一致しないようにする。
				copyArray[secondLoop]++;
				// ループから抜ける。
				break;
				}
			}
		}
		// できた配列を返す
		return indexArray;
	}

	/*
	 * 関数名：main
	 * 概要：配列をつくり、その配列に対して検索する値を入力すると一致した要素のインデックスを表示する。
	 *       もし配列の中に検索した値と同じ値の要素が存在しなかった場合はなかったことを表示する。
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
		
		// 検索する値を決める。
		int searchNumber = inputInteger("検索する値");
		// 配列から値のあるインデックスを探す。
		int[] indexSearch = arraySrchIdx(arrayNumber, searchNumber);
		// メソッドからそのままの値が返された場合の分岐。
		if (arraysEqual(arrayNumber,indexSearch)) {
			// 一致する値が見つからなかったことを示す表示をする。
			System.out.println(searchNumber + "に一致する要素はありませんでした。");
		// 一致したインデックスを示す配列が返ってきた場合。
		} else {
			// 土の値と一致していたのかわかりやすいように表示する。
			System.out.print(searchNumber + "に一致した要素のインデックスは");
			// 配列の値を表示する
			printArray(indexSearch);
		}
	}

}
