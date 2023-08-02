package Services;

import Models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // i need to ask eng.Menna about this annotation
public class StudentServices implements IStudentServices{
    @Override
    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "MAhmoudMatar",
                        "01128673348",
                        "mahmoudmatar49@gmail.com",
                        3.2
                )
        );
    }
}
