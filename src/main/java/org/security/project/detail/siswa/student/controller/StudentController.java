package org.security.project.detail.siswa.student.controller;

import lombok.RequiredArgsConstructor;
import org.security.project.detail.siswa.student.StudentService;
import org.security.project.detail.siswa.student.model.StudentModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final List<StudentModel> studentList = new ArrayList<>();
    private final StudentService studentService;

    @GetMapping
    public ModelAndView getAll() {
        ModelAndView view = new ModelAndView("pages/student/index");
        List<StudentModel> student = studentService.getStudents();
        view.addObject("data", student);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView getDetail(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("pages/student/detail");
        Optional<StudentModel> detail = studentService.getById(id);
        if (detail.isPresent()) {
            view.addObject("student", detail.get());
        } else {
            return new ModelAndView("redirect:/student");
        }
        return view;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView view = new ModelAndView("pages/student/add");
        StudentModel student = this.studentService.createStudent();
        view.addObject("student", student);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("student") StudentModel student) {
        this.studentService.save(student);
        return new ModelAndView("redirect:/student");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("pages/student/edit");

        for (StudentModel student : this.studentList) {
            if (student.getId().equals(id)) {
                view.addObject("student", student);
                return view;
            }
        }
        return new ModelAndView("redirect:/student");
    }

    @PostMapping("/update/{id}")
    public ModelAndView update(@PathVariable("id") Integer id, @ModelAttribute("student") StudentModel student) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).getId().equals(id)) {
                this.studentList.set(i, student);
                return new ModelAndView("redirect:/student");
            }
        }
        return new ModelAndView("redirect:/student");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("pages/student/delete");

        for (StudentModel student : this.studentList) {
            if (student.getId().equals(id)) {
                view.addObject("student", student);
                return view;
            }
        }
        return new ModelAndView("redirect:/student");
    }

    @PostMapping("/remove/{id}")
    public ModelAndView remove(@PathVariable("id") Integer id, @ModelAttribute StudentModel student) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (student.getId().equals(id)) {
                this.studentList.remove(i);
                return new ModelAndView("redirect:/student");
            }
        }
        return new ModelAndView("redirect:/student");
    }
}
