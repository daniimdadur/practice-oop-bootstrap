package org.security.project.detail.siswa.student.controller;

import org.security.project.detail.siswa.kelurahan.model.KelurahanModel;
import org.security.project.detail.siswa.student.model.SchoolClassModel;
import org.security.project.detail.siswa.student.model.SchoolHistoryModel;
import org.security.project.detail.siswa.student.model.StudentModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

        //data jahfal
        List<SchoolHistoryModel> schoolHistoryJahfal = new ArrayList<>();
        schoolHistoryJahfal.add(
                new SchoolHistoryModel(1, "SDN 1 Bandung", "Bandung", "West Java",
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

        schoolHistoryJahfal.add(
                new SchoolHistoryModel(2, "MTsN 7 Ciamis", "Sukahurip", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(7, "Class 07", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Cecep"),
                                new SchoolClassModel(8, "Class 08", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Bumi"),
                                new SchoolClassModel(7, "Class 09", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Hilmi")
                        )
                )
        );

        schoolHistoryJahfal.add(
                new SchoolHistoryModel(3, "MA IPHI Pamarican", "Pamarican", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(10, "Class 10", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Deri"),
                                new SchoolClassModel(11, "Class 11", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Puri"),
                                new SchoolClassModel(12, "Class 12", LocalDate.of(2024, 1, 1), LocalDate.of(2025, 12, 31), "Deuis")
                        )
                )
        );
        StudentModel jahfal = new StudentModel(4, 4444, "Jahfal", "Baehaki", "Bandung");
        jahfal.setSchoolHistory(schoolHistoryJahfal);

        //data naufal
        List<SchoolHistoryModel> schoolHistoryNaufal = new ArrayList<>();
        schoolHistoryNaufal.add(
                new SchoolHistoryModel(1, "MIS Sukajadi", "Sukajadi", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(1, "Class 01", LocalDate.of(2013, 1, 1), LocalDate.of(2014, 12, 31), "Titin"),
                                new SchoolClassModel(2, "Class 02", LocalDate.of(2014, 1, 1), LocalDate.of(2015, 12, 31), "Omah"),
                                new SchoolClassModel(3, "Class 03", LocalDate.of(2015, 1, 1), LocalDate.of(2016, 12, 31), "Erum"),
                                new SchoolClassModel(4, "Class 04", LocalDate.of(2016, 1, 1), LocalDate.of(2017, 12, 31), "Dudi"),
                                new SchoolClassModel(5, "Class 05", LocalDate.of(2017, 1, 1), LocalDate.of(2018, 12, 31), "Fulanah"),
                                new SchoolClassModel(6, "Class 06", LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 31), "Asep")
                        )
                )
        );

        schoolHistoryNaufal.add(
                new SchoolHistoryModel(2, "MTsN 7 Ciamis", "Sukahurip", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(7, "Class 07", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Sali"),
                                new SchoolClassModel(8, "Class 08", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Aso"),
                                new SchoolClassModel(7, "Class 09", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Siska")
                        )
                )
        );

        schoolHistoryNaufal.add(
                new SchoolHistoryModel(3, "MA IPHI Pamarican", "Pamarican", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(10, "Class 10", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Deri"),
                                new SchoolClassModel(11, "Class 11", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Puri"),
                                new SchoolClassModel(12, "Class 12", LocalDate.of(2024, 1, 1), LocalDate.of(2025, 12, 31), "Deuis")
                        )
                )
        );
        StudentModel naufal = new StudentModel(5, 5555, "Naufal", "Firdaus", "Sukajadi");
        naufal.setSchoolHistory(schoolHistoryNaufal);

        //data adit
        List<SchoolHistoryModel> schoolHistoryAdit = new ArrayList<>();
        schoolHistoryAdit.add(
                new SchoolHistoryModel(1, "MIS Sukajadi", "Sukajadi", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(1, "Class 01", LocalDate.of(2013, 1, 1), LocalDate.of(2014, 12, 31), "Titin"),
                                new SchoolClassModel(2, "Class 02", LocalDate.of(2014, 1, 1), LocalDate.of(2015, 12, 31), "Omah"),
                                new SchoolClassModel(3, "Class 03", LocalDate.of(2015, 1, 1), LocalDate.of(2016, 12, 31), "Erum"),
                                new SchoolClassModel(4, "Class 04", LocalDate.of(2016, 1, 1), LocalDate.of(2017, 12, 31), "Dudi"),
                                new SchoolClassModel(5, "Class 05", LocalDate.of(2017, 1, 1), LocalDate.of(2018, 12, 31), "Fulanah"),
                                new SchoolClassModel(6, "Class 06", LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 31), "Asep")
                        )
                )
        );

        schoolHistoryAdit.add(
                new SchoolHistoryModel(2, "MTsN 7 Ciamis", "Sukahurip", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(7, "Class 07", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Sali"),
                                new SchoolClassModel(8, "Class 08", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Aso"),
                                new SchoolClassModel(7, "Class 09", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Siska")
                        )
                )
        );

        schoolHistoryAdit.add(
                new SchoolHistoryModel(3, "MA IPHI Pamarican", "Pamarican", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(10, "Class 10", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Deri"),
                                new SchoolClassModel(11, "Class 11", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Puri"),
                                new SchoolClassModel(12, "Class 12", LocalDate.of(2024, 1, 1), LocalDate.of(2025, 12, 31), "Deuis")
                        )
                )
        );
        StudentModel adit = new StudentModel(6, 6666, "Adit", "Sutan", "Sukajadi");
        adit.setSchoolHistory(schoolHistoryAdit);

        //data agung
        List<SchoolHistoryModel> schoolHistoryAgung = new ArrayList<>();
        schoolHistoryAgung.add(
                new SchoolHistoryModel(1, "MIS Sukajadi", "Sukajadi", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(1, "Class 01", LocalDate.of(2013, 1, 1), LocalDate.of(2014, 12, 31), "Titin"),
                                new SchoolClassModel(2, "Class 02", LocalDate.of(2014, 1, 1), LocalDate.of(2015, 12, 31), "Omah"),
                                new SchoolClassModel(3, "Class 03", LocalDate.of(2015, 1, 1), LocalDate.of(2016, 12, 31), "Erum"),
                                new SchoolClassModel(4, "Class 04", LocalDate.of(2016, 1, 1), LocalDate.of(2017, 12, 31), "Dudi"),
                                new SchoolClassModel(5, "Class 05", LocalDate.of(2017, 1, 1), LocalDate.of(2018, 12, 31), "Fulanah"),
                                new SchoolClassModel(6, "Class 06", LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 31), "Asep")
                        )
                )
        );

        schoolHistoryAgung.add(
                new SchoolHistoryModel(2, "MTsN 7 Ciamis", "Sukahurip", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(7, "Class 07", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Sali"),
                                new SchoolClassModel(8, "Class 08", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Aso"),
                                new SchoolClassModel(7, "Class 09", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Siska")
                        )
                )
        );

        schoolHistoryAgung.add(
                new SchoolHistoryModel(3, "MA IPHI Pamarican", "Pamarican", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(10, "Class 10", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Deri"),
                                new SchoolClassModel(11, "Class 11", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Puri"),
                                new SchoolClassModel(12, "Class 12", LocalDate.of(2024, 1, 1), LocalDate.of(2025, 12, 31), "Deuis")
                        )
                )
        );
        StudentModel agung = new StudentModel(7, 7777, "Agung", "Mustofa", "Sukajadi");
        agung.setSchoolHistory(schoolHistoryAgung);

        //data rizki
        List<SchoolHistoryModel> schoolHistoryRizki = new ArrayList<>();
        schoolHistoryRizki.add(
                new SchoolHistoryModel(1, "MIS Sukajadi", "Sukajadi", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(1, "Class 01", LocalDate.of(2013, 1, 1), LocalDate.of(2014, 12, 31), "Titin"),
                                new SchoolClassModel(2, "Class 02", LocalDate.of(2014, 1, 1), LocalDate.of(2015, 12, 31), "Omah"),
                                new SchoolClassModel(3, "Class 03", LocalDate.of(2015, 1, 1), LocalDate.of(2016, 12, 31), "Erum"),
                                new SchoolClassModel(4, "Class 04", LocalDate.of(2016, 1, 1), LocalDate.of(2017, 12, 31), "Dudi"),
                                new SchoolClassModel(5, "Class 05", LocalDate.of(2017, 1, 1), LocalDate.of(2018, 12, 31), "Fulanah"),
                                new SchoolClassModel(6, "Class 06", LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 31), "Asep")
                        )
                )
        );

        schoolHistoryRizki.add(
                new SchoolHistoryModel(2, "MTsN 7 Ciamis", "Sukahurip", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(7, "Class 07", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Sali"),
                                new SchoolClassModel(8, "Class 08", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Aso"),
                                new SchoolClassModel(7, "Class 09", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Siska")
                        )
                )
        );

        schoolHistoryRizki.add(
                new SchoolHistoryModel(3, "MA IPHI Pamarican", "Pamarican", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(10, "Class 10", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Deri"),
                                new SchoolClassModel(11, "Class 11", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Puri"),
                                new SchoolClassModel(12, "Class 12", LocalDate.of(2024, 1, 1), LocalDate.of(2025, 12, 31), "Deuis")
                        )
                )
        );
        StudentModel rizki = new StudentModel(8, 8888, "Rizki", "Najrul", "Sukajadi");
        rizki.setSchoolHistory(schoolHistoryRizki);

        //data danis
        List<SchoolHistoryModel> schoolHistoryDanis = new ArrayList<>();
        schoolHistoryDanis.add(
                new SchoolHistoryModel(1, "MIS Sukajadi", "Sukajadi", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(1, "Class 01", LocalDate.of(2013, 1, 1), LocalDate.of(2014, 12, 31), "Titin"),
                                new SchoolClassModel(2, "Class 02", LocalDate.of(2014, 1, 1), LocalDate.of(2015, 12, 31), "Omah"),
                                new SchoolClassModel(3, "Class 03", LocalDate.of(2015, 1, 1), LocalDate.of(2016, 12, 31), "Erum"),
                                new SchoolClassModel(4, "Class 04", LocalDate.of(2016, 1, 1), LocalDate.of(2017, 12, 31), "Dudi"),
                                new SchoolClassModel(5, "Class 05", LocalDate.of(2017, 1, 1), LocalDate.of(2018, 12, 31), "Fulanah"),
                                new SchoolClassModel(6, "Class 06", LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 31), "Asep")
                        )
                )
        );

        schoolHistoryDanis.add(
                new SchoolHistoryModel(2, "MTsN 7 Ciamis", "Sukahurip", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(7, "Class 07", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Sali"),
                                new SchoolClassModel(8, "Class 08", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Aso"),
                                new SchoolClassModel(7, "Class 09", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Siska")
                        )
                )
        );

        schoolHistoryDanis.add(
                new SchoolHistoryModel(3, "SMK Al-Ihsan", "Pamarican", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(10, "Class 10", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Deri"),
                                new SchoolClassModel(11, "Class 11", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Puri"),
                                new SchoolClassModel(12, "Class 12", LocalDate.of(2024, 1, 1), LocalDate.of(2025, 12, 31), "Deuis")
                        )
                )
        );
        StudentModel danis = new StudentModel(9, 9999, "Danis", "Bahri", "Sidaharja");
        danis.setSchoolHistory(schoolHistoryDanis);

        //data zaeta
        List<SchoolHistoryModel> schoolHistoryZaeta = new ArrayList<>();
        schoolHistoryZaeta.add(
                new SchoolHistoryModel(1, "MIS Sukajadi", "Sukajadi", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(1, "Class 01", LocalDate.of(2013, 1, 1), LocalDate.of(2014, 12, 31), "Titin"),
                                new SchoolClassModel(2, "Class 02", LocalDate.of(2014, 1, 1), LocalDate.of(2015, 12, 31), "Omah"),
                                new SchoolClassModel(3, "Class 03", LocalDate.of(2015, 1, 1), LocalDate.of(2016, 12, 31), "Erum"),
                                new SchoolClassModel(4, "Class 04", LocalDate.of(2016, 1, 1), LocalDate.of(2017, 12, 31), "Dudi"),
                                new SchoolClassModel(5, "Class 05", LocalDate.of(2017, 1, 1), LocalDate.of(2018, 12, 31), "Fulanah"),
                                new SchoolClassModel(6, "Class 06", LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 31), "Asep")
                        )
                )
        );

        schoolHistoryZaeta.add(
                new SchoolHistoryModel(2, "MTsN 7 Ciamis", "Sukahurip", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(7, "Class 07", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 12, 31), "Sali"),
                                new SchoolClassModel(8, "Class 08", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31), "Aso"),
                                new SchoolClassModel(7, "Class 09", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 12, 31), "Siska")
                        )
                )
        );

        schoolHistoryZaeta.add(
                new SchoolHistoryModel(3, "SMAN 1 Banjarsari", "Banjarsari", "West Java",
                        Arrays.asList(
                                new SchoolClassModel(10, "Class 10", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 12, 31), "Deri"),
                                new SchoolClassModel(11, "Class 11", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 12, 31), "Puri"),
                                new SchoolClassModel(12, "Class 12", LocalDate.of(2024, 1, 1), LocalDate.of(2025, 12, 31), "Deuis")
                        )
                )
        );
        StudentModel zaeta = new StudentModel(10, 10101010, "Zaeta", "Fulanah", "Sidaharja");
        zaeta.setSchoolHistory(schoolHistoryZaeta);

        //generate data
        this.studentList.add(sabil);
        this.studentList.add(dudu);
        this.studentList.add(rayhan);
        this.studentList.add(jahfal);
        this.studentList.add(naufal);
        this.studentList.add(adit);
        this.studentList.add(agung);
        this.studentList.add(rizki);
        this.studentList.add(danis);
        this.studentList.add(zaeta);
    }

    @GetMapping
    public ModelAndView getAll() {
        ModelAndView view = new ModelAndView("pages/student/index");
        view.addObject("data", studentList);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView getDetail(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("pages/student/detail");
        Optional<StudentModel> detail = studentList.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst();
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
        StudentModel student = new StudentModel();

        List<SchoolHistoryModel> schoolHistoryModel = new ArrayList<>();

        //sd
        ArrayList<SchoolClassModel> sdClass = new ArrayList<>();
        sdClass.add(new SchoolClassModel(0, "Class 01", null, null, ""));
        sdClass.add(new SchoolClassModel(0, "Class 02", null, null, ""));
        sdClass.add(new SchoolClassModel(0, "Class 03", null, null, ""));
        sdClass.add(new SchoolClassModel(0, "Class 04", null, null, ""));
        sdClass.add(new SchoolClassModel(0, "Class 05", null, null, ""));
        sdClass.add(new SchoolClassModel(0, "Class 06", null, null, ""));

        SchoolHistoryModel sdHistory = new SchoolHistoryModel(0, "SD", "", "", sdClass);
        schoolHistoryModel.add(sdHistory);

        //smp
        ArrayList<SchoolClassModel> smpClass = new ArrayList<>();
        smpClass.add(new SchoolClassModel(0, "Class 07", null, null, ""));
        smpClass.add(new SchoolClassModel(0, "Class 08", null, null, ""));
        smpClass.add(new SchoolClassModel(0, "Class 09", null, null, ""));

        SchoolHistoryModel smpHistory = new SchoolHistoryModel(0, "SMP", "", "", smpClass);
        schoolHistoryModel.add(smpHistory);

        //sma
        ArrayList<SchoolClassModel> smaClass = new ArrayList<>();
        smaClass.add(new SchoolClassModel(0, "Class 10", null, null, ""));
        smaClass.add(new SchoolClassModel(0, "Class 11", null, null, ""));
        smaClass.add(new SchoolClassModel(0, "Class 12", null, null, ""));

        SchoolHistoryModel smaHistory = new SchoolHistoryModel(0, "SMA", "", "", smaClass);
        schoolHistoryModel.add(smaHistory);

        //add to student
        student.setSchoolHistory(schoolHistoryModel);

        view.addObject("student", student);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("student") StudentModel student) {
        this.studentList.add(student);
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
