// パッケージの宣言
package Ensyu14_1;

/**
 * クラス名 AbstractLine<Br>
 * 概要：直線の抽象クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.10
 * @author S.Saito
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
	/**
	 * 関数名：getLength<Br>
	 * 概要：直線の長さを取得する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：lineLength … 直線の長さ<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 * @return lineLength … 直線の長さ
	 */
	public int getLength() {
		// 直線の長さを返す。
		return lineLength;
	}
	
	// セッタ
	/**
	 * 関数名：setLength<Br>
	 * 概要：直線の長さを設定する。<Br>
	 * 引数：lineLength … 直線の長さ<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 * @param lineLength … 直線の長さ
	 */
	public void setLength(int lineLength) {
		// 直線mんの長さを入れる
		this.lineLength = lineLength;
	}
	
	/**
	 * 関数名：toString<Br>
	 * 概要：直線の長さを示す文字列を返す。<Br>
	 * 引数：なし<Br>
	 * 戻り値：lengthString … 直線の長さを示す文字列<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 * @return lengthString … 直線の長さを示す文字列
	 */
	public String toString() {
		// 直線の長さを示す文字列
		String lengthString = "直線の長さ(" + lineLength + ")"	;
		// 直線の長さを示す文字列を返す。
		return lengthString;
	}
}

