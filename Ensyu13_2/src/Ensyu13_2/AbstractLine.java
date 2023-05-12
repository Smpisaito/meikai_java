// パッケージの宣言
package Ensyu13_2;

/*
 * クラス名 AbstractLine
 * 概要：直線の抽象クラス
 * 作成者：S.Saito
 * 作成日：2023.05.10
 */
public abstract class AbstractLine extends ShapeClass {
	// フィールドの設定
	// 直線の長さ
	private int lineLength;
	
	// コンストラクタ
	public AbstractLine(int lineLength) {
		// 直線の長さを入れる。
		setLength(lineLength);
	}

	// ゲッタ
	/*
	 * 関数名：getLength
	 * 概要：直線の長さを取得する。
	 * 引数：なし
	 * 戻り値：lineLength
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */ 
	public int getLength() {
		// 直線の長さを返す。
		return lineLength;
	}
	
	// セッタ
	/*
	 * 関数名：setLength
	 * 概要：直線の長さを設定する。
	 * 引数：lineLength
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */ 
	public void setLength(int lineLength) {
		// 直線mんの長さを入れる
		this.lineLength = lineLength;
	}
	
	/*
	 * 関数名：toString
	 * 概要：直線の長さを示す文字列を返す。
	 * 引数：なし
	 * 戻り値：(文字列)"直線の長さ(" + lineLength + ")" … 直線の長さを示す文字列。
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public String toString() {
		// 直線の長さを示す文字列を返す。
		return "直線の長さ(" + lineLength + ")"	;
	}
}
