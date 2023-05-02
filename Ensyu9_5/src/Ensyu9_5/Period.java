// パッケージの宣言
package Ensyu9_5;

/*
 * クラス名：Period
 * 概要：開始日と終了日からなる＜期間クラス＞を作成する。
 * 作成者：S.Saito
 * 作成日：2023.05.01
 */
public class Period {

	// フィールド
	// 開始日を示すフィールドをつくる
	private DayClass startDay;
	// 終了日を示すフィールドをつくる
	private DayClass finishDay;
	
	// コンストラクタ。終了日未定。
	public Period(DayClass startDay){
		// 開始日
		this.startDay = new DayClass(startDay);
	}
	// コンストラクタ。予定決定。
	public Period(DayClass startDay,DayClass finishDay){
		// 開始日
		this(startDay);
		// 終了日
		this.finishDay = new DayClass(finishDay);
	}
	
	
	// ゲッタ
	
	/*
	 * 関数名：getStart
	 * 概要：開始日のゲッタ
	 * 引数：なし
	 * 戻り値：new DayClass(startDay) … 開始日の情報のコピーへの参照
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public DayClass getStart () {
		// 開始日を返す
		return new DayClass(startDay);
	}
	
	/*
	 * 関数名：getFinish
	 * 概要：終了日のゲッタ
	 * 引数：なし
	 * 戻り値：new DayClass(finishDay) … 終了日の情報のコピーへの参照
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public DayClass getFinish () {
		// 開始日を返す
		return new DayClass(finishDay);
	}
	
	
	// セッタ
	
	/*
	 * 関数名：setStart
	 * 概要：開始日のセッタ
	 * 引数：newStart … 新しい開始日
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void setStart (DayClass newStart) {
		// 開始日を変更する。
		startDay = new DayClass(newStart);
	}
	
	/*
	 * 関数名：setFinish
	 * 概要：終了日のセッタ
	 * 引数：newFinish … 新しい終了日
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void setFinish (DayClass newFinish) {
		// 終了日を追加、または変更する。
		finishDay = new DayClass(newFinish);
	}
	
	/*
	 * 関数名：toString
	 * 概要：開始日と終了日を示す。(toString)
	 * 引数：なし
	 * 戻り値：String.format … 開始日と終了日の文字列
	 * 作成者：S.Saito
	 * 作成日：20223.05.01
	 */
	public String toString() {
		// 開始日と終了日を返す。
		return String.format("開始日：" + startDay + "\n終了日：" + finishDay); 
	}
}
