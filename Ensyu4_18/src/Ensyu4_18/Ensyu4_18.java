// パッケージの宣言
package Ensyu4_18;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_18
 * 概要：演習4-18クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_18 {
	
	/*
	 * 関数名：main
	 * 概要：正の整数値を入力し、１から入力した値までの整数のそれぞれの二乗した値を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		// 入力するための変数をつくる。
		int integerNumber = 0;
		
		// 0以下が入力された場合
		do {
			// 正の整数値の入力を示すように表示する。
			System.out.print("正の整数値：");
			// 正の整数値を入力する。
			integerNumber = standardInput.nextInt();
		// 入力した値が0以下の時ループする。
		} while (integerNumber <= 0 );
		// １から入力した値までそれぞれの二乗を求めるループをつくる。
		for ( int loopNumber = 1; loopNumber <= integerNumber; loopNumber++ ) {
			// 元の数とそれに対応する二乗が何かわかるように表示する。
			System.out.println(loopNumber + " の2乗は " + loopNumber*loopNumber );
		}
		
	}

}
