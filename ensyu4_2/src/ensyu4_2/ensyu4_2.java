// パッケージの宣言
package ensyu4_2;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：ensyu4_2
 * 概要：演習4-2クラス
 * 作成者：S.Saito
 * 作成日：2023.04.10
 */
public class ensyu4_2 {
	
	/*
	 * 関数名：main
	 * 概要：二桁の整数値(10～99)の乱数で決められた値を当てる「数当てゲーム」を行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.10
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);

		// 乱数を入力する際に、main内で入力操作を行うコードより前に置く
		Random RandomNumber = new Random();
		
		// ゲームにおける目標となる値を乱数で決める。
		int GameNumber = RandomNumber.nextInt(90)+10;
		
		// 数当てゲームを開始することを表示する。
		System.out.println("数当てゲームを開始します！");
		// 目標となる値が10～99であることを記載する。
		System.out.println("10～99から当ててください。\n");
		
		// 推測した値を入れる変数をつくる。
		int CheckNumber;
		
		// 間違っている間は繰り返すループをつくる。
		do {
			// 推測した値を入力することを表示する。
			System.out.print("予想する値を入力してください：");
			// 推測した値を入力する。
			CheckNumber = StandardInput.nextInt();
			
			// 入力した値が目標となる値よりも大きい場合の分岐。
			if ( CheckNumber > GameNumber )
				// 目標となる値はもっと小さいことを示す。
				System.out.println("もっと小さい値です。\n");
			// 入力した値が目標となる値よりも小さい場合の分岐。
			else if ( CheckNumber < GameNumber )
				// 目標となる値はもっと大きいことを示す。
				System.out.println("もっと大きい値です。\n");
			
		// 間違っているときは繰り返しを行う。
		} while ( CheckNumber != GameNumber );
		
		// 正解であることを示す。
		System.out.println("正解です。");
		
	}

}
