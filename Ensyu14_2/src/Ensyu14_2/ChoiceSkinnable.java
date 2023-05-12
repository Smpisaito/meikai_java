// パッケージの宣言
package Ensyu14_2;

/**
 * インターフェース名：ChoiceSkinnable
 * 概要：着せ替え可能インターフェース
 * 作成者：S.Saito
 * 作成日：2023.05.12
 * @author S.Saito
 *
 */
public interface ChoiceSkinnable {
	
	// 黒が0と示すfinal変数
	int COLOR_BLACK = 0;
	// 赤が1と示すfinal変数
	int COLOR_RED = 1;
	// 緑が2と示すfinal変数
	int COLOR_GREEN = 2;
	// 青が0と示すfinal変数
	int COLOR_BLUE = 3;
	// ヒョウ柄が4と示すfinal変数
	int COLOR_LEOPARD = 4;
	
	/**
	 * 関数名：changeSkin
	 * 概要：着せ替えメソッド
	 * 引数：skinNumber 選択した値
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.12
	 */
	void changeSkin (int skinNumber) ;
	
}
