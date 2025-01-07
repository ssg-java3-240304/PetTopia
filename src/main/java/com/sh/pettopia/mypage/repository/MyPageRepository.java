package com.sh.pettopia.mypage.repository;

import com.sh.pettopia.user.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyPageRepository extends JpaRepository<Member, Long> {
}