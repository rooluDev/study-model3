package com.study.service;

import com.study.DTO.CategoryDTO;
import com.study.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


// TODO : service와 mapper 동일한데 service를 만들어야할까
/**
 * 카테고리 서비스
 */
@Service
public class CategoryService {
    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryService(CategoryMapper categoryMapper){
        this.categoryMapper = categoryMapper;
    }

    /**
     * 카테고리 List 가져오기
     * @return
     */
    public List<CategoryDTO> getCategoryList(){
        return categoryMapper.getCategory();
    }

    /**
     * 카테고리 이름 가져오기
     * @param categoryId
     * @return
     */
    public String findCategoryName(Long categoryId){
        return categoryMapper.findById(categoryId);
    }

}
