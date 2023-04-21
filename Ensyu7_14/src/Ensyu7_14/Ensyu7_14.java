// パッケージの宣言
package Ensyu7_14;

import java.util.Scanner;

/*
 * クラス名：Ensyu7_14
 * 概要：演習7-14クラス
 * 作成者：S.Saito
 * 作成日：2023.04.21
 */
public class Ensyu7_14 {
	
	/*
	 * 関数名：inputInteger
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
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
	 * 関数名：inputPlus
	 * 概要：「(引数の文字)：」と表示し、その後に正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static int inputPlus(String outputWord) {
		
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
	 * 関数名：inpurMore
	 * 概要：「(引数の文字)：」と表示し、その後に0以上の整数値の入力を求める。0以上の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 *       lowerNumber … 入力する値の最小値
	 * 戻り値：integerNumber … 最小値以上の入力した整数値を返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int inputMore(String outputWord, int lowerNumber) {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 正の整数値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger(outputWord);
			// 正の整数値ではないときに分岐する。
			if (integerNumber < lowerNumber) {
				// 正の整数値を入力するように促す。
				System.out.println(lowerNumber + "以上の値を入力してください。");
			}
		// 入力した値が0以下ならループする。
		} while( integerNumber < lowerNumber );
		// 最後に入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：printBits
	 * 概要：int型の整数のビット構造の内容を表示する。
	 * 引数：integerNumber … int型の整数値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static void printBits(int integerNumber) {
		// int型(32bit)の全てを確認する。
		for (int loopNumber = 31;loopNumber >= 0; loopNumber--) {
			// シフトしたときの1の位の値が1なら1、0なら0を表示することでビットを表示する。
			System.out.print(((integerNumber >>> loopNumber & 1) == 1) ? '1' : '0');
		}
	}
	
	/*
	 * 関数名：getPowor
	 * 概要：int型の値から2のべき乗の計算を行う。べき数が正か0ではない場合はそのことを表示してから1を返す。
	 * 引数：baseNumber … 底を示す整数値。
	 *       exponentNumber … べき指数を示す正の整数値
	 * 戻り値：integerNumber … べき数が正か0であれば計算した値を、べき数が正か0ではない場合は1を返す
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static int getPowor(int baseNumber, int exponentNumber) {
		// integerNumberに初期値1を入れる。
		int integerNumber = 1;
		// べき指数が0以上である場合の分岐
		if (exponentNumber >= 0){
			// べき数の回数ループする。
			for(int loopNumber = 0;loopNumber < exponentNumber ;loopNumber++) {
				// 底をかける
				integerNumber *= baseNumber;
			} 
		// 正か0ではないときの分岐
		}else {
			// 問題点を表示する。
			System.out.println("べき数が負の値でした。確認をしてください");
		}
		// 戻り値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：setBits
	 * 概要：元となる整数値integerNumberから、引数positionNumberの値のビット目を1にした値を返す。
	 * 引数：integerNumber … 元となる整数値
	 *       positionNumber … 何ビット目の値を1にするか示す。最下位から 0,1,2…、と数える。
	 * 戻り値：bitsNumber … 変換後の値。変換しなかった場合はそのままの値を返す。
	 * 作成者：S.Saito
	 * 作成日：20023.04.21
	 */
	static int setBits(int integerNumber, int positionNumber) {
		// 戻り値を設定する。
		int bitsNumber = 0;
		// 2のfinal変数をつくる。
		final int SECONDFINAL = 2;
		// 整数値xのビット構造において、posビット目の値が1の時の分岐。
		if ((integerNumber >>> positionNumber) == 1) {
			// xの値をそのまま戻り値に代入する。
			bitsNumber = integerNumber;
		// それ以外、posビット目が0の場合
		} else {
			// xの値に2のpos乗の値を入れる。
			bitsNumber = integerNumber + getPowor(SECONDFINAL, positionNumber);
		}
		// 戻り値を返す。
		return bitsNumber;
	}
	
	/*
	 * 関数名：resetBits
	 * 概要：元となる整数値integerNumberから、引数positionNumberの値のビット目を0にした値を返す。
	 * 引数：integerNumber … 元となる整数値
	 *       positionNumber … 何ビット目の値を0にするか示す。最下位から 0,1,2…、と数える。
	 * 戻り値：bitsNumber … 変換後の値。変換しなかった場合はそのままの値を返す。
	 * 作成者：S.Saito
	 * 作成日：20023.04.21
	 */
	static int resetBits(int integerNumber, int positionNumber) {
		// 戻り値を設定する。
		int bitsNumber = 0;
		// 2のfinal変数をつくる。
		final int SECONDFINAL = 2;
		// 整数値xのビット構造において、posビット目の値が1の時の分岐。
		if ((integerNumber >>> positionNumber) == 1) {
			// xの値に2のpos乗の値を引く。
			bitsNumber = integerNumber - getPowor(SECONDFINAL, positionNumber);
		// それ以外、posビット目が0の場合
		} else {
			// xの値をそのまま戻り値に代入する。
			bitsNumber = integerNumber;
		}
		// 戻り値を返す。
		return bitsNumber;
	}
	
	/*
	 * 関数名：inverseBits
	 * 概要：元となる整数値integerNumberから、引数positionNumberの値のビット目を反転した値を返す。
	 * 引数：integerNumber … 元となる整数値
	 *       positionNumber … 何ビット目の値を1なら0、0なら1にするか示す。最下位から 0,1,2…、と数える。
	 * 戻り値：bitsNumber … 変換後の値。
	 * 作成者：S.Saito
	 * 作成日：20023.04.21
	 */
	static int inverseBits(int integerNumber, int positionNumber) {
		// 戻り値を設定する。
		int bitsNumber = 0;
		// 2のfinal変数をつくる。
		final int SECONDFINAL = 2;
		// 整数値xのビット構造において、posビット目の値が1の時の分岐。
		if ((integerNumber >>> positionNumber) == 1) {
			// xの値に2のpos乗の値を引く。
			bitsNumber = integerNumber - getPowor(SECONDFINAL, positionNumber);
		// それ以外、posビット目が0の場合
		} else {
			// xの値に2のpos乗の値を入れる。
			bitsNumber = integerNumber + getPowor(SECONDFINAL, positionNumber);
		}
		// 戻り値を返す。
		return bitsNumber;
	}
	
	/*
	 * 関数名：setN
	 * 概要：元となる整数値xの引数posビット目からn個分のビットまでを1にした値を返す。関数名・引数名は指定のものを使う。
	 * 引数：x … 元となる整数値
	 *       pos … 何ビット目の値から1にするか示す。最下位から 0,1,2…、と数える。
	 *       n … 何ビット分まで1を入力するか示す。
	 * 戻り値：bitsNumber … 変換後の値。
	 * 作成者：S.Saito
	 * 作成日：20023.04.21
	 */
	static int setN(int x,int pos, int n) {
		// 戻り値に引数の整数値を入れる。
		int bitsNumber = x;
		// posから1ずつ上がるループをn回行う
		for (int loopNumber = pos; loopNumber < pos + n; loopNumber++) {
			// 対象となるビット構成の値が0の時に1にするように値をかえる。
			bitsNumber = setBits(bitsNumber,loopNumber);
		}
		// 戻り値を返す。
		return bitsNumber;
	}
	
	/*
	 * 関数名：resetN
	 * 概要：元となる整数値xの引数posビット目からn個分のビットまでを0にした値を返す。関数名・引数名は指定のものを使う。
	 * 引数：x … 元となる整数値
	 *       pos … 何ビット目の値から0にするか示す。最下位から 0,1,2…、と数える。
	 *       n … 何ビット分まで0を入力するか示す。
	 * 戻り値：bitsNumber … 変換後の値。
	 * 作成者：S.Saito
	 * 作成日：20023.04.21
	 */
	static int resetN(int x,int pos, int n) {
		// 戻り値に引数の整数値を入れる。
		int bitsNumber = x;
		// posから1ずつ上がるループをn回行う
		for (int loopNumber = pos; loopNumber < pos + n; loopNumber++) {
			// 対象となるビット構成の値が0の時に0にするように値をかえる。
			bitsNumber = resetBits(bitsNumber,loopNumber);
		}
		// 戻り値を返す。
		return bitsNumber;
	}
	
	/*
	 * 関数名：inverseN
	 * 概要：元となる整数値xの引数posビット目からn個分のビットまでを反転した値を返す。関数名・引数名は指定のものを使う。
	 * 引数：x … 元となる整数値
	 *       pos … 何ビット目の値から反転を行うか示す。最下位から 0,1,2…、と数える。
	 *       n … 何ビット分まで反転を行うか示す。
	 * 戻り値：bitsNumber … 変換後の値。
	 * 作成者：S.Saito
	 * 作成日：20023.04.21
	 */
	static int inverseN(int x,int pos, int n) {
		// 戻り値に引数の整数値を入れる。
		int bitsNumber = x;
		// posから1ずつ上がるループをn回行う
		for (int loopNumber = pos; loopNumber < pos + n; loopNumber++) {
			// 対象となるビット構成の値が0の時に0にするように値をかえる。
			bitsNumber = inverseBits(bitsNumber,loopNumber);
		}
		// 戻り値を返す。
		return bitsNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：整数値と参考にするビット(二進数)の位、個数を入力し、ビットの位から入力した個数の分まで1にした値、0にした値、1なら0・0なら1にした値をそれぞれ
	 *       表示する。位に関しては、ビット構造の最下位から 0,1,2…、とする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args){
		// 整数値の入力を行う。
		int integerNumber = inputInteger("整数値");
		// ビット構造の位を0以上の値で入力する。
		int bitsInteger = inputMore("変換を始めるビット構造の位",0);
		// 変換する個数を入力する。
		int countBits = inputPlus("変換するビットの個数");
		// 整数値のもともとのビット構造を示す表示をする。
		printBits(integerNumber);
		// 改行を入れる。
		System.out.println();
		
		// メソッドsetの処理を行う
		int firstBits = setN(integerNumber,bitsInteger,countBits);
		// メソッドsetの処理の結果を示す表示をする。
		System.out.println("\nビット構造の" + bitsInteger + "の位を1にした値は" + firstBits + "です。");
		// メソッドsetの処理の結果を示す表示をする。
		printBits(firstBits);
		// 改行を入れる。
		System.out.println();
		
		// メソッドresetの処理を行う
		int secondBits = resetN(integerNumber,bitsInteger,countBits);
		// メソッドresetの処理の結果を示す表示をする。
		System.out.println("\nビット構造の" + bitsInteger + "の位を0にした値は" + secondBits + "です。");
		// メソッドresetの処理の結果を示す表示をする。
		printBits(secondBits);
		// 改行を入れる。
		System.out.println();
		
		// メソッドinverseの処理を行う
		int thirdBits = inverseN(integerNumber,bitsInteger,countBits);
		// メソッドinverseの処理の結果を示す表示をする。
		System.out.println("\nビット構造の" + bitsInteger + "の位を反転した値は" + thirdBits + "です。");
		// メソッドinverseの処理の結果を示す表示をする。
		printBits(thirdBits);
		// 改行を入れる。
		System.out.println();
	}
	
}
