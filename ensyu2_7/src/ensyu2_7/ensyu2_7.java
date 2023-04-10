// 	パッケージの宣言
package ensyu2_7;

// 値として乱数を用いるとき、クラスの宣言の前に置く。
import java.util.Random;

/*
 * クラス名：ensyu2_7
 * 概要：演習2-7クラス
 * 作成者：S.Saito
 * 作成日：2023.04.06
 */
public class ensyu2_7 {
	
	/*
	 * 関数名：main
	 * 概要：一桁の正の整数値(1～9)、一桁の負の整数値(-9～-1)、二桁の正の整数値(10～99)
	 *       をそれぞれランダムに生成する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		
		// 乱数を用いる時にmainの最初に置く。
		Random randomNumber = new Random();
		
		
		// 整数値の変数FirstRandomに0以上8以下でランダムに初期値を決める。
		int FirstRandom = randomNumber.nextInt(9);
		// 1以上9以下の整数値として、FirstRandomに1加えた値を表示する。
		System.out.println("一桁の正の整数値でランダムに生成：" + (FirstRandom + 1));
		
		
		// 整数値の変数SecondRandomに0以上8以下でランダムに初期値を決める
		int SecondRandom = randomNumber.nextInt(9);
		// -9以上-1以下の整数値として、SecondRandomに1加えた値にさらに-1をかけた値を表示する。
		System.out.println("一桁の負の整数値でランダムに生成：" + (SecondRandom + 1)*-1);
		
		
		// 整数値の変数ThirdRandomに0以上89以下でランダムに初期値を決める。
		int ThirdRandom = randomNumber.nextInt(90);
		// 10以上99以下の整数値として、ThirdRandomに10加えた値を表示する。
		System.out.println("二桁の正の整数値でランダムに生成：" + (ThirdRandom + 10));
		
	}

}
