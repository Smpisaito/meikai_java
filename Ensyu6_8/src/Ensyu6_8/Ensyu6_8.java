// パッケージの宣言
package Ensyu6_8;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu6_8
 * 概要：演習6-8クラス
 * 作成者：S.Saito
 * 作成日：2023.04.17
 */
public class Ensyu6_8 {
	
	/*
	 * 関数名：main
	 * 概要：double型の配列の全要素の合計値と平均値を求めるプログラムを作成する。要素数と各要素の値は入力する。
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
	
		// 入力した要素数の配列をつくる。
		double[] arrayNumber = new double[arrayElements];
		
		// すべての要素に入力するループ。
		for ( int loopNumber = 0; loopNumber < arrayElements; loopNumber++ ) {
			// 配列arrayNumberのインデックスがloopNumberになる要素に代入することを示す。
			System.out.print("arrayNumber[" + loopNumber + "] = ");
			// 要素に入力値を代入する。
			arrayNumber[loopNumber] = standardInput.nextDouble();
		}
		
		// 合計を示す変数をつくる。
		double sumNumber = 0;
		// 拡張for文による配列の全要素で行うループ
		for(double loopNumber : arrayNumber){
			// 合計の変数に値を加える。
			sumNumber += loopNumber;
		}
		// 配列の全要素の値の合計を表示する。
		System.out.println("合計：" + sumNumber);
		// 配列の全要素の平均の合計を表示する。
		System.out.println("平均：" + sumNumber/arrayElements);
	}
}
