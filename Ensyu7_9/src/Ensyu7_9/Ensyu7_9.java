// パッケージの宣言
package Ensyu7_9;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu７_9
 * 概要：演習7-9クラス
 * 作成者：S.Saito
 * 作成日：2023.04.20
 */
public class Ensyu7_9 {
	
	/*
	 * 関数名：readPlusInt
	 * 概要：「正の整数値：」と表示して入力を求め、正の整数値を返却する。正の整数値が入力されるまでループする。
	 *       関数名は指定のものを使う。
	 * 引数：なし
	 * 戻り値：integerNumber
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int readPlusInt() {
		
		// 「正の整数値」と表示するようにメソッドplusIntegerを呼び出す。
		int integerNumber = plusInteger("正の整数値");
		// 正の整数値を返す。
		return integerNumber;
		
	}

	
	/*
	 * 関数名：plusInteger
	 * 概要：「(引数の文字列)：」と表示し、その後に正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
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
		// 最後に入力した値を返す。
		return integerNumber;
		
	}
	
	
	/*
	 * 関数名：main
	 * 概要：メソッドreadPlusIntを呼び出して、正の整数値の入力操作が行われるかの確認を行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	public static void main(String[] args){
		// メソッドreadPlusIntから正の整数値の入力が行われるかの確認を行う。
		int	 checkInput = readPlusInt();
	}
	
}
