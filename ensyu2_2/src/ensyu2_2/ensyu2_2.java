// パッケージの宣言
package ensyu2_2;

/*
 * クラス名：ensyu2_2
 * 概要：演習2-2クラス
 * 作成者：S.Saito
 * 作成日：2023.04.05
 */
public class ensyu2_2 {
	
	/*
	 * 関数名：main
	 * 概要：三つのint型の変数に値を代入し、それらの合計と平均値を求める。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.05
	 */
	public static void main(String[] args) {
		
		// 一つ目のint型の変数FirstNumberをつくる。
		int FirstNumber;
		// 二つ目のint型の変数SecondNumberをつくる。
		int SecondNumber;
		// 三つ目のint型の変数ThirdNumberをつくる
		int ThirdNumber;
		
		// 一つ目の変数に代入を行う。
		FirstNumber = 39;
		// 二つ目の変数に代入を行う。
		SecondNumber = 26;
		// 三つ目の変数に代入を行う。
		ThirdNumber = 72;
		
		// 一つ目の変数に代入された値を表示する。
		System.out.println("一つ目の値は" + FirstNumber + "です。");
		// 二つ目の変数に代入された値を表示する。
		System.out.println("二つ目の値は" + SecondNumber + "です。");
		// 三つ目の変数に代入された値を表示する。
		System.out.println("三つ目の値は" + ThirdNumber + "です。");
		
		// 三つの変数の表示との間を一行開ける。
		System.out.println();
		// 三つの変数の合計を表示する。
		System.out.println("合計は" + ( FirstNumber + SecondNumber + ThirdNumber ) + "です。");
		// 三つの変数の平均を、小数点以下切り捨てして表示する。
		System.out.println("平均は" + ( FirstNumber + SecondNumber + ThirdNumber ) / 3 + "です。");
		
	}

}