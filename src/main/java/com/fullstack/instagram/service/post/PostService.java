package com.fullstack.instagram.service.post;

import java.util.List;
import java.util.Optional;

import com.fullstack.instagram.api.request.PostCreateRequest;
import com.fullstack.instagram.model.Post;

public interface PostService {
   Post savePost(PostCreateRequest post);
   Optional<Post> findPostById(Long id);
   List<Post> findPostsByProfileInfoId(Long profileInfoId);
   List<Post> findAllPosts();
   void deletePostById(Long id);
}
