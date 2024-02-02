package com.study.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * CategoryDTO
 */
@Getter
@Setter
@Builder
public class CategoryDTO {
    private Long categoryId;
    private String categoryName;
}
