// 　パッケージの宣言
package Ensyu4_9;

//入力操作を行うときにクラスの宣言の前に置く。

import java.util.Scanner;

/*
 * クラス名：Ensyu4_9
 * 概要：演習4-9クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_9 {
	
	/*
	 * 関数名：main
	 * 概要：正の整数値を入力し、1から入力した値までの整数の積を求める。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 正の整数値の入力を行うことを示す。
		System.out.print("正の整数値：");
		// 整数値の入力を行う。
		int integerNumber = standardInput.nextInt();
		
		// 積を入力するための変数multiplicationNumberを用意する。初期値は0とする。
		int multiplicationNumber = 0;
		// ループに用いる変数loopNumberをつくる。初期値は1とする。
		int loopNumber = 1;
		
		// 変数integerNumberが1以上の時はループを行う。
		while ( loopNumber <= integerNumber ) {
			
			// 変数multiplicationNumberが初期値の時の分岐。
			if ( multiplicationNumber == 0 ) {
				// 初回は変数multiplicationNumberに1を代入する。
				multiplicationNumber = 1;
			}
			
			// 変数multiplicationNumberに変数integerNumberの値をかける。
			multiplicationNumber *= loopNumber;
			// 変数integerNumberの値をループの回数だけデクリメントする。
			loopNumber++;
		
		}
		
		// 変数multiplicationNumberが0以上(正の整数が入力された場合の分岐)
		if ( multiplicationNumber > 0 ) {
			
			// 変数inteerNumberと変数multiplicationNumberの値を用いて結果を表示する。
			System.out.println( "1から" + integerNumber + "までの積は" + multiplicationNumber + "です。");
		
			// 入力した値が正の整数値の場合)の場合の分岐。
		} else {
			
			// 入力されていた値が正の整数値ではなかったことをしめす。
			System.out.println("入力された値が正の整数値ではありません。");
			
		}
		
	}

}
