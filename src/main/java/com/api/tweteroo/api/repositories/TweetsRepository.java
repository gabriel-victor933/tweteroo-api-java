package com.api.tweteroo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.tweteroo.api.models.TweetModel;

@Repository
public interface TweetsRepository extends JpaRepository<TweetModel, Long> {
    
}
