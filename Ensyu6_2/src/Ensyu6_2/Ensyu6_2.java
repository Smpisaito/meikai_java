// パッケージの宣言
package Ensyu6_2;

/*
 * クラス名：Ensyu6_2
 * 概要：演習6-2クラス
 * 作成者：S.Saito
 * 作成日：2023.04.14
 */
public class Ensyu6_2 {
	
	/*
	 * 関数名：main
	 * 概要：int型で要素数が5の配列に対し、要素の先頭から順に5，4，3，2，1を代入して表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.14
	 */
	public static void main(String[] args){
		
		// int型、要素数5の配列をつくる。
		int[] integerNumber = new int[5];
		// 配列の要素数をもとに全要素に目的の値の代入を行うループをつくる。
		for ( int countNumber = 1; countNumber <= integerNumber.length; countNumber++) {
			// 配列integerNumberの、配列自体の要素数から変数countNumberを引いた値が
			// インデックスである要素に対し変数countnumberの値を代入する。
			integerNumber[integerNumber.length - countNumber] = countNumber;
		}
		// 配列の要素を先頭から順に表示するループをつくる。
		for ( int countNumber = 0; countNumber < integerNumber.length; countNumber++) {
			// 配列integerNumberの要素をインデックスが0から順に表示される。
			System.out.println("integernumber[" + countNumber + "] = " + integerNumber[countNumber]);
		}
		
	}

}
