package com.leapfrog.jdbcandui.dao;

import com.leapfrog.jdbcandui.entity.Student;
import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {

    int insert(Student s) throws SQLException, ClassNotFoundException;

    int update(Student s) throws SQLException, ClassNotFoundException;

    int delete(String id) throws SQLException, ClassNotFoundException;

    Student getById(String id) throws SQLException, ClassNotFoundException;

    List<Student> getAll() throws SQLException, ClassNotFoundException;

}
