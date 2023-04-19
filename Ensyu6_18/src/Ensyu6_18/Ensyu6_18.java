// パッケージの宣言
package Ensyu6_18;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu6_18
 * 概要：演習6-18クラス
 * 作成者：S.Saito
 * 作成日：2023.04.18
 */
public class Ensyu6_18 {
	
	/*
	 * 関数名：main
	 * 概要：行数、各行の列数、各要素の値を入力して表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 行数の入力に使う変数をつくる。
		int arrayElements = 0;
		// 行数として正の整数値が入力されるまで入力を続けるループ。
		do {
			// 行数を入力することを示す表示をする。
			System.out.print("行数：");
			// 行数を入力する。
			arrayElements = standardInput.nextInt();
			// 正の整数値ではない値が入力された場合の分岐
			if ( arrayElements <= 0) {
				// 正の整数値を入力するように促す。
				System.out.println("正の整数値を入力してください。");
			}
		// 行数が0以下のときループする。
		}while (arrayElements <= 0);
		
		// 入力した行の行列をつくる。
		int[][] arrayNumber = new int[arrayElements][];
		
		// 列数の入力に使う配列をつくる。
		int[] arraySecond = new int[arrayElements];
		// 各行の列数の入力をするループ。
		for (int firstLoop = 0; firstLoop < arrayElements; firstLoop++) {
			// 列数として正の整数値が入力されるまで入力を続けるループ。
			do {
				// 列数を入力することを示す表示をする。
				System.out.print(firstLoop + 1 + "行目の列数：");
				// 列数を入力する。
				arraySecond[firstLoop] = standardInput.nextInt();
				// 正の整数値ではない値が入力された場合の分岐
				if ( arraySecond[firstLoop] <= 0) {
					// 正の整数値を入力するように促す。
					System.out.println("正の整数値を入力してください。");
				}
			// 列数が0以下のときループする。
			}while (arraySecond[firstLoop] <= 0);
			// 行ごとの列数を行列に反映する。
			arrayNumber[firstLoop] = new int[arraySecond[firstLoop]];
		}
		
		// 各要素の値を入れるループ。
		for (int firstLoop = 0; firstLoop < arrayElements; firstLoop++) {
			// 行がfirstLoopのときの列一つずつに値を入れるループ。
			for (int secondLoop = 0; secondLoop < arraySecond[firstLoop]; secondLoop++) {
				// どの要素に入れているのかがわかるように表示する。
				System.out.print("arrayNumber[" + firstLoop + "][" + secondLoop + "] = ");
				// 各要素に値の入力を行う
				arrayNumber[firstLoop][secondLoop] = standardInput.nextInt();
			}
		}
		// つくった行列の表示をすることを示す。
		System.out.println("行列全体を示します。");
		// 入力した行列の表示を行う。
		for (int firstLoop = 0; firstLoop < arrayElements; firstLoop++) {
			// 行がfirstLoopのときの列一つずつに値を入れるループ。
			for (int secondLoop = 0; secondLoop < arraySecond[firstLoop]; secondLoop++) {
				// 配列の表示を行う。
				System.out.print(arrayNumber[firstLoop][secondLoop]  + ", ");
			}
			// 改行を入れて行を変更する。
			System.out.println();
		}
	}

}
