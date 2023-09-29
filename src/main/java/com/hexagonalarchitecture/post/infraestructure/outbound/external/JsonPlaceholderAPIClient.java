package com.hexagonalarchitecture.post.infraestructure.outbound.external;

import com.hexagonalarchitecture.post.domain.model.PostCommand;
import com.hexagonalarchitecture.post.domain.model.PostQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

// name -> nombre cualquiera que desiemos colocar
// url -> servicio web externo a querer consumir
@FeignClient(name = "feign-api", url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceholderAPIClient {

    @PostMapping
    PostQuery create(@RequestBody PostCommand request);

    @GetMapping("/{id}")
    PostQuery findPostById(@PathVariable Integer id);

    @GetMapping
    List<PostQuery> getAllPosts();

    @GetMapping
    List<PostQuery> searchByParam(@RequestParam Map<String, String> params);
}
