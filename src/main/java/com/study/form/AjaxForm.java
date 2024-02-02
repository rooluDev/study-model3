package com.study.form;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * AJAX json 데이터 매칭
 */
@Getter
@Setter
@Builder
public class AjaxForm {
    private Long boardId;
    private String password;
}
