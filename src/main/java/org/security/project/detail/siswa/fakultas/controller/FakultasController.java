package org.security.project.detail.siswa.fakultas.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.security.project.detail.siswa.fakultas.model.*;
import org.security.project.detail.siswa.fakultas.service.FakultasSevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/fakultas")
public class FakultasController {
    private final FakultasSevice fakultasSevice;

    @GetMapping
    public ModelAndView get() {
        ModelAndView view = new ModelAndView("pages/fakultas/dashboard/index");
        List<FakultasModel> fakultas = this.fakultasSevice.getAllFakultas();
        view.addObject("data", fakultas);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView fakultasDetail(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("pages/fakultas/detail/fakultas");
        view.addObject("id", id);

        Optional<FakultasModel> fakultas = this.fakultasSevice.getFakultasById(id);
        if (fakultas.isPresent()) {
            view.addObject("fakultas", fakultas.get());
            return view;
        } else {
            return new ModelAndView("redirect:/fakultas");
        }
    }

    @GetMapping("/detail/{fakultasId}/majors/{majorsId}")
    public ModelAndView majorsDetail(@PathVariable("fakultasId") String fakultasId,
                                         @PathVariable("majorsId") String majorsId) {
        ModelAndView view = new ModelAndView("pages/fakultas/detail/majors");
        view.addObject("fakultasId", fakultasId);
        view.addObject("majorId", majorsId);

        Optional<FakultasModel> fakultas = fakultasSevice.getFakultasById(fakultasId);
        if (fakultas.isPresent()) {
            JurusanModel jurusan = fakultas.get().getJurusanModels().stream().filter(f -> f.getId().equals(majorsId)).findFirst().get();
            view.addObject("fakultas", fakultas.get());
            view.addObject("jurusan", jurusan);
            return view;
        }
        return new ModelAndView("redirect:/fakultas");
    }

    @GetMapping("/fakultas/{fakultasId}/majors/{majorsId}/majorsYear/{majorsYearId}")
    public ModelAndView majorsYearDetail(@PathVariable("fakultasId") String fakultasId,
                                         @PathVariable("majorsId") String majorsId,
                                         @PathVariable("majorsYearId") String majorsYearId) {
        ModelAndView view = new ModelAndView("pages/fakultas/detail/majors-years");
        view.addObject("fakultasId", fakultasId);
        view.addObject("majorId", majorsId);
        view.addObject("majorsYearId", majorsYearId);

        Optional<FakultasModel> fakultas = fakultasSevice.getFakultasById(fakultasId);
        if (fakultas.isPresent()) {
            JurusanModel jurusan = fakultas.get().getJurusanModels().stream().filter(f -> f.getId().equals(majorsId)).findFirst().get();
            StudentCountModel year = jurusan.getStudentCountModels().stream().filter(f -> f.getId().equals(majorsYearId)).findFirst().get();
            view.addObject("fakultas", fakultas.get());
            view.addObject("jurusan", jurusan);
            view.addObject("years", year);
            return view;
        }
        return new ModelAndView("redirect:/fakultas");
    }

    @GetMapping("/fakultas/{fakultasId}/majors/{majorsId}/majorsYear/{majorsYearId}/mahasiswa/{mahasiswaId}")
    public ModelAndView mahasiswaDetail(@PathVariable("fakultasId") String fakultasId,
                                        @PathVariable("majorsId") String majorsId,
                                        @PathVariable("majorsYearId") String majorsYearId,
                                        @PathVariable("mahasiswaId") String mahasiswaId) {
        ModelAndView view = new ModelAndView("pages/fakultas/detail/mahasiswa");
        view.addObject("fakultasId", fakultasId);
        view.addObject("majorsId", majorsId);
        view.addObject("majorsYearId", majorsYearId);
        view.addObject("mahasiswaId", mahasiswaId);

        Optional<FakultasModel> fakultas = fakultasSevice.getFakultasById(fakultasId);
        if (fakultas.isPresent()) {
            JurusanModel jurusan = fakultas.get().getJurusanModels().stream().filter(f -> f.getId().equals(majorsId)).findFirst().get();
            StudentCountModel year = jurusan.getStudentCountModels().stream().filter(f -> f.getId().equals(majorsYearId)).findFirst().get();
            MahasiswaModel mahasiswa = year.getMahasiswa().stream().filter(f -> f.getId().equals(mahasiswaId)).findFirst().get();
            view.addObject("fakultas", fakultas.get());
            view.addObject("jurusan", jurusan);
            view.addObject("years", year);
            view.addObject("mahasiswa", mahasiswa);
            return view;
        }
        return new ModelAndView("redirect:/fakultas");
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView view = new ModelAndView("pages/fakultas/add/list");

        FakultasModel fakultas = fakultasSevice.prepareFakultasData();
        view.addObject("fakultas", fakultas);
        return view;
    }

    @GetMapping("/v2/add")
    public ModelAndView addV2() {
        ModelAndView view = new ModelAndView("pages/fakultas/add/fakultas");

        FakultasModel fakultas = fakultasSevice.prepareFakultasData();
        view.addObject("fakultas", fakultas);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute FakultasModel fakultas) {

        fakultasSevice.save(fakultas);
        return new ModelAndView("redirect:/fakultas");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("pages/fakultas/edit/fakultas");
        Optional<FakultasModel> fakultas = fakultasSevice.getFakultasById(id);
        if (fakultas.isPresent()) {
            view.addObject("fakultas", fakultas.get());
            return view;
        } else {
            return new ModelAndView("redirect:/fakultas");
        }
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute FakultasModel fakultas) {
        fakultasSevice.update(fakultas, fakultas.getId());
        return new ModelAndView("redirect:/fakultas");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("pages/fakultas/delete/list");
        Optional<FakultasModel> fakultas = fakultasSevice.getFakultasById(id);
        if (fakultas.isPresent()) {
            view.addObject("fakultas", fakultas.get());
            return view;
        } else {
            return new ModelAndView("redirect:/fakultas");
        }
    }

    @PostMapping("/remove")
    public ModelAndView remove(@ModelAttribute FakultasModel fakultas) {
        fakultasSevice.delete(fakultas.getId());
        return new ModelAndView("redirect:/fakultas");
    }
}
