// パッケージの宣言
package Ensyu13_2;

/*
* クラス名：PointClass
* 概要：点を示すクラス
* 作成者：S.Saito
* 作成日：2023.05.10
*/
public class PointClass extends ShapeClass {
	
	// コンストラクタ
	public PointClass () {	}
	
	/*
	 * 関数名：toString
	 * 概要：Pointと返す
	 * 引数：なし
	 * 戻り値：(文字列)"点" … 点の図形だとわかる名前の文字列を返す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public String toString() {
		// 文字列を返す。
		return "点";
	}
	
	/*
	 * 関数名：drawShape
	 * 概要：点の描写をする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public void drawShape() {
		// 点の描写をする。
		System.out.println('+');
	}
	
}
