// パッケージの宣言
package Ensyu4_7;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_7
 * 概要：演習4-7クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_7 {
	
	/*
	 * 関数名：main
	 * 概要：入力した個数の記号文字を表示する。表示する記号文字は「*」と「+」を交互に行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力した値だけ「*」を表示することを示す。
		System.out.print("何個の記号文字を表示しますか：");
		// 記号文字を表示したい数を入力する。
		int asteriskNumber = standardInput.nextInt();
		
		// ループに用いる関数を設定する。
		int loopNumber = 1 ;
		// 入力した値の回数のループを行う。
		while ( loopNumber <= asteriskNumber ) {
			// 奇数個のときの条件分岐
			if (loopNumber % 2 == 1 )
				// 奇数個の時は「*」を表示する。
				System.out.print('*');
			// 偶数個のときの条件分岐
			else if (loopNumber % 2 == 0 )
				// 偶数個の時は「+」を表示する。
				System.out.print('+');
			// ループごとに変数loopNumberのインクリエイトを行う。
			loopNumber++;
		}
		
		// ループが発生した場合の分岐。
		if ( loopNumber > 1)
			// 改行をループが発生した場合のみ行う。
			System.out.println("");
		
	}

}
