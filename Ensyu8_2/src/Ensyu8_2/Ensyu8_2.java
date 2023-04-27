// パッケージの宣言
package Ensyu8_2;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu8_2クラス
* 概要：演習8-2クラス
* 作成者：S.Saito
* 作成日：2023.04.27
*/
public class Ensyu8_2 {
	
	
	
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
	 * 関数名：inputDoubla
	 * 概要：実数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：doubleNumber … 実数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static double inputDouble() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		double doubleNumber = 0;
		// 整数値の入力を行う。
		doubleNumber = standardInput.nextDouble();
		// 入力した値を返す。
		return doubleNumber;
	}

	/*
	 * 関数名：inputDouble
	 * 概要：「(引数の文字)：」と表示し、その後に実数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：doubleNumber … 実数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static double inputDouble(String outputWord) {
		// 入力を行う変数をつくる。
		double doubleNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		doubleNumber = inputDouble();
		// 入力した値を返す。
		return doubleNumber;
	}
	
	/*
	 * 関数名：inputDouble
	 * 概要：「(引数の文字)：」と表示し、その後に引数の範囲の実数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 *       lowerNumber … 下限となる実数値。
	 * 戻り値：doubleNumber … 実数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static double inputDouble(String outputWord, double lowerNumber) {
		// 入力を行う変数をつくる。
		double doubleNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 正の値が入力されるまでループする。
		do {
			// 実数値の入力を行う。
			doubleNumber = inputDouble();
			// 目的の範囲の値が入力されないときの分岐
			if ( doubleNumber < lowerNumber ) {
				// 引数以上の値を求める
				System.out.println(lowerNumber + "以上の値を入力してください");
			}
		// 目的の範囲の値が入力されるまでループする
		} while ( doubleNumber < lowerNumber );
		// 入力した値を返す。
		return doubleNumber;
	}
	
	/*
	 * 関数名：inputDouble
	 * 概要：「(引数の文字)：」と表示し、その後に引数以上の実数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 *       lowerNumber … 下限となる実数値。
	 *       higherNumber … 上限となる実数値。
	 * 戻り値：doubleNumber … 実数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static double inputDouble(String outputWord, double lowerNumber, double higherNumber) {
		// 入力を行う変数をつくる。
		double doubleNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 正の値が入力されるまでループする。
		do {
			// 実数値の入力を行う。
			doubleNumber = inputDouble();
			// 目的の範囲の値が入力されないときの分岐
			if ( doubleNumber < lowerNumber || doubleNumber > higherNumber ) {
				// 引数以上の値を求める
				System.out.println(lowerNumber + "以上" + higherNumber + "以下の値を入力してください");
			}
		// 目的の範囲の値が入力されるまでループする
		} while ( doubleNumber < lowerNumber || doubleNumber > higherNumber );
		// 入力した値を返す。
		return doubleNumber;
	}
	
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
	 * 関数名：main
	 * 概要：Carクラスにフィールドやメソッドを追加したものの動作確認をする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.27
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を求める表示をする。
		System.out.println("車のデータを入力してください。");
		
		// 自動車の名前
		System.out.print("車の名前：");
		// 自動車の名前の入力をする。
		String carName = standardInput.next();
		
		// 自動車のナンバーの入力をする。
		int carNumber= inputRange("車のナンバー",1,9999);
		
		// 自動車の幅の入力をする。
		int carWidth = inputPlus("車の幅");
		
		// 自動車の幅の入力をする。
		int carHeight = inputPlus("車の高さ");
		
		// 自動車の幅の入力をする。
		int carLength = inputPlus("車の長さ");
		
		// 自動車のタンク容量を入力する。
		double carTank = inputDouble("車のタンク容量",0);
		
		// 自動車の残り燃料の入力をする。
		double remainFuel = inputDouble("車の残り燃料",0,carTank);
		
		// 自動車の燃費の入力をする。
		double carCost = inputDouble("車の燃費",0);
		
		// インスタンス化する。
		Car myCar = new Car(carName,carNumber,carWidth,carHeight,carLength,carTank,remainFuel,carCost);
		// 改行を入れる。
		System.out.println();
		
		// 燃料が0になるか終了を行うまで移動を繰り返す。
		while (true) {
			// 現在の座標や残り燃料などの状態を表示する。
			System.out.println("現在地(" + myCar.getCoordinateX() + ", " + myCar.getCoordinateY() +  ")	・残り燃料 " + myCar.getFuel());
			// 行える動作を表示する。
			System.out.println("目標座標を決めて移動する … 1\n軸ごとの移動距離を決めて移動する … 2\n給油を行う … 3\n終了する … 4");
			// 目的の値を入力する。
			int choiceNumber = inputRange("目的に合った番号を入力してください。",1,4);
			
			// 目標座標を参照して移動する。
			if (choiceNumber == 1) {
				// xとyの二つの座標で示される目標を示す配列をいれる
				double[] moveTarget = new double[2];
				// xの座標の入力を求める。
				moveTarget[0] = inputDouble("目標地点のx座標を入力してください。");
				// yの座標の入力を求める。
				moveTarget[1] = inputDouble("目標地点のy座標を入力してください。");
				// 座標まで移動できる時の分岐
				if (myCar.checkMove(moveTarget)) {
					// 座標まで移動する。
					boolean moveBoolean = myCar.moveCar(moveTarget);
				// 移動できないときの分岐。
				} else {
					// 燃料が足りないことを示す。
					System.out.println("燃料が足りません。");
				}
					
			// 座標の軸ごとの移動距離を決めて移動する。
			} else if (choiceNumber == 2) {
				// xの座標の移動距離の入力を求める。
				double distanceX = inputDouble("x座標の移動距離を入力してください。");
				// yの座標の移動距離の入力を求める。
				double distanceY = inputDouble("y座標の移動距離を入力してください。");
				// 座標まで移動できる時の分岐
				if (myCar.checkMove (distanceX,distanceY)) {
					// 座標まで移動する。
					boolean moveBoolean = myCar.moveCar(distanceX,distanceY);
				// 移動できないときの分岐。
				} else {
					// 燃料が足りないことを示す。
					System.out.println("燃料が足りません。");
				}
				
			//給油を行う。
			} else if (choiceNumber == 3) {
				// 給油の量の値を入れる変数をつくる。
				double refuelFuel = 0;
				// 給油する値を決める
				refuelFuel = inputDouble("給油する量", 0);
				// 給油したときにタンク内に納まる場合の分岐
				if (myCar.refuelTank(refuelFuel)) {
					// 
					System.out.println(refuelFuel + "だけ給油されました。");
				} else {
					// タンクに入り切らないことを示す。
					System.out.println("燃料タンクに入りきる量で行ってください。");
				}
				
			// 終了を選んだ場合。
			} else {
				// 終わることを示す表示をする。
				System.out.println("終了します。");
				// ループを終える。
				break;
			}
			
			// 改行を入れる。
			System.out.println();
		}
	}
}
