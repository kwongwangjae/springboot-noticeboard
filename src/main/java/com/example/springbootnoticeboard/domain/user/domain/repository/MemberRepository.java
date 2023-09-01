package com.example.springbootnoticeboard.domain.user.domain.repository;

import com.example.springbootnoticeboard.domain.user.domain.entity.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}