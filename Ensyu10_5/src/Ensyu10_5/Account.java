// パッケージの宣言
package Ensyu10_5;

/*
 * クラス名：Account
 * 概要：インスタンス生成時の毎回行う表示を追加したもの。クラス名は指定のものを使っている。
 * 作成者：S.Saito
 * 作成日：2023.04.28
 */
public class Account {
	
	// 銀行口座クラスのフィールド 
	// 口座名義
	private String accountName;
	// 口座番号
	private String accauntNumber;
	// 預金残高
	private long accauntBalance = 0;
	// 口座開設日
	private DayClass openDay;
	
	// インスタンス初期化子
	{
		// インスタンス生成ごとに表示する。
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}
	
	// コンストラクタ。同時に預金も行われる場合
	public Account (String accountName,String accauntNumber,long accauntBalance,DayClass accountOpen) {
		// 口座名義
		this.accountName = accountName;
		// 口座番号
		this.accauntNumber = accauntNumber;
		// 預金残高の初期金額
		this.accauntBalance = accauntBalance;
		// 口座開設日
		this.openDay = new DayClass(accountOpen);
	}
	// コンストラクタ。預金は行われない場合。
	public Account (String accountName,String accauntNumber,DayClass accountOpen) {
		// 口座名義
		this.accountName = accountName;
		// 口座番号
		this.accauntNumber = accauntNumber;
		// 口座開設日
		this.openDay = new DayClass(accountOpen);
	}
	
	
	// 各情報のゲッター
	
	/*
	 * 関数名：getName
	 * 概要：口座名義のゲッター
	 * 引数：なし
	 * 戻り値：accountName … 口座名義
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public String getName () {return accountName;}
	
	/*
	 * 関数名：getNumber
	 * 概要：口座番号のゲッター
	 * 引数：なし
	 * 戻り値：accauntNumber … 口座番号
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public String getNumber () {return accauntNumber;}
	
	/*
	 * 関数名：getBalanc
	 * 概要：預金残高のゲッター
	 * 引数：なし
	 * 戻り値：accauntBalance … 預金残高
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public long getBalance () {return accauntBalance;}
	
	/*
	 * 関数名：getDay
	 * 概要：口座開設日のゲッター。クラス型なので外部から書き換えできないようにreturnの後にnewを付ける。
	 * 引数：なし
	 * 戻り値：new DayClass(openDay) … 口座開設日のフィールドの内容のコピーへの参照
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public DayClass getDay () {return new DayClass(openDay);}
	
	
	// 各情報のセッタ－
	
	/*
	 * 関数名：setName
	 * 概要：口座名義のセッター
	 * 引数：newName … 新しい口座名義
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void setName (String newName) {accountName = newName;}
	
	/*
	 * 関数名：setNumber
	 * 概要：口座番号のセッター
	 * 引数：newNumber … 新しい口座番号
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void setNumber (String newNumber) {accauntNumber = newNumber;}
	
	
	/*
	 * 関数名：depositMoney
	 * 概要：口座にお金を預ける。
	 * 引数：inputMoney … 入金額
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void depositMoney (long inputMoney) {accauntBalance += inputMoney;}
	
	/*
	 * 関数名：withdrawMoney
	 * 概要：口座からお金をおろす。
	 * 引数：outputMoney … 出金額
	 * 戻り値：なし
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public void withdrawMoney (long outputMoney) {accauntBalance -= outputMoney;}
	
	/*
	 * 関数名：toString
	 * 概要：口座情報を返す。(toString)
	 * 引数：なし
	 * 戻り値：format … 口座の全ての情報が縦に並べて表示される文字列
	 * 作成者：S.Saito
	 * 作成日：2023.05.01
	 */
	public String toString() {
		// 
		return String.format("口座名義：%s\n口座番号：%s\n預金残高：%d\n口座開設日：%s",accountName,accauntNumber,accauntBalance,openDay);
	}
	
}