package com.example.react_aws_proj.todo.persistence;

import com.example.react_aws_proj.todo.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {

    @Query(value = "SELECT t FROM Todo t WHERE t.userId = ?1")
    List<TodoEntity> findByUserId(String userId);

}
