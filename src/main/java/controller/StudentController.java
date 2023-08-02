package controller;

import Services.IStudentServices;
import Services.StudentServices;
import Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final IStudentServices iStudentServices;

    @Autowired  // i need to ask eng.Menna about this annotation
    public StudentController(StudentServices studentServices){
        this.iStudentServices=studentServices;
    }

    @GetMapping
    public List<Student> getStudent(){
        return iStudentServices.getStudent();
    }
}
