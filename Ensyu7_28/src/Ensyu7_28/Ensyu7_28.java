// パッケージの宣言
package Ensyu7_28;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu7_28
* 概要：演習7-28クラス
* 作成者：S.Saito
* 作成日：2023.04.25
*/
public class Ensyu7_28 {
	
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
	 * 関数名：inputArray
	 * 概要：int型の配列の全要素に値を入れる。
	 * 引数：arrayNumber[] … 値を入れるint型の配列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static void inputArray(int[] arrayNumber){
		// 配列の値の入力であることを示す表示。
		System.out.println("各要素に値を入れてください。");
		// 配列の要素数をもとにループする。
		for (int loopNumber = 0; loopNumber < arrayNumber.length; loopNumber++) {
			// 全ての要素の値を入力する。
			arrayNumber[loopNumber] = inputInteger("[" + loopNumber + "]");
		}
	}
	
	/*
	 * 関数名：inputArrays
	 * 概要：int型の行列の全要素に値を入れる。
	 * 引数：arrayNumber[][] … 値を入れるint型の配列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static void inputArrays(int[][] arrayNumber){
		// 配列の値の入力であることを示す表示。
		System.out.println("行列の要素に値を入れます。");
		// 	行の要素数をもとにループする。
		for (int loopNumber = 0; loopNumber < arrayNumber.length; loopNumber++) {
			// 行数を示す
			System.out.print(loopNumber + "行の");
			// 全ての列の値を入力する。
			inputArray(arrayNumber[loopNumber] );
		}
	}
	
	/*
	 * 関数名：inputColumn
	 * 概要：int型の行列の各行の列数を入力する。
	 * 引数：arrayNumber[][] … int型の行列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static void printArray(int[][] arrayNumber) {
		// 各行の列数を入力するループ。
		for (int loopNumber = 0; loopNumber < arrayNumber.length; loopNumber++) {
			// 列数の入力を行う。
			int columnNumber = inputPlus(loopNumber + "行の列数");
			// 列数を行列にいれる。
			arrayNumber[loopNumber] = new int[columnNumber];
		}
	}
	
	/*
	 * 関数名：inpurRange
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求める。最小値となる引数の値以上の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 *       lowerNumber … 入力する値の最小値
	 *       higherNumber … 入力する値の最大値
	 * 戻り値：integerNumber … 最小値以上最大値以下の入力した整数値を返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int inputRange(String outputWord, int lowerNumber, int higherNumber) {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 最小値より大きい値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger(outputWord);
			// 入力範囲の整数値ではないときに分岐する。
			if (integerNumber < lowerNumber || integerNumber > higherNumber) {
				// 正しい整数値を入力するように促す。
				System.out.println(lowerNumber + "以上" + higherNumber + "以下の値を入力してください。");
			}
		// 入力した値が適さないならループする。
		} while( integerNumber < lowerNumber || integerNumber > higherNumber);
		// 最後に入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：printArrays
	 * 概要：int型の行列の全ての値を表示する。
	 * 引数：arrayNumber … int型の行列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static void printArrays(int[][] arrayNumber) {
		// 全行で行うことを示すループ。
		for(int firstLoop = 0; firstLoop < arrayNumber.length; firstLoop++) {
			// 全列で行うことを示すループ。
			for(int secondLoop = 0; secondLoop < arrayNumber[firstLoop].length; secondLoop++) {
				// 値を表示する
				System.out.print(arrayNumber[firstLoop][secondLoop] + " ");
			}
			// 列が終わったら改行を入れる。
			System.out.println();
		}
	}
	
	/*
	 * 関数名：addMatrix
	 * 概要：二つの行列の和を格納した二次元配列を返す。行数及び列数が同一であること前提であり、関数名・引数名も指定されている。
	 * 引数：x[][] … int型の行列
	 *       y[][] … int型の行列
	 * 戻り値：addArray[][] … 二つの行列の和
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
	 */
	static int[][] addMatrix(int[][] x, int[][] y){
		// 戻り値を設定する。列数などが同じになるようにxを代入する。
		int[][] addArray = new int[x.length][];
		// 列数を移すループ
		for (int loopNumber = 0; loopNumber < x.length;loopNumber++) {
			// 行ごとに列数を移す。
			addArray[loopNumber] = new int[x[loopNumber].length];
		}
		// xとyの値の和をzに入れるループ。
		for(int firstLoop = 0; firstLoop < x.length; firstLoop++) {
			// xとyの和をzに入れるループ
			for(int secondLoop = 0; secondLoop < x[firstLoop].length; secondLoop++) {
				// xとyの和をaddArrayに代入する。
				addArray[firstLoop][secondLoop] = x[firstLoop][secondLoop] + y[firstLoop][secondLoop];
			}
		}
		// 戻り値を返す。
		return addArray;
	}
	
	/*
	 * 関数名：main
	 * 概要：同じ大きさの行列を二つ作り、入力したインデックスに入力した値の要素を挿入する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
	 */
	public static void main(String[] args){
		
		// 行数を入力する。
		int firstElements = inputPlus("xとyの行数");
		// 行数をもとに行列をつくる。
		int[][] arrayFirst = new int[firstElements][];
		// 同じ行数をもとに行列をつくる
		int[][] arraySecond = new int[firstElements][];
		// 行ごとの列数の入力をする。
		printArray(arrayFirst);
		// 列数を移すループ
		for (int loopNumber = 0; loopNumber < arrayFirst.length;loopNumber++) {
			// 行ごとに列数を移す。
			arraySecond[loopNumber] = new int[arrayFirst[loopNumber].length];
		}
		
		
		// 行列x(表記)であることを示す表示をする。
		System.out.print("xの");
		// 行列の入力を行う。
		inputArrays(arrayFirst);
		// 行列y(表記)であることを示す表示をする。
		System.out.print("yの");
		// 行列の入力を行う。
		inputArrays(arraySecond);
		
		// 行列の和を求める
		int[][] addArray = addMatrix(arrayFirst,arraySecond);
		// xの行列を表示することを示す
		System.out.println("xの行列を表示します。");
		// 行列を表示する
		printArrays(arrayFirst);
		// yの行列を表示することを示す
		System.out.println("yの行列を表示します。");
		// 行列を表示する
		printArrays(arraySecond);
		// 行列の和を表示することを示す。
		System.out.println("xとyの行列の和を表示します。");
		// 行列の和を表示する
		printArrays(addArray);
	}
}
