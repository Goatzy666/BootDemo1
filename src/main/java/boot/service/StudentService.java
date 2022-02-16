package boot.service;

import boot.bean.Student;

public interface StudentService {
    Student getById(Long id);
    void insert(Student student);
    void deleteById(Long id);
    void updateGrades(Long id,Double grades);
}
