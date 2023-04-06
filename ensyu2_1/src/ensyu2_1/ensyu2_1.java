//パッケージの宣言
package ensyu2_1;

/*
 * クラス名：ensyu2_1
 * 概要：演習2-1クラス
 * 作成者：S.Saito
 * 作成日：2023.04.05
 */
public class ensyu2_1 {
	
	/*
	 * 関数名：main
	 * 概要：明解Java入門編のList2－6のプログラムをもとに、
	 *       int型の変数に小数部を持つ実数値を入力するとエラーが発生することを確認する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.05
	 */
	public static void main(String[] args) {
		
		
		int x;			// int型の変数xをつくる。
		int y;			// int型の変数yをつくる。
		
		// int型の変数xに小数部のある数字を代入しようとするとエラーが出ることを確認する。
		x = 63.65;
		// int型の変数yに小数部のある数字を代入しようとするとエラーが出ることを確認する。
		y = 18.45;
		
		// xに正しく数字が代入されていた場合に、xの値を表示する。
		System.out.println("xの値は" + x + "です。");
		// yに正しく数字が代入されていた場合に、yの値を表示する。
		System.out.println("yの値は" + y + "です。");
		// xとyに正しく数字が代入されていた場合に、xとyの合計を表示する。
		System.out.println("合計は" + ( x + y ) + "です。");
		// xとyに正しく数字が代入されていた場合に、xとyの平均を小数点以下を切り捨てして表示する。
		System.out.println("平均は" + ( x + y ) / 2 + "です。");
		
	} 

}
