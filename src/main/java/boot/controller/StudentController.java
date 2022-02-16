package boot.controller;

import boot.bean.Student;
import boot.service.StudentService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
public class StudentController {
    @Resource(name = "StudentServiceImpl")
    StudentService studentService;

    @GetMapping("/student")
    public Student getStudentById(@RequestParam("id") Long id) {
        return studentService.getById(id);
    }

    @PostMapping("/student")
    public Student insertStudent(Student student){
        studentService.insert(student);
        return student;
    }

    @DeleteMapping("/student")
    public void deleteStudent(@RequestParam("id") Long id){
        studentService.deleteById(id);
        System.out.println("id:"+id+" DELETED SUCCESSFULLY");
    }

    @PutMapping ("/student")
    public void updateStuGrades(@RequestParam("id") Long id,@RequestParam("grades") Double grades){
        studentService.updateGrades(id,grades);
        System.out.println("id:"+id+"GRADES UPDATED SUCCESSFULLY");
    }


}


