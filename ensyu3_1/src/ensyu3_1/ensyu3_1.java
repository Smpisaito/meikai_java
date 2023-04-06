// パッケージの宣言
package ensyu3_1;

// 入力を行うときにクラス宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_1
 * 概要：演習3-1クラス
 * 作成者：S.Saito
 * 作成日：2023.04.06
 */
public class ensyu3_1 {
	
	/*
	 * 関数名：main
	 * 概要：整数値を入力し、入力した整数値の絶対値を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		
		// キーボードでの入力を指定する。mainの中で入力を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 整数値の入力をすることを示すように表示する。
		System.out.print("整数値");
		// int型の変数Integerに整数値を入力する。
		int Integer = StandardInput.nextInt();
		
		// Integerに入力した値が負の値である場合の分岐
		if (Integer < 0)
			// Integerを正の値にする。
			Integer = Integer * -1;
		// Integerの値を表示する
		System.out.println("入力した値の絶対値は" + Integer + "です。");
		
	}

}
