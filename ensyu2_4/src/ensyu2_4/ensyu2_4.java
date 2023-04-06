//パッケージの宣言
package ensyu2_4;

// 入力するときにクラスの前に書く。
import java.util.Scanner;

/*
 * クラス名：ensyu2_4
 * 概要：演習2-4クラス
 * 作成者：S.Saito
 * 作成日：2023.04.05
 */
public class ensyu2_4 {
	
	/*
	 * 関数名：main
	 * 概要：整数値を入力し、入力した値に対し10加えた値と10減じた値を出力する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.05
	 */
	public static void main(String[] args) {
		
		// [System.in]でキーボードで入力するように指定する。mainの最初に書く。
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値の変数Integerをつくる。
		int Integer;		
		// 整数値の入力を行うことを示すように文字を表示する。
		System.out.print("整数値：");
		// 変数Integerにキーボードでの整数値の入力を行う。
		Integer = standardInput.nextInt();
		
		// 入力した値に対して10を加えた値を文字で表示する。
		System.out.println("10を加えた値は" + (Integer+10) + "です。");
		// 入力した値に対して10を減じた値を文字で表示する。
		System.out.println("10を減じた値は" + (Integer-10) + "です。");
		
	}

}
