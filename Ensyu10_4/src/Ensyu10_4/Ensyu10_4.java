// パッケージの宣言
package Ensyu10_4;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu10_4
* 概要：演習10-4クラス
* 作成者：S.Saito
* 作成日：2023.05.08
*/
public class Ensyu10_4 {
	
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
	 * 概要：DayClassの挙動の確認を行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public static void main(String[] args){
		
		// 引数を受け取らない日付クラスのインスタンスを作成する。
		DayClass noInput = new DayClass();
		// 引数を受け取らない日付クラスのインスタンスの初期値が今日の日付であることを確認する。
		System.out.println("引数がないインスタンスの日付：" + noInput);
		
		// 年の値の入力
		int dayYear = inputInteger("生年月日・年");
		// 月の値の入力
		int dayMonth = inputInteger("生年月日・月");
		// 日の値の入力
		int dayDate = inputInteger("生年月日・日");
		
		// 入力した値をもとに日付クラスのインスタンスを作成する。
		DayClass newDay = new DayClass(dayYear,dayMonth,dayDate);
		// 日付クラスのインスタンスを確認する。不正な値は修正されていることを確認する。
		System.out.println("入力した日付：" + newDay);
		
		// 見やすくするための改行
		System.out.println();
		
		// 入力した日付クラスの日付を変更していくことを示す。
		System.out.println("入力した日付クラスを用いてメソッドの確認をしていきます。");
		// 年内の経過日数を表示する。
		System.out.println("年内の経過日数：" + newDay.elapseDay());
		// 年内の残り日数を表示する。
		System.out.println("年内の残り日数：" + newDay.leftDay());
		// 今日の日付との前後関係の判別。
		System.out.println("今日と比べた時：" + newDay.compareDays(noInput));
		// メソッドで入力した日付クラスを次の日の日付に進める
		newDay.advanceDayFirst();
		// 次の日の日付になったか表示する
		System.out.println("次の日に進める：" + newDay);
		// 進める日数を入力。
		int upNumber = inputPlus("さらに進める日数を入力");
		// さらに日数を進める。
		newDay.advanceDay(upNumber);
		// 進めた後の日付を表示する。
		System.out.println("さらに" + upNumber +"日を進めた日付：" + newDay);
		// メソッドで入力した日付クラスを前の日の日付に進める
		newDay.backDayFirst();
		// 前の日の日付になったか表示する
		System.out.println("前の日に戻す：" + newDay);
		// 進める日数を入力。
		int downNumber = inputPlus("さらに戻す日数を入力");
		// さらに日数を進める。
		newDay.backDay(downNumber);
		// 進めた後の日付を表示する。
		System.out.println("さらに" + downNumber +"日を戻した日付：" + newDay);
		
		
	}

}
