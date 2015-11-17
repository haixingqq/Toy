package com.robin.toy.api.cart;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author Robin
 *
 */
public interface ICart {
	
	/**
	 * @param jsoncart <Cart>
	 */
	public void  add(JSONObject jsoncart);

}
