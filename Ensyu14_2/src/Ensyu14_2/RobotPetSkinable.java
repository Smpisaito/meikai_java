// パッケージの宣言
package Ensyu14_2;

/**
 * クラス名：RobotPetSkinable<Br>
 * 概要：着せ替え可能なロボットペットクラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.12
 */
public class RobotPetSkinable extends RobotPet implements PlayKey, ChoiceSkinnable {
	
	// フィールド
	private int robotSkin = COLOR_BLACK;

	// コンストラクタ
	public RobotPetSkinable (String RobotPetName,String MasterName) {
		// 上位クラスのコンストラクタを呼び出す。
		super(RobotPetName,MasterName);
	}

	/**
	 * 関数名：changeSkin<Br>
	 * 概要：スキンを変える<Br>
	 * 引数：skinNumber スキンの色の選択<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @param skinNumber スキンの色の選択
	 * @Override 
	 */
	public void changeSkin(int skinNumber) {
		// 文字列での表示
		System.out.print("スキンを");
		// 選択肢で分岐する。
		switch (skinNumber) {
			// 黒の場合の分岐
			case COLOR_BLACK:
				// 黒色になる
				System.out.print("黒色");
			// 赤の場合の分岐
			case COLOR_RED:
				// 赤色になる
				System.out.print("赤色");
			// 緑の場合の分岐
			case COLOR_GREEN:
				// 緑色になる
				System.out.print("緑色");
			// 青の場合の分岐
			case COLOR_BLUE:
				// 青色になる
				System.out.print("青色");
			// 豹柄の場合の分岐
			case COLOR_LEOPARD:
				// 豹柄になる
				System.out.print("豹柄");
				
		}
		// 変更したことを示す表示。
		System.out.println("に変更しました");
	}

	
	/**
	 * 関数名：playStart<Br>
	 * 概要：動作を開始する<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @Override
	 */
	public void playStart() {
		// 動作を開始したことを示す表示をする。
		System.out.println("動作を開始します。");

	}

	
	/**
	 * 関数名：playFinish<Br>
	 * 概要：動作を終了する<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @Override
	 */
	public void playFinish() {
		// 動作を終えたことを示す表示をする。
		System.out.println("動作を終了します。");

	}

}
