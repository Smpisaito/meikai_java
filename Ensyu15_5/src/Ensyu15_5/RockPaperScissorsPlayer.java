// パッケージの宣言
package Ensyu15_5;

/*
 * クラス名：RockPaperScissorsPlayer
 * 概要：じゃんけんのプレーヤクラス
 * 作成者：S.Saito
 * 作成日：2023.05.11
 */
public abstract class RockPaperScissorsPlayer {
	
	// フィールド
	// 手の種類の3のfinal変数。クラス変数。
	public static final int HANDS_NUMBER = 3;
	// グーが0、チョキが1、パーが2を示すint型。初期値は0(グー)にしておく。
	private int playerHand = 0;
	
	/*
	 * 関数名：matchHands
	 * 概要：じゃんけんを行う。二人の場合。
	 * 引数：firstHand … 前者の手
	 *       secondHand … 後者の手
	 * 戻り値：resultNumber … 結果を示す。あいこで0、1で前者の勝ち、-1で後者の勝ちを示す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.11
	 */
	private static int matchHands(int firstHand,int secondHand) {
		// じゃんけんの勝敗を示す戻り値をつくる。初期値は0(あいこ)にする。
		int resultNumber = 0;
		
		// もし前者が勝っていた場合
		if (firstHand - secondHand == -1 || firstHand - secondHand ==2) {
			// 戻り値を1に変える
			resultNumber = 1;
		// あいこでもない、後者が勝っていた場合
		} else if (firstHand - secondHand != 0) {
			// 戻り値を-1に変える。
			resultNumber = -1;
		}
		// 戻り値を返す。
		return resultNumber;
	}
	
	/*
	 * 関数名：matchHands
	 * 概要：じゃんけんを行う。配列を用いた複数人の場合。
	 * 引数：playerAllay[] … プレーヤの配列
	 * 戻り値：resultNumber … 勝った人の配列のインデックス
	 * 作成者：S.Saito
	 * 作成日：2023.05.11
	 */
	public static int matchHands(RockPaperScissorsPlayer[] playerAllay) {
		// じゃんけんを勝った人のインデックスを入れる戻り値をつくる。初期値はインデックスにはない-1にする。
		int resultNumber = -1;
		// じゃんけんで出したグーチョキパーそれぞれの手の数を示す配列をつくる。
		int[] handsArray = new int[HANDS_NUMBER];
		// 負けた人の数を数える変数をつくる。初期値は0とする。
		int loserCounter = 0;
		
		// 勝者が決まるまでループする
		while (resultNumber == -1) {
			
			// プレーヤの配列の全てで行うループ
			for (int loopNumber = 0; loopNumber < playerAllay.length; loopNumber++) {
				// 配列の残っている人のみ参照する。
				if (playerAllay[loopNumber].getHand() >= 0) {
					// 配列の値をインデックスとする値を+1する。
					handsArray[playerAllay[loopNumber].getHand()]++;
				}
			}
			
			// 手の確認をするための変数をつくる。初期値は-1とする。
			int checkNumber = -1;
			// 全ての手を確認するループ
			for (int loopNumber = 0; loopNumber < HANDS_NUMBER; loopNumber++) {
				// 手の数が0つの時の分岐。
				if (handsArray[loopNumber] == 0) {
					// 他に0つの要素が見つかっていない時の分岐
					if (checkNumber == -1) {
						// 変数に選ばれていない手の値を入れる。
						checkNumber = loopNumber;
					// 他に0つの要素が見つかっている場合の分岐
					} else {
						// 変数に-1を戻す。
						checkNumber = -1;
					}
				}
			}
			
			// 一部の勝敗が決まった場合の分岐
			if (checkNumber != -1) {
				// 残った人の手を教える分岐。
				switch (checkNumber) {
				// 0(グーを出した人がいない場合)の分岐
				case 0:
					// 勝ち残ったのがチョキだと伝える
					System.out.println("チョキの人が勝ち残りました。");
					// 分岐を終える
					break;
				// 1(チョキを出した人がいない場合)の分岐
				case 1:
					// 勝ち残ったのがパーだと伝える
					System.out.println("パーの人が勝ち残りました。");
					// 分岐を終える
					break;
				// 2(パーを出した人がいない場合)の分岐
				case 2:
					// 勝ち残ったのがグーだと伝える
					System.out.println("グーの人が勝ち残りました。");
					// 分岐を終える
					break;
				}
				
				// プレーヤの配列の全てで行うループ
				for (int loopNumber = 0; loopNumber < playerAllay.length; loopNumber++) {
					// 負けた人を参照する。
					if (playerAllay[loopNumber].getHand() == (checkNumber + 2) % 3) {
						// 配列の値をインデックスとする値を+1する。
						playerAllay[loopNumber].setHand(-1);
						// 負けた人の変数を増やす。
						loserCounter++;
					}
				}
			// それ以外、あいこの場合の分岐
			} else {
				// 文字列であいこを伝える。
				System.out.println("あいこです。");
			}
			
			
			// もしも残り一人になった場合の分岐
			if (loserCounter == playerAllay.length - 1) {
				// 全ての配列でループする。
				for (int loopNumber = 0; loopNumber < playerAllay.length; loopNumber++) {
					// 配列で0以上(勝った人)のとき分岐する。
					if (playerAllay[loopNumber].getHand() >= 0) {
						// 勝者のインデックスを入れる
						resultNumber = loopNumber;
					}
				}
			}
			
			// 勝者が決まっていないときの分岐
			if (resultNumber == -1) {
				// 残りの人数を伝える。
				System.out.println("残りの人数は" + (playerAllay.length - loserCounter) + "人です。");
				
				// プレーヤの配列の全てで行うループ
				for (int loopNumber = 0; loopNumber < playerAllay.length; loopNumber++) {
					// 配列の残っている人のみ参照する。
					if (playerAllay[loopNumber].getHand() >= 0) {
						// 人間プレーヤクラスの場合の分岐
						if (playerAllay[loopNumber] instanceof HumanPlayer) {
							// 配列の手を変える。
							((HumanPlayer)playerAllay[loopNumber]).changeHand();
						// コンピュータプレーヤクラスの場合の分岐
						} else {
							// 配列の手を変える。
							((ComputerPlayer)playerAllay[loopNumber]).changeHand();
						}
					}
				}
				// 全ての手を確認するループ
				for (int loopNumber = 0; loopNumber < HANDS_NUMBER; loopNumber++) {
					// 手の数を0に戻す。
					handsArray[loopNumber] = 0;
				}
			}
		}
		// 戻り値を返す。
		return resultNumber;
	}
	
	/*
	 * 関数名：getHand
	 * 概要：出した手の値を返す。
	 * 引数：なし
	 * 戻り値：playerHand … グーが0、チョキが1、パーが2を示す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public int getHand () {
		// 出した手の値を返す。
		return playerHand;
	}
	
	/*
	 * 関数名：setHand
	 * 概要：手を決める場合のセッタ。
	 * 引数：setNumber … 入力する値。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public void setHand(int playerHand) {
		// 引数の値をいれる。
		this.playerHand = playerHand;
	}
	
	/*
	 * 関数名：changeHand
	 * 概要：手を変える場合のセッタ。抽象メソッド
	 * 引数：setNumber … 入力する値。
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public abstract void changeHand();
	
	/*
	 * 関数名：matchHands
	 * 概要：勝敗が決まるまでじゃんけんを行う。二人の場合。
	 * 引数：secondPlayer … 相手になるプレーヤ
	 * 戻り値：resultBoolean … 結果を示す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.11
	 */
	public boolean matchHands(RockPaperScissorsPlayer secondPlayer) {
		// じゃんけんの勝敗を示す戻り値をつくる。初期値はfalse(負け)にする。
		boolean resultBoolean = false;
		
		// じゃんけんがあいこの間はループする。
		while (matchHands(getHand(),secondPlayer.getHand()) == 0) {
			// 文字列であいこを伝える。
			System.out.println("あいこです。");
			// 手を変える。
			changeHand();
			// 相手も手を変える。
			secondPlayer.changeHand();
		}
		
		// もし勝っていた場合の分岐。
		if (matchHands(getHand(),secondPlayer.getHand()) == 1) {
			// 戻り値をtrueに変える。
			resultBoolean = true;
		}
		
		// 戻り値を返す。
		return resultBoolean;
	}
	
	/*
	 * 関数名：matchHands
	 * 概要：勝敗が決まるまでじゃんけんを行う。三人の場合。
	 * 引数： secondPlayer … 相手になるプレーヤ一人目
	 *       thirdPlayer … 相手になるプレーヤ二人目
	 * 戻り値：resultBoolean … 結果を示す。
	 * 作成者：S.Saito
	 * 作成日：2023.05.11
	 */
	public  boolean matchHands(RockPaperScissorsPlayer secondPlayer,RockPaperScissorsPlayer thirdPlayer) {
		// じゃんけんの勝敗を示す戻り値をつくる。初期値はfalse(負け)にする。
		boolean resultBoolean = false;
		
		// じゃんけんがあいこの間はループする。全員の出した手が同じ場合。
		while (matchHands(playerHand,secondPlayer.getHand()) == 0 && matchHands(playerHand,thirdPlayer.getHand()) == 0||
				// あいこの条件の続き。全員の出した手が違う場合。
				(playerHand != secondPlayer.getHand() && playerHand != thirdPlayer.getHand() && secondPlayer.getHand() != thirdPlayer.getHand())) {
			
			// 文字列であいこを伝える。
			System.out.println("あいこです。");
			// 手を変える。
			changeHand();
			// 相手プレーヤ一人目も手を変える。
			secondPlayer.changeHand();
			// 相手プレーヤ二人目も手を変える。
			thirdPlayer.changeHand();
		}
		
		// もしどちらにも勝っていたら戻り値をtrueに変える。
		if (matchHands(getHand(),secondPlayer.getHand()) == 1 && matchHands(getHand(),thirdPlayer.getHand()) == 1) {
			// 戻り値をtrueに変える。
			resultBoolean = true;
		}
		
		// もし一人だけに勝ったら残りの一人と勝負する。
		// 相手の一人目には勝った場合の分岐
		if (matchHands(getHand(),secondPlayer.getHand()) == 1 && matchHands(getHand(),thirdPlayer.getHand()) == 0) {
			// 文字列で一人目の相手に勝ったことを伝える。
			System.out.println("一人目の相手に勝ちました。残りの一人とじゃんけんを続けます。");
			// 手を変える。
			changeHand();
			// 相手プレーヤ一人目も手を変える。
			secondPlayer.changeHand();
			// 相手プレーヤ二人目も手を変える。
			thirdPlayer.changeHand();
			// 勝ったらtrue、負けたらfalseを入れる
			resultBoolean = matchHands(thirdPlayer);
			
		// 相手の二人目には勝った場合の分岐
		} else if (matchHands(getHand(),secondPlayer.getHand()) == 0 && matchHands(getHand(),thirdPlayer.getHand()) == 1) {
			// 文字列で二人目の相手に勝ったことを伝える。
			System.out.println("二人目の相手に勝ちました。残りの一人とじゃんけんを続けます。");
			// 手を変える。
			changeHand();
			// 相手プレーヤ一人目も手を変える。
			secondPlayer.changeHand();
			// 相手プレーヤ二人目も手を変える。
			thirdPlayer.changeHand();
			// 勝ったらtrue、負けたらfalseを入れる
			resultBoolean = matchHands(secondPlayer);
		}
		
		// 戻り値を返す。
		return resultBoolean;
	}
	
	/*
	 * 関数名：WinLose
	 * 概要：引数に合わせて勝ったか負けたかを表示する
	 * 引数：WinLose … 結果を示すboolean型の変数
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.11
	 */
	public void WinLose (boolean WinLose) {
		// 勝った場合の分岐
		if (WinLose) {
			// 文字列で勝ったことを伝える。
			System.out.println("勝ちました。おめでとうございます。");
		} else {
			// 文字列で負けたことを伝える。
			System.out.println("負けました。お疲れ様です。");
		}
		
	}
	
}
