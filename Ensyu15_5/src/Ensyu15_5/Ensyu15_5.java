// パッケージの宣言
package Ensyu15_5;

/**
 * クラス名：Ensyu15_5<Br>
 * 概要：演習15-5クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.15
 * @author S.Saito
 *
 */
public class Ensyu15_5 {
	
	/**
	 * 関数名：main<Br>
	 * 概要：3人で行うじゃんけんプログラム。プレーヤーのうち2人はコンピュータで行う。<Br>
	 * 引数：args … コマンドライン引数<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.15
	 * @param args … コマンドライン引数
	 */
	public static void main(String[] args){
		
		// 三人でのじゃんけんを行うこと説明する。
		System.out.println("3人でのじゃんけんを行います。");
		// 対戦相手はコンピュータが行うこと説明する。
		System.out.println("対戦相手はどちらもコンピュータとなります。");
		
		// 3人で固定する。
		// プレーヤクラスの配列をつくる。
		RockPaperScissorsPlayer[] newPlayers = {
				// 人間のプレイヤー
				new HumanPlayer(),
				// コンピュータのプレイヤー一人目
				new ComputerPlayer(),
				// コンピュータのプレイヤー二人目
				new ComputerPlayer()
		};
		// 配列内で勝者を決める。
		int resultNumber = RockPaperScissorsPlayer.matchHands(newPlayers);
		
		// 勝ったのが自分の場合の分岐
		if (resultNumber == 0) {
			// 勝ったことを伝える。
			System.out.println("おめでとうございます。あなたの勝ちです。");
		// 負けた場合の分岐
		} else {
			// 負けたことを伝える。
			System.out.println("あなたは負けました。お疲れさまでした。");
		}
		
	}

}
