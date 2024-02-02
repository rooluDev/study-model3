package com.study.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


/**
 * CommentDTO
 */
@Getter
@Setter
@Builder
public class CommentDTO {
    private Long commentId;
    private Long boardId;
    private String comment;
    private Timestamp createdAt;
    private Timestamp editedAt;
}
