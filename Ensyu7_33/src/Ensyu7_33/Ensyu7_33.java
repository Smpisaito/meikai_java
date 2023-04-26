// パッケージの宣言
package Ensyu7_33;

//入力操作を行うときにクラスの宣言の前に置く
import java.util.Scanner;

/*
* クラス名：Ensyu7_33
* 概要：演習7-33クラス
* 作成者：S.Saito
* 作成日：2023.04.26
*/
public class Ensyu7_33 {
	
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
	 * 関数名：inputPlus
	 * 概要：正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：なし
	 * 戻り値：integerNumber … 正の整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
	 */
	static int inputPlus() {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 正の整数値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger();
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
	 * 関数名：inputInteger
	 * 概要：整数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：integerNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int inputInteger() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 整数値の入力を行う。
		integerNumber = standardInput.nextInt();
		// 入力した値を返す。
		return integerNumber;
	}

	/*
	 * 関数名：inputInteger
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int inputInteger(String outputWord) {
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		integerNumber = inputInteger();
		// 入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：inputArray
	 * 概要：int型の配列の全要素に値を入れる。
	 * 引数：arrayNumber[] … 値を入れるint型の配列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
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
	 * 関数名：makeElements
	 * 概要：int型の配列の要素数をつくる
	 * 引数：なし
	 * 戻り値：arrayElements … 1以上の整数値
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
	 */
	static int makeElements(){
		// 要素数を読み込む。
		int arrayElements = inputPlus("要素数");
		// 要素数を返す。
		return arrayElements;
	}
	
	/*
	 * 関数名：makeElements
	 * 概要：int型の配列の要素数をつくる
	 * 引数：なし
	 * 戻り値：arrayElements … 1以上の整数値
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int makeElements(String outputWord){
		// 要素数を読み込む。
		int arrayElements = inputPlus(outputWord);
		// 要素数を返す。
		return arrayElements;
	}
	
	/*
	 * 関数名：makeArray
	 * 概要：int型の配列をつくる
	 * 引数：なし
	 * 戻り値：arrayNumber[] … int型の配列
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
	 */
	static int[] makeArray(){
		// 要素数をつくる
		int arrayElements = makeElements();
		// 要素をもとに戻り値となる配列をつくる。
		int[] arrayNumber = new int[arrayElements];
		// 全ての要素に値を入れる。
		inputArray(arrayNumber);
		// 戻り値を返す。
		return arrayNumber;
	}
	
	/*
	 * 関数名：inputArray
	 * 概要：int型の行列の全要素に値を入れる。
	 * 引数：arrayNumber[][] … 値を入れるint型の配列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.21
	 */
	static void inputArray(int[][] arrayNumber){
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
	static void inputColumn(int[][] arrayNumber) {
		// 各行の列数を入力するループ。
		for (int loopNumber = 0; loopNumber < arrayNumber.length; loopNumber++) {
			// 列数の入力を行う。
			int columnNumber = inputPlus(loopNumber + "行の列数");
			// 列数を行列にいれる。
			arrayNumber[loopNumber] = new int[columnNumber];
		}
	}
	
	/*
	 * 関数名：makeArrays
	 * 概要：int型の行列をつくる
	 * 引数：なし
	 * 戻り値：arrayNumber[][] … int型の配列
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int[][] makeArrays(){
		// 要素数をつくる
		int arrayElements = makeElements("行数");
		// 要素をもとに戻り値となる配列をつくる。
		int[][] arrayNumber = new int[arrayElements][];
		// 行ごとの列数を決める。
		inputColumn(arrayNumber);
		// 全ての要素に値を入れる。
		inputArray(arrayNumber);
		// 戻り値を返す。
		return arrayNumber;
	}
	
	/*
	 * 関数名：printArray
	 * 概要：int型の配列の全ての値を表示する。
	 * 引数：arrayNumber … int型の配列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static void printArray(int[] a) {
		// 全ての要素を確認する。
		for (int loopNumber = 0;loopNumber < a.length; loopNumber++) {
			// 要素の値を表示する。
			System.out.print(a[loopNumber] + " ");
		}
		// 改行を入れる。
		System.out.println();
	}
	
	/*
	 * 関数名：printArray
	 * 概要：int型の行列の全ての値を表示する。
	 * 引数：a … int型の配列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static void printArray(int[][] a) {
		// 列ごとの桁数の最大値を入れた配列をつくる。
		int[] digitsHighest = digitsHighest(a);
		// 全行で行うことを示すループ。
		for(int firstLoop = 0; firstLoop < a.length; firstLoop++) {
			// 全列で行うことを示すループ。
			for(int secondLoop = 0; secondLoop < a[firstLoop].length; secondLoop++) {
				// 値を表示する
				System.out.printf("%d",a[firstLoop][secondLoop]);
				// 値の桁数を調べる
				int digitsNumber = getDigits(a[firstLoop][secondLoop]);
				// 値が負であったときの分岐
				if (checkMinus(a[firstLoop][secondLoop])) {
					// 桁数に1加える。
					digitsNumber++;
				}
				// 同列の最大値との差の数に1加えた回数のループ。
				for (int thirdLoop = 0; thirdLoop <= digitsHighest[secondLoop] - digitsNumber; thirdLoop++) {
					// 空白を入れる。
					System.out.print(" ");
				}
			}
			// 列が終わったら改行を入れる。
			System.out.println();
		}
	}

	/*
	 * 関数名：getDigits
	 * 概要：入力された値の桁数を返す
	 * 引数：checkNumber
	 * 戻り値：digitsNumber
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int getDigits(int checkNumber) {
		// 戻り値を初期値0で設定する。
		int digitsNumber = 0;
		// 桁数を調べる。
		while (checkNumber != 0) {
			// 桁数の分だけ戻り値に1加える。
			digitsNumber++;
			// 次の桁の確認に移る。
			checkNumber /= 10;
		}
		// 戻り値が0(checkNumberが最初から0であった)場合の分岐。
		if (digitsNumber == 0) {
			// 戻り値1加える。
			digitsNumber++;
		}
		// 戻り値を返す。
		return digitsNumber;
	}
	
	/*
	 * 関数名：checkHigher
	 * 概要：二つの整数値の高いほうを返す。
	 * 引数：firstNumber … 比べる整数値の一つ目
	 *       secondNumber … 比べる整数値の二つ目
	 * 戻り値：higherNumber … 整数値の高いほうの値
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static int checkHigher(int firstNumber, int secondNumber) {
		// 戻り値を設定する。
		int higherNumber = 0;
		// firstNumberの値のほうが高いときの分岐。
		if (firstNumber > secondNumber) {
			// 戻り値にfirstNumberの値を入れる。
			higherNumber = firstNumber;
		// secondNumberの値のほうが高いか同値のときの分岐。
		} else {
			// 戻り値にsecondNumberの値を入れる。
			higherNumber = secondNumber;
		}
		// 戻り値を返す。
		return higherNumber;
	}
	
	/*
	 * 関数名：checkMinus
	 * 概要：値が負の時にtureを返す。
	 * 引数：integerNumber … 整数値の値
	 * 戻り値：minusAnswer … boolean型の結果を示す
	 * 作成者：S.Saito
	 * 作成日：2023.04.24
	 */
	static boolean checkMinus(int integerNumber) {
		// 戻り値を設定する。初期値はtrueにする。
		boolean minusAnswer = true;
		// 引数が0以上の時の分岐。
		if (integerNumber >= 0) {
			// 戻り値をfalseにする。
			minusAnswer = false;
		}
		// 戻り値である変数を返す。
		return minusAnswer;
	}
	
	/*
	 * 関数名：digitsHighest
	 * 概要：二次元配列の列ごとの桁数の最大値を調べて一次元配列として返す。負の値は「-」の表示の分一桁多くして比べる。
	 * 引数：arrayNumber[][] … 調べる二次元配列
	 * 戻り値：digitsHighest[] … 列ごとの桁数の最大値を示す一次元配列
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int[] digitsHighest (int[][] arrayNumber){
		// 列数の最大値を入れる変数をつくる。
		int columnHighest = arrayNumber[0].length;
		// 全行で行うことを示すループ。
		for(int firstLoop = 1; firstLoop < arrayNumber.length; firstLoop++) {
			// 列数の最大値を求める。
			columnHighest = checkHigher(columnHighest,arrayNumber[firstLoop].length);
		}
		
		// 列数の最大値をもとに戻り値となる桁数を示す配列をつくる
		int[] digitsHighest = new int[columnHighest];
		// 全行で行うことを示すループ。
		for(int firstLoop = 0; firstLoop < arrayNumber.length; firstLoop++) {
			// 全列で行うことを示すループ。
			for(int secondLoop = 0; secondLoop < arrayNumber[firstLoop].length; secondLoop++){
				// 二次配列の要素の値の桁数を調べる。
				int digitsNumber = getDigits(arrayNumber[firstLoop][secondLoop]);
				// 値が負であったときの分岐
				if (checkMinus(arrayNumber[firstLoop][secondLoop])) {
					// 桁数に1加える。
					digitsNumber++;
				}
				// 列ごとの桁数の最大値を入れる。
				digitsHighest[secondLoop] = checkHigher(digitsHighest[secondLoop],digitsNumber);
			}
		}
		// 戻り値を返す。
		return digitsHighest;
	}
	
	/*
	 * 関数名：main
	 * 概要：int型の一次元配列と二次元配列をつくり、それぞれ表示する。一次元配列では要素間に一文字分のスペースを空け、二次元配列では
	 *       各列の数値の戦闘がそろうように最低限のスペースを開ける。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	public static void main(String[] args){
		// 一次元配列をつくる
		int[] firstArray = makeArray();
		// 見やすくするために改行を入れる。
		System.out.println();
		// 二次元配列をつくる。
		int[][] secondArray = makeArrays();
		// 結果と分けるための改行を入れる。
		System.out.println();
		// 一次元配列の表示であることを示す。
		System.out.println("一次元配列");
		// 一次元配列の全要素を表示する。
		printArray(firstArray);
		// 見やすくするための改行を入れる。
		System.out.println();
		// 二次元配列の表示であることを示す。
		System.out.println("二次元配列");
		// 二次元配列の全要素を表示する。
		printArray(secondArray);
	}
}
