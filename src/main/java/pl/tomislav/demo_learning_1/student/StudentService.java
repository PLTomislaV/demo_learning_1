package pl.tomislav.demo_learning_1.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> my_name_is(){
        return List.of(new Student(1L,"Tomasz","TOMASZ.L159@gmail.com", LocalDate.of(1998, Month.DECEMBER,12),23));
    }
}
