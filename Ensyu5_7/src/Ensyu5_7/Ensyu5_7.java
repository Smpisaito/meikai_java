// パッケージの宣言
package Ensyu5_7;

/*
 * クラス名：Ensyu4_7
 * 概要：演習4-7クラス
 * 作成者：S.Saito
 * 作成日：2023.04.14
 */
public class Ensyu5_7 {
	
	/*
	 * 関数名：main
	 * 概要：0.0から1.0まで0.001おきに、その値とその値の二乗を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.14
	 */
	public static void main(String[] args){
		
		// 代入を行うfloat型の変数をつくる。
		float outputNumber = 0;
		// int型の変数integerNumberが0から1000になるまでループする。
		for(int integerNumber = 0; integerNumber<= 1000; integerNumber++) {
			// 変数outputNumberに、変数integerNumberの値をfloat型のキャストしてさらに1000で割った値を代入する。
			outputNumber = (float)integerNumber / 1000;
			// 変数outputNumberを表示する。改行は入れない。
			System.out.printf("%1.8f  ", outputNumber);
			// 変数outputNumberに、変数integerNumberの二乗のfloat型のキャストをした値を1000000(百万)で割った値を代入する。
			outputNumber = (float)integerNumber * integerNumber / 1000000;
			// 変数outputNumberを表示する。
			System.out.printf("%1.8f\n", outputNumber);
		}
		
	}

}
