// パッケージの宣言
package Ensyu14_1;

/**
 * クラス名：RectangleShape<Br>
 * 概要：長方形クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.10
 * @author S.Saito
 *
 */
public class RectangleShape extends ShapeClass implements Plane2D {

	// フィールド
	// 幅の長さ
	private int widthLength;
	// 高さの長さ
	private int heightLength;
	
	
	/**
	 * コンストラクタ
	 * @param widthLength … 長方形の幅
	 * @param heightLength … 長方形の高さ
	 */
	public RectangleShape(int widthLength,int heightLength) {
		// 幅の値を入れる。
		this.widthLength = widthLength;
		// 高さの値を入れる。
		this.heightLength = heightLength;
	}
	
	/**
	 * コンストラクタ
	 * @param copyRectangle コピー元の長方形クラス
	 */
	public RectangleShape (RectangleShape copyRectangle) {
		// コピーをつくる。
		this(copyRectangle.widthLength, copyRectangle.heightLength);
	}
	
	/**
	 * 関数名：toString<Br>
	 * 概要：長方形の幅と高さを示す文字列を返す。<Br>
	 * 引数：なし<Br>
	 * 戻り値：(文字列)"長方形(幅：" + widthLength + ",高さ：" + heightLength + ")" … 長方形の幅と高さを示す文字列<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 * @return rectangleString … 長方形の幅と高さを示す文字列
	 */
	public String toString() {
		// 長方形の幅と高さを示す文字列
		String rectangleString = "長方形(幅：" + widthLength + ",高さ：" + heightLength + ")";
		// 長方形の幅と高さを示す文字列を返す。
		return rectangleString;
	}

	/**
	 * 関数名：drawShape<Br>
	 * 概要：長方形を表示する。<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 */
	public void drawShape() {
		// 高さの分だけ繰り返すループ
		for (int firstLoop = 0; firstLoop < heightLength; firstLoop++) {
			// 幅の分だけ繰り返すループ
			for (int secondLoop = 0; secondLoop < widthLength; secondLoop++) {
				// アステリスクを表示する。
				System.out.print('*');
			}
			// 改行する
			System.out.println();
		}
	}
	
	/**
	 * 関数名：getArea<Br>
	 * 概要：面積を求めるメソッド。<Br>
	 * 引数：なし<Br>
	 * 戻り値：areaNumber … 面積の値<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @return areaNumber … 面積の値
	 */
	public int getArea () {
		// 幅×高さで面積を求める。
		int areaNumber = widthLength * heightLength;
		// 面積を返す
		return areaNumber;
	};

}

