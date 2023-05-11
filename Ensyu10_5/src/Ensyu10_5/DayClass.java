// パッケージの宣言
package Ensyu10_5;

//今日の日付を獲得するためのインポート宣言
import static java.util.Calendar.*;

//今日の日付を獲得するためのインポート宣言
import java.util.GregorianCalendar;

/*
* クラス名：DayClass
* 概要：日付クラス
* 作成者：S.Saito
* 作成日：2023.05.02
*/
public class DayClass {
	
	// 静的フィールド
	// 今日の年を示すクラス変数
	private static int todayYear;
	// 今日の年を示すクラス変数
	private static int todayMonth;
	// 今日の年を示すクラス変数
	private static int todayDate;
	
	// フィールド
	// 年の設定。
	private int dayYear = 1;
	// 月の設定。
	private int dayMonth = 1;
	// 日の設定。
	private int dayDate = 1;
	
	// 静的初期化子
	static {
		// 今日の日付のインスタンスの生成
		GregorianCalendar today = new GregorianCalendar();
		
		// 今日の年数を入れる。
		todayYear = today.get(YEAR);
		// 今日の月数を入れる。MONTHは0～11が得られるので1加えて1～12にする。
		todayMonth = today.get(MONTH) + 1;
		// 今日の月数を入れる。
		todayDate = today.get(DATE);
	}
	
	/*
	 * 関数名：isLeap
	 * 概要：うるう年か否か
	 * 引数：dayYear
	 * 戻り値：checkLeap
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public static boolean isLeap(int dayYear) {
		// 戻り値に、うるう年ならtrueになる論理型の式を入れる
		boolean checkLeap = (dayYear % 4 == 0 && dayYear % 100 != 0 || dayYear % 400 == 0);
		// 戻り値を返す。
		return checkLeap;
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
	public static int checkLastDate(int checkYear,int checkMonth) {
		
		// 戻り値として月の最終日をいれる変数。初期値は0とする。
		int lastDate = 0;
		
		// 月の入力に合わせてその月の最終日を示す分岐をする。
		switch (checkMonth) {
		// 二月の場合。
		case 2:
			// うるう年の分岐
			if (isLeap(checkYear)) {
				// うるう年なので29日に設定する。
				lastDate = 29;
				// 分岐を抜ける
				break;
			// うるう年じゃない分岐
			} else {
				// うるう年ではないため28日に設定する。
				lastDate = 28;
				// 分岐を抜ける
				break;
			}
			
		// 4月、6月、9月、11月の場合の分岐。
		case 4: case 6: case 9: case 11:
			// 30日に設定する。
			lastDate = 30;
			// 分岐を抜ける
			break;
			
		// 1月、3月、5月、7月、8月、10月、12月の場合。
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			// 31日に設定する。
			lastDate = 31;
			// 分岐を抜ける
			break;
		}
		// 戻り値を返す。
		return lastDate;
	}
	
	/*
	 * 関数名：equalTo
	 * 概要：日付クラスのフィールドの他の日付dと等しいかを調べる。
	 * 引数：firstDay … 日付クラスの一つ目の日付。
	 *       secondDay … 日付クラスの二つ目の日付。
	 * 戻り値：(計算式) … 年月日それぞれの値を比較し、全て同じならture、一つでも異なるならfalseになる。
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public static boolean equalTo (DayClass firstDay,DayClass secondDay) {
		// 年月日がすべて同じ場合はture、異なる値があった場合はfalseと返す
		return firstDay.dayYear == secondDay.dayYear && firstDay.dayMonth == secondDay.dayMonth && firstDay.dayDate == secondDay.dayDate;
	}
	
	
	/*
	 * 関数名：compareDays
	 * 概要：日付の前後関係を調べる
	 * 引数：firstDay … 日付クラスの一つ目の日付
	 *       secondDay … 日付クラスの二つ目の日付
	 * 戻り値：compareResult … インスタンスの日付が早ければ1、遅ければ-1、同じ日なら0を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public static int compareDays(DayClass firstDay,DayClass secondDay) {
		// 戻り値を初期値0でつくる。
		int compareResult = 0;
		// 同じ日か調べる。
		if (equalTo (firstDay,secondDay)) {
			// もし同じ日なら0を返す。
			return compareResult;
		}
		// 一つ目の日付のほうが早い日付のとき
		if (firstDay.dayYear < secondDay.dayYear || (firstDay.dayYear == secondDay.dayYear && firstDay.dayMonth < secondDay.dayMonth) 
				// 条件の続き
				|| (firstDay.dayYear == secondDay.dayYear && firstDay.dayMonth == secondDay.dayMonth && firstDay.dayDate < secondDay.dayDate)) {
			// 1にする
			compareResult = 1;
		// それ以外、一つ目の日付のほうが遅い場合
		} else {
			// -1にする
			compareResult = -1;
		}
		// 戻り値を返す
		return compareResult;
	}
	
	/*
	 * 関数名：advanceDay
	 * 概要：advanceNumberの値の日数だけ年月日の値を進めて日付クラスにして返す。
	 * 引数：dayYear … 年の値。
	 *       dayMonth … 月の値。
	 *       dayDate … 日の値。
	 *       advanceNumber … 進める日数の値
	 * 戻り値：newDay … 変更後の年月日の値
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public static DayClass advanceDay(int dayYear, int dayMonth, int dayDate, int advanceNumber) {
		// 進める日数だけ日の値を進める。
		dayDate += advanceNumber;
		// 日数が月の最終日を超える場合のループ。
		while (dayDate > checkLastDate(dayYear,dayMonth)){
			// 日数から最終日の値だけ減らす
			dayDate -= checkLastDate(dayYear,dayMonth);
			// 月を来月に進める。
			dayMonth++;
			// 月の値が12を超えた場合の分岐
			if (dayMonth > 12) {
				// 12ヶ月減らす。
				dayMonth -= 12;
				// 一年先に進める。
				dayYear++;
			}
		}
		// 新しい値をもとに日付クラスをつくる。
		DayClass newDay = new DayClass(dayYear,dayMonth,dayDate);
		// 新しい日付クラスを返す。
		return newDay;
	}
	
	/*
	 * 関数名：backDay
	 * 概要：backNumberの値の日数だけ年月日の値を戻して日付クラスにして返す。
	 * 引数：dayYear … 年の値。
	 *       dayMonth … 月の値。
	 *       dayDate … 日の値。
	 *       backNumber … 戻す日数の値
	 * 戻り値：newDay … 変更後の年月日の値
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public static DayClass backDay(int dayYear, int dayMonth, int dayDate, int backNumber) {
		// 戻す日数だけ日の値を戻す。
		dayDate -= backNumber;
		// 日数が0日以下になる場合のループ。
		while (dayDate < 1){
			// 月を先月に戻す。
			dayMonth--;
			// 月の値が0以下になった場合の分岐
			if (dayMonth < 1) {
				// 12ヶ月増やす。
				dayMonth += 12;
				// 一年前に戻す。
				dayYear--;
			}
			// 日数から最終日の値だけ増やす
			dayDate += checkLastDate(dayYear,dayMonth);
		}
		// 新しい値をもとに日付クラスをつくる。
		DayClass newDay = new DayClass(dayYear,dayMonth,dayDate);
		// 新しい日付クラスを返す。
		return newDay;
	}
	
	
	// コンストラクタ、未入力用。
	public DayClass() {
		// 引数が未入力の場合の今日の年
		dayYear = todayYear;
		// 引数が未入力の場合の今日の月
		dayMonth = todayMonth;
		// 引数が未入力の場合の今日の日
		dayDate = todayDate;
		
	}
	// コンストラクタ、年までの入力。
	public DayClass(int dayYear) {
		//もし0以下の値が入れられたら1にする
		if (dayYear <= 0) {dayYear = 1;}
		// 年数を代入する
		this.dayYear = dayYear;
	}
	// コンストラクタ、月までの入力。
	public DayClass(int dayYear, int dayMonth) {
		// 年数までをいれる。
		this(dayYear);
		// もし0以下なら1を入れる。
		if (dayMonth <= 0) {dayMonth = 1;}
		// もし13以上なら12を入れる。
		if (dayMonth > 12) {dayMonth = 12;}
		// 月数を代入する。
		this.dayMonth = dayMonth;
	}
	// コンストラクタ、日までの入力。
	public DayClass(int dayYear, int dayMonth, int dayDate) {
		// 月数までいれる。
		this(dayYear,dayMonth);
		//もし0以下の値が入れられたら1にする
		if (dayYear <= 0) {dayYear = 1;}
		// もし0以下なら1を入れる。
		if (dayMonth <= 0) {dayMonth = 1;}
		// もし13以上なら12を入れる。
		if (dayMonth > 12) {dayMonth = 12;}
		// もし0以下なら1を入れる。
		if (dayDate <= 0) {dayDate = 1;}
		// 年数と月数をもとに大きすぎる日数を月の最終日の値に合わせる。
		if (dayDate > checkLastDate(dayYear,dayMonth)) {dayDate = checkLastDate(dayYear,dayMonth);}
		// 日数を代入する。
		this.dayDate = dayDate;
	}
	// コンストラクタ、他の年月日のコピー。
	public DayClass(DayClass makeDay) {this(makeDay.dayYear,makeDay.dayMonth,makeDay.dayDate);}
	
	
	// 各ゲッター
	
	/*
	 * 関数名：getYear
	 * 概要：年を取得するゲッター。
	 * 引数：なし
	 * 戻り値：dayYear … フィールドの年の値を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public int getYear() { return dayYear;}
	
	/*
	 * 関数名：getMonth
	 * 概要：月を取得するゲッター。
	 * 引数：なし
	 * 戻り値：dayMonth … フィールドの月の値を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public int getMonth() {return dayMonth;}
	
	/*
	 * 関数名：getDate
	 * 概要：日を取得するゲッター。
	 * 引数：なし
	 * 戻り値：dayDate … フィールドの日の値を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public int getDate() {return dayDate;}
	
	
	// 各セッター
	
	/*
	 * 関数名：setYear
	 * 概要：年を入力するセッター。
	 * 引数：dayYear … フィールドの年の値を変更する。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void setYear(int dayYear) {this.dayYear = dayYear;}
	
	/*
	 * 関数名：setMonth
	 * 概要：月を入力するセッター。
	 * 引数：dayMonth … フィールドの月の値を変更する。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void setMonth(int dayMonth) {this.dayMonth = dayMonth;}
	
	/*
	 * 関数名：setDate
	 * 概要：日を入力するセッター。
	 * 引数：dayDate … フィールドの日の値を変更する。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void setDate(int dayDate) {this.dayDate = dayDate;}
	
	/*
	 * 関数名：setDay
	 * 概要：年月日を同時に入力するセッター。
	 * 引数：dayYear … フィールドの年の値を変更する。
	 *       dayMonth … フィールドの月の値を変更する。
	 *       dayDate … フィールドの日の値を変更する。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	// 年月日を同時に入力するセッター
	public void setDay(int dayYear,int dayMonth,int dayDate) {
		// 年を入力する。
		this.dayYear = dayYear;
		// 月を入力する。
		this.dayMonth = dayMonth;
		// 日を入力する。
		this.dayDate = dayDate;
	}
	
	
	/*
	 * 関数名：isLeap
	 * 概要：うるう年かどうかの判定を返す。うるう年ならtrueが返される。
	 * 引数：なし
	 * 戻り値：isLeap(dayYear) … インスタンスの「年」の値をもとに調べたうるう年であるかの判定
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public boolean isLeap() {
		// クラスメソッドのうるう年の判別した結果を返す。
		return isLeap(dayYear);
	}
	
	/*
	 * 関数名：elapseDay
	 * 概要：年内の経過日数を示す。数える値の最終日が日付とする。
	 * 引数：なし
	 * 戻り値：ageDate … 計算した経過日数
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public int elapseDay() {
		
		// 戻り値をつくる。初期値は0とする。
		int ageDate = 0;
		// 先月までの経過日数を調べるループ。
		for (int loopNumber = 1; loopNumber < dayMonth; loopNumber++) {
			// それぞれの月の最終日までの日数を加える。
			ageDate += checkLastDate(dayYear,loopNumber);
		}
		// 当月の経過日数を加える。
		ageDate += dayDate;
		// 戻り値を返す。
		return ageDate;
	}
	
	/*
	 * 関数名：leftDate
	 * 概要：年内の残り日数を示す。数える値の開始日が日付の次の日とする。
	 * 引数：なし
	 * 戻り値：ageDate … 計算した残り日数
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public int leftDay() {
		
		// 戻り値をつくる。初期値は0とする。
		int restDate = 0;
		// うるう年ではない場合の日数(365日)をいれる。
		restDate += 365;
		// うるう年の場合の分岐。
		if (isLeap()) {
			// 1加える。
			restDate++;
		}
		// 経過日数で値を引く。
		restDate -= elapseDay();
		// 戻り値を返す。
		return restDate;
	}
	
	/*
	 * 関数名：checkWeek
	 * 概要：年月日の情報から曜日を求めて、0が日曜日で6が土曜日となる0～6の値を返す。
	 * 引数：なし
	 * 戻り値：(計算式) … 年月日の情報をもとに計算された、その日の曜日となる値。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public int checkWeek() { 
		// 年の入力をする。
		int yearWeek = dayYear;
		// 月の入力をする。
		int monthWeek = dayMonth;
		// １月と２月のときの分岐
		if (yearWeek == 1 || monthWeek == 2) {
			// yの年のうるう年の分の計算をしないように減らす。
			yearWeek--;
			// yを減らした分の12ヶ月を月の値に入れる。
			monthWeek += 12;
		}
		// それぞれの値をもとに腰部を求める。
		return (yearWeek + yearWeek / 4 - yearWeek / 100 + yearWeek / 400 + (13 * monthWeek + 8) / 5 + dayDate ) % 7;
	}
	
	/*
	 * 関数名：returnAdvanceDayFirst
	 * 概要：1日だけ年月日の値を進め、その年月日を返す。
	 * 引数：なし
	 * 戻り値：newDay … 変更後の年月日の値
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public DayClass returnAdvanceDayFirst() {
		// 年月日をもとに1日だけ進めたクラスをつくる。
		DayClass newDay = new DayClass(advanceDay(dayYear,dayMonth,dayDate,1));
		// 年月日を返す。
		return newDay;
	}
	
	/*
	 * 関数名：advanceDayFirst
	 * 概要：値の日数だけ年月日の値を進める。その年月日に変更する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public void advanceDayFirst() {
		// 年月日をもとに1日だけ進めたクラスをつくる
		DayClass newDay = new DayClass(returnAdvanceDayFirst());
		// 年月日を更新する。
		setDay (newDay.dayYear, newDay.dayMonth, newDay.dayDate);
	}
	
	/*
	 * 関数名：returnAdvanceDay
	 * 概要：値の日数だけ年月日の値を進め、その年月日を返す。
	 * 引数：advanceNumber … 進める日数の値
	 * 戻り値：newDay … 変更後の年月日の値
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public DayClass returnAdvanceDay(int advanceDay) {
		// 年月日をもとにadvanceDayだけ進めたクラスをつくる。
		DayClass newDay = new DayClass(advanceDay(dayYear,dayMonth,dayDate,advanceDay));
		// 年月日を返す。
		return newDay;
	}
	
	/*
	 * 関数名：advanceDay
	 * 概要：値の日数だけ年月日の値を進める。その年月日に変更する。
	 * 引数：advanceNumber … 進める日数の値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public void advanceDay(int advanceDay) {
		// 年月日をもとにadvanceDayだけ進めたクラスをつくる。
		DayClass newDay = new DayClass(returnAdvanceDay(advanceDay));
		// 年月日を更新する。
		setDay (newDay.dayYear, newDay.dayMonth, newDay.dayDate);
	}
	
	/*
	 * 関数名：returnBackDayFirst
	 * 概要：backNumberの値の日数だけ年月日の値を戻して日付クラスにして返す。
	 * 引数： backNumber … 戻す日数の値
	 * 戻り値：newDay … 変更後の年月日の値
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public DayClass returnBackDayFirst() {
		// 年月日をもとに1日だけ戻したクラスをつくる。
		DayClass newDay = new DayClass(backDay(dayYear,dayMonth,dayDate,1));
		// 年月日を返す。
		return newDay;
	}
	
	/*
	 * 関数名：backDayFirst
	 * 概要：backNumberの値の日数だけ年月日の値を戻して日付クラスにして返す。
	 * 引数： backNumber … 戻す日数の値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public void backDayFirst() {
		// 年月日をもとに1日だけ戻したクラスをつくる。
		DayClass newDay = new DayClass(returnBackDayFirst());
		// 年月日を更新する。
		setDay (newDay.dayYear, newDay.dayMonth, newDay.dayDate);
	}
	
	/*
	 * 関数名：returnBackDay
	 * 概要：backNumberの値の日数だけ年月日の値を戻して日付クラスにして返す。
	 * 引数： backNumber … 戻す日数の値
	 * 戻り値：newDay … 変更後の年月日の値
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public DayClass returnBackDay(int backDay) {
		// 年月日をもとにadvanceDayだけ戻したクラスをつくる。
		DayClass newDay = new DayClass(backDay(dayYear,dayMonth,dayDate,backDay));
		// 年月日を返す。
		return newDay;
	}
	
	/*
	 * 関数名：backDay
	 * 概要：backNumberの値の日数だけ年月日の値を戻して日付クラスにして返す。
	 * 引数： backNumber … 戻す日数の値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.08
	 */
	public void backDay(int backDay) {
		// 年月日をもとにadvanceDayだけ戻したクラスをつくる。
		DayClass newDay = new DayClass(returnBackDay(backDay));
		// 年月日を更新する。
		setDay (newDay.dayYear, newDay.dayMonth, newDay.dayDate);
	}
	
	/*
	 * 関数名：compareDays
	 * 概要：日付の前後関係を調べる
	 * 引数：anotherDay … 日付クラスの他の日付
	 * 戻り値：compareResult … インスタンスの日付が早ければ1、遅ければ-1、同じ日なら0を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public String compareDays(DayClass anotherDay) {
		// 戻り値となる文字列をつくる。
		String compareResult = "エラー";
		// 引数の日付と同じ場合。
		if (compareDays(new DayClass(dayYear,dayMonth,dayDate),anotherDay) == 0) {
			// 「同じ日付」と文字列に入れる。
			compareResult = "同じ日付";
		// 引数の日付より前の場合
		} else if (compareDays(new DayClass(dayYear,dayMonth,dayDate),anotherDay) == 1) {
			// 「前の日」と文字列に入れる
			compareResult = "前の日";
		// 引数の日付より後の場合
		} else {
			// 「後の日」と文字列に入れる。
			compareResult = "後の日";
		}
		
		// 結果を返す。
		return compareResult;
	}
	
	/*
	 * 関数名：equalTo
	 * 概要：日付クラスのフィールドの他の日付dと等しいかを調べる。
	 * 引数：makeDay … 日付クラスのフィールドで作られた別のインスタンスの日付。
	 * 戻り値：(計算式) … 年月日それぞれの値を比較し、全て同じならture、一つでも異なるならfalseになる。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public boolean equalTo (DayClass makeDay) {
		// 年月日がすべて同じ場合はture、異なる値があった場合はfalseと返す
		return equalTo (new DayClass(dayYear,dayMonth,dayDate),makeDay);
	}
	
	/*
	 * 関数名：toString
	 * 概要：文字列表現で年月日(曜)を返す。曜日はday0fWeekを用いて得た値から適切な文字を表示する。
	 * 引数：なし
	 * 戻り値：format … 年月日および曜日の情報を文字列で表したもの。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public String toString() {
		// 各曜日が入った文字の配列をつくる
		String[] weekWord = {"日","月","火","水","木","金","土"};
		// 年月日(曜)という形で文字列を返す。曜日はcheckWeek()の値を用いて文字列を返す。
		return String.format("%04d年%02d月%02d日(%s)", dayYear,dayMonth,dayDate,weekWord[checkWeek()]);
	}
	
}

