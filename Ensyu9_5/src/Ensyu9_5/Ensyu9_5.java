// パッケージの宣言
package Ensyu9_5;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
* クラス名：Ensyu9_5
* 概要：演習9-5クラス
* 作成者：S.Saito
* 作成日：2023.05.01
*/
public class Ensyu9_5 {
	
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
				return lastDate;
			// 4の倍数ではない、もしくは100の倍数の場合の分岐
			} else {
				// うるう年ではないため28日に設定する。
				lastDate = 28;
				// 戻り値を返す。
				return lastDate;
			}
			
		// 4月、6月、9月、11月の場合の分岐。
		case 4: case 6: case 9: case 11:
			// 30日に設定する。
			lastDate = 30;
			// 戻り値を返す。
			return lastDate;
			
		// 1月、3月、5月、7月、8月、10月、12月の場合。
		case 1: case 3: case 5: case 7: case 10: case 12:
			// 31日に設定する。
			lastDate = 31;
			// 戻り値を返す。
			return lastDate;
			
		// それ以外、月の値がおかしい場合の分岐
		default :
			// 戻り値を0のまま返す。
			return lastDate;
		}
	}
	
	/*
	 * 関数名：makeDay
	 * 概要：DayClassの入力を求めて代入する。
	 * 引数：newDay
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	static void makeDay(DayClass newDay){
		// 誕生日の年の入力を求める。
		int birthYear = inputPlus("年");
		// 誕生日の月の入力を求める。入力範囲は1から12とする
		int birthMonth = inputRange("月",1,12);
		// 誕生日の月の最終日となる日の値を求める。
		int lastDate = checkLastDate(birthYear,birthMonth);
		// 誕生日の日の入力を求める。
		int birthDay = inputRange("日",1,lastDate);
		// 
		newDay = new DayClass(birthYear,birthMonth,birthDay);
	}
	
	/*
	 * 関数名：main
	 * 概要：Periodクラスを用いた開始日と終了日のインスタンスをつくり、表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public static void main(String[] args){
		
		// 開始日を示すDayClassのインスタンスを入力値なしで作る。
		DayClass startDay = new DayClass();
		// 終了日を示すDayClassのインスタンスを入力値なしで作る。
		DayClass finishDay = new DayClass();
		// 開始日の入力を求める。
		System.out.println("開始日を入力してください。");
		// 開始日を入力する。
		makeDay(startDay);
		// 終了日の入力を求める。
		System.out.println("終了日を入力してください。");
		// 終了日を入力する。
		makeDay(finishDay);
		
		// 開始日より終了日のほうが早い日付の場合
		if (startDay.getYear() > finishDay.getYear() || ( startDay.getYear() == finishDay.getYear() && startDay.getMonth() < finishDay.getMonth() )
				// if文の条件式の続き
				|| ( startDay.getYear() == finishDay.getYear() && startDay.getMonth() == finishDay.getMonth() && startDay.getDate() > finishDay.getDate() )) {
			
			// 日付がおかしいことを示す。
			System.out.println("開始日と終了日が正しくありません。");
			
		// 日付が正しい場合
		} else {
			
			// 開始日と終了日をもとにPeriodのインスタンスをつくる。
			Period newPeriod = new Period(startDay,finishDay);
			
			// 開始日と終了日を表示する。
			System.out.println(newPeriod.toString());
		}
	}
	
}
