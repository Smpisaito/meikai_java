// パッケージの宣言
package Ensyu5_6;

/*
 * クラス名：Ensyu5_6
 * 概要：演習5-6クラス
 * 作成者：S.Saito
 * 作成日：2023.04.14
 */
public class Ensyu5_6 {
	
	/*
	 * 関数名：main
	 * 概要：float型の変数を0.0から1.0まで0.001ずつ増やす様子と、
	 *       int型の変数を1から1000までインクリメントした値を1000で割った値を求める様子を、横に並べて表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.14
	 */
	public static void main(String[] args){
		
		// float型を用いた場合の合計を示す変数をつくる。初期値を0.0とする
		float sumFloat = (float)0 / 1000;
		// int型を用いた場合の合計を示す変数をつくる。
		float sumInt = 0.0F;
		
		// float型の場合とint型の場合がわかるように表示する。
		System.out.println("   float        int");
		// 値がわかりやすいように分けるように表示する。
		System.out.println("-----------------------");
		// 変数sumFloatと変数sumIntそれぞれの初期値を表示する。
		System.out.printf("%1.8f | %1.8f\n", sumFloat, sumInt);
		
		// int型の変数が0から1000まで1ずつ増加する間繰り返すループ。
		for (int integerNumber = 1; integerNumber <= 1000; integerNumber++ ) {
			// float型の合計を示す変数sumFloatにfloot型の0.001を加算する。
			sumFloat += 0.001F;	
			// int型の変数integerNumberをfloatのキャストしたものに対して1000で割った値を変数sumIntに代入する
			sumInt = (float)integerNumber / 1000;
			// 変数sumFloatと変数sumIntそれぞれの値を表示する。
			System.out.printf("%1.8f | %1.8f\n", sumFloat, sumInt);
		}
		
	}

}
