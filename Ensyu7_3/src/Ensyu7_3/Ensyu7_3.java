// パッケージの宣言
package Ensyu7_3;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu7_3
 * 概要：演習7-3クラス
 * 作成者：S.Saito
 * 作成日：2023.04.19
 */
public class Ensyu7_3 {
	
	/*
	 * 関数名：med
	 * 概要：三つのint型の値の中央値を求める。関数名・引数名は指定のものを使う。
	 * 引数：a … 整数値。
	 *       b … 整数値。
	 *       c … 整数値。
	 * 戻り値：medianNumber … 三つの引数の整数値の中央値。
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	static int med(int a,int b,int c) {
		// 中央値を示す変数に初期値0を入れる。
		int medianNumber = 0;
		// 変数aより変数bのほうが小さいときの分岐
		if (a > b) {
				// 変数cが変数aより大きい場合の分岐
				if (a < c) {
					// 変数aを中央値を示す変数に代入する
					medianNumber = a;
				// 変数cが変数b未満の場合の分岐
				} else if (b > c) {
					// 変数bを中央値を示す変数に代入する
					medianNumber = b;
				// それ以外、cがb以上a以下の場合の分岐
				} else {
					// 変数cを中央値を示す変数に代入する
					medianNumber = c;
				}
		// 変数bより変数aのほうが小さいときの分岐
		} else if (a < b) {
			// 変数cが変数a未満の場合の分岐
			if (a > c) {
				// 変数aを中央値を示す変数に代入する
				medianNumber = a;
			// 変数cが変数bより大きい場合の分岐
			} else if (b < c) {
				// 変数bを中央値を示す変数に代入する
				medianNumber = b;
			// それ以外、cがa以上b以下の場合の分岐
			} else {
				// 変数cを中央値を示す変数に代入する
				medianNumber = c;
			}
		}
		// 中央値の変数を返す。
		return medianNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：三つの値を入力し、三つの値の中央値を求めるメソッドminの確認をする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 3を示すfinal変数をつくる。
		final int thirdNumber = 3;
		// 要素数3の配列をつくる。
		int[] medianCheck = new int[thirdNumber];
		// 三つの変数の中央値を求めることを示すように表示する。
		System.out.println("三つの整数の中央値を求めます。");
		// 配列の入力を行うループ
		for (int loopNumber = 0; loopNumber < thirdNumber; loopNumber++) {
			// 3回の入力を確認できる表示をする。
			System.out.print(loopNumber + 1 + "つ目：");
			// 入力を行う。
			medianCheck[loopNumber] = standardInput.nextInt();
		}
		// メソッドで中央値を求める。
		int medianNumber = med(medianCheck[0],medianCheck[1], medianCheck[2]);
		
		// メソッドで求めた中央値を表示する。
		System.out.println("中央値：" + medianNumber);
	}

}
