package com.hexagonalarchitecture.post.domain.repository;

import com.hexagonalarchitecture.post.domain.model.PostCommand;
import com.hexagonalarchitecture.post.domain.model.PostQuery;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PostQueryRepository {

    Optional<PostQuery> findById(int id);
    List<PostQuery> searchBy(Map<String,String> params);
    List<PostQuery> findAllPost();
}
