// パッケージの宣言
package Ensyu12_2;

/*
 * クラス名：TimeAccount
 * 概要：定期預金付き銀行口座クラス
 * 作成者：S.Saito
 * 作成日：2023.05.09
 */
public class TimeAccount extends AccountClass {
	
	// フィールド
	// 定期預金残高
	private long timeBalance;
	
	/*
	 * 関数名：compBalance
	 * 概要：銀行口座の普通預金と定期預金の残高の合計額を比較する。定期預金がない場合は普通預金のみで比較する。
	 *       前者が多ければ1、同じなら0、後者が多ければ-1を返す。クラス名、引数名は指定のものを用いる。
	 * 引数：a … 預金口座
	 *       b … 預金口座
	 * 戻り値：checkNumber … 比較した結果を1、0、-1のいずれかの値にして返す
	 * 作成者：S.Saito
	 * 作成日：2023.05.10
	 */
	public static int compBalance (AccountClass a, AccountClass b) {
		
		// 戻り値となる変数をつくる。初期値は0にする。
		int checkNumber = 0;
		// aの預金口座が定期預金付き銀行口座クラスである場合
		if (a instanceof TimeAccount) {
			// 定期預金口座の金額を普通預金口座に移す。
			((TimeAccount)a).cancelTimeBalance();
		}
		// bの預金口座が定期預金付き銀行口座クラスである場合
		if (b instanceof TimeAccount) {
			// 定期預金口座の金額を普通預金口座に移す。
			((TimeAccount)b).cancelTimeBalance();
		}
		
		// aのほうが口座残高が高い場合
		if (a.getBalance() > b.getBalance()) {
			// 戻り値を1にする。
			checkNumber = 1;
		// bのほうが口座残高が高い場合
		} else if (a.getBalance() < b.getBalance()) {
			// 戻り値を-1にする。
			checkNumber = -1;
		}
		// 戻り値を返す。
		return checkNumber;
	}
	
	TimeAccount (String accountName,String accountNumber,long normalBalance,long timeBalance) {
		// 預金残高まで入laa力する。
		super(accountName, accountNumber, normalBalance);
		// 定期預金残高を入れる。
		this.timeBalance = timeBalance;
	}
	
	
	// ゲッタ
	/*
	 * 関数名：getTimeBalance
	 * 概要：定期預金残高を調べる。
	 * 引数：なし
	 * 戻り値：timeBalance … 定期預金残高
	 * 作成者：S.Saito
	 * 作成日：2023.05.09
	 */
	public long getTimeBalance () {
		// 定期預金残高を返す。
		return timeBalance;
	}
	
	
	/*
	 * 関数名：cancelTimeBalance
	 * 概要：定期預金を解約して全額を普通預金に移す。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.09
	 */
	public void cancelTimeBalance() {
		// 残高を普通預金に移す。
		depositMoney(timeBalance);
		// 定期預金額を0にする。
		timeBalance = 0;
	}

	

	
}
