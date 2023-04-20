// パッケージの宣言
package Ensyu7_6;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu7_6
 * 概要：演習7-6クラス
 * 作成者：S.Saito
 * 作成日：2023.04.19
 */
public class Ensyu7_6 {
	
	/*
	 * 関数名：printSeason
	 * 概要：引数mの月の季節を求める。1～12以外の値の時は何も表示しない。関数名・引数名は指定のものを用いる。
	 * 引数：m … 何月かを示す整数値。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	static void printSeason(int m) {
		// mの値を参照して分岐する
		switch (m) {
		// 3月の場合の分岐
		case 3:
		// 4月の場合の分岐
		case 4:
		// 5月の場合の分岐
		case 5:
			// 春と表示して分岐を終える。
			System.out.println("春"); break;
		// 6月の場合の分岐
		case 6:
		// 7月の場合の分岐
		case 7:
		// 8月の場合の分岐
		case 8:
			// 夏と表示して分岐を終える。
			System.out.println("夏"); break;
		// 9月の場合の分岐
		case 9:
		// 10月の場合の分岐
		case 10:
		// 11月の場合の分岐
		case 11:
			// 秋と表示して分岐を終える。
			System.out.println("秋"); break;
		// 12月の場合の分岐
		case 12:
		// 1月の場合の分岐
		case 1:
		// 2月の場合の分岐
		case 2:
			// 秋と表示して分岐を終える。
			System.out.println("冬"); break;
		}
	}
		
	/*
	 * 関数名：plusInteger
	 * 概要：「(引数の文字)：」と表示し、その後に正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	static int plusInteger(String outputWord) {
			
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 正の整数値が入力されるまで入力を続けるループ。
		do {
			// 「(引数の文字列)：」と表示する。
			System.out.print(outputWord + "：");
			// 正の整数値を入力する。
			integerNumber = standardInput.nextInt();
			// 正の整数値ではない値が入力された場合の分岐
			if ( integerNumber <= 0) {
			// 正の整数値を入力するように促す。
				System.out.println("正の整数値を入力してください。");
			}
		// 入力した値が0以下ならループする。
		} while( integerNumber <= 0 );
		
		return integerNumber;
		
	}
	
	/*
	 * 関数名：main
	 * 概要：月の値を入力し、その値をもとに季節を表示する。13以上の時は何も表示しないことを確認する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args){
		
		// 月の値を正の整数値で求める。
		int monthNumber = plusInteger("月");
		
		// 月の値をもとに季節を表示する。
		printSeason(monthNumber);
	}
	
}
