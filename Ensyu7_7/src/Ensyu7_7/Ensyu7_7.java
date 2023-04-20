// パッケージの宣言
package Ensyu7_7;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu7_7
 * 概要：演習7-7クラス
 * 作成者：S.Saito
 * 作成日：2023.04.19
 */
public class Ensyu7_7 {
	
	/*
	 * 関数名：putStars
	 * 概要：「*」の連続表示をputCharsを用いて行う。関数名・引数名は、問の中で指定されている関数名とその関数の
	 *       出る元のプログラムとしてあげられている[明解Java List7-7][明解Java List7-8]のと同じものを使う。
	 * 引数：n … 「*」の表示する回数。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	static void putStars(int n) {
		// n回の「*」の文字の連続表示をメソッドputCharsを用いて行う。
		putChars('*',n);
	}
	
	/*
	 * 関数名：putChars
	 * 概要：引数cに入れられたchar型の文字の連続表示を行う。関数名・引数名は、問の中で指定されている関数名と
	 *       その関数の出る元のプログラムとしてあげられている[明解Java List7-7][明解Java List7-8]のと同じものを使う。
	 * 引数：c … char型の文字列。
	 *       n … 文字列を表示する回数。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	static void putChars(char c, int n) {
		// 引数nの回数だけ繰り返すループ。
		while (n-- > 0) {
			// 引数cの文字を表示する。
			System.out.print(c);
		}
	}
	
	/*
	 * 関数名：main
	 * 概要：[明解Java List7-7]のメソッドputStarsの「*」を連続表示する動作を[明解Java List7-8]メソッドputChars
	 *       を用いて行うように直して、正常に動いているのかを確認する。[明解Java List7-7]に合わせて、段数を入力
	 *       するとそれに合った段数で左下に直角が来る直角三角形を表示するプログラムを用いる。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args){
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 左下に直角の来る三角形を表示することを伝える。
		System.out.println("左下が直角の三角形を表示します。");
		// 段数を示す変数をつくる。
		int integerNumber = 0;
		// 正の整数値が入力されるまで入力を続けるループ。
		do {
			// 段数を入力するように表示する。
			System.out.print("段数：");
			// 段数を入力する。
			integerNumber = standardInput.nextInt();
			// 正の整数値ではない値が入力された場合の分岐
			if ( integerNumber <= 0) {
			// 正の整数値を入力するように促す。
				System.out.println("正の整数値を入力してください。");
			}
		// 入力した値が0以下ならループする。
		} while( integerNumber <= 0 );
		
		// 入力した値をもとに左下が直角の三角形を表示するループ。
		for (int loopNumber = 1; loopNumber <= integerNumber; loopNumber++) {
			// メソッドputStarsを用いて「*」を目的の回数だけ表示する
			putStars(loopNumber);
			// 段数を変えるための改行を入れる。
			System.out.println();
		}
	}
	
}
