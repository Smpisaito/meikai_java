// パッケージの宣言
package Ensyu15_8;

import static java.util.Calendar.*;

//今日の日付を呼び出す
import  java.util.GregorianCalendar;

/**
 * クラス名：Ensyu15_8
 * 概要：演習15-8クラス
 * 作成者：S.Saito
 * 作成日：2023.05.15
 * @author S.Saito
 *
 */
public class Ensyu15_8 {
	
	/**
	 * 関数名：checkLastDate
	 * 概要：年と月の情報を入力すると、入力した月の最終日が何日であるかを返す
	 * 引数：checkYear … 年を示す引数
	 *       checkMonth … 月を示す引数
	 * 戻り値：lastDate … 引数の年の月における最終日の日付を示す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 * @param checkYear … 年を示す引数
	 * @param checkMonth … 月を示す引数
	 * @return lastDate … 引数の年の月における最終日の日付を示す。
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
	
	/**
	 * 関数名：printCalendar
	 * 概要：入力された年と月に応じたカレンダーを表示する。
	 * 引数：thisYear … 年を示す引数
	 *       thisMonth … 月を示す引数
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.15
	 */
	public static void printCalendar (int thisYear, int thisMonth) {
		// DayClassで年と月をいれたインスタンスをつくる。
		DayClass thisCalendar = new DayClass(thisYear, thisMonth);
		
		// 上部の枠をつくる。
		System.out.println("+--------------------+");
		// 年と月を表示する。
		System.out.printf( "|    %4d年  %2d月    |\n", thisYear, thisMonth);
		// 仕切る部分の枠をつくる。
		System.out.println("+--------------------+");
		// 年と月を表示する。
		System.out.printf( "|日 月 火 水 木 金 土|\n");
		// 仕切る部分の枠をつくる。
		System.out.println("+--------------------+");
		
		// DayClassでは日が初期値1であるため、その曜日を産出する。
		int checkWeek = thisCalendar.checkWeek();
		// 日付の入力値となる変数をつくる。初期値は0にする。
		int dateNumber = 0;
		// 一週間をカウントする用の変数をつくる。
		int countNumber = 0;
		// 週の7を示すfinal変数。
		final int WEEK_NUMBER = 7;
		// 年と月からこの月の最終日の日付を出す。
		int lastDate = checkLastDate(thisYear, thisMonth);
		
		// カレンダーをつくるまでループする。
		while (true) {
			
			// 横枠(左)を表示する。
			System.out.print("|");
			
			// 最初の週である場合
			if (dateNumber == 0) {
				// 1日の曜日を合わせるためのループ。
				for (int loopNumber = 0; loopNumber < checkWeek; loopNumber++) {
					// 空白を三つ表示する
					System.out.print("   ");
					// カウントを増やす。
					countNumber++;
				}
				// dateNumberの値を1に増やす。
				dateNumber++;
			}
			
			// countNumberを用いて1週間ずつ日付を入力する。
			for (; countNumber < WEEK_NUMBER ; countNumber++) {
				
				// 最終日を超えていないときの分岐
				if (dateNumber <= lastDate) {
					// 日付を入力する
					System.out.printf("%2d", dateNumber);
					// 日付の値を進める。
					dateNumber++;
				// 最終日以降の分岐
				} else {
					// 空白二個を表示する。
					System.out.print("  ");
				}
				// 週の最終日ではない場合の分岐
				if (countNumber != 6) {
					// 空白一個を表示する。
					System.out.print(" ");
				}
			}
			// countnumberを0に戻す。
			countNumber = 0;
			
			// 横枠(右)を表示して改行する。
			System.out.println("|");
			
			// 日付が最終日を超えていた場合の分岐
			if (dateNumber > lastDate) {
				// ループを抜ける。
				break;
			}
		}
		
		// 仕切る部分の枠をつくる。
		System.out.println("+--------------------+");
	}
	
	/**
	 * 関数名：main
	 * 概要：コマンドライン引数で与えられた文字列の数字を、インデックス0を年、1を月として扱いその月のカレンダーを表示する。
	 *       もし年のみの場合はその年の全ての月のカレンダーを表示し、年も月もない場合は今月のカレンダーを表示する。
	 * 引数：args … コマンドライン引数
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.15
	 * @param args … コマンドライン引数
	 */
	public static void main(String[] args){
		
		// 今日の年月日を取得する。
		GregorianCalendar todayGetter = new GregorianCalendar();
		
		// 年の参照先になるインデックス
		final int INDEX_YEAR = 0;
		// 月の参照先になるインデックス
		final int INDEX_MONTH = 1;
		
		// 要素数が1以上で尚且つ年の値が1以上になる場合。
		if (args.length >= 1 && Integer.parseInt(args[INDEX_YEAR]) > 0) {
			// 年の値をいれる
			int inputYear = Integer.parseInt(args[INDEX_YEAR]);
			// 月の値の変数をつくる。初期値は1とする。
			int inputMonth = 1;
			// 要素数が2以上で尚且つその値が1～12の場合の分岐
			if (args.length >= 2 && Integer.parseInt(args[INDEX_MONTH]) <= 12 && Integer.parseInt(args[INDEX_MONTH]) >= 1) {
				// 月の値を入れる
				inputMonth = Integer.parseInt(args[INDEX_MONTH]);
				// カレンダーを作成する。
				printCalendar(inputYear, inputMonth);
			// 要素数が1であるか、インデックスの要素の値が月の範囲外の場合
			} else {
				// 全ての月の値で行う。
				while (inputMonth <= 12) {
					// カレンダーを作成する。
					printCalendar(inputYear, inputMonth);
					// 改行を入れる。
					System.out.println();
					// 月の値を上げる。
					inputMonth++;
				}
			}
		// 要素の値を参照できない場合
		} else {
			// 参照できなかったことを示す。
			System.out.println("参照できませんでした。今月のカレンダーを表示します");
			// 改行を入れる。
			System.out.println();
			// 今年の値を入れる。
			int todayYear = todayGetter.get(YEAR);
			// 今月の値を入れる。
			int todayMonth = todayGetter.get(MONTH) + 1;
			// カレンダーを作成する。
			printCalendar(todayYear, todayMonth);
		}
		
	}

}
