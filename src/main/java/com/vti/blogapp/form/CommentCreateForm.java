package com.vti.blogapp.form;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CommentCreateForm {

    private String name;


    private String email;


    private String body;
}
