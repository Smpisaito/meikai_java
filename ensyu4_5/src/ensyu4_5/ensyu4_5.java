// パッケージの宣言
package ensyu4_5;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu4_5
 * 概要：演習4-5クラス
 * 作成者：S.Saito
 * 作成日：2023.04.10
 */
public class ensyu4_5 {
	
	/*
	 * 関数名：main
	 * 概要：[明解Java List4-5]のカウントダウンのプログラムにおける変数xのデクリメントの部分の(x--)を
	 *       (--x)に書き換えた時、どのような出力が得られるか確認する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.10
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// カウントダウンを行うことを説明する。
		System.out.println("カウントダウンをします。");
		
		// カウントダウンに用いる変数として元のプログラムのxの代わりの変数integerNumberをつくる。
		int integerNumber = 0;
		
		// 入力した値が正の整数値になるまでループする。
		do {
			// 正の整数値を入力することを示す。
			System.out.print("正の整数値：");
			// 整数値の入力を行う。
			integerNumber = standardInput.nextInt();
		// 入力された値が正はない整数値(0、負の整数値)であるときを条件にする。
		} while ( integerNumber <= 0 );
		
		// 本来はデクリメントを用いて変数integerNumberが0未満になるまで繰り返す。
		while ( integerNumber >= 0 )
			// [明解Java List4-5]におけるデクリメントを(x--)を(--x)に変更したことで(本プログラム内ではintegerNumber)減少前ではなく減少後の値が表示されるようになり、
			// 本来は入力値から0までのところ、入力値より1減じた値から-1まで出力してしまっている。
			System.out.println(--integerNumber);
	}

}
