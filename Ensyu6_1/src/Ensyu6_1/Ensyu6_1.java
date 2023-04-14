// パッケージの宣言
package Ensyu6_1;

/*
 * クラス名：Ensyu6_1
 * 概要：演習6-1クラス
 * 作成者：S.Saito
 * 作成日：2023.04.14
 */
public class Ensyu6_1 {
	
	/*
	 * 関数名：main
	 * 概要：double型で要素数5の配列を生成して、全要素の初期値の初期値を確認する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.14
	 */
	public static void main(String[] args){
		
		// double型で要素数5の配列doubleNumberをつくる。
		double[] doubleNumber = new double[5];
		
		// 配列doubleNumberの1から5までの全要素の値を表示するループ。
		for (int integerNumber = 0; integerNumber < 5; integerNumber++) {
			// 変数integerNumberがインデックスに入る配列doubleNumberを表示する。
			System.out.println("doubleNumber[" + integerNumber + "] = " + doubleNumber[integerNumber]);
		}
	}
}
