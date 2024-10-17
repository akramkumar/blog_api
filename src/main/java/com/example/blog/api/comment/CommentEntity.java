package com.example.blog.api.comment;


import com.example.blog.api.article.ArticleEntity;
import com.example.blog.api.user.UserEntity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="comment")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false)
	private Long id;
	
	@Nonnull
	private String body;
	
	@ManyToOne
	@JoinColumn(name = "articleId",nullable = false)
	private ArticleEntity article;
	
	@ManyToOne
	@JoinColumn(name = "authorId", nullable= false)
	private UserEntity author;


}
