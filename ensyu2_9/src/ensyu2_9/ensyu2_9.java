
// パッケージの宣言
package ensyu2_9;

// 乱数を生成するときにクラス宣言の前に置く。
import java.util.Random;

/*
 * クラス名：ensyu2_9
 * 概要：演習2-9クラス
 * 作成者：S.Saito
 * 作成日：2023.04.06
 */
public class ensyu2_9 {
	
	/*
	 * 関数名：main
	 * 概要：0.0以上1.0未満、0.0以上10.0未満、-1.0以上1.0未満の実数値を
	 * 　　　それぞれランダムに生成して表示する。、
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args){
		
		// mainの中で乱数の生成を行うコードより前に置く
		Random RandomNumber = new Random();
		
		// 実数値の変数FirstRandomの初期値に0.0以上1.0未満の乱数を入れる。
		double FirstRandom = RandomNumber.nextDouble(1.0);
		// FirstRandomの値を表示する。
		System.out.println("0.0以上1.0未満の乱数：" + FirstRandom );
		
		//　実数値の変数SecondRandomの初期値に0.0以上10.0未満の乱数を入れる。
		double SecondRandom = RandomNumber.nextDouble(10.0);
		// SecondNumberの値を表示する。
		System.out.println("0.0以上10.0未満の乱数：" + SecondRandom );
		
		// 実数値の変数ThirdRandomの初期値に0.0以上2.0未満の乱数を入れる。
		double ThirdRandom = RandomNumber.nextDouble(2.0);
		// ThirdRandomの値に1減じた値を表示する。
		System.out.println("-1.0以上1.0未満の乱数：" + ( ThirdRandom - 1) );
	
	}

}
