// パッケージの宣言
package Ensyu14_3;

/**
 * クラス名：DVDPlayer<Br>
 * 概要：DVDプレイヤークラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.12
 * @author S.Saito
 *
 */
public class DVDPlayer implements ExPlayKey {
	
	
	/**
	 * 関数名：playStart<Br>
	 * 概要：DVDの再生を行う<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @Override
	 */
	public void playStart() {
		// DVDを再生する
		System.out.println("■DVD再生開始！");

	}

	/**
	 * 関数名：playFinish<Br>
	 * 概要：DVDの再生を終了する<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @Override
	 */
	public void playFinish() {
		// DVDの再生を終了する
		System.out.println("■DVD再生終了！");

	}
	
	/**
	 * 関数名：playSlow<Br>
	 * 概要：DVDのスロー再生を開始する<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @Override
	 */
	public void playSlow() {
		// DVDのスロー再生を開始する。
		System.out.println("■DVDスロー再生開始！");

	}

}
