// パッケージの宣言
package Ensyu4_2;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu4_2
* 概要：演習4-2クラス
* 作成者：S.Saito
* 作成日：2023.04.12
*/
public class Ensyu4_2 {
	
	/*
	 * 関数名：main
	 * 概要：二桁の正の整数(10～99)を用いた数当てゲームを行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.12
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);

		// 乱数を入力する際に、main内で入力操作を行うコードより前に置く
		Random randomNumber = new Random();
		
		// ゲームの開始を告げる。
		System.out.println("数当てゲームを開始します！");
		// 数当てゲームの内容
		System.out.println("10～99の中から数値を当ててください！");
		
		// 10～99の中からランダムに目標となる正解の値を入れる。
		int targetNumber = randomNumber.nextInt(90) + 10;
		// 整数値が入力される変数をつくる。
		int checkNumber = 0;
		
		// 正答が出るまでループが行われる。
		do {
			// 予想した値を入れるように表示する。
			System.out.print("予想した値：");
			// 予想した値の入力を行う。
			checkNumber = standardInput.nextInt();
			
			// 予想した値に10～99ではない値が入れられたときの分岐。
			if (checkNumber >= 100 || checkNumber < 10 ) {
				// 正解は10～99だと伝える。
				System.out.println("正解の値は10～99です。");
			// 入力した値が正解よりも小さかった場合の分岐
			} else if (checkNumber < targetNumber ) {
				// 正解はもっと大きい値だと伝える。
				System.out.println("正解の値はもっと大きいです。");
			// 入力した値が正解よりも大きかった場合の分岐
			} else if (checkNumber > targetNumber ){
				// 正解はもっと小さい値だと伝える。
				System.out.println("正解の値はもっと小さいです。");
			// 入力した値が正解だった場合の分岐
			} else {
				// 正解だと伝える
				System.out.println("正解です。");
			}
		// 正解と入力した値が一致しないとき繰り返す。
		} while ( checkNumber != targetNumber );
		
		
	}


}
