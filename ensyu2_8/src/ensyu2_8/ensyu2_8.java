// パッケージの宣言
package ensyu2_8;

import java.util.Random;
import java.util.Scanner;

/*
 * クラス名：ensyu2_8
 * 概要：演習2-8クラス
 * 作成者：S.Saito
 * 作成日：2023.04.06
 */
public class ensyu2_8 {
	
	/*
	 * 関数名：main
	 * 概要：入力した整数値に対して±5の範囲の整数値をランダムに生成して表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.05
	 */
	public static void main(String[] args) {
		
		// キーボードでの入力を指定する。main内で操作を行うコードより前に置く
		Scanner StandardInport = new Scanner(System.in);
		
		// 乱数を代入する際に、main内で操作を行うコードより前に置く
		Random RandomNumber = new Random();
		
		// 整数値を入力することを示す
		System.out.print("整数値：");
		// 整数値の変数Integerの初期値のキーボード入力を行う。
		int Integer = StandardInport.nextInt();
		
		// 整数値の変数Randomに初期値として0以上10以下の乱数を入れる。
		int Random = RandomNumber.nextInt(11);
		// 入力値±5の範囲の整数値になるように、IntegerとRandomの和に5を引いた値を示す。
		System.out.println("入力した値の±5の範囲で乱数を生成しました。\n乱数は　"
		+ (Integer + Random - 5) + "です");
	}

}
