// パッensyuケージの宣言
package Ensyu4_13;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_13
 * 概要：演習4-13クラス
 * 作成者：S.Saito
 * 作成日：2023.04.11
 */
public class Ensyu4_13 {
	
	/*
	 * 関数名：main
	 * 概要：入力した整数値から1までの和を求める。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		// 入力する変数をつくる。
		int integerNumber;
		// これから行うことを示す。
		System.out.println("1から入力した正の整数値までの和を求める。");
		
		do {
			// 整数値の入力を行うことを示す。
			System.out.print("整数値：");
			// 整数値の入力を行う。
			integerNumber = standardInput.nextInt();
		} while ( integerNumber<=0 );
		
		
		// 和を入れる変数sumNumbrを作る。初期値は0にする。
		int sumNumber =0;
		// 入力した値から1まで変数sumNumberに和を入れるためのループをつくる。
		for(int loopNumber = 1; loopNumber <= integerNumber ;loopNumber++) {
			// 入力した値から1までの数字を加算する。
			sumNumber += loopNumber;
		}
		
		// 入力した整数値から0までの和の値を表示する。
		System.out.println("入力した整数値から1までの和は" + sumNumber + "です。");
	}
	
}
