/**
 * 
 */
package aop.bo;

/**
 * @author minhn
 *
 */
public interface CustomerBo {
	void addCustomer();

	String addCustomerReturnValue();

	void addCustomerThrowException() throws Exception;

	void addCustomerAround(String name);
}
