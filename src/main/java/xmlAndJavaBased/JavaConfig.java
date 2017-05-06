package xmlAndJavaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public SpellChecker spellChecker(){
		SpellChecker instance = new SpellChecker();
		instance.setLang("English");
		return instance;
	}
	
	@Bean
	public TextEditor textEditor(){
		return new TextEditor(spellChecker());
	}
}
