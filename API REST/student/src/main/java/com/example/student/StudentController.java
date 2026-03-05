package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // ====================== API REST (avec @ResponseBody) ======================
    @GetMapping
    @ResponseBody
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    @ResponseBody
    public void newStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    @ResponseBody
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    // ====================== VUES THYMELEAF ======================
    @GetMapping("/thymeleaf")
    public String homePage(Model model) {
        model.addAttribute("stdlist", studentService.getStudents());
        return "index";
    }

    @GetMapping("/thymeleaf/addnew")
    public String addNewStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "newstudent";
    }

    @PostMapping("/thymeleaf/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.addStudent(student);
        return "redirect:/student/thymeleaf";
    }

    @GetMapping("/thymeleaf/deleteStudent/{id}")
    public String deleteStudentThymeleaf(@PathVariable(value = "id") long id) {
        studentService.deleteStudent(id);
        return "redirect:/student/thymeleaf";
    }
}