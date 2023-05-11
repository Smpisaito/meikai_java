// パッケージの宣言
package Ensyu10_3;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu10_3
* 概要：演習10-3クラス
* 作成者：S.Saito
* 作成日：2023.05.02
*/
public class Ensyu10_3 {
	
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
	 * 関数名：main
	 * 概要：ユーティリティクラスMinMuxのクラスメソッド群の確認をする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.25
	 */
	public static void main(String[] args){
		// 一つ目の変数の入力を行う。
		int firstInteger = inputInteger("整数値a");
		// 二つ目の変数の入力を行う。。
		int secondInteger = inputInteger("整数値b");
		// 三つ目の変数の入力を行う。。
		int thirdInteger = inputInteger("整数値c");
		
		// 二つの整数値の最小値を出すメソッドを使う。
		int minimumFirst = MinMax.checkLower(firstInteger,secondInteger);
		// 二つの整数値の最小値を出すことを示す。
		System.out.println("aとbの最小値：" + minimumFirst);
		// 改行を入れる。
		System.out.println();
		
		// 二つの整数値の最大値を出すメソッドを使う。
		int maximumFirst = MinMax.checkHigher(firstInteger,secondInteger);
		// 二つの整数値の最大値を出すことを示す。
		System.out.println("aとbの最大値：" + maximumFirst);
		// 改行を入れる。
		System.out.println();
		
		// 三つの整数値の最小値を出すメソッドを使う。
		int minimumSecond = MinMax.checkLower(firstInteger,secondInteger,thirdInteger);
		// 三つの整数値の最小値を出すことを示す。
		System.out.println("aとbとcの最小値：" + minimumSecond);
		// 改行を入れる。
		System.out.println();
		
		// 三つの整数値の最大値を出すメソッドを使う。
		int maximumSecond = MinMax.checkHigher(firstInteger,secondInteger,thirdInteger);
		// 三つの整数値の最大値を出すことを示す。
		System.out.println("aとbとcの最大値：" + maximumSecond);
		// 改行を入れる。
		System.out.println();
		
		// int型の配列をつくる。
		int[] arrayNumber = makeArray();
		
		// 配列の要素の最小値を出すメソッドを使う。
		int minimumThird = MinMax.checkLower(arrayNumber);
		// 配列の要素の最小値を出すことを示す。
		System.out.println("配列の最小値：" + minimumThird);
		// 改行を入れる。
		System.out.println();
		
		// 配列の要素の最大値を出すメソッドを使う。
		int  maximumThird = MinMax.checkHigher(arrayNumber);
		// 配列の要素の最大値を出すことを示す。
		System.out.println("配列の最大値：" +  maximumThird);
		// 改行を入れる。
		System.out.println();
		
	}
	
}