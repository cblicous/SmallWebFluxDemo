package de.cblicous.smallwebfluxdemo.dto;
/**
* AuthorMessage, the Message DTO 
*
*/
public class AuthorMessage {
	private String authorId;
	private String Message;

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

}
