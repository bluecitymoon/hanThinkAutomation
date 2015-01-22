package com.ls.vo;

import java.io.Serializable;
import java.util.List;

public class LihuaResponseObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5736873792733134424L;
	private String count;
	private List<LihuaListJsonObject> rows;

	public String getCount() {

		return count;
	}

	public void setCount(String count) {

		this.count = count;
	}

	public List<LihuaListJsonObject> getRows() {

		return rows;
	}

	public void setRows(List<LihuaListJsonObject> rows) {

		this.rows = rows;
	}

	@Override
	public String toString() {

		return "LihuaResponseObject [count=" + count + ", rows=" + rows + "]";
	}

	
}
