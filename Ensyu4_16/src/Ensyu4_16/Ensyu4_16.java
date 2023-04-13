// パッケージの宣言
package Ensyu4_16;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_16
 * 概要：演習4-16クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_16 {
	
	/*
	 * 関数名：main
	 * 概要：入力した個数の「*」を表示する。このとき「*」が5個ごとに改行を入れる。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力値を入れる変数をつくる。
		int integerNumber = 0;
		// 負の整数が入力されたらループさせる。。
		do {
			// 「*」を何個表示するかを入力することを示すように表示する。
			System.out.print("何個*を表示しますか：");
			// 何個表示するか入力する。
			integerNumber = standardInput.nextInt();
		// 0未満の値が入力されたらループする。
		} while ( integerNumber < 0 );
		
		
		// 「*」を入力した回数だけ表示するループをつくる
		for (int loopNumber = 1; loopNumber <= integerNumber; loopNumber++) {
			// 「*」を表示する
			System.out.print('*');
			// 「*」を5個表示したら改行する
			if (loopNumber % 5 == 0) {
				// 改行の操作をする。
				System.out.println();
			}
		}
		
	}

}
