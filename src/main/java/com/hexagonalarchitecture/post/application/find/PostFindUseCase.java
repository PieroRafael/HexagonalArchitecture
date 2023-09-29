package com.hexagonalarchitecture.post.application.find;

import com.hexagonalarchitecture.post.domain.model.PostQuery;
import com.hexagonalarchitecture.post.domain.repository.PostQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PostFindUseCase {

    private final PostQueryRepository postQueryRepository;

    public List<PostQuery> findAllPost(){
        return this.postQueryRepository.findAllPost();
    }

    public PostQuery findById(Integer id){
        return this.postQueryRepository.findById(id).orElseThrow();
    }

    public List<PostQuery> findAllPostByUserId(Integer userId){
        return this.postQueryRepository.searchBy(Map.of("userId",String.valueOf(userId)));
    }

}
