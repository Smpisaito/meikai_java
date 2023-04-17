// パッケージの宣言
package Ensyu6_5;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu6_5
* 概要：演習6-5クラス
* 作成者：S.Saito
* 作成日：2023.04.17
*/
public class Ensyu6_5 {
	
	/*
	 * 関数名：main
	 * 概要：配列の要素数と各要素の値を入力し、その配列の表示を行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.17
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
		// 入力した要素数をもとに配列をつくる。
		int[] arrayNumber = new int[arrayElements];
		// 配列のすべての要素に入力を行うループ。
		for (int loopNumber = 0; loopNumber < arrayElements; loopNumber++) {
			// 表示されたインデックスの要素の中に入力を行うように表示する。
			System.out.print("arrayNumber[" + loopNumber + "] =  ");
			// 表示された要素に入力する。
			arrayNumber[loopNumber] = standardInput.nextInt();
		}
		// 配列の値であることを示すように表示する。
		System.out.print("arrayNumber = {");
		// 配列arrayNumberの各要素の値を最後を除いてすべて表示するためのループ。
		for ( int loopNumber = 0; loopNumber < arrayElements - 1; loopNumber++ ) {
			// 要素の値を表示する。後ろにコンマを入れて区切る。
			System.out.print(arrayNumber[loopNumber] + ", ");
		}
		// 最後の要素の値を表示する。後ろに「 ｝」をつける。
		System.out.print(arrayNumber[arrayElements-1] + "}");

	}

}
