package models;


import java.util.Date;

public class Account {
	String accountNum;
	String accountHolder;
	String accountType;
	Date accountOpeningDate;
	
	public Account(String accountNum, String accountHolder, String accountType, Date accountOpeningDate) {
		super();
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		this.accountType = accountType;
		this.accountOpeningDate = accountOpeningDate;
	}
	
	public String toString() {
		return accountNum + ", " + accountHolder + ", " + accountType + ", " + accountOpeningDate;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}
	
	

}
