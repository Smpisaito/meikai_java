// パッケージの宣言
package ensyu2_3;

// 入力操作を行うときクラスの宣言前に配置する。
import java.util.Scanner;

/*
 * クラス名：ensyu2_3
 * 概要：演習2-3クラス
 * 作成者：S.Saito
 * 作成日：2023.04.05
 */
public class ensyu2_3 {
	
	/*
	 * 関数名：main
	 * 概要：整数値をキーボードで入力すると、何の数字を入力したか返答を行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.05
	 */
	public static void main(String[] args) {
		
		// mainの最初に入れる。キーボードでの入力を行うように設定する。
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値を示す変数Integerをつくる。
		int Integer;
		// 整数値を入れることを示すように表示する。
		System.out.print("整数値：");
		// Integerにキーボード入力で整数値を入力する
		Integer = standardInput.nextInt();
		
		// 入力した整数値が何であったかの返答を示す
		System.out.println( Integer + "と入力しましたね。");
		
	}

}