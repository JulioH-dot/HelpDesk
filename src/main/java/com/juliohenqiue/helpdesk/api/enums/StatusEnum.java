package com.juliohenqiue.helpdesk.api.enums;



public enum StatusEnum {

	New, Assigned, Resolved, Approved, Disaproved, Closed;

	public static StatusEnum getStatus(String status) {
		return StatusEnum.valueOf(status);
	}

}
