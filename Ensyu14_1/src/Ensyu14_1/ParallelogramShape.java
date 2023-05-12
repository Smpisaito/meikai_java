// パッケージの宣言
package Ensyu14_1;

/**
 * クラス名：ParallelogramShape<Br>
 * 概要：平行四辺形クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.12
 * @author S.Saito
 *
 */
public class ParallelogramShape extends ShapeClass implements Plane2D {

	// フィールド
	/**
	 *  底辺の長さ
	 */
	private int widthLength;
	/**
	 *  高さの長さ
	 */
	private int heightLength;
	
	
	/**
	 * コンストラクタ<Br>
	 * @param widthLength … 底辺の長さ
	 * @param heightLength … 高さの長さ
	 */
	public ParallelogramShape (int widthLength,int heightLength) {
		// 底辺の値を入れる。
		this.widthLength = widthLength;
		// 高さの値を入れる。
		this.heightLength = heightLength;
	}
	
	/**
	 * コンストラクタ<Br>
	 * @param copyRectangle コピー元の平行四辺形クラス
	 */
	public ParallelogramShape (ParallelogramShape copyParallelogram) {
		// コピーをつくる。
		this(copyParallelogram.widthLength, copyParallelogram.heightLength);
	}
	
	/**
	 * 関数名：toString<Br>
	 * 概要：平行四辺形の底辺と高さを示す文字列を返す<Br>
	 * 引数：なし<Br>
	 * 戻り値：parallelogramString … 平行四辺形の底辺と高さを示す文字列<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @return parallelogramString … 平行四辺形の底辺と高さを示す文字列
	 */
	public String toString () {
		// 平行四辺形の底辺と高さを示す文字列をつくる。
		String parallelogramString = "平行四辺形(底辺：" + widthLength + ", 高さ：" + heightLength + ")"; 
		// 文字列を返す。
		return parallelogramString;
	}
	
	/**
	 * 関数名：drawShape <Br>
	 * 概要：平行四辺形を表示する<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 */
	public void drawShape () {
		// 高さの回数だけループする。
		for (int firstLoop = 0; firstLoop < heightLength ; firstLoop++) {
			// 底辺から数えた現在の高さの値-1の回数ループする。
			for (int secondLoop = 1; secondLoop < heightLength - firstLoop; secondLoop++) {
				// 空白を入れる。
				System.out.print(' ');
			}
			// 底辺の長さの分ループする。
			for (int secondLoop = 0; secondLoop < widthLength; secondLoop++) {
				// シャープを表示する。
				System.out.print('#');
			}
			// 改行する。
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
