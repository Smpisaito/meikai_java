// パッケージの宣言
package Ensyu4_10;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_10
 * 概要：演習4-10クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_10 {
	
	/*
	 * 関数名：main
	 * 概要：[明解Java List4-11]のプログラムをもとに、入力した値が1未満なら改行しないように書き換える。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		//「*」の表示する個数の入力を行うことを示す。
		System.out.println("何個*を表示しますか？：");
		// 何個の「*」を表示するかの入力を行う。
		int integerNumber = standardInput.nextInt();
		
		// 入力した値の回数繰り返すループをつくる
		for (int loopNumber = 0 ; loopNumber < integerNumber ; loopNumber++) {
			
			// 入力した値の回数「*」の表示を繰り返す。
			System.out.print('*');
		}
		
		// 入力した値が1以上の時のみ改行を行う。
		if ( integerNumber > 0 ) {
			// 改行を行う
			System.out.println();
		}
		
	}

}
