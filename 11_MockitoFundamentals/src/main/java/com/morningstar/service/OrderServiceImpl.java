package com.morningstar.service;

import java.sql.SQLException;

import com.morningstar.dao.OrderDao;
import com.morningstar.exception.OrderException;
import com.morningstar.model.Order;

public class OrderServiceImpl implements OrderService{

	private OrderDao orderDao;
	@Override
	public boolean placeOrder(Order order) throws OrderException {
		try {
			int result=getDao().create(order);
			if(result!=0) {
				return true;
			}
		}
		catch(SQLException e) {
			throw new OrderException(e);
		}
		return false;
	}


	private OrderDao getDao() {
		return orderDao;
	}


	@Override
	public boolean cancelOrder(int id) throws OrderException {
		return false;
	}

	@Override
	public boolean deleteOrder(int id) throws OrderException {
		return false;
	}


	public void setDao(OrderDao dao) {
		orderDao=dao;
	}

}
