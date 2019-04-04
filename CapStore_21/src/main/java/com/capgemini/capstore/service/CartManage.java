package com.capgemini.capstore.service;

import java.util.List;
import com.capgemini.capstore.beans.Product;

public interface CartManage {
	Product addCartItem(int pid, int custid,int merid);
	Product removeCartItem(int pid, int custid);
	List<Product> viewCart(int custid);
	Boolean minAmountCheck(int custid);

}
