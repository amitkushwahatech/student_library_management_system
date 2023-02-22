package com.example.Student_Library_Management_System2.Services;

import com.example.Student_Library_Management_System2.Enums.CardStatus;
import com.example.Student_Library_Management_System2.Models.Card;
import com.example.Student_Library_Management_System2.Models.Student;
import com.example.Student_Library_Management_System2.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String createStudent(Student student){

        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudentVariableName(student);  //foregin key column attribute value


        //Lets go to the student
        student.setCard(card);

        //unidirectional mapping : we had to save both of them
        //bidirectional : child will automatically saved( cascading effect )
        studentRepository.save(student);

         return "Student and card save added";
    }
}
