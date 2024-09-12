package com.fullstack.instagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.instagram.model.ProfileInfo;

@Repository
public interface ProfileInfoRepository extends JpaRepository<ProfileInfo, Long> {}