package org.security.project.detail.siswa.kelurahan.controller;

import lombok.RequiredArgsConstructor;
import org.security.project.detail.siswa.kelurahan.model.*;
import org.security.project.detail.siswa.kelurahan.service.KelurahanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/desa")
public class DesaController {
    private final KelurahanService kelurahanService;

    @GetMapping()
    public ModelAndView get() {
        ModelAndView view = new ModelAndView("pages/kelurahan/dashboard/index");
        List<KelurahanModel> kelurahan = kelurahanService.get();
        view.addObject("data", kelurahan);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView desaDetail(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("pages/kelurahan/detail/desa");
        view.addObject("id", id);

        Optional<KelurahanModel> kelurahan = kelurahanService.getById(id);
        if (kelurahan.isPresent()) {
            view.addObject("kelurahan", kelurahan.get());
            return view;
        } else {
            return new ModelAndView("redirect:/desa");
        }
    }

    @GetMapping("/desa/{desaId}/dusun/{dusunId}")
    public ModelAndView dusunDetail(@PathVariable("desaId") String id,
                                    @PathVariable("dusunId") String dusunId) {
        ModelAndView view = new ModelAndView("pages/kelurahan/detail/dusun");
        view.addObject("id", id);
        view.addObject("dusunId", dusunId);

        Optional<KelurahanModel> kelurahan = kelurahanService.getById(id);
        if (kelurahan.isPresent()) {
            DusunModel dusun = kelurahan.get().getDusunModels().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            view.addObject("dusun", dusun);
            view.addObject("kelurahan", kelurahan.get());
            return view;
        } else {
            return new ModelAndView("redirect:/desa");
        }
    }

    @GetMapping("/desa/{desaId}/dusun/{dusunId}/rw/{rwId}")
    public ModelAndView rwDetail(@PathVariable("desaId") String desaId,
                                 @PathVariable("dusunId") String dusunId,
                                 @PathVariable("rwId") String rwId) {
        ModelAndView view = new ModelAndView("pages/kelurahan/detail/rw");
        view.addObject("desaId", desaId);
        view.addObject("dusunId", dusunId);
        view.addObject("rwId", rwId);

        Optional<KelurahanModel> kelurahan = kelurahanService.getById(desaId);
        if (kelurahan.isPresent()) {
            DusunModel dusun = kelurahan.get().getDusunModels().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            RWModel rw = dusun.getRwModels().stream().filter(x -> x.getId().equals(rwId)).findFirst().get();
            view.addObject("kelurahan", kelurahan.get());
            view.addObject("dusun", dusun);
            view.addObject("rw", rw);
            return view;
        } else {
            return new ModelAndView("redirect:/desa");
        }
    }

    @GetMapping("/desa/{desaId}/dusun/{dusunId}/rw/{rwId}/rt/{rtId}")
    public ModelAndView rtDetail(@PathVariable("desaId") String desaId,
                                 @PathVariable("dusunId") String dusunId,
                                 @PathVariable("rwId") String rwId,
                                 @PathVariable("rtId") String rtId) {
        ModelAndView view = new ModelAndView("pages/kelurahan/detail/rt");
        view.addObject("desaId", desaId);
        view.addObject("dusunId", dusunId);
        view.addObject("rwId", rwId);
        view.addObject("rtId", rtId);

        Optional<KelurahanModel> kelurahan = kelurahanService.getById(desaId);
        if (kelurahan.isPresent()) {
            DusunModel dusun = kelurahan.get().getDusunModels().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            RWModel rw = dusun.getRwModels().stream().filter(x -> x.getId().equals(rwId)).findFirst().get();
            RTModel rt = rw.getRtModels().stream().filter(x -> x.getId().equals(rtId)).findFirst().get();
            view.addObject("kelurahan", kelurahan.get());
            view.addObject("dusun", dusun);
            view.addObject("rw", rw);
            view.addObject("rt", rt);
            return view;
        } else {
            return new ModelAndView("redirect:/desa");
        }
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView view = new ModelAndView("pages/kelurahan/add/list");

        KelurahanModel kelurahan = kelurahanService.prepareKelurahanData();

        view.addObject("desa", kelurahan);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute KelurahanModel kelurahan) {
        kelurahanService.save(kelurahan);
        return new ModelAndView("redirect:/desa");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView add(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("pages/kelurahan/edit/list");

        Optional<KelurahanModel> kelurahan = this.kelurahanService.getById(id);
        if (kelurahan.isPresent()) {
            view.addObject("desa", kelurahan.get());
            return view;
        }
        return new ModelAndView("redirect:/desa");
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("desa") KelurahanModel kelurahan) {
        this.kelurahanService.update(kelurahan, kelurahan.getId());
        return new ModelAndView("redirect:/desa");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("pages/kelurahan/delete/list");

        Optional<KelurahanModel> kelurahan = this.kelurahanService.getById(id);
        if (kelurahan.isPresent()) {
            view.addObject("desa", kelurahan.get());
            return view;
        }
        return new ModelAndView("redirect:/desa");
    }

    @PostMapping("/remove")
    public ModelAndView remove(@ModelAttribute KelurahanModel kelurahan){
        this.kelurahanService.remove(kelurahan.getId());
        return new ModelAndView("redirect:/desa");
    }
//
//    @GetMapping("/delete/{id}")
//    public ModelAndView delete(@PathVariable("id") String id) {
//        ModelAndView view = new ModelAndView("pages/kelurahan/delete/list");
//
//        for (KelurahanModel kelurahan : kelurahanService) {
//            if (kelurahan.getId().equals(id)) {
//                view.addObject("desa", kelurahan);
//                return view;
//            }
//        }
//        return new ModelAndView("redirect:/desa");
//    }
//
//    @PostMapping("/remove/{id}")
//    public ModelAndView remove(@PathVariable("id") String id, @ModelAttribute KelurahanModel kelurahan) {
//        for (int i = 0; i < kelurahanService.size(); i++) {
//            if (kelurahanService.get(i).getId().equals(id)) {
//                kelurahanService.remove(i);
//                return new ModelAndView("redirect:/desa");
//            }
//        }
//        return new ModelAndView("redirect:/desa");
//    }
//
//    private void generateId(KelurahanModel kelurahan) {
//        // Generate ID for KelurahanModel
//        kelurahan.setId(UUID.randomUUID().toString());
//
//        // Generate IDs for all nested entities
//        for (DusunModel dusun : kelurahan.getDusunModels()) {
//            dusun.setId(UUID.randomUUID().toString());
//            for (RWModel rw : dusun.getRwModels()) {
//                rw.setId(UUID.randomUUID().toString());
//                for (RTModel rt : rw.getRtModels()) {
//                    rt.setId(UUID.randomUUID().toString());
//                    for (PeopleModel people : rt.getPeopleModel()) {
//                        people.setId(UUID.randomUUID().toString());
//                    }
//                }
//            }
//        }
//    }
}
