package cz.zipek.sqflint.linter;

import cz.zipek.sqflint.parser.Token;

/**
 *
 * @author Jan Zípek <jan at zipek.cz>
 */
public class Warning {
	private final Token token;
	private final String message;
	
	public Warning(Token token, String message) {
		this.token = token;
		this.message = message;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("Warning: ")
				.append(getMessage())
				.append(" at line ")
				.append(getToken().beginLine)
				.append(" column ")
				.append(getToken().beginColumn)
				.toString();
	}

	/**
	 * @return the token
	 */
	public Token getToken() {
		return token;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
}
