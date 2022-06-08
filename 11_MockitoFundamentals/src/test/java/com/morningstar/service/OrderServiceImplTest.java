package com.morningstar.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.morningstar.dao.OrderDao;
import com.morningstar.exception.OrderException;
import com.morningstar.model.Order;

public class OrderServiceImplTest {

	OrderServiceImpl target;
	Order order=null;
	@Mock
	OrderDao dao=null;
	
	@Before
	public void setup(){		
		MockitoAnnotations.initMocks(this);
		target=new OrderServiceImpl();
		order=new Order();
		order.setId(1234);
		order.setStatus("confirm");
		
		target.setDao(dao);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlaceOrderShouldSaveOrderInDatabaseAndReturnTrue() throws OrderException, SQLException {
		when(dao.create(order)).thenReturn(1);
		boolean result=target.placeOrder(order);
		assertTrue(result);
	}

}
