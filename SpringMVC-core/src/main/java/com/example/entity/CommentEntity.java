package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="comment")
public class CommentEntity extends BaseEntity{
	@Id
	@Column(name="comment_id")
	private String commentId;
	
	@Column(name="content", columnDefinition = "TEXT")
	private String content;
	
	@Column(name="review")
	private double review;
	
	@Column(name="like_total")
	private int likeTotal;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="user_name")
	private UserEntity user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="new_id")
	private NewsEntity newEntity;
	
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

	
}
