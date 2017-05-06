package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
	
	String lang;
	public String getLang() {
		return lang;
	}

	@Autowired
	@Qualifier("lang")
	public void setLang(String lang) {
		this.lang = lang;
	}

	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor");
	}

	public void checkSpelling() {
		System.out.println("Inside checkSpelling. Language: " + lang);
	}

}
