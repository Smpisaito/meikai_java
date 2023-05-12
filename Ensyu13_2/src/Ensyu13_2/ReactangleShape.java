// パッケージの宣言
package Ensyu13_2;

/*
 * クラス名：RectangleShape
 * 概要：長方形クラス
 * 作成者：S.Saito
 * 作成日：2023.05.10
 */
public class ReactangleShape extends ShapeClass {

	// フィールド
	// 幅の長さ
	private int widthLength;
	// 高さの長さ
	private int heightLength;
	
	// コンストラクタ
	public ReactangleShape(int widthLength,int heightLength) {
		// 幅の値を入れる。
		this.widthLength = widthLength;
		// 高さの値を入れる。
		this.heightLength = heightLength;
	}
	
	/*
	 * 関数名：toString
	 * 概要：長方形の幅と高さを示す文字列を返す。
	 * 引数：なし
	 * 戻り値：(文字列)"長方形(幅：" + widthLength + ",高さ：" + heightLength + ")" … 長方形の幅と高さを示す文字列
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public String toString() {
		// 長方形の幅と高さを示す文字列を返す。
		return "長方形(幅：" + widthLength + ",高さ：" + heightLength + ")";
	}

	/*
	 * 関数名：drawShape
	 * 概要：長方形を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
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

}