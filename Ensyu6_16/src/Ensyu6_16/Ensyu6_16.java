// パッケージの宣言
package Ensyu6_16;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu6_16
 * 概要：演習6-16クラス
 * 作成者：S.Saito
 * 作成日：2023.04.18
 */
public class Ensyu6_16 {
	
	/*
	 * 関数名：main
	 * 概要：4行3列の行列と3行4列の行列の積を求めるプログラム。各要素の値は入力する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 3を示す変数をつくる。
		final int thirdNumber = 3;
		// 4を示す変数をつくる。
		final int fourthNumber = 4;
		// 4行3列の行列をつくる。
		int[][] firstArray = new int[fourthNumber][thirdNumber];
		// 3行4列の行列をつくる。
		int[][] secondArray = new int[thirdNumber][fourthNumber];
		
		// 4行3列の値の入力を行うことを示す表示をする。
		System.out.println(fourthNumber + "行" + thirdNumber + "列の行列の各要素に入力します。");
		// 4行の行列の各要素の値を入力するループ。
		for (int firstLoop = 0; firstLoop < fourthNumber; firstLoop++) {
			// 3列の行列の各要素の値を入力するループ。
			for (int secondLoop = 0; secondLoop < thirdNumber; secondLoop++) {
				// どの要素に入れてるのかわかるように表示する。
				System.out.print("firstArray[" + firstLoop + "][" + secondLoop + "] = ");
				// 要素に代入する値の入力を行う。
				firstArray[firstLoop][secondLoop] = standardInput.nextInt();
			}
		}
		
		// 3行4列の値の入力を行うことを示す表示をする。
		System.out.println(thirdNumber + "行" + fourthNumber + "列の行列の各要素に入力します。");
		// 3行の行列の各要素の値を入力するループ。
		for (int firstLoop = 0; firstLoop < thirdNumber; firstLoop++) {
			// 4列の行列の各要素の値を入力するループ。
			for (int secondLoop = 0; secondLoop < fourthNumber; secondLoop++) {
				// どの要素に入れてるのかわかるように表示する。
				System.out.print("secondArray[" + firstLoop + "][" + secondLoop + "] = ");
				// 要素に代入する値の入力を行う。
				secondArray[firstLoop][secondLoop] = standardInput.nextInt();
			}
		}
		
		// 結果の行列と分ける改行。
		System.out.println();
		// 積を入れるための行列をつくる。
		int[][] answerArray = new int[fourthNumber][fourthNumber];
		// 積の行列の値を表示することを示す。
		System.out.println("answerArray[" + fourthNumber + "][" + fourthNumber + "]");
		// 4行の行列の各要素の値を入力するループ。
		for (int firstLoop = 0; firstLoop < fourthNumber; firstLoop++) {
			// 4列の行列の各要素の値を入力するループ。
			for (int secondLoop = 0; secondLoop < fourthNumber; secondLoop++) {
				// 積の計算での参照につかう計算用のループ。
				for (int thirdLoop = 0; thirdLoop < thirdNumber; thirdLoop++) {
					// 2つの行列の積を求める。
					answerArray[firstLoop][secondLoop] += firstArray[firstLoop][thirdLoop]*secondArray [thirdLoop][secondLoop];
				}
				// 	積の行列の各要素を表示する。
				System.out.print(" " + answerArray[firstLoop][secondLoop]);
			}
			// 行列の表示する行が変わることを示す改行を入れる。
			System.out.println();
		}
		
	}
	

}
