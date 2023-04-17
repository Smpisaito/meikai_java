// パッケージの宣言
package Ensyu6_10;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu6_10
* 概要：演習6-10クラス
* 作成者：S.Saito
* 作成日：2023.04.17
*/
public class Ensyu6_10 {
	
	/*
	 * 関数名：main
	 * 概要：int型の配列をつくり、全要素を1～10の乱数で埋めつくす。ただし、連続した要素は同じ数字を
	 *       もたな鋳物が代入される。要素数は入力する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);

		// 乱数を入力する際に、main内で入力操作を行うコードより前に置く
		Random randomNumber = new Random();
		
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
		} while (arrayElements <= 0);

		// 入力した要素数の配列をつくる。
		int[] arrayNumber = new int[arrayElements];
		// 乱数の範囲を示す変数をつくる。初期値は10とする。
		int randomInteger = 10;
		
		// 最初の要素の値に乱数1～10から代入する。
		arrayNumber[0] = randomNumber.nextInt(randomInteger) + 1;
		// すべての要素に入力するループ。
		for ( int loopNumber = 1; loopNumber < arrayElements; loopNumber++ ) {
			// ひとつ前の乱数と同じ値なら入力をしなおすループ。
			do {
				// 要素に乱数で1～10から代入する。
				arrayNumber[loopNumber] = randomNumber.nextInt(randomInteger) + 1;
			// その要素に代入した値がひとつ前の要素と同じ値ならループする。
			} while (arrayNumber[loopNumber] == arrayNumber[loopNumber - 1]);
		}
		
		// 配列a(表記)の要素の表示であることを示す前部分の文字の表示。
		System.out.print("配列a = {");
		// 最後を除きすべての要素を表示するループ。
		for (int loopNumber = 0; loopNumber < arrayElements - 1; loopNumber++) {
			// 最後の値を除いたすべての要素の値を表示する
			System.out.print(arrayNumber[loopNumber]+",");
		}
		// 最後の要素の表示と「 } 」を表示する。
		System.out.print(arrayNumber[arrayElements - 1] + "}");

	}

}
