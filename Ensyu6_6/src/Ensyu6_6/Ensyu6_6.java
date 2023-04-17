// パッケージの宣言
package Ensyu6_6;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu6_6
 * 概要：演習6-6クラス
 * 作成者：S.Saito
 * 作成日：2023.04.17
 */
public class Ensyu6_6 {
	
	/*
	 * 関数名：main
	 * 概要：人数とテストの点数を入力し、テストの点数の合計点、平均点、最高点、最低点を表示する。
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
			System.out.print("人数：");
			// 要素数を入力する。
			arrayElements = standardInput.nextInt();
			// 正の整数値ではない値が入力された場合の分岐
			if ( arrayElements <= 0) {
				// 正しい値を入力するように促す。
				System.out.println("正しい人数を入力してください。");
			}
		// 要素数が0以下のときループする。
		}while (arrayElements <= 0);
		
		// 入力した要素数の配列をつくる。
		int[] arrayNumber = new int[arrayElements];
		
		// すべての要素に入力するループ。
		for ( int loopNumber = 0; loopNumber < arrayElements; loopNumber++ ) {
			// 点数として不適切な値が入力されたら入力しなおすループ。
			do {
				// 当てはまる点数を入力することを示すように表示する。
				System.out.print(loopNumber + 1 +"番の点数： ");
				// 要素に入力値を代入する。
				arrayNumber[loopNumber] = standardInput.nextInt();
				// 点数の範囲外の値(0～100ではない値)が入力されたときに分岐する。
				if(arrayNumber[loopNumber] < 0 || arrayNumber[loopNumber] > 100) {
					System.out.println("正しい点数を入力してください。");
				}
			// 入力が０未満、もしくは101以上のときにループする。
			} while (arrayNumber[loopNumber] < 0 || arrayNumber[loopNumber] > 100);
		}
		
		// 合計を示す変数sumNumberをつくる。
		int sumNumber = 0;
		// 最大値を示す変数maximumNumberをつくる。点数の取りうる最小値は0のため初期値は0とする。
		int maximumNumber = 0;
		// 最小値を示す変数minimumNumberをつくる。点数のとりうる最大値は100のため初期値は100にする。
		int minimumNumber = 100;
		// すべての要素の合計、最高点、最低点をもとめるループ。
		for (int loopNumber = 0; loopNumber < arrayElements; loopNumber++) {
			// 要素の値を変数sumNumberに加える。
			sumNumber += arrayNumber[loopNumber];
			// 要素の値が変数maxmumNumberの最大値より大きいときの分岐。
			if (arrayNumber[loopNumber] > maximumNumber) {
				// 変数maximumNumberに要素の値を代入する。
				maximumNumber = arrayNumber[loopNumber];
			}
			// 要素の値が変数minimumNumberより小さい場合の分岐。
			if (arrayNumber[loopNumber] < minimumNumber) {
				// 変数minimumNumberに要素の値を代入する。
				minimumNumber = arrayNumber[loopNumber];
			}
		}
		
		// 変数sumNumberをもとに合計を表示する。
		System.out.println("合計：" + sumNumber);
		// 変数sumNumberと要素数arrayElementsをもとに平均を表示する。平均値は実数値を表示する。
		System.out.println("平均：" + (double)sumNumber/arrayElements);
		// 変数maximumNumberをもとに最高点を表示する。
		System.out.println("最高点：" + maximumNumber);
		// 変数minimumNumberをもとに最低点を表示する。
		System.out.println("最低点：" + minimumNumber);
	}

}
