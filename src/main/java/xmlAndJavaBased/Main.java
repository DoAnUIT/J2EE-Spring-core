package xmlAndJavaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import scope.HelloWorld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xmlBased();
		//javaBased();
	
	}
	
	public static void xmlBased(){
		 ApplicationContext context = new ClassPathXmlApplicationContext("xmlBased.xml");

	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	}
	
	public static void javaBased(){
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		TextEditor te = (TextEditor) context.getBean("textEditor");
		TextEditor te = (TextEditor) context.getBean(TextEditor.class);
	      te.spellCheck();
		
	}

}
