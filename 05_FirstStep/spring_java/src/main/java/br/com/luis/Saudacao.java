package br.com.luis;

public class Saudacao {
	private final long id;
	private final String content;

	Saudacao(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
