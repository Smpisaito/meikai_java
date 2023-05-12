// パッケージの宣言
package Ensyu13_1;

/*
 * クラス名：HorizonLine
 * 概要：水平直線クラス
 * 作成者：S.Saito
 * 作成日：2023.05.10
 */
public class HorizonLine extends AbstractLine {

	// コンストラクタ
	public HorizonLine(int holizonLength) {
		// 水平直線の長さを入れる。
		super(holizonLength);
	}
	
	/*
	 * 関数名：toString
	 * 概要：水平直線の長さを示す文字列を返す。
	 * 引数：なし
	 * 戻り値：(文字列)"水平直線の長さ(" + super.getLength() + ")" … 水平直線の長さを示す文字列
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public String toString() {
		// 水平直線の長さを示す文字列を返す。
		return "水平直線の長さ(" + super.getLength() + ")"	;
	}
	
	/*
	 * 関数名：drawShape
	 * 概要：水平直線を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
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
