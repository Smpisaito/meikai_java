// パッケージの宣言
package Ensyu10_1;

/*
 * クラス名：Id
 * 概要：連番クラス。クラス名などは[明解Java List10-3]と同じものや指定のものを用いる。
 * 作成者：S.Saito
 * 作成日：2023.05.02
 */
public class Id {

	// 識別番号を何番まで与えたかを示すクラス変数。初期値0でインスタンスの数だけ増えていく。変数名は参考元と同じものを用いる。
	private static int counter = 0;
	// 識別番号をつくる。前回の識別番号に1加えた値になる。変数名は参考元と同じものを用いる。
	private int id;
	
	// コンストラクタ(必要な値なし、クラス変数から識別番号を与える)
	public Id() {
		// 識別番号を入れる。
		id = ++counter;
	}
	
	/*
	 * 関数名：getId
	 * 概要：識別番号を取得するゲッタ。変数名は参考元と同じものを用いる。
	 * 引数：なし
	 * 戻り値：id … インスタンスの識別番号。
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public int getId() {
		// 識別番号を返す
		return id;
	}
	
	/*
	 * 関数名：getMaxId
	 * 概要：最後に与えた識別番号を取得するゲッタ。変数名は参考元と同じものを用いる。
	 * 引数：なし
	 * 戻り値：counter … インスタンスの識別番号を何番まで与えたかを示すクラス変数。最後に与えた識別番号が入る。
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public static int getMaxId() {
		// クラス変数の値を返す
		return counter;
	}
}
