public class CountXMLToken {

	String token;

	//create a token and initialize it
	public CountXMLToken(String token) {
		this.token = token;
	}
	
	//return true if the tag is a token and false if not, it has three character first and last are < and >.
	public boolean isTag() {
		if (token.charAt(0) == '<' && token.charAt(token.length() - 2) == '>') { 
			return true;
		} else {
			return false;
		}
	}
	
	//return true if it is an open tag
	public boolean isOpeningTag() {
		if (token.charAt(0) == '<' && token.charAt(1) != '/' && token.charAt(token.length() - 2) == '>') {
			return true;
		} else {
			return false;
		}
	}
	
	//return true if it is a close tag
	public boolean isClosingTag() {
		if (token.charAt(0) == '<' && token.charAt(1) == '/' && token.charAt(token.length() - 2) == '>') {
			return true;
		} else {
			return false;
		}
	}
	
	//return name of specific tag
	public String getTagName() {
		String ans = "";
		if (isTag()) {
			if (isOpeningTag()) {
				ans = token.substring(1, token.length() - 2);
			} else {
				ans = token.substring(2, token.length() - 2);
			}
		}
		return ans;
	}
}
