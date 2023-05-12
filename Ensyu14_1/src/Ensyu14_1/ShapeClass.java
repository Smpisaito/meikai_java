// パッケージの宣言
package Ensyu14_1;

/**
 * クラス名：ShapeClass<Br>
 * 概要：図形クラス。図形の概念を示す抽象クラスである。<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.10<Br>
 * @author S.Saito
 */
public abstract class ShapeClass {
	
	/**
	 * 関数名：toString()<Br>
	 * 概要：toStringの抽象メソッド<Br>
	 * 引数：なし<Br>
	 * 戻り値：String型<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 */
	public abstract String toString() ;
	
	/**
	 * 関数名：drawShape <Br>
	 * 概要：図形情報の抽象メソッド<Br>
	 * 引数：なし<Br>
	 * 戻り値：	なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 */
	public abstract void drawShape ();
	
	/**
	 * 関数名：printShape<Br>
	 * 概要：図形情報の抽象とtoStringの情報の公開を行う。<Br>
	 * 引数：なし<Br>
	 * 戻り値：	なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.10
	 */
	public void printShape() {
		// toStringの文章を表示する。
		System.out.println(toString());
		// 図形の描写をする。
		drawShape();
	}
}
