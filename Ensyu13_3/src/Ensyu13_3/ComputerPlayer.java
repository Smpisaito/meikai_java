// パッケージの宣言
package Ensyu13_3;

//乱数を用いるときにクラスの宣言の前に置く。
import java.util.Random;

/*
* クラス名：ComputerPlayer
* 概要：コンピュータプレーヤクラス
* 作成者：S.Saito
* 作成日：2023.05.11
*/
public class ComputerPlayer extends RockPaperScissorsPlayer {
	
	/*
	 * 概要：コンストラクタ
	 * 引数：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.11
	 */
	ComputerPlayer() {
		// ランダムに値を決める。
		changeHand();
	}
	
	
	/*
	 * 関数名：changeHand
	 * 概要：手をランダムに変える。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.11
	 */
	@Override
	public void changeHand() {
		// 乱数を入力する際に、関数内で入力操作を行うコードより前に置く
		Random randomNumber = new Random();
		
		// ランダムに0から2の手の値を入れる。
		int randomHand = randomNumber.nextInt(HANDS_NUMBER);
		// ランダムに決めた手の値を入れる。
		super.setHand(randomHand);

	}

}
