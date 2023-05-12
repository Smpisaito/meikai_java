// パッケージの宣言
package Ensyu13_2;

/*
 * クラス名：RightHighTriangle
 * 概要：直角が右上の直角二等辺三角形
 * 作成者：S.Saito
 * 作成日：2023.05.10
 */
public class RightHighTriangle extends TriangleShape {

	// コンストラクト
	public RightHighTriangle (int triangleLength) {
		// 二等辺の辺の長さをいれる
		super(triangleLength);
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
		return "直角二等辺三角形(二等辺の長さ：" + super.getTriangleLength() + ",直角の位置：右上)";
	}
	
	/*
	 * 関数名：drawShape
	 * 概要：右上が直角の直角二等辺三角形をつくる。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public void drawShape() {
		// 辺の回数だけループする
		for (int firstLoop = 0; firstLoop <  super.getTriangleLength() ;firstLoop++) {
			// 空白を入れるループをする
			for (int secondLoop = 0; secondLoop < firstLoop; secondLoop++) {
				// 空白を入れる。
				System.out.print(' ');
			}
			// アスタリスクを入れるループをする
			for (int thirdLoop =  super.getTriangleLength(); thirdLoop > firstLoop; thirdLoop--) {
				// アステリスクを入れる。
				System.out.print('*');
			}
			// 改行する
			System.out.println();
		}

	}

}
