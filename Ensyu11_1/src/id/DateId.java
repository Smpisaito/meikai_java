// パッケージの宣言
package id;

import static java.util.Calendar.*;

// 今日の日付を呼び出すためのインポート宣言
import java.util.GregorianCalendar;

/*
 * クラス名：DateId
 * 概要：識別番号クラス。[明解Java List10-12]と同じ。クラス名は指定のものを用いている。
 * 作成者：S.Saito
 * 作成日：2023.05.09
 */
public class DateId {
	
	// 何番までの識別番号を与えたか。クラス変数。
	private static int counterNumber;
	
	// 識別番号。
	private int identityNumber;
	
	// クラス初期化子
	static {
		// 今日の日付を呼び出す
		GregorianCalendar inputToday = new GregorianCalendar();
		
		// 今年の値
		int todayYear = inputToday.get(YEAR);
		// 今月の値
		int todayMonth = inputToday.get(MONTH);
		// 今日の値
		int todayDate = inputToday.get(DATE);
		
		// 今日の日付を示す表示をする
		System.out.printf("今日は%04d年%02d月%02d日です。\n",todayYear ,todayMonth ,todayDate);
	}
	
	// コンストラクタ
	public DateId() {
		// 識別番号をつくる
		identityNumber = ++counterNumber;
	}
	
	// ゲッタ
	
	/*
	 * 関数名：getIdentity
	 * 概要：識別番号を取得する。
	 * 引数：なし
	 * 戻り値：identityNumber … 識別番号
	 * 作成者：S.Saito
	 * 作成日：2023.05.09
	 */
	public int getIdentity() {
		// 識別番号を返す。
		return identityNumber;
	}
	
}
