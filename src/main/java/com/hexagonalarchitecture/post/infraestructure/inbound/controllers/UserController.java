package com.hexagonalarchitecture.post.infraestructure.inbound.controllers;

import com.hexagonalarchitecture.post.application.find.PostFindUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final PostFindUseCase postFindUseCase;
    @GetMapping("/{id}/post")
    public ResponseEntity findAllPosts(@PathVariable Integer id){
        return ResponseEntity.ok(this.postFindUseCase.findAllPostByUserId(id));
    }

}
