package xmlAndJavaBased;

public class SpellChecker {
	String lang;
	public String getLang() {
		return lang;
	}

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
