// パッケージの宣言
package Ensyu14_2;

/**
 * クラス名：PetClass<Br>
 * 概要：ペットクラス<Br>
 * 作成者：S.Saito<Br>
 * 作成日：2023.05.12
 * @author S.Saito
 *
 */
public class PetClass {
	
	// フィールド
	/**
	 * ペットの名前
	 */
	private String petName;
	
	/**
	 * 飼い主の名前
	 */
	private String masterName;
	
	/**
	 * コンストラクタ
	 * @param petName … ペットの名前
	 * @param masterName … 飼い主の名前
	 */
	public PetClass (String petName, String masterName) {
		// ペットの名前
		this.petName = petName;
		// 飼い主の名前
		this.masterName = masterName;
	}
	
	// ゲッタ
	
	/**
	 * 関数名：getPetName<Br>
	 * 概要：ペットの名前を調べる<Br>
	 * 引数：なし<Br>
	 * 戻り値：petName ペットの名前<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @return petName ペットの名前
	 */
	public String getPetName() {
		// ペットの名前を返す。
		return petName;
	}
	
	/**
	 * 関数名：getMasterName<Br>
	 * 概要：飼い主の名前を調べる<Br>
	 * 引数：なし<Br>
	 * 戻り値：masterName 飼い主の名前<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 * @return masterName 飼い主の名前
	 */
	public String getMasterName () {
		// 飼い主の名前を返す
		return masterName;
	}
	
	
	
	/**
	 * 関数名：introduceName<Br>
	 * 概要：自己紹介をする<Br>
	 * 引数：なし<Br>
	 * 戻り値：なし<Br>
	 * 作成者：S.Saito<Br>
	 * 作成日：2023.05.12
	 */
	public void introduceName () {
		// ペットの名前が表示される。
		System.out.println("■僕の名前は" + getPetName() + "。");
		// 飼い主の名前が表示される。
		System.out.println("■ご主人様は" + getMasterName() + "。");
	}
}
