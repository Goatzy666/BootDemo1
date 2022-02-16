package boot.service.impl;
import boot.bean.Student;
import boot.dao.StudentDao;
import boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentServiceImpl")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;
    @Override
    public Student getById(Long id){
        return studentDao.getById(id);
    }

    @Override
    public void insert(Student student) {
        studentDao.insert(student);
    }

    @Override
    public void deleteById(Long id) {
        studentDao.deleteById(id);
    }

    @Override
    public void updateGrades(Long id, Double grades) {
        studentDao.updateGrades(id,grades);
    }


}
