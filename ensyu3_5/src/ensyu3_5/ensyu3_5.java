// パッケージの宣言
package ensyu3_5;

// 入力を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_5
 * 概要：演習3-5クラス
 * 作成者：S.Saito
 * 作成日：2023.04.06
 */
public class ensyu3_5 {
	
	/*
	 * 関数名：main
	 * 概要：正の整数値を読みこみ、それが5で割り切れるか否かを表示する。
	 *       もし正ではない整数値が読み込まれたら正ではない値が入力されたことを示す。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		
		// 入力がキーボードから行われるように指定する。main内で入力するコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 正の整数値を入力することを示す表示をする。
		System.out.print("正の整数：");
		// int型の変数Numberの初期値を入力する。
		int Number = StandardInput.nextInt();
		
		// Numberに入力した値が正の整数でないときの分岐。
		if (Number <= 0)
			// 正ではない値が入力されたことを示す表示をする。
			System.out.println("正ではない値が入力されました。");
		// Numberに入力した値が正の整数であり、5で割った時に割り切れる時の分岐。
		else if (Number % 5 == 0)
			// Numberに入力された値が5で割り切れることを示す表示をする。
			System.out.println("その値は5で割り切れます。");
		// その他、Numberが正の整数であり、5で割り切れない時の分岐。
		else
			// Numberに入力された値が5で割り切れないことを示す表示をする。
			System.out.println("その値は5で割り切れません。");
		
	}

}
