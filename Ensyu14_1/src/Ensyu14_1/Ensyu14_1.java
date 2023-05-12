// パッケージの宣言
package Ensyu14_1;

// 入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/**
 * クラス名：Ensyu14_1<Br>
 * 概要：演習14-1クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.11
 * @author S.Saito
 */
public class Ensyu14_1 {
	/**
	 * 関数名：inputInteger<Br>
	 * 概要：整数値の入力を求め、その値を返却する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：integerNumber … 整数値として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.04.26
	 * @return integerNumber … 整数値として返却する。
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

	/**
	 * 関数名：inputInteger<Br>
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。<Br>
	 * 引数：outputWord … String型の表示に使う文字列。<Br>
	 * 戻り値：integerNumber … 整数値として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.04.26
	 * @param outputWord … String型の表示に使う文字列。
	 * @return integerNumber … 整数値として返却する。
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
	
	/**
	 * 関数名：inputPlus<Br>
	 * 概要：正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：integerNumber … 正の整数値として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.04.25
	 * @return integerNumber … 正の整数値として返却する。
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
	
	/**
	 * 関数名：inputPlus<Br>
	 * 概要：「(引数の文字)：」と表示し、その後に正の整数値の入力を求める。正の整数値が入れられるまでループし、最終的な値を返却する。<Br>
	 * 引数：outputWord … String型の表示に使う文字列。<Br>
	 * 戻り値：integerNumber … 正の整数値として返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.04.21
	 * @param outputWord … String型の表示に使う文字列。
	 * @return integerNumber … 正の整数値として返却する。
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
	
	/**
	 * 関数名：inputRange<Br>
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求める。最小値となる引数の値以上の整数値が入れられるまでループし、最終的な値を返却する。<Br>
	 * 引数：outputWord … String型の表示に使う文字列。<Br>
	 *       lowerNumber … 入力する値の最小値<Br>
	 *       higherNumber … 入力する値の最大値<Br>
	 * 戻り値：integerNumber … 最小値以上最大値以下の入力した整数値を返却する。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.04.20
	 * @param outputWord … String型の表示に使う文字列。
	 * @param lowerNumber … 入力する値の最小値
	 * @param higherNumber … 入力する値の最大値
	 * @return integerNumber … 最小値以上最大値以下の入力した整数値を返却する。
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
	
	/**
	 * 関数名：selectMulti<Br>
	 * 概要：文字列で複数選択を求め、選択肢の中で入力された値を返す。最小の選択肢の値は1とする。<Br>
	 * 引数：outputWord … String型の選択肢の表示に使う文字列。<Br>
	 *       selectRange … 選べる値の最大値<Br>
	 * 戻り値：selectNumber … 選択によって選択肢の値を返す。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.04.28
	 * @param outputWord … String型の選択肢の表示に使う文字列。
	 * @param selectRange … 選べる値の最大値
	 * @return selectNumber … 選択によって選択肢の値を返す。
	 */
	static int selectMulti (String outputWord,int selectRange) {
		// 選択肢を表示して選択肢内の値で入力をする。
		int selectNumber = inputRange(outputWord,1,selectRange);
		// 戻り値を返す
		return selectNumber;
	}
	
	/**
	 * 関数名：main<Br>
	 * 概要：図形クラス群<Br>
	 * 引数：args … コマンドライン引数<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.11
	 * @param args … コマンドライン引数
	 */
	public static void main(String[] args){
		// 選択肢の数の5をいれたfinal変数。
		final int GET_CHOICE = 5;
		// 図形クラスの数を決める。
		int shapeNumber = inputPlus("図形の個数");
		
		// 入力した値をもとにShapeClass型の配列をつくる。
		ShapeClass[] shapeArray = new ShapeClass[shapeNumber];
		// 図形の個数だけ入力するループ
		for (int loopNumber = 0 ; loopNumber < shapeNumber; loopNumber++) {
			// 4種類の図形から選択する
			int choiceNumber = selectMulti (loopNumber + 1 + "番目の図形の種類(1 … 点 / 2 … 水平直線 / 3 … 垂直直線 / 4 … 長方形 / 5 … 平行四辺形)" ,GET_CHOICE);
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
				shapeArray[loopNumber] = new RectangleShape(rectangleWidth,rectangleHeight);
				// 分岐を終える
				break;
			// 平行四辺形を選んだ場合
			case 5:
				// 底辺の入力を求める。
				int parallelogramWidth = inputPlus("平行四辺形の底辺");
				// 幅の入力を求める。
				int parallelogramHeight = inputPlus("平行四辺形の高さ");
				// 長方形の図形のインスタンスを生成する
				shapeArray[loopNumber] = new ParallelogramShape(parallelogramWidth,parallelogramHeight);
				// 分岐を終える
				break;
			}
		
		}
		
		// 改行する。
		System.out.println();
		
		// 各図形に対してメソッドshapeCheckを動かす
		for (ShapeClass shapeCheck : shapeArray) {
			// 図形クラスでprintShapeを動かす。
			shapeCheck.printShape();
			
			// 長方形クラスに所属している場合の分岐。
			if (shapeCheck instanceof RectangleShape) {
				// 長方形クラスにコピーをつくる
				RectangleShape areaCheck = new RectangleShape((RectangleShape)shapeCheck);
				// 面積を求める
				System.out.println("長方形(面積：" +  areaCheck.getArea() + ")");
			}
			
			// 平行四辺形クラスに所属している場合の分岐。
			if (shapeCheck instanceof ParallelogramShape) {
				// 平行四辺形クラスにコピーをつくる
				ParallelogramShape areaCheck = new ParallelogramShape((ParallelogramShape)shapeCheck);
				// 面積を求める
				System.out.println("平行四辺形(面積：" +  areaCheck.getArea() + ")");
			}
			
			// 改行する。
			System.out.println();
		}
	}

}
