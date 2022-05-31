package org.example.demo.dao;

import java.util.Collection;

import org.example.demo.model.Order;

public interface OrderDao {
	
	public Order createOrder(Order order);
	public Collection<Order> fetchAllOrders();
	public Order findOrderById(int id);
	public void removeOrderById(int removeId);
	public void updateOrder(int id, Order order);

}
