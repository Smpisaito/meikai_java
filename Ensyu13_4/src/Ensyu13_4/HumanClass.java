// パッケージの宣言
package Ensyu13_4;

/**
 * クラス名：HumanClass
 * 概要：名前、身長、体重などの情報をメンバとして持った人間クラス
 * 作成者：S.Saito
 * 作成日：2023.05.01
 * @author S.Saito
 * @see DayClass
 */
public class HumanClass {
	
	/**
	 *  名前の情報のフィールド。String型
	 */
	private String userName;
	/**
	 *  身長の情報のフィールド。float型
	 */
	private float centimetreHeight;
	/**
	 *  体重の情報のフィールド。float型
	 */
	private float kilogramWeight;
	/**
	 *  生年月日の情報のフィールド。DayClassのクラス型
	 *  @see DayClass
	 */
	private DayClass birthDay;

	/**
	 *  コンストラクタを定義する。
	 * @param checkName
	 * @param checkHeight
	 * @param checkWeight
	 * @param birthDay
	 */
	public HumanClass(String checkName, float checkHeight, float checkWeight, DayClass birthDay){

		// 名前の情報の初期値の設定
		userName = checkName;
		// 身長の情報の初期値の設定
		centimetreHeight = checkHeight;
		// 体重の情報の初期値の設定
		kilogramWeight = checkWeight;
		// 誕生日の初期値の設定
		this.birthDay = new DayClass(birthDay);
	}
	
	
	// ゲッター
	
	/**
	 * 関数名：getName
	 * 概要：名前の情報のゲッター
	 * 引数：なし
	 * 戻り値：userName … 名前フィールドに入れられた登録者の名前の文字列。String型
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 * @return userName … 名前フィールドに入れられた登録者の名前の文字列。String型
	 */
	public String getName() {
		// 登録名を返す。
		return userName;
	}
	
	/**
	 * 関数名：getHeight
	 * 概要：身長の情報のゲッター
	 * 引数：なし
	 * 戻り値：centimetreHeight … 身長フィールドに入れられた登録者の身長の値
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 * @return centimetreHeight … 身長フィールドに入れられた登録者の身長の値。float型
	 */
	public float getHeight() {
		// 身長の値を返す。
		return centimetreHeight;
	}
	
	/**
	 * 関数名：getWeight
	 * 概要：体重の情報のゲッター
	 * 引数：なし
	 * 戻り値：kilogramWeight … 体重フィールドに入れられた登録者の身長の値
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 * @return kilogramWeight … 体重フィールドに入れられた登録者の身長の値。float型
	 */
	public float getWeight() {
		// 体重の値を返す。
		return kilogramWeight;
	}
	
	/**
	 * 関数名：getBirth
	 * 概要：誕生日の情報のゲッター
	 * 引数：なし
	 * 戻り値：birthDay … フィールドに入れられた登録者の誕生日の情報のコピーへの参照。
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 * @return birthDay … フィールドに入れられた登録者の誕生日の情報のコピーへの参照。DayClassのクラス型
	 */
	public DayClass getBirth() {
		// 身長の値を返す。
		return new DayClass(birthDay);
	}
	
	
	// セッター
	
	/**
	 * 関数名：setName
	 * 概要：名前の情報のセッター
	 * 引数：newName … 名前フィールドに入れる名前の文字列
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 * @param newName … 名前フィールドに入れる名前の文字列。String型
	 */
	public void setName(String newName) { userName = newName;}
	
	/**
	 * 関数名：setHeight
	 * 概要：身長の情報のセッター
	 * 引数：nowHeight … 新しい身長の情報
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 * @param nowHeight … 新しい身長の情報。float型
	 */
	public void setHeight(float nowHeight) { centimetreHeight = nowHeight;}
	
	/**
	 * 関数名：setWeight
	 * 概要：体重の情報のセッター
	 * 引数：nowWeight … 新しい体重の情報
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 * @param nowWeight … 新しい体重の情報。float型
	 */
	public void setWeight(float nowWeight) { kilogramWeight = nowWeight;}
	
	/**
	 * 関数名：setBirth<br>
	 * 概要：誕生日の情報のセッター
	 * 引数：trueBirth … 新しい誕生日の情報
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.04.28
	 * @param trueBirth 新しい誕生日の情報。DayClassのクラス型
	 */
	public void setBirth(DayClass trueBirth) { birthDay = new DayClass(trueBirth);}
	
	
	/**
	 * 関数名：toString
	 * 概要：登録情報を調べて文字列を返す。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public String toString() {
		// 情報を文字にして返す。
		return String.format("登録名：%s\n身長(㎝)：%5.1f\n体重(㎏)：%5.1f\n生年月日：%s", userName, centimetreHeight, kilogramWeight, birthDay);
	}
}