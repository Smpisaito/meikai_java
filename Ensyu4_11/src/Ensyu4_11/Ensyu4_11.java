// パッケージの宣言
package Ensyu4_11;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_11
 * 概要：演習4-11クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_11 {
	
	/*
	 * 関数名：main
	 * 概要：[明解Java List4-4]の入力した正の整数値から０までのカウントダウンを行うプログラムを
	 *       for文を用いて作成する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// カウントダウンを行うことを示す。
		System.out.println("カウントダウンを行います。");
		int countNumber;
		// 入力した値が1以上になるまで繰り返す。
		do {
			// 正の整数値を入力することを示す。
			System.out.print("正の整数値：");
			// 正の整数値の入力を行う。
			countNumber = standardInput.nextInt();
		// 入力した値が0以下の条件の時繰り返す。
		} while (countNumber <= 0);
		
		// 変数countNumberが変数loopNumber(0)より小さくなるまで繰り返す。
		for( int loopNumber = 0; loopNumber <= countNumber ;countNumber--) {
			// 入力した値から0までの数字を表示する。
			System.out.println( countNumber );
		}
	}

}
