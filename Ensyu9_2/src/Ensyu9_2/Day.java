// パッケージの宣言
package Ensyu9_2;

/*
* クラス名：Day
* 概要：[明解Java List9-12]の日付クラス。クラス名および各変数名等はもとの[明解Java List9-12]と同じものを用いている。
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
	
	
	// 各ゲッター
	
	/*
	 * 関数名：getYear
	 * 概要：年を取得するゲッター。関数名・戻り値名は参考元のクラスと同じものを用いている。
	 * 引数：なし
	 * 戻り値：year … フィールドの年の値を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public int getYear() { return year;}

	/*
	 * 関数名：getMonth
	 * 概要：月を取得するゲッター。関数名・戻り値名は参考元のクラスと同じものを用いている。
	 * 引数：なし
	 * 戻り値：month … フィールドの月の値を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public int getMonth() {return month;}
	
	/*
	 * 関数名：getDate
	 * 概要：日を取得するゲッター。関数名・戻り値名は参考元のクラスと同じものを用いている。
	 * 引数：なし
	 * 戻り値：date … フィールドの日の値を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public int getDate() {return date;}
	
	
	// 各セッター
	
	/*
	 * 関数名：setYear
	 * 概要：年を入力するセッター。関数名・引数名は参考元のクラスと同じものを用いている。
	 * 引数：year … フィールドの年の値を変更する。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void setYear(int year) {this.year = year;}
	
	/*
	 * 関数名：setMonth
	 * 概要：月を入力するセッター。関数名・引数名は参考元のクラスと同じものを用いている。
	 * 引数：month … フィールドの月の値を変更する。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void setMonth(int month) {this.month = month;}
	
	/*
	 * 関数名：setDate
	 * 概要：日を入力するセッター。関数名・引数名は参考元のクラスと同じものを用いている。
	 * 引数：date … フィールドの日の値を変更する。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void setDate(int date) {this.date = date;}
	
	/*
	 * 関数名：set
	 * 概要：年月日を同時に入力するセッター。関数名・引数名は参考元のクラスと同じものを用いている。
	 * 引数：year … フィールドの年の値を変更する。
	 *       month … フィールドの月の値を変更する。
	 *       date … フィールドの日の値を変更する。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void set(int year,int month,int date) {
		// 年を入力する。
		this.year = year;
		// 月を入力する。
		this.month = month;
		// 日を入力する。
		this.date = date;
	}
	
	/*
	 * 関数名：day0fWeek
	 * 概要：年月日の情報から曜日を求めて、0が日曜日で6が土曜日となる0～6の値を返す。関数名・戻り値名は参考元のクラスと同じものを用いている。
	 * 引数：なし
	 * 戻り値：(計算式) … 年月日の情報をもとに計算された、その日の曜日となる値。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
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
		// それぞれの値をもとに曜日を求める。
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date ) % 7;
	}
	
	/*
	 * 関数名：equalTo
	 * 概要：日付クラスのフィールドの他の日付dと等しいかを調べる。関数名・引数名・戻り値名は参考元のクラスと同じものを用いている。
	 * 引数：d … 日付クラスのフィールドで作られた別のインスタンスの日付。
	 * 戻り値：(計算式) … 年月日それぞれの値を比較し、全て同じならture、一つでも異なるならfalseになる。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public boolean equalTo (Day d) {
		// 年月日がすべて同じ場合はture、異なる値があった場合はfalseと返す
		return year == d.year && month == d.month && date == d.date;
	}
	
	/*
	 * 関数名：toString
	 * 概要：文字列表現で年月日(曜)を返す。曜日はday0fWeekを用いて得た値から適切な文字を表示する。関数名・戻り値名は参考元のクラスと同じものを用いている。
	 * 引数：なし
	 * 戻り値：format … 年月日および曜日の情報を文字列で表したもの。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	// 文字列表現で年月日(曜)を返す。
	public String toString() {
		// 各曜日が入った文字の配列をつくる
		String[] wd = {"日","月","火","水","木","金","土"};
		// 年月日(曜)という形で文字列を返す。曜日はday0fWeek()の値を用いて表示する。
		return String.format("%04d年%02d月%02d日(%s)", year,month,date,wd[day0fWeek()]);
	}
}
