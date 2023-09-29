package com.hexagonalarchitecture.post.domain.repository;

import com.hexagonalarchitecture.post.domain.model.PostCommand;
import com.hexagonalarchitecture.post.domain.model.PostQuery;

import java.util.Optional;

public interface PostCommandRepository {

    Optional<PostQuery> createPost(PostCommand postCommand);
    Optional<PostQuery> updatePost(PostCommand postCommand);
    void deletePost(int id);

}
