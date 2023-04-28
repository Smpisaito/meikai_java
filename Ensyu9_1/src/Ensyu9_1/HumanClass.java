// 	パッケージの宣言
package Ensyu9_1;

/*
 * クラス名：HumanClass
 * 概要：名前、身長、体重などの情報をメンバとして持った人間クラス
 * 作成者：S.Saito
 * 作成日：2023.04.26
 */
public class HumanClass {
		// 名前の情報
		private String userName;
		// 身長の情報
		private float centimetreHeight;
		// 体重の情報
		private float kilogramWeight;
		// 生年月日の年
		private short birthYear;
		// 生年月日の月
		private short birthMonth;
		// 生年月日の日
		private short birthDay;

		// コンストラクタを定義する。
		HumanClass(String checkName, float checkHeight, float checkWeight, short checkYear, short checkMonth, short checkDay){

			// 名前の情報の初期値の設定
			userName = checkName;
			// 身長の情報の初期値の設定
			centimetreHeight = checkHeight;
			// 体重の情報の初期値の設定
			kilogramWeight = checkWeight;
			// 生年月日の年の初期値の設定
			birthYear = checkYear;
			// 生年月日の月の初期値の設定
			birthMonth = checkMonth;
			// 生年月日の日の初期値の設定
			birthDay = checkDay;

		}

		/*
		 * 関数名：getUser
		 * 概要：登録情報を調べて表示する
		 * 引数：なし
		 * 戻り値：なし
		 * 作成者：S.Saito
		 * 作成日：2023.04.28
		 */
		void getUser() {
			// 名前の情報を表示する。
			System.out.println("登録名：" + userName);
			// 名前の情報を表示する。
			System.out.println("身長(㎝)：" + centimetreHeight);
			// 名前の情報を表示する。
			System.out.println("体重(㎏)：" + kilogramWeight);
			// 名前の情報を表示する。
			System.out.println("生年月日：" + birthYear + "/" + birthMonth + "/" + birthDay);
		}
		
		/*
		 * 関数名：pdateHeight
		 * 概要：身長の情報を新しくする
		 * 引数：nowHeight … 新しい身長の情報
		 * 戻り値：なし
		 * 作成者：S.Saito
		 * 作成日：2023.04.28
		 */
		void updateHeight(float nowHeight) {
			// 身長の情報を書き換える。
			centimetreHeight = nowHeight;
		}
		
		/*
		 * 関数名：updateWeight
		 * 概要：体重の情報を新しくする
		 * 引数：nowWeight … 新しい体重の情報
		 * 戻り値：なし
		 * 作成者：S.Saito
		 * 作成日：2023.04.28
		 */
		void updateWeight(float nowWeight) {
			// 体重の情報を書き換える。
			kilogramWeight = nowWeight;
		}
		
}
