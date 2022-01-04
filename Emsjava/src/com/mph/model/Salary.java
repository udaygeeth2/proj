package com.mph.model;

public class Salary {
	private int basic;
	private int da;
	private int hra;
	private int pf;
	private int gross;
	private int net;

	public Salary() {
		super();
	}

	public Salary(int basic, int da, int hra, int pf, int gross, int net) {
		super();
		this.basic = basic;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
		this.gross = gross;
		this.net = net;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getPf() {
		return pf;
	}

	public void setPf(int pf) {
		this.pf = pf;
	}

	public int getGross() {
		return gross;
	}

	public void setGross() {
		this.gross = this.basic+this.da+this.hra+this.pf;
	}

	public int getNet() {
		return net;
	}

	public void setNet() {
		this.net = this.gross-this.pf;
	}

	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", da=" + da + ", hra=" + hra + ", pf=" + pf + ", gross=" + gross + ", net="
				+ net + "]";
	}

}