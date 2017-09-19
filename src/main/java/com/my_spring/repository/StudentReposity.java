package com.my_spring.repository;

import com.my_spring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface StudentReposity extends JpaRepository<Student,Long>{

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
   Student getStudentById(int id);

    /**
     * 根据用户名查找用户
     * @param name
     * @return
     */
   @Query("from student where user_name=:name ")
   Student findStudent(@Param("name") String name);
}
