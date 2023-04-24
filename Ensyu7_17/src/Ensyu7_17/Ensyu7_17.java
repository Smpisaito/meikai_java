// パッケージの宣言
package Ensyu7_17;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu7_17
* 概要：演習7-17クラス
* 作成者：S.Saito
* 作成日：2023.04.24
*/
public class Ensyu7_17 {

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
	 * 関数名：linearSearchR
	 * 概要：配列の要素から探索する値と同じ要素を探してインデックスを返す。探索する値と同じ要素が複数ある時は末尾側の要素を見つける。
	 *       値が見つからなかった場合は-1を入れる。関数名・引数名は指定のものを使う。
	 * 引数：a[] … int型の配列
	 *       key … 探索する値
	 * 戻り値：keyPlase … 値を見つけた要素のインデックス。見つからなかったときは-1を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static int linearSearchR(int a[],int key){
		// 戻り値をつくる。
		int keyPlase = 0;
		// 配列の要素数をもとにループする。
		for (keyPlase = a.length - 1; keyPlase >= 0; keyPlase--) {
			// 確認しているまでの最小値と比較して値が低ければ分岐する。
			if (key == a[keyPlase]) {
				// 見つけたインデックスの値を返却する。
				return keyPlase;
			}
		}
		// 変数を返す。
		return keyPlase;
	}
		
	/*
	 * 関数名：main
	 * 概要：配列の要素数と各要素の値を入力し、その後に検索値を入力する。入力した値と一致する一番末尾の要素のインデックスを示す。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args){
		// 要素数の入力を行う。
		int arrayElements = inputPlus("要素数");
		// 要素数をもとに配列をつくる。
		int[] arrayNumber = new int[arrayElements];
		// 配列の全要素に値を入れる。
		inputArray(arrayNumber);
		// 探索する値を決める。
		int searchNumber = inputInteger("探索する値");
		
		// 配列の全要素の検索をする。
		int keyPlase = linearSearchR(arrayNumber,searchNumber);
		// 値が-1の時、値が見つからなかった場合の分岐
		if (keyPlase == -1) {
			// 探索した値がなかったことを示す表示をする。
			System.out.println("その値の要素は存在しませんでした。");
		// それ以外、値が見つかった場合の分岐。
		} else {
			// 一致した最も末尾側の要素のインデックスを表示する。
			System.out.println("その値は配列の [" + keyPlase + "] にあります。");
		}
	}

	
}
