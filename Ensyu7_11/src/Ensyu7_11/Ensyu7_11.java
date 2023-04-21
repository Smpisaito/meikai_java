// パッケージの宣言
package Ensyu7_11;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu7_11
 * 概要：演習7-11クラス
 * 作成者：S.Saito
 * 作成日：2023.04.20
 */
public class Ensyu7_11 {
	
	/*
	 * 関数名：printBits
	 * 概要：int型の整数のbitの内容を表示する。
	 * 引数：integerNumber … int型の整数値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static void printBits(int integerNumber) {
		// int型(32bit)の全てを確認する。
		for (int loopNumber = 31;loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((integerNumber >>> loopNumber & 1) == 1) ? '1' : '0');
		}
	}
	
	/*
	 * 関数名：inputInteger
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int inputInteger(String outputWord) {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		integerNumber = standardInput.nextInt();
		// 入力した値を返す。
		return integerNumber;
	}

	/*
	 * 関数名：plusInteger
	 * 概要：「(引数の文字)：」と表示し、その後に正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：
	 */
	static int plusInteger(String outputWord) {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 正の整数値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger(outputWord);
			// 正の整数値ではないときに分岐する。
			if (integerNumber <= 0) {
				// 正の整数値を入力するように促す。
				System.out.println("正の整数値を入力してください。");
			}
		// 入力した値が0以下ならループする。
		} while( integerNumber <= 0 );
		// 最後に入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：exponentiationInteger
	 * 概要：int型の値から2のべき乗の計算を行う。べき数が正か0ではない場合はそのことを表示してから1を返す。
	 * 引数：baseNumber … 底を示す整数値。
	 *       exponentNumber … べき指数を示す整数値
	 * 戻り値：integerNumber … べき指数が正か0であれば計算した値を、べき指数が正か0ではない場合は1を返す
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int exponentiationInteger(int baseNumber, int exponentNumber) {
		// integerNumberに初期値1を入れる。
		int integerNumber = 1;
		// べき指数が0以上である場合の分岐
		if (exponentNumber >= 0){
			// べき数の回数ループする。
			for(int loopNumber = 0;loopNumber < exponentNumber ;loopNumber++) {
				// 底をかける
				integerNumber *= baseNumber;
			} 
		// 正か0ではないとき
		}else {
			// 問題点を表示する。
			System.out.println("べき指数が負の値でした。確認をしてください");
		}
		// 戻り値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：好きな整数値を入力し、左右にシフトした値と2のべき乗での乗算や除算と同じになることを確認する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 整数の入力を行うことを示す。
		int integerNumber = inputInteger("整数値");
		// シフトする数の入力を示す。
		int shiftBits = plusInteger("シフトするビット数");
		
		// もとの整数値の値のビット構成であることを示す。
		System.out.println("整数値" + integerNumber + "のビット構成");
		// もとの整数値のビット構成を表示する。
		printBits(integerNumber);
		
		// 左に入力したビット値だけシフトした整数値のビット構成であることを示す。
		System.out.println("\n整数値を" + shiftBits + "だけ左にシフトしたビット構成");
		// 左にシフトした際のビット構成を表示する。
		printBits(integerNumber << shiftBits);
		// 右に入力したビット値だけシフトした整数値のビット構成であることを示す。
		System.out.println("\n整数値を" + shiftBits + "だけ右にシフトしたビット構成");
		// 右にシフトした際のビット構成を表示する。
		printBits(integerNumber >> shiftBits);
		
		final int SECONDNUMBER = 2;
		// シフトするビット数の値で2のべき乗した値を出すことを示す。
		System.out.print("\nシフトするビット数をべき指数とした2のべき乗の値：");
		// シフトするビット数の値で2のべき乗した値を出すことを示す。
		int poworInteger = exponentiationInteger(SECONDNUMBER, shiftBits);
		// 2のべき乗の値をもとに整数値を乗算した値を示す。
		System.out.println("\n" + integerNumber + " × " + poworInteger + " = " + integerNumber * poworInteger);
		// 乗算後の値のビット数であることを示す。
		System.out.println(integerNumber * poworInteger + "のビット数");
		// 乗算後の値のビット構成を示す
		printBits(integerNumber * poworInteger);
		// 2のべき乗の値をもとに整数値を減算した値を示す。
		System.out.println("\n" + integerNumber + " ÷ " + poworInteger + " = " + integerNumber / poworInteger);
		// 減算後の値のビット数であることを示す。
		System.out.println(integerNumber / poworInteger + "のビット数");
		// 減算後の値のビット構成を示す
		printBits(integerNumber / poworInteger);
		// 改行を入れる
		System.out.println();
	}
}
