// パッケージの宣言
package Ensyu14_1;

/**
 * クラス名：PointClass<Br>
 * 概要：点を示すクラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.10<Br>
 * @author S.Saito
 *
 */
public class PointClass extends ShapeClass {
	
	// コンストラクタ
	public PointClass () {	}
	
	/**
	 * 関数名：toString<Br>
	 * 概要：Pointと返す<Br>
	 * 引数：なし<Br>
	 * 戻り値：returnString … 点の図形だとわかる名前の文字列を返す。<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10<Br>
	 * @return returnString … 点の図形だとわかる名前の文字列を返す。
	 */
	public String toString() {
		// 点の図形だとわかる名前の文字列
		String returnString = "点";
		// 文字列を返す。
		return returnString;
	}
	
	/**
	 * 関数名：drawShape<Br>
	 * 概要：点の描写をする<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10<Br>
	 */
	public void drawShape() {
		// 点の描写をする。
		System.out.println('+');
	}
	
}
