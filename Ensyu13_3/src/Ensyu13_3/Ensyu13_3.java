// パッケージの宣言
package Ensyu13_3;

import java.util.Scanner;

/*
* クラス名：Ensyu13_3
* 概要：演習13-3クラス
* 作成者：S.Saito
* 作成日：2023.05.11
*/
public class Ensyu13_3 {
	
	/*
	 * 関数名：inputInteger
	 * 概要：整数値の入力を求め、その値を返却する。
	 * 引数：なし
	 * 戻り値：integerNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int inputInteger() {
		// 入力をキーボードに指定する。関数内で入力操作を行うコードより前に置く。
		Scanner standardInput = new Scanner(System.in);
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 整数値の入力を行う。
		integerNumber = standardInput.nextInt();
		// 入力した値を返す。
		return integerNumber;
	}

	/*
	 * 関数名：inputInteger
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求め、その値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 * 戻り値：integerNumber … 整数値として返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.26
	 */
	static int inputInteger(String outputWord) {
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 「(引数の文字列)：」と表示する。
		System.out.print(outputWord + "：");
		// 整数値の入力を行う。
		integerNumber = inputInteger();
		// 入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：inputRange
	 * 概要：「(引数の文字)：」と表示し、その後に整数値の入力を求める。最小値となる引数の値以上の整数値が入れられるまでループし、最終的な値を返却する。
	 * 引数：outputWord … String型の表示に使う文字列。
	 *       lowerNumber … 入力する値の最小値
	 *       higherNumber … 入力する値の最大値
	 * 戻り値：integerNumber … 最小値以上最大値以下の入力した整数値を返却する。
	 * 作成者：S.Saito
	 * 作成日：2023.04.20
	 */
	static int inputRange(String outputWord, int lowerNumber, int higherNumber) {
		
		// 入力を行う変数をつくる。
		int integerNumber = 0;
		// 最小値より大きい値が入力されるまで入力を続けるループ。
		do {
			// 整数値の入力を行う。
			integerNumber = inputInteger(outputWord);
			// 入力範囲の整数値ではないときに分岐する。
			if (integerNumber < lowerNumber || integerNumber > higherNumber) {
				// 正しい整数値を入力するように促す。
				System.out.println(lowerNumber + "以上" + higherNumber + "以下の値を入力してください。");
			}
		// 入力した値が適さないならループする。
		} while( integerNumber < lowerNumber || integerNumber > higherNumber);
		// 最後に入力した値を返す。
		return integerNumber;
	}
	
	/*
	 * 関数名：selectTwo
	 * 概要：1か0を入力し、1ならtrue、0ならfalseを返す。
	 * 引数：outputWord … String型の選択肢の表示に使う文字列。
	 * 戻り値：booleanSelect … 選択によってtrueかfalseを返す。
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 */
	static boolean selectTwo (String outputWord) {
		
		// 選択肢を表示して1か0の値で入力をする。
		int selectNumber = inputRange(outputWord,0,1);
		// 戻り値をつくる。入力が1のときにture、0のときにfalseになる。
		boolean booleanSelect = selectNumber == 1;
		// 戻り値を返す
		return booleanSelect;
	}
	
	/*
	 * 関数名：main
	 * 概要：じゃんけんのプレーヤクラスの動作の確認を行う。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.11
	 */
	public static void main(String[] args){
		
		// 人間プレーヤクラスをつくる。
		RockPaperScissorsPlayer newPlayer = new HumanPlayer();
		// コンピュータプレーヤの一人目をつくる。
		RockPaperScissorsPlayer firstComputer = new ComputerPlayer();
		// コンピュータプレーヤの二人目をつくる。
		RockPaperScissorsPlayer secondComputer = new ComputerPlayer();
		// コンピュータプレーヤクラスの相手とじゃんけんで勝負する。
		newPlayer.WinLose (newPlayer.matchHands(firstComputer,secondComputer));
		
		// 確認用なので3人で固定する。
		// プレーヤクラスの配列をつくる。
		RockPaperScissorsPlayer[] newPlayers = new RockPaperScissorsPlayer[3];
		// プレーヤクラスにそれぞれのプレーヤを入れるループ。
		for (int loopNumber = 0; loopNumber < newPlayers.length; loopNumber++) {
			// プレーヤクラスの選択をする。人間プレーヤを選んだ場合の分岐。
			if (selectTwo ("人間プレーヤ … 1 / コンピュータプレーヤ … 0")) {
				// 人間プレーヤクラスをつくる。
				newPlayers[loopNumber] = new HumanPlayer();
			// コンピュータプレーヤを選んだ場合
			} else {
				// コンピュータプレーヤをつくる。
				newPlayers[loopNumber] = new ComputerPlayer();
			}
		}
		// 配列内で勝者を決める。
		int resultNumber = RockPaperScissorsPlayer.matchHands(newPlayers);
		// 勝者の配列のインデックスを表示する。
		System.out.println("勝ったのはインデックス" + resultNumber + "の人です。");
		
	}
	
}
