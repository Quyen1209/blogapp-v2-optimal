package com.vti.blogapp.service;

import com.vti.blogapp.dto.CommentDto;
import com.vti.blogapp.form.CommentCreateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommentService {
    CommentDto create(CommentCreateForm form, Long postId);
    Page<CommentDto> findAll (Pageable pageable);
}
