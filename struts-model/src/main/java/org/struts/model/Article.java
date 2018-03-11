package org.struts.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Article entity with details of an article
 * @author hackme
 *
 */
public class Article {

	private int id;
	private String title;
	private String content;
	private Date submissionDate;
	
	// The author of this article
	@Autowired(required=true)
	@Qualifier("user")
	private User author;

	/**
	 * Emtpy constructor
	 */
	public Article() {
		
	}
	
	public Article(String title, String content, Date submissionDate, User author) {

		this.title = title;
		this.content = content;
		this.submissionDate = submissionDate;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public User getAuthor() {
		return author;
	}

	/**
	 * Set author - allow injecting the user bean defined in our bean conf. file
	 */
	//@Autowired
	public void setAuthor(User author) {
		this.author = author;
	}
	
	
	
}
