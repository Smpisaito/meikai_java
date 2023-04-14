// パッケージの宣言
package Ensyu6_3;

/*
 * クラス名：Ensyu6_3
 * 概要：演習6-3クラス
 * 作成者：S.Saito
 * 作成日：2023.04.14
 */
public class Ensyu6_3 {
	
	/*
	 * 関数名：main
	 * 概要：double型で要素数が5の配列に対し、要素の先頭から順に1.1，2.2，3.3，4.4，5.5を代入して表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.14
	 */
	public static void main(String[] args){
		
		// double型、要素数5の配列をつくる。
		double[] doubleNumber = new double[5];
		// 配列の要素数をもとに全要素に目的の値の代入を行うループをつくる。
		for ( int countNumber = 0; countNumber < doubleNumber.length; countNumber++) {
			/*
			 *  配列doubleNumberの変数countNumberがインデックスである要素に対し変数countnumberの値を代入する
			 *  計算式は可能な限りint型で行うように「(countNumber +1)* 1」とdouble型の「(countNumber + 1)* 0.1」
			 *  で分けて計算を行ってから足すことで誤差ができるだけ生じないようにしている。
			 */
			doubleNumber[countNumber] = (countNumber + 1)* 1 + (countNumber + 1)* 0.1;
		}
		// 配列の要素を先頭から順に表示するループをつくる。
		for ( int countNumber = 0; countNumber < doubleNumber.length; countNumber++) {
			// 配列doubleNumberの要素をインデックスが0から順に表示される。
			System.out.println("doubleNumber[" + countNumber + "] = " + doubleNumber[countNumber]);
		}
	}
}
