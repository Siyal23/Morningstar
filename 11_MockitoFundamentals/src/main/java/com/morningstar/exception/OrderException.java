package com.morningstar.exception;

import java.sql.SQLException;

public class OrderException extends Exception {

	public OrderException(SQLException e) {
		super(e);
	}
	
}
