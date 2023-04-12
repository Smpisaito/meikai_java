// パッケージの宣言
package Ensyu4_19;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_19
 * 概要：演習4-19クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_19 {
	
	/*
	 * 関数名：main
	 * 概要：[明解Java List4-1]の月から季節を求めるプログラムを月の入力を1～12以外で行った際に
	 *       再入力を行うように書き直したもの。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 月の入力を行う変数monthNumberをつくる。
		int monthNumber = 0;
		// 再度行うかの確認のための変数retryNumberをつくる。
		int retryNumber = 0;
		// 入力した月から季節を求めるプログラムを繰り返したいだけ繰り返せるようにループをつくる。
		do {
			
			// 入力された値が1～12ではない場合再入力を求めるループをつくる。
			do {
				// 月から季節を求めることを説明して、何月かを入力するように表示する。
				System.out.print("月から季節を求めます。\n何月ですか：");
				// 月の入力を行う。
				monthNumber = standardInput.nextInt();
				// 1～12の値でないときに分岐する。
				if ( monthNumber < 1 || monthNumber > 12 ) {
					// 再入力してもらうように表示する。
					System.out.println("再度入力してください。");
				}
			// 月の入力が1～12ではないときループする
			} while ( monthNumber < 1 || monthNumber > 12 );
			
			// 月の入力した値ごとに分岐する。
			switch ( monthNumber ) {
			// 3月の場合
			case 3:
			// 4月の場合
			case 4:
			// 5月の場合
			case 5:
				// 3～5月は春であることを示す表示をする。
				System.out.println("その月の季節は春です。");
			// 6月の場合
			case 6:
			// 7月の場合	
			case 7:
			// 8月の場合
			case 8:
				// 6～8月が夏であることを示す表示をする。
				System.out.println("その月の季節は夏です。");
			// 9月の場合
			case 9:
			// 10月の場合
			case 10:
			// 11月の場合
			case 11:
				// 9～11月が秋であることを示す表示をする。
				System.out.println("その月の季節は秋です。");
			// 12月の場合
			case 12:
			// 1月の場合
			case 1:
			// 2月の場合
			case 2:
				// 12～2月が冬であることを示す表示をする。
				System.out.println("その月の季節は冬です。");
			}
			
			// もう一度行うかの入力を行う。
			retryNumber = standardInput.nextInt();
		// もう一度繰り返す判断をした場合はループする。
		} while ( retryNumber == 1 );
		
	}

}
