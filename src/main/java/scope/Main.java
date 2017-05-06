package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.setMessage("I'm object A");

		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.setMessage("I'm object B");

		// neu la singleton deu in ra "object b"
		objA.getMessage();
		objB.getMessage();
	}
}
