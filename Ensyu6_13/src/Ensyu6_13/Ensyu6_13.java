// パッケージの宣言
package Ensyu6_13;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu6_13
* 概要：演習6-13クラス
* 作成者：S.Saito
* 作成日：2023.04.18
*/
public class Ensyu6_13 {
	
	/*
	 * 関数名：main
	 * 概要：同一の要素数を持つ二つの配列aとbにおいて、配列aの全要素を配列bに逆順にコピーする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 要素数の入力に使う変数をつくる。
		int arrayElements = 0;
		// 要素数として正の整数値が入力されるまで入力を続けるループ。
		do {
			// 要素数を入力することを示す表示をする。
			System.out.print("要素数：");
			// 要素数を入力する。
			arrayElements = standardInput.nextInt();
			// 正の整数値ではない値が入力された場合の分岐
			if ( arrayElements <= 0) {
				// 正の整数値を入力するように促す。
				System.out.println("正の整数値を入力してください。");
			}
		// 要素数が0以下のときループする。
		}while (arrayElements <= 0);

		// 入力した要素数の配列a(表記)をつくる。
		int[] arrayNumber = new int[arrayElements];
		
		// 入力した要素数の配列b(表記)をつくる。
		int[] copyNumber = new int[arrayElements];
		
		// 配列a(表記)の全要素に値を入力するループ。
		for (int loopNumber = 0; loopNumber < arrayElements; loopNumber++) {
			// 配列a(表記)のどの要素に入力しているかわかるように表示する。
			System.out.print("a[" + loopNumber + "] = ");
			// 配列a(表記)である配列arrayNumberに入力を行う。
			arrayNumber[loopNumber] = standardInput.nextInt();
		}
		
		// 配列aの全要素を逆順で配列bにコピーしたことを示す表示をする。
		System.out.println("\n配列aの全要素を逆順にして配列bにコピーしました。");		
		// 配列a(表記)の全ての要素を逆順にして配列b(表記)にコピーするループ。
		for (int loopNumber = 0; loopNumber < arrayElements; loopNumber++) {
			// 配列b(表記)に対して配列aの値を逆順にコピーする。
			copyNumber[loopNumber] = arrayNumber[arrayElements-loopNumber-1];
			// 配列b(表記)の各要素の値を表示する。
			System.out.println("b[" + loopNumber + "] = " + copyNumber[loopNumber]);
		}
	}


}
