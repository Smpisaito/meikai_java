// パッケージの宣言
package Enayu12_1;

/**
 * クラス名： CarClass
 * 概要：自動車クラス。変数名等は設問の参考元に準ずる。書き直し版
 * 作成者：S.Saito
 * 作成日：2023.05.12
 */
public class CarClass {
	// フィールド
	// 車の名前
	private String name;
	// 車の幅
	private int width;
	// 車の高さ
	private int height;
	// 車の長さ
	private int length;
	// 車のx座標
	private double x;
	// 車のy座標
	private double y;
	// 車の残り燃料
	private double fuel;
	// 車の購入日
	private DayClass purchaseDay;
	
	// コンストラクタ
	public CarClass (String name, int width, int height, int length, double fuel,DayClass purchaseDay) {
		// 車の名前
		this.name = name;
		// 車の幅
		this.width = width;
		// 車の高さ
		this.height = height;
		// 車の長さ
		this.length = length;
		// 車のx座標とy座標
		this.x = this.y = 0;
		// 車の残り燃料
		this.fuel = fuel;
		// 車の購入日
		this.purchaseDay = new DayClass (purchaseDay);
		
	}
	

	/**
	 * 関数名： getX 
	 * 概要：x座標を得る
	 * 引数：なし
	 * 戻り値：x
	 * 作成者：S.Saito
	 * 作成日：2023.05.12
	 */
	public double getX () {
		// x座標を得る。
		return x;
	}
	
	/**
	 * 関数名：getY 
	 * 概要：y座標を得る
	 * 引数：なし
	 * 戻り値：y
	 * 作成者：S.Saito
	 * 作成日：2023.05.12
	 */
	public double getY () {
		// y座標を得る
		return y;
		
	}
	
	/**
	 * 関数名：getfuel
	 * 概要：残り燃料を得る
	 * 引数：なし
	 * 戻り値：fuel
	 * 作成者：S.Saito
	 * 作成日：2023.05.12
	 */
	public double getfuel () {
		// 残り燃料を得る
		return fuel;
	}
	
	/**
	 * 関数名：purchaseDay
	 * 概要：購入日を見る
	 * 引数：なし
	 * 戻り値：fuel
	 * 作成者：S.Saito
	 * 作成日：2023.05.12
	 */
	public DayClass purchaseDay () {
		// 購入日を見る
		return new DayClass(purchaseDay );
	}
	
	
	/**
	 * 関数名：putSpec 
	 * 概要：車のスペックを表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.12
	 */
	public void putSpec () {
		// 車の名前
		System.out.println("車の名前" + name);
		// 車の幅
		System.out.println("車の幅" + width);
		// 車の高さ
		System.out.println("車の高さ" + height);
		// 車の長さ
		System.out.println("車の長さ" + length);
	}
	
	/**
	 * 関数名：move
	 * 概要：車の移動をする。
	 * 引数：dx … x座標の移動距離
	 *       dy … y座標の移動距離
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.12
	 */
	public boolean move(double dx, double dy) {
		// 移動距離を調べる
		double dist = Math.sqrt(dx*dx + dy*dy);
		
		// 燃料が足りない場合
		if (dist > fuel) {
			// 移動できなかったことを伝える戻り値。
			return false;
		// 燃料が足りる場合
		} else {
			// 燃料を減らす。
			fuel -= fuel;
			// 移動する
			x += dx;
			// 移動する。
			y += dy;
			// 移動できたことを伝える戻り値
			return true;
		}
	}
	
	
	
}
