package com.example.AlokSpringCRUD;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public void create(Student s) {
        repo.save(s);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Student getById(int id) {
        return repo.findById(id);
    }

    public void update(int id, Student s) {
        repo.update(id, s);
    }

    public void delete(int id) {
        repo.delete(id);
    }
}