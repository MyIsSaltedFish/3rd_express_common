package com.qf.express.common;

import java.util.List;

public class DataGridResult<T> {

	private List<T> rows;
	private int total;
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "DataGridResult [rows=" + rows + ", total=" + total + "]";
	}
	public DataGridResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataGridResult(List<T> rows, int total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	
}
