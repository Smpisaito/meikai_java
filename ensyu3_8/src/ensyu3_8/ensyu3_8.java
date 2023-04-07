// パッケージの宣言
package ensyu3_8;

import java.util.Scanner;

// 入力操作を行う場合にクラスの宣言前に置く。


/*
 * クラス名：ensyu3_8
 * 概要：ensyuu 3-8クラス
 * 作成者：S.Saito
 * 作成日：2023.04.07
 */
public class ensyu3_8 {
	
	/*
	 * 関数名：main
	 * 概要：入力した点数の値に応じて、優/良/可/不可を判定して表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		// 入力をキーボードで行うよう指定する。main内で入力を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 0～100の整数値の点数の入力を行うことを示す。
		System.out.print("点数の入力：");
		// 整数値の入力を行う。
		int PointNumber = StandardInput.nextInt();
		
		// 入力された整数値が0未満、もしくは101以上であった場合の分岐。
		if (PointNumber < 0 || PointNumber > 100)
			// 入力された値は判定外の値であることを示す。
			System.out.println("判定外の数字が入力されました。");
			
		// 入力された整数値が80以上100以下の場合の分岐
		else if (PointNumber >= 80)
			// 入力された値が評価「優」(80～100)であることを示す。
			System.out.println("評価：優");
			
		// 入力された整数値が70以上80未満の場合の分岐。
		else if (PointNumber >= 70)
			// 入力された値が評価「良」(70～79)であることを示す。
			System.out.println("評価：良");
		
		// 入力された整数値が60以上70未満の場合の分岐。
		else if (PointNumber >= 60)
			// 入力された値が評価「可」(60～69)であることを示す。
			System.out.println("評価：可");
		
		// それ以外、入力された整数値が0以上50未満の場合の分岐。
		else
			// 入力された値が評価「不可」(0～59)であることを示す。
			System.out.println("評価：不可");
		
	}
		
	

}
