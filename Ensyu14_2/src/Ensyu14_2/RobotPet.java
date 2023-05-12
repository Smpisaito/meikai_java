// パッケージの宣言
package Ensyu14_2;

/**
 * クラス名： RobotPet<Br>
 * 概要：ロボット型ペットクラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.12
 * @author S.Saito
 *
 */
public class RobotPet extends PetClass {
	
	/**
	 * コンストラクタ
	 * @param RobotPetName
	 * @param MasterName
	 */
	public RobotPet (String RobotPetName,String MasterName) {
		// 	上位クラスのコンストラクタを呼び出す。
		super(RobotPetName,MasterName);
	}
	
	/**
	 * 関数名：introduceName<Br>
	 * 概要：自己紹介をする。オーバーライドしているメソッド。<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 */
	public void introduceName () {
		// ロボットペットの名前が表示される。
		System.out.println("◇私はロボット。名前は" + getPetName() + "。");
		// 飼い主の名前が表示される。
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}
	
	/**
	 * 関数名：householdTask<Br>
	 * 概要：家事をする。<Br>
	 * 引数：taskNumber 家事の選択を行う<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @param taskNumber 家事の選択行う
	 */
	public void householdTask(int taskNumber) {
		// 引数によって行う仕事が分岐する。
		switch (taskNumber) {
			// 1の場合の分岐
			case 1:
				// 掃除を行うと表示する。
				System.out.println("掃除をします。");
				// 分岐を終える。
				break;
			// 2の場合の分岐
			case 2:
				// 洗濯を行うと表示する。
				System.out.println("洗濯をします。");
				// 分岐を終える。
				break;
			// 3の場合の分岐
			case 3:
				// 炊事を行うと表示する。
				System.out.println("炊事をします。");
				// 分岐を終える。
				break;
		}
	}

}
