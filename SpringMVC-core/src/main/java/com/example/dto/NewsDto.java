package com.example.dto;

import java.util.List;

public class NewsDto extends BaseDto{
	
	private String newsId;
	
	private String titile;
	
	private String fileName;
	
	private String content;
	
	private String description;
	
	private int views;
	
	private int top;
	
	private double review;
	
	private UserDto userDto;
	
	private CategoryDto category;

	private List<CommentDto> comments;

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

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public List<CommentDto> getComments() {
		return comments;
	}

	public void setComments(List<CommentDto> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "NewsDto [newsId=" + newsId + ", titile=" + titile + ", fileName=" + fileName + ", content=" + content
				+ ", description=" + description + ", views=" + views + ", top=" + top + ", review=" + review
				+ ", userDto=" + userDto + ", category=" + category + ", comments=" + comments + "]";
	}
    
	
}
