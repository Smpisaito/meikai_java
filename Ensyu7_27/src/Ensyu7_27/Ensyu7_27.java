// パッケージの宣言
package Ensyu7_27;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu7_27
* 概要：演習7-27クラス
* 作成者：S.Saito
* 作成日：2023.04.25
*/
public class Ensyu7_27 {
	
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
	 * 引数：arrayNumber … int型の配列
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
	 * 概要：三つの配列の行数と列数が同一のときに加算を行いtureを返し、行数か列数が異なるときは加算せずfalseを返す。変数名・引数名は指定のものを用いる。
	 * 引数：x[][] … 配列の一つ目
	 *       y[][] … 配列の二つ目
	 *       z[][] … 配列の三つ目
	 * 戻り値：getAdd … 加算ができたらtrue、できなかったらfalseを返す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
	 */
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		// 戻り値にtrueをいれる。。
		boolean getAdd = true;
		// 行数のいずれかがが等しくない場合の分岐
		if (x.length != y.length || x.length != z.length || y.length != z.length)  {
			// 戻り値にfalseをいれる。
			getAdd = false;
		// 等しい場合の分岐
		} else {
			// すべての行で比較するループ
			for (int loopNumber = 0; loopNumber < x.length; loopNumber++) {
				// 同行の各列のうちいずれかが等しくないとき
				if (x[loopNumber].length != y[loopNumber].length || y[loopNumber].length != z[loopNumber].length || x[loopNumber].length != z[loopNumber].length) {
					// 戻り値にfalseを入れる
					getAdd = false;
				}
			}
		}
		// 戻り値を返す。
		return getAdd;
	}
	
	/*
	 * 関数名：addMatrix
	 * 概要：三つの配列の行数と列数が同一のときに加算を行いtureを返し、行数か列数が異なるときは加算せずfalseを返す。変数名・引数名は指定のものを用いる。
	 * 引数：x[][] … 配列の一つ目
	 *       y[][] … 配列の二つ目
	 *       z[][] … 配列の三つ目
	 * 戻り値：getAdd … 加算ができたらtrue、できなかったらfalseを返す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
	 */
	static int[][] addThreeArrays(int[][] x, int[][] y, int[][] z) {
		// 戻り値となる行列をつくる。行数をxと同じにする。
		int[][] addNumber = new int[x.length][];
		// 全ての行を確認する。
		for(int firstLoop = 0; firstLoop < x.length; firstLoop++) {
			// 行ごとの列数を入れる。
			addNumber[firstLoop] = new int[x[firstLoop].length];
		}
		// xとyの値の和をzに入れるループ。
		for(int firstLoop = 0; firstLoop < x.length; firstLoop++) {
			// xとyの和をzに入れるループ
			for(int secondLoop = 0; secondLoop < x[firstLoop].length; secondLoop++) {
				// xとyの和をzに入れるループ
				addNumber[firstLoop][secondLoop] = z[firstLoop][secondLoop] + x[firstLoop][secondLoop] + y[firstLoop][secondLoop];
			}
		}
		// 戻り値を返す。
		return addNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：三つの行列をつくり、二つには値を入れる。三つの行列の行数・列数が等しい時に値の入っていない行列に二つの行列の和をいれて表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
	 */
	public static void main(String[] args){
		
		// 行数を入力する。
		int firstElements = inputPlus("xの行数");
		// 行数をもとに行列をつくる。
		int[][] arrayFirst = new int[firstElements][];
		// 行ごとの列数の入力をする。
		printArray(arrayFirst);
		// 行列x(表記)であることを示す表示をする。
		System.out.print("xの");
		// 行列の入力を行う。
		inputArrays(arrayFirst);
		
		// 行数を入力する。
		int secondElements = inputPlus("yの行数");
		// 行数をもとに行列をつくる。
		int[][] arraySecond = new int[secondElements][];
		// 行ごとの列数の入力をする。
		printArray(arraySecond);
		// 行列y(表記)であることを示す表示をする。
		System.out.print("yの");
		// 行列の入力を行う。
		inputArrays(arraySecond);
		
		// 行数を入力する。
		int thirdElements = inputPlus("zの行数");
		// 行数をもとに行列をつくる。
		int[][] arrayThird = new int[thirdElements][];
		// 行ごとの列数の入力をする。
		printArray(arrayThird);
		// 行列z(表記)であることを示す表示をする。
		System.out.print("zの");
		// 行列の入力を行う。
		inputArrays(arrayThird);
		
		// 同じ大きさの行列ならzにxとyの合計を出された上で。違う場合はfalseが返ってくる。
		boolean getAdd = addMatrix(arrayFirst, arraySecond, arrayThird);
		// getAddがtrueで返されたときの分岐。
		if (getAdd == true) {
			// 合計を示す配列をつくる。
			int[][] addNumber = addThreeArrays(arrayFirst,arraySecond,arrayThird);
			// xの行列を表示することを示す
			System.out.println("xの行列を表示します。");
			// 行列を表示する
			printArrays(arrayFirst);
			// yの行列を表示することを示す
			System.out.println("yの行列を表示します。");
			// 行列を表示する
			printArrays(arraySecond);
			// zの行列を表示することを示す
			System.out.println("zの行列を表示します。");
			// 行列を表示する
			printArrays(arrayThird);
			// 行列の和を表示することを示す。
			System.out.println("xとyとzの行列の和を表示します。");
			// 行列の和を表示する
			printArrays(addNumber);
		// getAddがfalseで返された場合の分岐。
		} else {
			//　行列の行数や列数が異なることを示す。
			System.out.println("いずれかの行列の行数、または列数に違いがあります。");
			
		}
	}
}
