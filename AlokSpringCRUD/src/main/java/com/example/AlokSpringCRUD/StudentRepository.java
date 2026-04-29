package com.example.AlokSpringCRUD;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentRepository {

    private final JdbcTemplate jdbc;

    public StudentRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public int save(Student s) {
        return jdbc.update(
                "INSERT INTO student(name,email,course) VALUES (?,?,?)",
                s.getName(), s.getEmail(), s.getCourse());
    }

    public List<Student> findAll() {
        return jdbc.query("SELECT * FROM student",
                (rs, i) -> {
                    Student s = new Student();
                    s.setId(rs.getInt("id"));
                    s.setName(rs.getString("name"));
                    s.setEmail(rs.getString("email"));
                    s.setCourse(rs.getString("course"));
                    return s;
                });
    }

    public Student findById(int id) {
        return jdbc.queryForObject(
                "SELECT * FROM student WHERE id=?",
                new Object[] { id },
                (rs, i) -> {
                    Student s = new Student();
                    s.setId(rs.getInt("id"));
                    s.setName(rs.getString("name"));
                    s.setEmail(rs.getString("email"));
                    s.setCourse(rs.getString("course"));
                    return s;
                });
    }

    public int update(int id, Student s) {
        return jdbc.update(
                "UPDATE student SET name=?, email=?, course=? WHERE id=?",
                s.getName(), s.getEmail(), s.getCourse(), id);
    }

    public int delete(int id) {
        return jdbc.update("DELETE FROM student WHERE id=?", id);
    }
}