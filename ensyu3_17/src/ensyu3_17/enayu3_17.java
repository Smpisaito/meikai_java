// パッケージの宣言
package ensyu3_17;

// 乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;

/*
 * クラス名：ensyu3_17
 * 概要：演習3-17クラス
 * 作成者：S.Saito
 * 作成日：2023.04.07
 */
public class enayu3_17 {
	
	/*
	 * 関数名：main
	 * 概要：0～2の乱数を発生し、0であれば「グー」、1であれば「チョキ」、2であれば「パー」を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		// main内で乱数を使うコードよりも前に置く。
		Random RandomNumber = new Random();
		
		// 0,1,2の中からランダムに一つ生成して当てはめる。
		int FirstRandom = RandomNumber.nextInt(3);
		
		// ランダムに生成した数字を参照する。
		switch(FirstRandom){
			// ランダムに生成した数字が0の時は「グー」と表示する。
			case 0 : System.out.println("グー"); break;
			// ランダムに生成した数字が0の時は「チョキ」と表示する
			case 1 : System.out.println("チョキ"); break;
			// ランダムに生成した数字が0の時は「パー」と表示する。
			case 2 : System.out.println("パー"); break;
		}
	}

}
