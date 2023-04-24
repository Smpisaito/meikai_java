// パッケージの宣言
package Ensyu7_12;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu7_12
 * 概要：演習7-12クラス
 * 作成者：S.Saito
 * 作成日：2023.04.20
 */
public class Ensyu7_12 {
	
	/*
	 * 関数名：rRotate
	 * 概要：整数xを右にnビット回転した値を返す。関数名・引数名は指定のものを使う。
	 * 引数：x … 整数
	 *       n … 整数ビットの回転数
	 * 戻り値：bitsInteger … 回転後の整数値
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int rRotate(int x, int n) {
		// 戻り値として変更後の値となる変数に初期値0を入れる。
		int bitsInteger = 0;
		// final変数で2をとる。
		final int SECONDFINAL = 2;
		// ビット数の32の値を入れる。
		final int BITSCOUNT = 32;
		// nの値の32の剰余をあらわす
		int remainderInteger = n % BITSCOUNT;
		// もともと値の入っているビットのみ表示する。
		for (int loopNumber = remainderInteger - 1;loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
			// シフトしたときの値を戻り値bitsIntegerに加える。
			bitsInteger += ((x >>> loopNumber & 1) == 0) ? 0 : exponentiationInteger(SECONDFINAL,BITSCOUNT+loopNumber-remainderInteger);
		}
		// 回転した値を表示する。
		for (int loopNumber = BITSCOUNT - 1 ;loopNumber >= remainderInteger; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
			// シフトしたときの値を戻り値bitsIntegerに加える。
			bitsInteger += ((x >>> loopNumber & 1) == 0) ? 0 : exponentiationInteger(SECONDFINAL,loopNumber-remainderInteger);
			
		}
		// bitsIntegerの値を返す。
		return bitsInteger;
	}
	
	/*
	 * 関数名：lRotate
	 * 概要：整数xを左にnビット回転した値を返す。関数名・引数名は指定のものを使う。
	 * 引数：x … 整数
	 *       n … 整数ビットの回転数
	 * 戻り値：bitsInteger … 回転後の整数値
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int lRotate(int x, int n) {
		// 戻り値として変更後の値となる変数に初期値1を入れる。
		int bitsInteger = 0;
		// final変数で2をとる。
		final int SECONDFINAL = 2;
		// ビット数の32の値を入れる。
		final int BITSCOUNT = 32;
		// nの値の32の剰余をあらわす
		int remainderInteger = n % BITSCOUNT;
		// もともと値の入っているビットのみ表示する。
		for (int loopNumber = BITSCOUNT - 1 - remainderInteger;loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
			// シフトしたときの値を戻り値bitsIntegerに加える。
			bitsInteger += ((x >>> loopNumber & 1) == 0) ? 0 : exponentiationInteger(SECONDFINAL,loopNumber + remainderInteger);
		}
		// 回転した値を表示する。
		for (int loopNumber = BITSCOUNT - 1 ;loopNumber > BITSCOUNT - 1 - remainderInteger; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((x >>> loopNumber & 1) == 1) ? '1' : '0');
			// シフトしたときの値を戻り値bitsIntegerに加える。
			bitsInteger += ((x >>> loopNumber & 1) == 0) ? 0 : exponentiationInteger(SECONDFINAL,loopNumber + remainderInteger - BITSCOUNT);
		}
		return bitsInteger;
	}

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
	 * 関数名：xponentiationInteger
	 * 概要：int型の値から2のべき乗の計算を行う。べき数が正か0ではない場合はそのことを表示してから1を返す。
	 * 引数：baseNumber … 底を示す整数値。
	 *       exponentNumber … べき指数を示す正の整数値
	 * 戻り値：integerNumber … べき数が正か0であれば計算した値を、べき数が正か0ではない場合は1を返す
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
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
			System.out.println("べき数が負の値でした。確認をしてください");
		}
		// 戻り値を返す。
		return integerNumber;
	
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
	 * 作成日：2023.04.20
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
	 * 関数名：main
	 * 概要：入力した整数値をもとに、左右それぞれに入力した回数だけビット回転した値を求める。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	public static void main(String[] args){
		
		// 整数値の入力を行う。
		int integerNumber = inputInteger("整数値");
		// 整数値のビット回転する数の入力を行う。
		int bitsRotate = plusInteger("ビット回転する回数");
		
		// 整数値そのままのビット構成を表示することを示す。
		System.out.println("整数値のもとのビット構成");
		// ビット構成を示す。
		printBits(integerNumber);
		
		// 整数値の右にビット回転した時のビット構成。
		System.out.println("\n\n整数値の右にビット回転した時のビット構成");
		// 整数値の右にビット回転した時のビット構成を表示する
		int rightBits = rRotate(integerNumber, bitsRotate);
		// 処理後の値を表示する。
		System.out.print("\n右回転後の値：" + rightBits);
		
		// 整数値の左にビット回転した時のビット構成。
		System.out.println("\n\n整数値の左にビット回転した時のビット構成");
		// 整数値の左にビット回転した時のビット構成を表示する
		int leftBits = lRotate(integerNumber, bitsRotate);
		// 処理後の値を表示する。
		System.out.print("\n左回転後の値：" + leftBits);
	}
}
