// パッケージの宣言
package Ensyu14_2;

/**
 * クラス名：Ensyu14_2<Br>
 * 概要：演習14-2クラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.12
 * @author S.Saito
 *
 */
public class Ensyu14_2 {
	
	/**
	 * 関数名：main<Br>
	 * 概要：着せ替え可能なロボットペットクラスの動作確認<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 */
	public static void main(String[] args){
		
		// 簡易のロボットペットのデータを作成する
		RobotPetSkinable defaultPet = new RobotPetSkinable("[ロボットペットの名前]","[ロボットペットの飼い主の名前]");
		
		// 起動操作をする。
		defaultPet.playStart();
		// 自己紹介を行う。
		defaultPet.introduceName ();
		// スキン変更操作の確認をする。青色に変更する。
		defaultPet.changeSkin(4);
		// 家事昨日の確認をする。炊事を選択する。
		defaultPet.householdTask(3);
		// 終了操作を行う。
		defaultPet.playFinish();
	}

}
