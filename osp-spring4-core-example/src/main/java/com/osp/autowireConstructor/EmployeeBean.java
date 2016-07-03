package com.osp.autowireConstructor;

public class EmployeeBean {
 
	private String fullName;
	
	private DepartmentBean departmentBean;
	
	public EmployeeBean(DepartmentBean aDepartmentBean) {
		this.departmentBean=aDepartmentBean;
	}


	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	
}
