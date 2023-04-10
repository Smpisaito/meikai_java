// パッケージの宣言
package ensyu4_4;

//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：emsyu4_4
 * 概要：演習4-4クラス
 * 作成者：S.Saito
 * 作成日：2023.04.10
 */
public class ensyu4_4 {
	
	/*
	 * 関数名：main
	 * 概要：入力した正の値から0までをカウントダウンする[明解Java List4-4]において
	 *       while文終了時に変数xの値が-1になることを確認する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.10
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner StandardInput = new Scanner(System.in);
		
		// 後にカウントダウンを行うことを表示する。
		System.out.println("カウントダウンします。");
	
		// 確認に用いる変数xをつくる。
		int x;
		
		// xに正の整数以外が入力されないようにループにかける。
		do {
			
			// 正の整数値を入れることを示す。
			System.out.print("正の整数値：");
			// 変数xにカウントしたい正の整数値を入れる。
			x = StandardInput.nextInt();
			
		// もし正の整数以外(0、負の整数値)が変数xに入っていた場合はループする。
		} while ( x <= 0 );
		
		// xに入力した値から0までのカウントダウンが終わるまでループする。
		while ( x >= 0 ) {
			
			// 変数xの値を表示する。
			System.out.println(x);
			// 変数xの値-1する。
			x--;
			
		}
		
		// 変数xの値が-1であることを確認する。
		System.out.println("\nwhile文終了後の変数xの値：" + x );
		
	}

}
