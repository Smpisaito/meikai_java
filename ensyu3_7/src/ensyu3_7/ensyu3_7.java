// パッケージの宣言
package ensyu3_7;

import java.util.Scanner;

/*
 * クラス名：ensyu3_7
 * 概要：演習3-7クラス
 * 作成者：S.Saito
 * 作成日：2023.04.07
 */
public class ensyu3_7 {
	
	/*
	 * 関数名：main
	 * 概要：正の整数値を入力すると3で割り切れるか、割った余りがいくつかを表示する。
	 *       正ではない整数値が入力された場合はそのことを表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		// キーボードでの入力を指定する。main内の入力を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 正の整数値を入力するように示す。
		System.out.print("正の整数値：");
		// 整数値を変数の初期値に入力する。
		int IntegerNumber = StandardInput.nextInt();
		
		// 正の整数値ではない場合の分岐。
		if (IntegerNumber <= 0)
			// 正の整数値ではないことを示す。
			System.out.println("正ではない値が入力されました。");
		// 入力した値を3で割ったあまりが0の場合の分岐。
		else if (IntegerNumber % 3 == 0)
			// 入力した値が3で割り切れることを示す。
			System.out.println("この値は3で割り切れます。");
		// 入力した値を3で割ったあまりが1の場合の分岐。
		else if (IntegerNumber % 3 == 1)
			// 入力した値が3で割ると1余ることを示す。
			System.out.println("この値を3で割った余りは1です。");
		// 入力した値を3で割ったあまりが2の場合の分岐。
		else if (IntegerNumber % 3 == 2)
			// 入力した値が3で割ると2余ることを示す。
			System.out.println("この値を3で割った余りは2です。");
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
