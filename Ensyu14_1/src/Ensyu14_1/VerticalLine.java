// パッケージの宣言
package Ensyu14_1;

/**
 * クラス名：VerticalLine<Br>
 * 概要：垂直直線クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.10
 * @author S.Saito
 *
 */
public class VerticalLine extends AbstractLine {

	/**
	 * コンストラクタ
	 * @param verticalLength … 垂直直線の長さ
	 */
	public VerticalLine (int verticalLength) {
		// 垂直直線の長さを入れる。
		super(verticalLength);
	}
	
	/**
	 * 関数名：toString<Br>
	 * 概要：垂直直線の長さを示す文字列を返す。<Br>
	 * 引数：なし<Br>
	 * 戻り値：lengthString … 直線の長さを示す文字列<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 * @return lengthString … 直線の長さを示す文字列
	 */
	public String toString () {
		// 直線の長さを示す文字列
		String lengthString = "垂直直線の長さ(" + super.getLength() + ")"	;
		// 垂直直線の長さを示す文字列を返す。
		return lengthString	;
	}
	
	/**
	 * 関数名：drawShape<Br>
	 * 概要：垂直直線を表示する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
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