// パッケージの宣言
package Ensyu15_8;

/**
 * クラス名：DayClass<Br>
 * 概要：年月日を格納する日付クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.04.28
 * @author S.Saito
 *
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
	public DayClass(int dayYear) {
		// 引数を年にいれる。
		this.dayYear = dayYear;
	}
	// コンストラクタ、月までの入力。
	public DayClass(int dayYear, int dayMonth) {
		// 年までのコンストラクタの操作と同じ。
		this(dayYear);
		// 引数を月に入れる。
		this.dayMonth = dayMonth;
	}
	// コンストラクタ、日までの入力。
	public DayClass(int dayYear, int dayMonth, int dayDate) {
		// 月までのコンストラクタの操作と同じ。
		this(dayYear,dayMonth);
		// 引数を日に入れる。
		this.dayDate = dayDate;
	}
	// コンストラクタ、他の年月日のコピー。
	public DayClass(DayClass makeDay) {
		// クラスの各値をもとにコピーのコンストラクタをつくる。
		this(makeDay.dayYear,makeDay.dayMonth,makeDay.dayDate);
	}
	
	
	// 各ゲッター
	
	/**
	 * 関数名：getYear<Br>
	 * 概要：年を取得するゲッター。<Br>
	 * 引数：なし<Br>
	 * 戻り値：dayYear … フィールドの年の値を返す。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.01
	 * @return dayYear … フィールドの年の値を返す。
	 */
	public int getYear() { 
		// 年の値を返す
		return dayYear;
	}
	
	/**
	 * 関数名：getMonth<Br>
	 * 概要：月を取得するゲッター。<Br>
	 * 引数：なし<Br>
	 * 戻り値：dayMonth … フィールドの月の値を返す。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.01
	 * @return dayMonth … フィールドの月の値を返す。
	 */
	public int getMonth() {
		// 月の値を返す
		return dayMonth;
	}
	
	/**
	 * 関数名：getDate<Br>
	 * 概要：日を取得するゲッター。<Br>
	 * 引数：なし<Br>
	 * 戻り値：dayDate … フィールドの日の値を返す。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.01
	 * @return dayDate … フィールドの日の値を返す。
	 */
	public int getDate() {
		// 日の値を返す。
		return dayDate;
	}
	
	// 各セッター
	
	/**
	 * 関数名：setYear<Br>
	 * 概要：年を入力するセッター。<Br>
	 * 引数：dayYear … フィールドの年の値を変更する。<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.01
	 * @param dayYear … フィールドの年の値を変更する。
	 */
	public void setYear(int dayYear) {
		// 年に値を入力する。
		this.dayYear = dayYear;
	}
	
	/**
	 * 関数名：setMonth<Br>
	 * 概要：月を入力するセッター。<Br>
	 * 引数：dayMonth … フィールドの月の値を変更する。<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.01
	 * @param dayMonth … フィールドの月の値を変更する。
	 */
	public void setMonth(int dayMonth) {
		// 月に値を入力する。
		this.dayMonth = dayMonth;
	}
	
	/**
	 * 関数名：setDate<Br>
	 * 概要：日を入力するセッター。<Br>
	 * 引数：dayDate … フィールドの日の値を変更する。<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.01
	 * @param dayDate … フィールドの日の値を変更する。
	 */
	public void setDate(int dayDate) {
		// 日に値を入力する。
		this.dayDate = dayDate;
	}
	
	/**
	 * 関数名：setDay<Br>
	 * 概要：年月日を同時に入力するセッター。<Br>
	 * 引数：dayYear … フィールドの年の値を変更する。<Br>
	 *       dayMonth … フィールドの月の値を変更する。<Br>
	 *       dayDate … フィールドの日の値を変更する。<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.01
	 * @param dayYear … フィールドの年の値を変更する。
	 * @param dayMonth … フィールドの月の値を変更する。
	 * @param dayDate … フィールドの日の値を変更する。
	 */
	public void setDay(int dayYear,int dayMonth,int dayDate) {
		// 年を入力する。
		this.dayYear = dayYear;
		// 月を入力する。
		this.dayMonth = dayMonth;
		// 日を入力する。
		this.dayDate = dayDate;
	}
	
	
	/**
	 * 関数名：checkWeek<Br>
	 * 概要：年月日の情報から曜日を求めて、0が日曜日で6が土曜日となる0～6の値を返す。<Br>
	 * 引数：なし<Br>
	 * 戻り値：(計算式) … 年月日の情報をもとに計算された、その日の曜日となる値。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.01
	 * @return (計算式) … 年月日の情報をもとに計算された、その日の曜日となる値。
	 */
	public int checkWeek() { 
		// 年の入力をする。
		int yearWeek = dayYear;
		// 月の入力をする。
		int monthWeek = dayMonth;
		// １月と２月のときの分岐
		if (monthWeek == 1 || monthWeek == 2) {
			// yの年のうるう年の分の計算をしないように減らす。
			yearWeek--;
			// yを減らした分の12ヶ月を月の値に入れる。
			monthWeek += 12;
		}
		// それぞれの値をもとに腰部を求める。
		return (yearWeek + yearWeek / 4 - yearWeek / 100 + yearWeek / 400 + (13 * monthWeek + 8) / 5 + dayDate ) % 7;
	}
	
	/**
	 * 関数名：equalTo<Br>
	 * 概要：日付クラスのフィールドの他の日付dと等しいかを調べる。<Br>
	 * 引数：makeDay … 日付クラスのフィールドで作られた別のインスタンスの日付。<Br>
	 * 戻り値：(計算式) … 年月日それぞれの値を比較し、全て同じならture、一つでも異なるならfalseになる。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.01
	 * @param makeDay … 日付クラスのフィールドで作られた別のインスタンスの日付。
	 * @return (計算式) … 年月日それぞれの値を比較し、全て同じならture、一つでも異なるならfalseになる。
	 */
	public boolean equalTo (DayClass makeDay) {
		// 年月日がすべて同じ場合はture、異なる値があった場合はfalseと返す
		return dayYear == makeDay.dayYear && dayMonth == makeDay.dayMonth && dayDate == makeDay.dayDate;
	}
	
	/**
	 * 関数名：toString<Br>
	 * 概要：文字列表現で年月日(曜)を返す。曜日はday0fWeekを用いて得た値から適切な文字を表示する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：String.format … 年月日および曜日の情報を文字列で表したもの。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.01
	 * @return String.format … 年月日および曜日の情報を文字列で表したもの。
	 */
	public String toString() {
		// 各曜日が入った文字の配列をつくる
		String[] weekWord = {"日","月","火","水","木","金","土"};
		// 年月日(曜)という形で文字列を返す。曜日はcheckWeek()の値を用いて文字列を返す。
		return String.format("%04d年%02d月%02d日(%s)", dayYear,dayMonth,dayDate,weekWord[checkWeek()]);
	}
}