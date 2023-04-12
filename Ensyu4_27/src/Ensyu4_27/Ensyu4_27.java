// パッケージの宣言
package Ensyu4_27;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;
//入力操作を行うときにクラスの宣言の前に置く。
import java.util.Scanner;

/*
 * クラス名：Ensyu4_27
 * 概要：演習4-27クラス
 * 作成者：S.Saito
 * 作成日：2023.04.12
 */
public class Ensyu4_27 {
	
	/*
	 * 関数名：main
	 * 概要：0～99から数字を当てる数当てゲーム。入力回数の制限内に当てられなかったら正解を表示して終了する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.12
	 */
	public static void main(String[] args){
		
		// 入力をキーボードに指定する。main内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);

		// 乱数を入力する際に、main内で入力操作を行うコードより前に置く
		Random randomNumber = new Random();
		
		// 数当てゲームを行うことを表示する。
		System.out.println("数当てゲームを開始します！");
		// 説明との間をあけるための改行。
		System.out.println("");
		// 答えとなる数が0～99までであることを示すように表示する。
		System.out.println("答えとなる値は0～99になります。");
		// 解答の入力は合計で10回であることを表示する。
		System.out.println("答えの入力は10回まで行えます。");
		// 間違えた時に答えが入力した値より高いか低いかがわかることを表示する。
		System.out.println("間違えた時、答えが入力した値より高いか低いかを知ることができます。");
		// 説明との間をあけるための改行。
		System.out.println("");
		
		// 答えとなる値を0～99の中からランダムに入れる。
		int targetNumber = randomNumber.nextInt(100);
		
		// 入力値を入れる変数をつくる。初期値は0～99ではない値として1000にする。
		int checkNumber = 1000;
		
		// 回答の入力を10回まで行うループをつくる。
		for ( int countNumber = 1; countNumber <= 10; countNumber++) {
			// 前回回答していた場合ヒントが与えられる分岐。
			if ( checkNumber >= 100 || checkNumber < 0 ) {
				System.out.println("答えは0～99ののうちのどれかですよ。");
			} else if ( checkNumber > targetNumber ) {
				System.out.println("答えはもっと小さい値です。");
			} else {
				System.out.println("答えはもっと大きい値です。");
			}
			
			// 答えだと思う値を入力する。
			System.out.print("予想する値：");
			// 値を入力する。
			checkNumber = standardInput.nextInt();
			
			// 正答だった場合の分岐。
			if ( checkNumber == targetNumber ) {
				// ループを終了する
				break;
			}
		}
		
		// 回答と結果の間の改行。
		System.out.println("");
		// 正答だった場合の分岐。
		if ( checkNumber == targetNumber ) {
			// 正解であることを示すような表示をする。
			System.out.println("正解です！おめでとうございます！");
		// 正答を出せなかった場合の分岐。
		} else {
			// 正解が何だったかを表示する。
			System.out.println("正解の値は" + targetNumber + "でした。");
		}
		// ゲームの終了を告げる。
		System.out.println("ゲームを終了します。");
		
	}

}

