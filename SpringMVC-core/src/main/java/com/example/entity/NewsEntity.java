package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="news")
public class NewsEntity extends BaseEntity{
	@Id
	@Column(name="new_id")
	private String newsId;
	
	@Column(name="titile")
	private String titile;
	
	@Column(name="file_name")
	private String fileName;
	
	@Column(name="content", columnDefinition = "TEXT")
	private String content;
	
	@Column(name="description", columnDefinition = "TEXT")
	private String description;
	
	@Column(name="views")
	private int views;
	
	@Column(name="top")
	private int top;
	
	@Column(name="review")
	private double review;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="user_name")
	private UserEntity userentity;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id")
	private CategoryEntity category;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "newEntity")
	private List<CommentEntity> comments;
	
	
	
	public String getNewsId() {
		return newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public double getReview() {
		return review;
	}

	public void setReview(double review) {
		this.review = review;
	}
	
	
}
