// パッケージの宣言
package ensyu3_3;

// 入力を行う特にクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_3
 * 概要：演習3-3クラス
 * 作成者：S.saito
 * 作成日：2023.04.06
 */
public class ensyu3_3 {
	
	/*
	 * 関数名：main
	 * 概要：明解JavaのList3-5をもとに、最後の[else]のコードを[else if (n == 0)]に変更したとき
	 *       プログラムがどのように動作するかについて確認をする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		
		// キーボードでの入力を行うよう指定する。main内で入力を行う前に置く。
		Scanner stdIn = new Scanner(System.in);
		
		// 整数値を出力する旨を示すように文字を表示する。
		System.out.print("整数値：");
		// int型の変数nに整数を入力する
		int n = stdIn.nextInt();
		
		// 入力した値が正の値であった場合の分岐。
		if (n > 0)
			// 入力した値が正であることを示すように表示する。
			System.out.println("その値は正です。");
		// 入力した値が負の数であった場合の分岐。
		else if (n < 0)
			// 入力した値が負であることを示すように表示する。
			System.out.println("その値は負です。");
		// 入力した値が0である場合の分岐。
		// 元の[else]のみであった場合は「正でも負でもない値」になるため同様の分岐となっている。
		else if (n == 0)
			// 入力した値が0であることを示すように表示する。
			System.out.println("その値は0です。");
		
		
	}

}
