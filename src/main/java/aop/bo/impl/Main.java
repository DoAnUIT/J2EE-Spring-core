/**
 * 
 */
package aop.bo.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.bo.CustomerBo;

/**
 * @author minhn
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

		CustomerBo customer = (CustomerBo) context.getBean("customerBo");
		customer.addCustomer();
	}

}
