// パッケージの宣言
package Enayu12_1;

/**
 * クラス名：NewCarClass 
 * 概要：総走行距離のフィールドを加えた自動車クラスの下位クラス。書き直し版
 * 作成者：S.Saito
 * 作成日：2023.05.12
 */
public class NewCarClass extends CarClass {
	
	// フィールド
	// 総走行距離
	private int totalMove;
	
	// コンストラクタ
	public NewCarClass (String name, int width, int height, int length, double fuel,DayClass purchaseDay) {
		// 上位クラスのコンストラクタを呼び出す。
		super(name,width,height,length, fuel, purchaseDay);
		// 総走行距離を入れる。
		this.totalMove = 0;
	}
	
	/**
	 * 関数名：getTotalMove
	 * 概要：総走行距離を得る。
	 * 引数：なし
	 * 戻り値：totalMove
	 * 作成者：S.Saito
	 * 作成日：2023.05.12
	 */
	public int getTotalMove () {
		// 総走行距離を返す。
		return totalMove;
	}
	
	/**
	 * 関数名：move
	 * 概要：車の移動をする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.12
	 */
	public boolean move(double dx, double dy) {
		// 移動距離を調べる
		double dist = Math.sqrt(dx*dx + dy*dy);
		
		// 燃料が足りる場合
		if (super.move(dx, dy)) {
			// 総走行距離を増やす。
			totalMove += dist;
			// 移動できたことを伝える戻り値
			return true;
		// 燃料が足りない場合
		} else {
			// 移動できなかったことを伝える戻り値。
			return false;
			
		}
	}

}
