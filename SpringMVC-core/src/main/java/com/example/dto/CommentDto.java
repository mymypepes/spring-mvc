package com.example.dto;

public class CommentDto extends BaseDto{
	
	private String commentId;
	
	private String content;
	
	private double review;
	
	private int likeTotal;
	
	private UserDto user;
	
	private NewsDto newsDto;

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getReview() {
		return review;
	}

	public void setReview(double review) {
		this.review = review;
	}

	public int getLikeTotal() {
		return likeTotal;
	}

	public void setLikeTotal(int likeTotal) {
		this.likeTotal = likeTotal;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public NewsDto getNewsDto() {
		return newsDto;
	}

	public void setNewsDto(NewsDto newsDto) {
		this.newsDto = newsDto;
	}

	@Override
	public String toString() {
		return "CommentDto [commentId=" + commentId + ", content=" + content + ", review=" + review + ", likeTotal="
				+ likeTotal + ", user=" + user + ", newsDto=" + newsDto + "]";
	}
	
	
}
