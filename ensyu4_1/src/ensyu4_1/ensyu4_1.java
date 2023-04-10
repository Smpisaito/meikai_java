// パッケージの宣言
package ensyu4_1;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu4_1
 * 概要：演習4-1クラス
 * 作成者：S.Saito
 * 作成日：2023.04.10
 */
public class ensyu4_1 {
	
	/*
	 * 関数名：main
	 * 概要：入力した整数値の符号(+、-、0)を確認するプログラム(明解Java List3-5)をもとに、
	 *       入力から表示までの動作を好きなだけ繰り返すおとができるプログラム。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		int RetryNumber = 0;
		
		// もう一度行うことを選んだ時に戻るループをつくる
		do {
			// 操作が二度目以降の場合のみ行う。
			if ( RetryNumber == 1 )
				// 前回のループでの繰り返しの確認と分けるための改行
				System.out.println("");
			
			// 整数値の入力を行うことを示す。
			System.out.print("整数値：");
			// 整数値の入力を行う。
			int IntegerNumber = StandardInput.nextInt();
			
			
			// 整数値が正の時の分岐。
			if ( IntegerNumber > 0 ) {
				// 入力値が正であることを表示する。
				System.out.println("入力した整数値は正です");
						// 整数値が負の時の分岐
			} else if ( IntegerNumber < 0 ) {
				// 入力値が負であることを表示する
				System.out.println("入力した整数値は負です");
			// それ以外、整数値が0であるときの分岐
			} else {
				// 入力値が0であることを表示する。
				System.out.println("入力した整数値は0です");
			}
			
			// 結果と分けるための改行
			System.out.println("");
			
			// もう一度操作を行うかの確認を表示する。
			System.out.print("もう一度操作を行いますか？   1…Yes / 0…No  ：");
			// もう一度操作を行うかどうかを数値として入力する。
			RetryNumber = StandardInput.nextInt();
			
		// もう一度行うことを選ぶとループする条件になるように設定する。
		} while ( RetryNumber == 1 );
		
	}

}
