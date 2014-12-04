package page;

import java.util.ArrayList;
import java.util.List;

public class Page {
	private int pageSize;
	private int totalPage;
	private int rows;
	private int pageFirst;
	private List list = new ArrayList();
	
	public Page(){}
	
	public Page(int pageSize, int totalPage, int pageFirst, List list) {
		super();
		this.pageSize = pageSize;
		this.totalPage = totalPage;
		this.pageFirst = pageFirst;
		this.list = list;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPageFirst() {
		return pageFirst;
	}
	public void setPageFirst(int pageFirst) {
		this.pageFirst = pageFirst;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
}
