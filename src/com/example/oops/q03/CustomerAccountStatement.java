package com.example.oops.q03;

import java.time.LocalDate;

public class CustomerAccountStatement {

	private Integer CAID;
	private Integer CustId;
	private Double amount;
	private Double depositWithdrawl;
	private LocalDate depositDate;

	public CustomerAccountStatement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerAccountStatement(Integer cAID, Integer custId, Double amount, Double depositWithdrawl,
			LocalDate depositDate) {
		super();
		CAID = cAID;
		CustId = custId;
		this.amount = amount;
		this.depositWithdrawl = depositWithdrawl;
		this.depositDate = depositDate;
	}

	public Integer getCAID() {
		return CAID;
	}

	public void setCAID(Integer cAID) {
		CAID = cAID;
	}

	public Integer getCustId() {
		return CustId;
	}

	public void setCustId(Integer custId) {
		CustId = custId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getDepositWithdrawl() {
		return depositWithdrawl;
	}

	public void setDepositWithdrawl(Double depositWithdrawl) {
		this.depositWithdrawl = depositWithdrawl;
	}

	public String getDepositDate() {
		return depositDate.toString();
	}

	public void setDepositDate(String depositDate) {
		this.depositDate = LocalDate.parse(depositDate);
	}

	@Override
	public String toString() {
		return "CustomerAccountStatement [CAID=" + CAID + ", CustId=" + CustId + ", amount=" + amount
				+ ", depositWithdrawl=" + depositWithdrawl + ", depositDate=" + depositDate + "]";
	}

}
