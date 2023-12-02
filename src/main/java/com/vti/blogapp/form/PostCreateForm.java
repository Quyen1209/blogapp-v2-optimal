package com.vti.blogapp.form;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostCreateForm {
    private String title;
    private String description;
    private String content;
}


