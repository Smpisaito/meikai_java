// パッケージの宣言
package Ensyu4_8;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_7
 * 概要：演習4-7クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_8 {
	
	/*
	 * 関数名：main
	 * 概要：入力した正の整数値の桁数を求めて表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値の入力を行うことを示す。
		System.out.print("正の整数値：");
		// 整数値の入力を行う。
		int integerNumber = standardInput.nextInt();
		
		// 入力した整数値の桁数を示す変数digitNumberを初期値0としてつくる。
		int digitNumber = 0;
		
		// 入力した値の桁数回のループを行う。
		while ( integerNumber > 0 ) {
			// 変数digitNumberにインクリメントを行う。
			digitNumber++;
			// 変数integerNumberの値を10で割る。
			integerNumber /= 10;
		}
		
		// 正の整数値を入力した場合は桁数を示す変数digitNumberが1以上になることを利用して分岐
		if ( digitNumber > 0 ) {
			// 入力した値が何桁かを表示する。
			System.out.println("入力した値の桁数：" + digitNumber );
		// 入力した値が正の整数値でなかった場合の分岐
		} else {
			// 整数値が正でないことを表示する。
			System.out.println("入力した値が正の整数値ではありません。");
		}
		
	}
	
}
