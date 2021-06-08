package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="category")
public class CategoryEntity extends BaseEntity{
	@Id
	@Column(name="category_id")
	private String categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@Column(name="root_category")
	private String rootCategory;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	private List<NewsEntity> news;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getRootCategory() {
		return rootCategory;
	}

	public void setRootCategory(String rootCategory) {
		this.rootCategory = rootCategory;
	}

	
	
	
}
