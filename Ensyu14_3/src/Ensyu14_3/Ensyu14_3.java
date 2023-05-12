// パッケージの宣言
package Ensyu14_3;

/**
 * クラス名：Ensyu14_3
 * 概要：演習14-3クラス
 * 作成者：S.Saito
 * 作成日：2023.05.12
 */
public class Ensyu14_3 {
	
	/**
	 * 関数名：main
	 * 概要：DVDプレーヤークラスの動作確認
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.12
	 */
	public static void main(String[] args){
		// DVDプレーヤークラスの変数をつくる。
		DVDPlayer newWatch = new DVDPlayer();
		
		// DVDの再生を行う。
		newWatch.playStart();
		// DVDのスロー再生を行う。
		newWatch.playSlow();
		// DVDの再生を終了する。
		newWatch.playFinish();
		
	}

}
