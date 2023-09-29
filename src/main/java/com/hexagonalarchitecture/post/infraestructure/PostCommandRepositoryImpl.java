package com.hexagonalarchitecture.post.infraestructure;

import com.hexagonalarchitecture.post.domain.model.PostCommand;
import com.hexagonalarchitecture.post.domain.model.PostQuery;
import com.hexagonalarchitecture.post.domain.repository.PostCommandRepository;
import com.hexagonalarchitecture.post.infraestructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostCommandRepositoryImpl implements PostCommandRepository {

    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;

    @Override
    public Optional<PostQuery> createPost(PostCommand postCommand) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.create(postCommand));
    }

    @Override
    public Optional<PostQuery> updatePost(PostCommand postCommand) {
        return Optional.empty();
    }

    @Override
    public void deletePost(int id) {

    }

}
