package com.vti.blogapp.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PostUpdateForm {
    private String title;
    private String description;
    private String content;
}
