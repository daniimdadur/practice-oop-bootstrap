package org.security.project.detail.siswa.controller;

import org.security.project.detail.siswa.model.SchoolClassModel;
import org.security.project.detail.siswa.model.SchoolHistoryModel;
import org.security.project.detail.siswa.model.StudentModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {
    private final List<StudentModel> studentList = new ArrayList<>();

    public StudentController() {
        //data sabil
        List<SchoolHistoryModel> schoolHistorySabil = new ArrayList<>();
        schoolHistorySabil.add(
                new SchoolHistoryModel(1, "SDN 1 Surabaya", "Surabaya", "Central Java",
                        Arrays.asList(
                                new SchoolClassModel(1, "Class 01", LocalDate.of(2012, 1, 1), LocalDate.of(2013, 12, 31), "Uley"),
                                new SchoolClassModel(2, "Class 02", LocalDate.of(2013, 1, 1), LocalDate.of(2014, 12, 31), "Sandi"),
                                new SchoolClassModel(3, "Class 03", LocalDate.of(2014, 1, 1), LocalDate.of(2015, 12, 31), "Wanto"),
                                new SchoolClassModel(4, "Class 04", LocalDate.of(2015, 1, 1), LocalDate.of(2016, 12, 31), "Tahrir"),
                                new SchoolClassModel(5, "Class 05", LocalDate.of(2016, 1, 1), LocalDate.of(2017, 12, 31), "Dudu"),
                                new SchoolClassModel(6, "Class 06", LocalDate.of(2017, 1, 1), LocalDate.of(2018, 12, 31), "Ijad")
                        )
                )
        );

        schoolHistorySabil.add(
                new SchoolHistoryModel(2, "SMPN 1 Surabaya", "Surabaya", "Central Java",
                        Arrays.asList(
                                new SchoolClassModel(7, "Class 07", LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 31), "Sugiono"),
                                new SchoolClassModel(8, "Class 08", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Bayu"),
                                new SchoolClassModel(9, "Class 09", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Jaki")
                        )
                )
        );

        schoolHistorySabil.add(
                new SchoolHistoryModel(3, "SMAN 1 Surabaya", "Surabaya", "Central Java",
                        Arrays.asList(
                                new SchoolClassModel(10, "Class 10", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Sugiono"),
                                new SchoolClassModel(11, "Class 11", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Bayu"),
                                new SchoolClassModel(12, "Class 12", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Jaki")
                        )
                )
        );
        StudentModel sabil = new StudentModel(1, 1111, "Sabil", "Rayhan", "Surabaya");
        sabil.setSchoolHistory(schoolHistorySabil);

        //data dudu
        List<SchoolHistoryModel> schoolHistoryDudu = new ArrayList<>();
        schoolHistoryDudu.add(
                new SchoolHistoryModel(1, "SDN 1 Langkaplancar", "langkaplancar", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(1, "Class 01", LocalDate.of(2012, 1, 1), LocalDate.of(2013, 12, 31), "Uley"),
                                new SchoolClassModel(2, "Class 02", LocalDate.of(2013, 1, 1), LocalDate.of(2014, 12, 31), "Sandi"),
                                new SchoolClassModel(3, "Class 03", LocalDate.of(2014, 1, 1), LocalDate.of(2015, 12, 31), "Wanto"),
                                new SchoolClassModel(4, "Class 04", LocalDate.of(2015, 1, 1), LocalDate.of(2016, 12, 31), "Tahrir"),
                                new SchoolClassModel(5, "Class 05", LocalDate.of(2016, 1, 1), LocalDate.of(2017, 12, 31), "Dudu"),
                                new SchoolClassModel(6, "Class 06", LocalDate.of(2017, 1, 1), LocalDate.of(2018, 12, 31), "Ijad")
                        )
                )
        );

        schoolHistoryDudu.add(
                new SchoolHistoryModel(2, "SMPN 1 Langkaplancar", "langkaplancar", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(7, "Class 07", LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 31), "Sugiono"),
                                new SchoolClassModel(8, "Class 08", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Bayu"),
                                new SchoolClassModel(9, "Class 09", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Jaki")
                        )
                )
        );

        schoolHistoryDudu.add(
                new SchoolHistoryModel(2, "SMPN 1 Langkaplancar", "langkaplancar", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(10, "Class 10", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Sugiono"),
                                new SchoolClassModel(11, "Class 11", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Bayu"),
                                new SchoolClassModel(12, "Class 12", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Jaki")
                        )
                )
        );
        StudentModel dudu = new StudentModel(2, 2222, "Dudu", "Abdullah", "Langkaplancar");
        dudu.setSchoolHistory(schoolHistoryDudu);

        //data rayhan
        List<SchoolHistoryModel> schoolHistoryRayhan = new ArrayList<>();
        schoolHistoryRayhan.add(
                new SchoolHistoryModel(1, "SDN 1 Sidamulih", "Sidamulih", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(1, "Class 01", LocalDate.of(2013, 1, 1), LocalDate.of(2014, 12, 31), "Tahrir"),
                                new SchoolClassModel(2, "Class 02", LocalDate.of(2014, 1, 1), LocalDate.of(2015, 12, 31), "Wanto"),
                                new SchoolClassModel(3, "Class 03", LocalDate.of(2015, 1, 1), LocalDate.of(2016, 12, 31), "Sandi"),
                                new SchoolClassModel(4, "Class 04", LocalDate.of(2016, 1, 1), LocalDate.of(2017, 12, 31), "Haikal"),
                                new SchoolClassModel(5, "Class 05", LocalDate.of(2017, 1, 1), LocalDate.of(2018, 12, 31), "Danis"),
                                new SchoolClassModel(6, "Class 06", LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 31), "Cecep")
                        )
                )
        );

        schoolHistoryRayhan.add(
                new SchoolHistoryModel(2, "MTsN 7 Ciamis", "Sukahurip", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(7, "Class 07", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Cecep"),
                                new SchoolClassModel(8, "Class 08", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Bumi"),
                                new SchoolClassModel(7, "Class 09", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Hilmi")
                        )
                )
        );

        schoolHistoryRayhan.add(
                new SchoolHistoryModel(3, "SMAN 1 Pamarican", "Pamarican", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(10, "Class 10", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Amad"),
                                new SchoolClassModel(11, "Class 11", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Yuli"),
                                new SchoolClassModel(12, "Class 12", LocalDate.of(2024, 1, 1), LocalDate.of(2025, 12, 31), "Hilmi")
                        )
                )
        );
        StudentModel rayhan = new StudentModel(3, 3333, "Rayhan", "Wildan", "Sidamulih");
        rayhan.setSchoolHistory(schoolHistoryRayhan);

        //generate data
        this.studentList.add(sabil);
        this.studentList.add(dudu);
        this.studentList.add(rayhan);
    }

    @GetMapping
    public ModelAndView getAll() {
        ModelAndView view = new ModelAndView("student/index");
        view.addObject("data", studentList);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView getDetail(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("student/detail");
        Optional<StudentModel> detail = studentList.stream().filter(student -> student.getId() == id).findFirst();
        if (detail.isPresent()) {
            view.addObject("student", detail.get());
        } else {
            return new ModelAndView("redirect:/student");
        }
        return view;
    }
}
