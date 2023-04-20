// パッケージの宣言
package Ensyu7_4;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu7_4
 * 概要：演習7-4クラス
 * 作成者：S.Saito
 * 作成日：2023.04.19
 */
public class Ensyu7_4 {
	
	/*
	 * 関数名：sumUp
	 * 概要：1から実引数の値までの整数の和を返す。関数名・引数名は指定のものを使う。
	 * 引数：n … 正の整数値。
	 * 戻り値：sumNumber … 1から引数の値までの全ての整数の和。
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	static int sumUp(int n) {
		// 1からnまでの整数の和を求める。
		int sumNumber = n * ( n + 1 ) / 2;
		// 1からnまでの整数の和を返す。
		return sumNumber;
	}

	/*
	 * 関数名：main
	 * 概要：正の整数値を入力し、1から入力した値までの整数和をメソッドで求める。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力に使う変数をつくる。
		int integerNumber = 0;
		// 正の整数値が入力されるまで入力を続けるループ。
		do {
			// 正の整数値を入力するように表示する。
			System.out.print("正の整数値：");
			// 正の整数値を入力する。
			integerNumber = standardInput.nextInt();
			// 正の整数値ではない値が入力された場合の分岐
			if ( integerNumber <= 0) {
			// 正の整数値を入力するように促す。
				System.out.println("正の整数値を入力してください。");
			}
		// 入力した値が0以下ならループする。
		} while( integerNumber <= 0 );
		// メソッドsumUpから、1から入力した値までの整数和を値を得る。
		int sumNumber = sumUp(integerNumber); 
		// 1から入力した値までの整数和を表示する。
		System.out.println("1から" + integerNumber + "までの整数和：" + sumNumber);
	}
	
}
