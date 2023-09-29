package com.hexagonalarchitecture.post.infraestructure;

import com.hexagonalarchitecture.post.domain.model.PostQuery;
import com.hexagonalarchitecture.post.domain.repository.PostQueryRepository;
import com.hexagonalarchitecture.post.infraestructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class PostQueryRepositoryImpl implements PostQueryRepository {

    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;

    @Override
    public Optional<PostQuery> findById(int id) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.findPostById(id));
    }

    @Override
    public List<PostQuery> searchBy(Map<String, String> params) {
        return jsonPlaceholderAPIClient.searchByParam(params);
    }

    @Override
    public List<PostQuery> findAllPost() {
        return jsonPlaceholderAPIClient.getAllPosts();
    }
}
