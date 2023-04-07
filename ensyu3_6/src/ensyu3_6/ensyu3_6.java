// パッケージの宣言
package ensyu3_6;

// 入力の操作をする場合、クラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu3_6
 * 概要：演習3-6クラス
 * 作成者：S.Saito
 * 作成日：2023.04.06
 */
public class ensyu3_6 {
	
	/*
	 * 関数名：main
	 * 概要：正の整数値を読み込んで、10の倍数であるか否かを示す。
	 *       入力した値が正の整数値ではなかった場合にもそれに対する反応を示す。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		
		// キーボードでの入力操作を指定する。main内に入力を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 正の整数値を入力することを示す。
		System.out.print("正の整数値：");
		// 正の整数値を入力する。
		int IntegerNumber = StandardInput.nextInt();
		
		// 入力された値が正の整数値ではなかった場合の分岐。
		if (IntegerNumber <= 0)
			// 正ではない値が入力されたことを説明する。
			System.out.println("正ではない値が入力されました");
		// 入力された値が10の倍数の場合の分岐。
		else if (IntegerNumber % 10 == 0)
			// 入力された値が10の倍数であることを表示する。
			System.out.println("この値は10の倍数です。");
		// それ以外、入力された値が10の倍数ではない場合の分岐。
		else
			// 入力された値が10の倍数ではないことを表示する
			System.out.println("この値は10の倍数ではありません。");
		
	}

}
