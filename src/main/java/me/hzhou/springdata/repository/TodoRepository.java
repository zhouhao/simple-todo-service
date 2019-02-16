package me.hzhou.springdata.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import me.hzhou.springdata.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findByUserId(Integer userId);

    List<Todo> findByCompletedAndRemindTimeBetween(Boolean isCompleted, LocalDateTime fromTime, LocalDateTime toTime);
}