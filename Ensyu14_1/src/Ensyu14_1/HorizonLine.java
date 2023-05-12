// パッケージの宣言
package Ensyu14_1;

/**
 * クラス名：HorizonLine<Br>
 * 概要：水平直線クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.10
 * @author S.Saito
 *
 */
public class HorizonLine extends AbstractLine {

	/**
	 * コンストラクタ
	 * @param holizonLength … 水平直線の長さ
	 */
	public HorizonLine(int holizonLength) {
		// 水平直線の長さを入れる。
		super(holizonLength);
	}
	
	/**
	 * 関数名：toString<Br>
	 * 概要：水平直線の長さを示す文字列を返す。<Br>
	 * 引数：なし<Br>
	 * 戻り値：lengthString … 直線の長さを示す文字列<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 * @return lengthString … 直線の長さを示す文字列
	 */
	public String toString() {
		// 直線の長さを示す文字列
		String lengthString = "水平直線の長さ(" + super.getLength() + ")"	;
		// 水平直線の長さを示す文字列を返す。
		return lengthString	;
	}
	
	/**
	 * 関数名：drawShape<Br>
	 * 概要：水平直線を表示する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 */
	public void drawShape() {
		// 長さの分だけループする。
		for (int loopNumber = 1; loopNumber <= getLength(); loopNumber++) {
			// 直線を表示する。
			System.out.print('-');
		}
		// 改行する。
		System.out.println();
	}
}

