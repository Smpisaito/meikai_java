// パッケージの宣言
package Enayu12_1;

// 入力操作の呼び出し
import java.util.Scanner;

/**
 * クラス名：Enayu12_1
 * 概要：自動車クラスの動作確認。書き直し版
 * 作成者：S.Saito
 * 作成日：2023.05.12
 */
public class Enayu12_1 {
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
	 * 関数名：checkLastDate
	 * 概要：年と月の情報を入力すると、入力した月の最終日が何日であるかを返す
	 * 引数：checkYear … 年を示す引数
	 *       checkMonth … 月を示す引数
	 * 戻り値：lastDate … 引数の年の月における最終日の日付を示す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	static int checkLastDate(int checkYear,int checkMonth) {
		
		// 戻り値として月の最終日をいれる変数。初期値は0とする。
		int lastDate = 0;
		
		// 年が0未満であったときは0を返す。
		if (checkYear < 0) {
			// 戻り値を0のまま返す。
			return lastDate;
		}
		
		// 月の入力に合わせてその月の最終日を示す分岐をする。
		switch (checkMonth) {
		// 二月の場合。
		case 2:
			// 4の倍数でかつ100の倍数ではない年、もしくは400の倍数の年の場合の分岐
			if ((checkYear % 4 == 0 && checkYear % 100 != 0) || checkYear % 400 == 0) {
				// うるう年なので29日に設定する。
				lastDate = 29;
				// 戻り値を返す。
				break;
			// 4の倍数ではない、もしくは100の倍数の場合の分岐
			} else {
				// うるう年ではないため28日に設定する。
				lastDate = 28;
				// 戻り値を返す。
				break;
			}
			
		// 4月、6月、9月、11月の場合の分岐。
		case 4: case 6: case 9: case 11:
			// 30日に設定する。
			lastDate = 30;
			// 戻り値を返す。
			break;
			
		// 1月、3月、5月、7月、8月、10月、12月の場合。
		case 1: case 3: case 5: case 7: case 8:case 10: case 12:
			// 31日に設定する。
			lastDate = 31;
			// 戻り値を返す。
			break;
			
		// それ以外、月の値がおかしい場合の分岐
		default :
			// 戻り値を0のまま返す。
			break;
		}
		// 戻り値を返す。
		return lastDate;
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
		
		// 自動車の幅の入力をする。
		int carWidth = inputRange("車の幅(mm)", 1000,10000);
		
		// 自動車の幅の入力をする。
		int carHeight = inputRange("車の高さ(mm)", 1000, 10000);
		
		// 自動車の幅の入力をする。
		int carLength = inputRange("車の長さ(mm)", 1000, 10000);
		
		// 自動車の残り燃料の入力をする。
		double remainFuel = inputDouble("車の残り燃料",0);
		// 年の入力。1以上の入力に制限する。
		int accountYear = inputPlus("年");
		// 月の入力。入力は1月から12月までに制限する
		int accountMonth = inputRange("月", 1, 12);
		// 入力した年月の最終日の日付を求める。
		int lastDate = checkLastDate(accountYear,accountMonth);
		// 日の入力
		int accountDate = inputRange("日", 1, lastDate);
		
		// インスタンス化する。
		NewCarClass myCar = new NewCarClass(carName,carWidth,carHeight,carLength,remainFuel,new DayClass(accountYear,accountMonth,accountDate));
		// 改行を入れる。
		System.out.println();
		
		// スペックを表示する。
		myCar.putSpec ();
		
		// 移動できなくなるまでループする。
		while (true) {
			// x座標の移動距離
			double movingX = inputDouble("x座標の移動距離");
			// y座標の移動距離
			double movingY = inputDouble("y座標の移動距離");
			// 移動できた場合。
			if (myCar.move(movingX,movingY)){
				// 現在地を表示する。
				System.out.println("現在地：(" + myCar.getY() + ", " + myCar.getY() + ")");
				// 残りの燃料を表示する。
				System.out.println("残り燃料：" + myCar.getfuel());
				// 総走行距離を表示する。
				System.out.println("総走行距離：" + myCar.getTotalMove());
			} else {
				System.out.println("移動できませんでした。");
				// ループを抜ける
				break;
			}
		}
		
	}
}
