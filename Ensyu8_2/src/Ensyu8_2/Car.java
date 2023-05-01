// パッケージの宣言
package Ensyu8_2;

/*
 * クラス名：Car
 * 概要：自動車のデータをまとめたもの。クラス名は指定のものを用いる。
 * 作成者：S.Saito
 * 作成日：2023.04.27
 */
public class Car {

	// 自動車の名前
	private String carName;
	// 自動車のナンバー
	private int carNumber;
	// 自動車の幅
	private int carWidth;
	// 自動車の高さ
	private int carHeight;
	// 自動車の長さ
	private int carLength;
	// 現在位置x座標
	private double coordinateX;
	// 現在位置y座標
	private double coordinateY;
	// 自動車のタンク容量
	private double carTank;
	// 自動車の残り燃料
	private double remainFuel;
	// 自動車の燃費
	private double carCost;

	// コンストラクタを定義する。
	Car(String carName, int carNumber, int carWidth, int carHeight, int carLength, double carTank,
			double remainFuel, double carCost) {

		// 自動車の名前
		this.carName = carName;
		// 自動車のナンバー
		this.carNumber = carNumber;
		// 自動車の幅
		this.carWidth = carWidth;
		// 自動車の高さ
		this.carHeight = carHeight;
		// 自動車の長さ
		this.carLength = carLength;
		// 自動車のタンク容量
		this.carTank = carTank;
		// 自動車の残り燃料
		this.remainFuel = remainFuel;
		// 自動車の燃費
		this.carCost = carCost;
		// xとyの座標の初期値を0.0にする。
		coordinateX = coordinateY = 0.0;

	}

	/*
	 * 関数名：getCoordinateX
	 * 概要：x座標を調べる。
	 * 引数：なし
	 * 戻り値：coordinateX … 現在地を示すx座標
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	double getCoordinateX() {
		// x座標を返す。
		return coordinateX;
	}
	
	/*
	 * 関数名：getCoordinateY
	 * 概要：y座標を調べる。
	 * 引数：なし
	 * 戻り値：coordinateY … 現在地を示すy座標
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */ 
	double getCoordinateY() {
		// x座標を返す。
		return coordinateY;
	}
	
	/*
	 * 関数名：getFuel
	 * 概要：現在の残り燃料を調べる。
	 * 引数：なし
	 * 戻り値：remainFuel … 残り燃料の値。
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */ 
	double getFuel() {
		// 残り燃料を返す
		return remainFuel;
	}

	/*
	 * 関数名：putSpec
	 * 概要：車のスペックを表示する(名前、ナンバー、各サイズ、タンク容量、燃費)。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */ 
	void putSpec() {
		// 車の名前の表示をする。
		System.out.println("名前：" + carName);
		// 車のナンバーの表示をする。
		System.out.println("ナンバー：" + carNumber);
		// 車の幅の表示をする。
		System.out.println("幅：" + carWidth);
		// 車の高さの表示をする。
		System.out.println("高さ：" + carHeight);
		// 車の長さの表示をする。
		System.out.println("長さ：" + carLength);
		// 車のタンク容量を表示する。
		System.out.println("タンク容量：" + carTank);
		// 車の燃費の表示をする。
		System.out.println("燃費：" + carCost);
	}

	/*
	 * 関数名：checkMove
	 * 概要：現在の燃料で入力した座標が移動可能な距離かを判断する。
	 * 引数：moveTarget … 移動先とする目標座標
	 * 戻り値：(boolean型の値として)true … 移動可能
	 *         (boolean型の値として)false … 移動不可能
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */ 
	boolean checkMove(double[] moveTarget) {
		// 目標地点までに直線距離をもとめる。
		double distanceTarget = Math.sqrt((moveTarget[0]-coordinateX)*(moveTarget[0]-coordinateX)+(moveTarget[1]-coordinateY)*(moveTarget[1]-coordinateY));
		// 目標地点まで移動できるときの分岐。
		if (remainFuel >= distanceTarget / carCost) {
			// trueを返す。
			return true;
		// 目標地点まで移動できない時の分岐。
		} else {
			// falseを返す。
			return false;
		}
		
	}
	
	/*
	 * 関数名：checkMove
	 * 概要：現在の燃料で入力した座標の移動距離が移動可能な距離かを判断する。
	 * 引数：distanceX … x座標の移動方向
	 *       distanceY … y座標の移動方向
	 * 戻り値：(boolean型の値として)true … 移動可能
	 *         (boolean型の値として)false … 移動不可能
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */ 
	boolean checkMove (double distanceX, double distanceY) {
		// 移動の方向をもとに直線距離を求める
		double distanceTarget = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
		// 目標地点まで移動できるときの分岐。
		if (remainFuel >= distanceTarget / carCost) {
			// trueを返す。
			return true;
		// 目標地点まで移動できない時の分岐。
		} else {
			// falseを返す。
			return false;
		}
	}
	
	/*
	 * 関数名：moveCar
	 * 概要：座標まで移動する。
	 * 引数：moveTarget … 移動先とする目標座標
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */ 
	void moveCar (double[] moveTarget) {
		// 目標地点までに直線距離をもとめる。
		double distanceTarget = Math.sqrt((moveTarget[0]-coordinateX)*(moveTarget[0]-coordinateX)+(moveTarget[1]-coordinateY)*(moveTarget[1]-coordinateY));
		// 目標地点まで移動できるときの分岐。
		if (remainFuel >= distanceTarget / carCost) {
			// 燃料を移動した分だけ減らす。
			remainFuel -= distanceTarget / carCost;
			// x座標を移動した分だけ加える。
			coordinateX = moveTarget[0];
			// x座標を移動した分だけ加える。
			coordinateY = moveTarget[1];
		// 目標地点まで移動できない時の分岐。
		}
	}
	
	/*
	 * 関数名：moveCar
	 * 概要：座標の移動距離の分だけ移動する。
	 * 引数：distanceX … x座標の移動方向
	 *       distanceY … y座標の移動方向
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */ 
	void moveCar (double distanceX, double distanceY) {
		// 移動の方向をもとに直線距離を求める
		double distanceTarget = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
		// 目標距離を移動できるときの分岐。
		if (remainFuel >= distanceTarget / carCost) {
			// 燃料を移動した分だけ減らす。
			remainFuel -= distanceTarget / carCost;
			// x座標を移動した分だけ加える。
			coordinateX += distanceX;
			// x座標を移動した分だけ加える。
			coordinateY += distanceY;
		// 移動できない時の分岐。
		}
	}
	
	/*
	 * 関数名：refuelTank
	 * 概要：給油を行う。
	 * 引数：refuelFuel … 入れようとしている燃料の量
	 * 戻り値：(boolean型の値として)true … 給油可能
	 *         (boolean型の値として)false … 給油不可能
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	boolean refuelTank(double refuelFuel) {
		// 燃料タンクの中に納まる場合
		if (refuelFuel + remainFuel <= carTank) {
			// 追加した燃料の分残り燃料を増やす。
			remainFuel += refuelFuel;
			// trueを返す。
			return true;
		// 燃料タンクを超える場合
		} else {
			// falseを返す。
			return false;
		}
	}
}