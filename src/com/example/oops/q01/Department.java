package com.example.oops.q01;

public class Department {

	private Integer deptId;
	private String dName;

	public Department() {
		super();
	}

	public Department(Integer deptId, String dName) {
		super();
		this.deptId = deptId;
		this.dName = dName;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dName=" + dName + "]";
	}

}
