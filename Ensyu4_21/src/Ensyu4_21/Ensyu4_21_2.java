// パッケージの宣言
package Ensyu4_21;

import java.util.Scanner;

/*
 * クラス名：Ensyu4_21_2
 * 概要：演習4-21-2クラス
 * 作成者：S.Saito
 * 作成日：2023.04.12
 */
public class Ensyu4_21_2 {

	/*
	 * 関数名：main
	 * 概要：入力した段数が2辺になる直角三角形を表示する。
	 *       演習4-21の問いにおける、直角三角形の直角が「右下側」の場合をつくる。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.12
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 段数を入れる変数をつくる
		int integerNumber;
		// 段数に0以下が入った場合入力しなおすためのループ。
		do {
			// 段数の入力を求めるように表示する。
			System.out.print("段数：");
			// 段数を入力する。
			integerNumber = standardInput.nextInt();
			// 段数が0以下だった場合分岐する。
			if (integerNumber <= 0) {
				// 再度入力を行うように促す。
				System.out.println("もう一度入力してください。");
			}
		// 入力した値が0以下の時にループする。
		} while ( integerNumber <= 0 );
		
		// 直角三角形の縦軸の段数を入力した値と同じにするループ。
		for ( int firstNumber = 1 ; firstNumber <= integerNumber ; firstNumber++ )  {
			// 「空白」を表示するループ。繰り返す回数を入力した値より1少ない値の回数から
			// 縦軸の段数が変わるごとに1回ずつ減らしていく。
			for ( int secondNumber = firstNumber ; secondNumber < integerNumber ; secondNumber++ )  {
				// 「空白」を表示する。ループによって繰り返し表示する。
				System.out.print(" ");
			}
			// 「*」を表示するループ。繰り返す回数を1回から縦軸の段数が変わるごと1回ずつ増やしていく。
			for ( int secondNumber = integerNumber - firstNumber ; secondNumber < integerNumber ; secondNumber++ )  {
				// 「*」を表示する。ループによって繰り返し表示する。
				System.out.print('*');
			}
			// 1段分の出力が終わったら改行を行う。
			System.out.println();
		}
		
	}

}
