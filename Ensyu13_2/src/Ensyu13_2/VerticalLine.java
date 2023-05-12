// パッケージの宣言
package Ensyu13_2;

/*
 * クラス名：VerticalLine
 * 概要：垂直直線クラス
 * 作成者：S.Saito
 * 作成日：2023.05.10
 */
public class VerticalLine extends AbstractLine {

	// コンストラクタ
	public VerticalLine (int verticalLength) {
		// 垂直直線の長さを入れる。
		super(verticalLength);
	}
	
	/*
	 * 関数名：toString
	 * 概要：垂直直線の長さを示す文字列を返す。
	 * 引数：なし
	 * 戻り値：(文字列)"垂直直線の長さ(" + super.getLength() + ")" … 垂直直線の長さを示す文字列
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public String toString () {
		// 垂直直線の長さを示す文字列を返す。
		return 	"垂直直線の長さ(" + super.getLength() + ")";
	}
	
	/*
	 * 関数名：drawShape
	 * 概要：垂直直線を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public void drawShape() {
		// 長さの分だけループする。
		for (int loopNumber = 1; loopNumber <= getLength(); loopNumber++) {
			// 直線を表示する。
			System.out.println('|');
		}
	}

}