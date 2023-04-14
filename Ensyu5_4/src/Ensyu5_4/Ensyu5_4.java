// パッケージの宣言
package Ensyu5_4;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu5_4
 * 概要：演習5-4クラス
 * 作成者：S.Saito
 * 作成日：2023.04.13
 */
public class Ensyu5_4 {
	
	/*
	 * 関数名：main
	 * 概要：三つの整数値を入力し、その平均と合計を表示する。平均は実数として表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.13
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 三つの整数値の合計と平均を求めることを表示する
		System.out.println("入力した三つの整数値の合計と平均を求めます。");
		// 入力した値の合計を示す変数をつくる。
		int sumNumber = 0;
		// 三回のループ内で入力を行う。
		for (int loopNumber = 0; loopNumber < 3; loopNumber++) {
			// 整数値の入力を行うように促す。
			System.out.print("整数値：");
			// 整数値の入力を行う。
			int integerNumber = standardInput.nextInt();
			// 入力した整数値を合計の変数sumnumberに加える。
			sumNumber += integerNumber;
		}
		// 三つの整数値の合計を表示する。
		System.out.println("合計：" + sumNumber);
		// 三つの整数値の合計を表示する。double型である3.0で割る。
		System.out.println("平均：" + sumNumber / 3.0);
		
	}

}
