package Ensyu9_4;

/*
 * クラス名：DayClass
 * 概要：年月日を格納する日付クラス
 * 作成者：S.Saito
 * 作成日：2023.04.28
 */
public class DayClass {

	// 年の設定。初期化子は1にする。
	private int dayYear = 1;
	// 月の設定。初期化子は1にする。
	private int dayMonth = 1;
	// 日の設定。初期化子は1にする。
	private int dayDate = 1;
	
	// コンストラクタ、未入力用。
	public DayClass() {}
	// コンストラクタ、年までの入力。
	public DayClass(int dayYear) {this.dayYear = dayYear;}
	// コンストラクタ、月までの入力。
	public DayClass(int dayYear, int dayMonth) {this(dayYear); this.dayMonth = dayMonth;}
	// コンストラクタ、日までの入力。
	public DayClass(int dayYear, int dayMonth, int dayDate) {this(dayYear,dayMonth);this.dayDate = dayDate;}
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
	 * 関数名：equalTo
	 * 概要：日付クラスのフィールドの他の日付dと等しいかを調べる。
	 * 引数：makeDay … 日付クラスのフィールドで作られた別のインスタンスの日付。
	 * 戻り値：(計算式) … 年月日それぞれの値を比較し、全て同じならture、一つでも異なるならfalseになる。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public boolean equalTo (DayClass makeDay) {
		// 年月日がすべて同じ場合はture、異なる値があった場合はfalseと返す
		return dayYear == makeDay.dayYear && dayMonth == makeDay.dayMonth && dayDate == makeDay.dayDate;
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
