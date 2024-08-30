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
    public ModelAndView edit(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("pages/student/edit");

        Optional<StudentModel> student = studentService.getById(id);
        if (student.isPresent()) {
            view.addObject("student", student.get());
            return view;
        }
        return new ModelAndView("redirect:/student");
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("student") StudentModel student) {
        this.studentService.update(student, student.getId());
        return new ModelAndView("redirect:/student");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("pages/student/delete");

        Optional<StudentModel> student = studentService.getById(id);
        if (student.isPresent()) {
            view.addObject("student", student.get());
            return view;
        }
        return new ModelAndView("redirect:/student");
    }

    @PostMapping("/remove")
    public ModelAndView remove(@ModelAttribute StudentModel student) {
        this.studentService.delete(student.getId());
        return new ModelAndView("redirect:/student");
    }
}
