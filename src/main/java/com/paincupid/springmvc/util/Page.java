package com.paincupid.springmvc.util;

public class Page {
	private static final long serialVersionUID = 1L;
	
	public int totalCounts=0;	//���÷�ҳ������Ŀ��
	public int pageSize = 20;	//����ÿһҳ����Ŀ��, Ĭ��20������
	public int currentPage = 1;	//���õ�ǰ��ҳ��
	
	public int getTotalCounts() {
		return totalCounts;
	}
	public void setTotalCounts(int totalCounts) {
		this.totalCounts = totalCounts;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	
	
}
