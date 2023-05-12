// パッケージの宣言
package Ensyu13_2;

/*
 * クラス名：TriangleShape
 * 概要：直角二等辺三角形メソッド。
 * 作成者：S.Saito
 * 作成日：2023.05.10
 */
public abstract class TriangleShape extends ShapeClass {

	// フィールド
	// 二等辺の辺の長さ
	private int triangleLength;
	
	// コンストラクト
	public TriangleShape (int triangleLength) {
		// 二等辺の辺の長さをいれる
		setTriangleLength (triangleLength);
	}
	
	// ゲッタ
	/*
	 * 関数名：getTriangleLength
	 * 概要：二等辺の辺の長さを返す。
	 * 引数：なし
	 * 戻り値：triangleLength … 二等辺三角形の二等辺の長さ。
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public int getTriangleLength () {
		// 二等辺の辺の長さを返す。
		return triangleLength;
	}
	
	// セッタ
	/*
	 * 関数名：setTriangleLength
	 * 概要：二等辺の辺の長さを返す。
	 * 引数：なし
	 * 戻り値：triangleLength … 二等辺三角形の二等辺の長さ。
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public void setTriangleLength (int triangleLength) {
		// 二等辺の辺の長さを入れる。
		this.triangleLength = triangleLength;
	}
	
	/*
	 * 関数名：toString
	 * 概要：直角二等辺三角形の二等辺の長さの文字列を返す。
	 * 引数：なし
	 * 戻り値：(文字列) "直角二等辺三角形の二等辺の長さ(" + triangleLength + ")" … 直角二等辺三角形の二等辺の長さの文字列
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public String toString() {
		// 直角二等辺三角形の二等辺の長さの文字列を返す。
		return "直角二等辺三角形の二等辺の長さ(" + triangleLength + ")";
	}

}
