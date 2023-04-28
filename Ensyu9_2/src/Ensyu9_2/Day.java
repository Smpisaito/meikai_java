// パッケージの宣言
package Ensyu9_2;

/*
* クラス名：Day
* 概要：[明解Java List9-12]をもとに作った日付クラス。クラス名および各変数名等はもとの[明解Java List9-12]と同じものを用いている。
* 作成者：S.Saito
* 作成日：2023.04.28
*/
public class Day {
	
	// 年の設定。初期化子は1にする。
	private int year = 1;
	// 月の設定。初期化子は1にする。
	private int month = 1;
	// 日の設定。初期化子は1にする。
	private int date = 1;
	
	// コンストラクタ、未入力用。
	public Day() {}
	// コンストラクタ、年までの入力。
	public Day(int year) {this.year = year;}
	// コンストラクタ、月までの入力。
	public Day(int year, int month) {this(year); this.month = month;}
	// コンストラクタ、日までの入力。
	public Day(int year, int month, int date) {this(year,month);this.date = date;}
	// コンストラクタ、他の年月日のコピー。
	public Day(Day d) {this(d.year,d.month,d.date);}
	
	// 年を取得するゲッター
	public int getYear() { return year;}
	// 月を取得するゲッター
	public int getMonth() {return month;}
	// 日を取得するゲッター
	public int getDate() {return date;}
	
	// 年を入力するセッター
	public void set(int year) {this.year = year;}
	// 月を入力するセッター
	public void setMonth(int month) {this.month = month;}
	// 日を入力するセッター
	public void setDate(int date) {this.date = date;}
	
	// 年月日を同時に入力するセッター
	public void set(int year,int month,int date) {
		// 年を入力する。
		this.year = year;
		// 月を入力する。
		this.month = month;
		// 日を入力する。
		this.date = date;
	}
	
	// 年月日の情報から曜日を求めて返す。0が日曜日で6が土曜日となる0～6の値を返す。
	public int day0fWeek() { 
		// 年の入力をする。
		int y = year;
		// 月の入力をする。
		int m = month;
		// １月と２月のときの分岐
		if (m == 1 || m == 2) {
			// yの年のうるう年の分の計算をしないように減らす。
			y--;
			// yを減らした分の12ヶ月を月の値に入れる。
			m += 12;
		}
		// それぞれの値をもとに腰部を求める。
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date ) % 7;
	}
	
	// 日付dと等しいかを調べる。
	public boolean equalTo (Day d) {
		// 年月日がすべて同じ場合はture、異なる値があった場合はfalseと返す
		return year == d.year && month == d.month && date == d.date;
	}
	
	// 文字列表現で年月日(曜)を返す。
	public String toString() {
		// 各曜日が入った文字の配列をつくる
		String[] wd = {"日","月","火","水","木","金","土"};
		// 年月日(曜)という形で文字列を返す。曜日はday0fWeek()の値を用いて表示する。
		return String.format("%04d年%02d月%02d日(%s)", year,month,date,wd[day0fWeek()]);
	}
}
