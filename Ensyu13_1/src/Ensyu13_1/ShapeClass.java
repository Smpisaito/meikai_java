// パッケ\\ージの宣言
package Ensyu13_1;

/*
 * クラス名：ShapeClass
 * 概要：図形クラス。図形の概念を示す抽象クラスである。
 * 作成者：S.Saito
 * 作成日：2023.05.10
 */
public abstract class ShapeClass {
	
	/*
	 * 関数名：toString()
	 * 概要：toStringの抽象メソッド
	 * 引数：なし
	 * 戻り値：String型
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public abstract String toString() ;
	
	/*
	 * 関数名：drawShape 
	 * 概要：図形情報の抽象メソッド
	 * 引数：なし
	 * 戻り値：	なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public abstract void drawShape ();
	
	/*
	 * 関数名：printShape
	 * 概要：図形情報の抽象とtoStringの情報の公開を行う。
	 * 引数：なし
	 * 戻り値：	なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public void printShape() {
		// toStringの文章を表示する。
		System.out.println(toString());
		// 図形の描写をする。
		drawShape();
	}
}