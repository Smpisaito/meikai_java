// パッケージの宣言
package Ensyu12_2;

/*
 * クラス名：AccountClass
 * 概要：銀行口座クラス。[明解Java List8-3]をもとに作成
 * 作成者：S.Saito
 * 作成日：2023.05.09
 */
public class AccountClass {
	
	// フィールド
	// 口座名義
	private String accountName;
	// 口座番号
	private String accountNumber;
	// 預金残高
	private long normalBalance;

	
	// コンストラクタ
	AccountClass(String accountName,String accountNumber,long normalBalance){
		// 口座名義を入れる。
		this.accountName = accountName;
		// 口座番号を入れる。
		this.accountNumber = accountNumber;
		// 預金残高を入れる。
		this.normalBalance = normalBalance;
	}
	
	
	// ゲッタ
	/*
	 * 関数名：getName
	 * 概要：口座名義を得る。
	 * 引数：なし
	 * 戻り値：accountName … 口座名義
	 * 作成者：S.Saito
	 * 作成日：2023.05.09
	 */
	public String getName() {
		// 口座名義を返す。
		return accountName;
	}
	
	/*
	 * 関数名：
	 * 概要：口座番号を得る。
	 * 引数：なし
	 * 戻り値：accountNumber … 口座番号
	 * 作成者：S.Saito
	 * 作成日：2023.05.09
	 */
	public String getNumber() {
		// 口座番号を返す。
		return accountNumber;
	}
	
	/*
	 * 関数名：
	 * 概要：預金残高を調べる。
	 * 引数：なし
	 * 戻り値：normalBalance … 預金残高
	 * 作成者：S.Saito
	 * 作成日：2023.05.09
	 */
	public long getBalance() {
		// 口座番号を返す。
		return normalBalance;
	}
		
	/*
	 * 関数名：depositMoney
	 * 概要：お金を預ける。
	 * 引数：inputMoney
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.09
	 */
	public void depositMoney(long inputMoney){
		// お金を預ける。
		normalBalance += inputMoney;
	}
	
	/*
	 * 関数名：withdrawMoney
	 * 概要：お金をおろす。
	 * 引数：outputMoney
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.09
	 */
	public void withdrawMoney(long outputMoney){
		// お金をおろす。
		normalBalance -= outputMoney;
	}
	
}
