// パッケージの宣言
package Ensyu7_2;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu7_2
* 概要：演習7-2クラス
* 作成者：S.Saito
* 作成日：2023.04.19
*/
public class Ensyu7_2 {
	
	/*
	 * 関数名：min
	 * 概要：三つのint型の値の最小値を求める。関数名・引数名は指定のものを使う。
	 * 引数：a … 整数値。
	 *       b … 整数値。
	 *       c … 整数値。
	 * 戻り値：minimumNumber … 三つの引数の整数値のなかの最小値。
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	static int min(int a,int b,int c) {
		// 最小値を示す変数に変数aの値を入れる。
		int minimumNumber = a;
		// 変数bのほうが小さいときの分岐
		if (minimumNumber > b) {
			// 変数bの値を最小値を示す変数に入れる。
			minimumNumber = b;
		}
		// 変数cのほうが小さいときの分岐
		if (minimumNumber > c) {
			// 変数cの値を最小値を示す変数に入れる。
			minimumNumber = c;
		}
		// 最小値の変数を返す。
		return minimumNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：三つの値を入力し、三つの値の最小値を求めるメソッドminの確認をする。
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
		int[] minimumCheck = new int[thirdNumber];
		// 三つの変数の最小値を求めることを示すように表示する。
		System.out.println("三つの整数の最小値を求めます。");
		// 配列の入力を行うループ
		for (int loopNumber = 0; loopNumber < thirdNumber; loopNumber++) {
			// 3回の入力を確認できる表示をする。
			System.out.print(loopNumber + 1 + "つ目：");
			// 入力を行う。
			minimumCheck[loopNumber] = standardInput.nextInt();
		}
		// メソッドで最小値を求める。
		int minimumNumber = min(minimumCheck[0],minimumCheck[1], minimumCheck[2]);
		
		// メソッドで求めた最小値を表示する。
		System.out.println("最小値：" + minimumNumber);
	}

}
