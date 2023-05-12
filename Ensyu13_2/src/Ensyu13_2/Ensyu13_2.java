// パッケージの宣言
package Ensyu13_2;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu13_2
* 概要：演習13-2クラス
* 作成者：S.Saito
* 作成日：2023.05.10
*/
public class Ensyu13_2 {
	
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
	 * 関数名：inputRange
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
	 * 関数名：selectMulti
	 * 概要：文字列で複数選択を求め、選択肢の中で入力された値を返す。最小の選択肢の値は1とする。
	 * 引数：outputWord … String型の選択肢の表示に使う文字列。
	 *       selectRange … 選べる値の最大値
	 * 戻り値：selectNumber … 選択によって選択肢の値を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	static int selectMulti (String outputWord,int selectRange) {
		// 選択肢を表示して選択肢内の値で入力をする。
		int selectNumber = inputRange(outputWord,1,selectRange);
		// 戻り値を返す
		return selectNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：図形クラス群
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public static void main(String[] args){
		// 選択肢の数の4をいれたfinal変数。
		final int GET_CHOICE = 8;
		// 図形クラスの数を決める。
		int shapeNumber = inputPlus("図形の個数");
		// 三角形用の変数を置く。
		int triangleLength = 0;
		
		// 入力した値をもとにShapeClass型の配列をつくる。
		ShapeClass[] shapeArray = new ShapeClass[shapeNumber];
		// 図形の個数だけ入力するループ
		for (int loopNumber = 0 ; loopNumber < shapeNumber; loopNumber++) {
			// 4種類の図形から選択する
			int choiceNumber = selectMulti (loopNumber + 1 + "番目の図形の種類(1 … 点 / 2 … 水平直線 / 3 … 垂直直線 / 4 … 長方形/"
					// 表示する文章の続き
					+ " 5 … 直角二等辺三角形(直角が左下)\n/ 6 … 直角二等辺三角形(直角が左上)/ 7 … 直角二等辺三角形(直角が右下)/"
					// 表示する文章の続き
					+ " 8 … 直角二等辺三角形(直角が右上))  :",GET_CHOICE);
			// 4種類の図形から選択したものをつくる分岐
			switch (choiceNumber) {
			// 点を選んだ場合
			case 1:
				// 点の図形のインスタンスを生成する
				shapeArray[loopNumber] = new PointClass();
				// 分岐を終える
				break;
			// 水平直線を選んだ場合
			case 2:
				// 長さの入力を求める。
				int horizonLength = inputPlus("水平直線の長さ");
				// 水平直線の図形のインスタンスを生成する
				shapeArray[loopNumber] = new HorizonLine(horizonLength);
				// 分岐を終える
				break;
			// 垂直直線を選んだ場合
			case 3:
				// 長さの入力を求める。
				int verticalLength = inputPlus("垂直直線の長さ");
				// 垂直直線の図形のインスタンスを生成する
				shapeArray[loopNumber] = new VerticalLine(verticalLength);
				// 分岐を終える
				break;
			// 長方形を選んだ場合
			case 4:
				// 幅の入力を求める。
				int rectangleWidth = inputPlus("長方形の幅");
				// 幅の入力を求める。
				int rectangleHeight = inputPlus("長方形の高さ");
				// 長方形の図形のインスタンスを生成する
				shapeArray[loopNumber] = new ReactangleShape(rectangleWidth,rectangleHeight);
				// 分岐を終える
				break;
			// 直角二等辺三角形(左下)を選んだ場合
			case 5:
				// 二等辺の長さを入力する。
				triangleLength = inputPlus("二等辺の長さ");
				// 三角形の図形のインスタンスを生成する
				shapeArray[loopNumber] = new LeftLowTriangle(triangleLength);
				// 分岐を終える
				break;
			// 直角二等辺三角形(左上)を選んだ場合
			case 6:
				// 二等辺の長さを入力する。
				triangleLength = inputPlus("二等辺の長さ");
				// 三角形の図形のインスタンスを生成する
				shapeArray[loopNumber] = new LeftHighTriangle(triangleLength);
				// 分岐を終える
				break;
			// 直角二等辺三角形(右下)を選んだ場合
			case 7:
				// 二等辺の長さを入力する。
				triangleLength = inputPlus("二等辺の長さ");
				// 三角形の図形のインスタンスを生成する
				shapeArray[loopNumber] = new RightLowTriangle(triangleLength);
				// 分岐を終える
				break;
			// 直角二等辺三角形(右上)を選んだ場合
			case 8:
				// 二等辺の長さを入力する。
				triangleLength = inputPlus("二等辺の長さ");
				// 三角形の図形のインスタンスを生成する
				shapeArray[loopNumber] = new RightHighTriangle(triangleLength);
				// 分岐を終える
				break;
			}
		
		}
		
		// 改行する。
		System.out.println();
		
		// 各図形に対してメソッドprintShapeを動かす
		for (ShapeClass checkArray : shapeArray) {
			// 図形クラスでprintShapeを動かす。
			checkArray.printShape();
			// 改行する。
			System.out.println();
		}
		
	}
	
}