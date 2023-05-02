// パッケージの宣言
package Ensyu10_1;

/*
 * クラス名：Ensyu10_1
 * 概要：演習10-1クラス
 * 作成者：S.Saito
 * 作成日：2023.05.02
 */
public class Ensyu10_1 {
	
	/*
	 * 関数名：main
	 * 概要：クラスIdのインスタンスを複数個つくり、最後の識別番号を表示するゲッタの動作を確認する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.02
	 */
	public static void main(String[] args){
	
		// クラスIdのインスタンスを4個つくる。
		Id[] instanceCheck = new Id[] {
			// 一つ目のインスタンス
			new Id(),
			// 二つ目のインスタンス
			new Id(),
			// 三つ目のインスタンス
			new Id(),
			// 四つ目のインスタンス
			new Id(),
		};
		
		// 作ったインスタンスの数だけループする。
		for (int loopNumber = 0; loopNumber < instanceCheck.length; loopNumber++) {
			// 作ったインスタンスそれそれの識別番号を表示する。
			System.out.println(loopNumber + 1 + "個めのインスタンスの識別番号" + instanceCheck[loopNumber].getId());
		}
		
		// 改行する。
		System.out.println();
		
		// 最後の識別番号を表示し、ループの表示と一致することを確認する
		System.out.println("最後の識別番号は" + Id.getMaxId());
	}
	
}
