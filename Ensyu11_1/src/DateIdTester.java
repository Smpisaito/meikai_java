import id.DateId;
/*
 * クラス名：DateIdTester
 * 概要：演習11-1において識別番号クラスの動作確認に用いるクラス。
 * 作成者：S.Saito
 * 作成日：2023.05.09
 */
public class DateIdTester {
	
	/*
	 * 関数名：main
	 * 概要：識別番号クラスの動作確認を行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.09
	 */
	public static void main(String[] args){
		
		// 一つ目の識別番号を作る
		DateId firstIdentity = new DateId();
		// 二つ目の識別番号を作る
		DateId secondIdentity = new DateId();
		// 三つ目の識別番号を作る
		DateId thirdIdentity = new DateId();
		
		// 一つ目の識別番号を表示する。
		System.out.println("一つ目の識別番号：" + firstIdentity.getIdentity());
		// 二つ目の識別番号を表示する。
		System.out.println("二つ目の識別番号：" + secondIdentity.getIdentity());
		// 三つ目の識別番号を表示する。
		System.out.println("三つ目の識別番号：" + thirdIdentity.getIdentity());
	}
	

}
