// パッケージの宣言
package Ensyu4_6;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_6
 * 概要：演習4-6クラス
 * 作成者：S.Saito
 * 作成日：2023.04.10
 */

public class Ensyu4_6 {
	
	/*
	 * 関数名：main
	 * 概要：「*」(アステリスク)を入力した値だけ表示するプログラム[明解Java List4-7][List4-8]をもとに、
	 *       1未満の値が入力されたときに改行を行わないように書き換えたプログラム。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.10
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		
		// 入力した値だけ「*」を表示することを示す。
		System.out.print("何個*を表示しますか：");
		// 「*」を表示したい数を入力する。
		int asteriskNumber = standardInput.nextInt();
		
		// ループに用いる関数を設定する。
		int loopNumber = 0 ;
		// 入力した値の回数のループを行う。
		while ( loopNumber < asteriskNumber ) {
			System.out.print('*');
			// 変数loopNumberにインクリメントを行う。
			loopNumber++;
		}
		
		// 変数loopNumberはループが発生した場合に増加するので、loopNumberが0以上の時という条件を付ける。
		if ( loopNumber > 0)
			// 改行をループが発生した場合のみ行う。
			System.out.println("");
		
	}

}
