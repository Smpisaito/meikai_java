// パッケージの宣言
package ensyu3_4;

// 入力を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_4
 * 概要：演習3-4クラス
 * 作成者：S.Saito
 * 作成日：2023.04.06
 */
public class ensyu3_4 {
	
	/*
	 * 関数名：main
	 * 概要：二つの変数aとbに値を入力し、その値の大小関係を答える。二つの変数が等しい場合も回答する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		
		// 入力をキーボードで行うよう指定する。main内で入力するコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 変数aに値を入力するように文字を表示する。
		System.out.print("変数a：");
		// double型の変数aに値を入力する。
		double a = StandardInput.nextInt();
		
		// 変数bに値を入力するように文字を表示する。
		System.out.print("変数b：");
		// double型の変数bに値を入力する。
		double b = StandardInput.nextInt();
		
		// aの値がbの値より大きかった場合の分岐。
		if (a > b)
			// aの値の方が大きいことを表示する。
			System.out.println("aのほうが大きいです。");
		// bの値がaの値より大きかった場合の分岐。
		else if (b > a)
			// bの方が大きかったことを表示する。
			System.out.println("bのほうが大きいです。");
		// それ以外、aとbが等しいときの分岐。
		else
			//　aとbが等しいことを表示する。
			System.out.println ("aとbは同じ値です。");
			
	}
}
