package org.security.project.detail.siswa.kelurahan.controller;

import org.security.project.detail.siswa.kelurahan.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/desa")
public class DesaController {
    public static List<KelurahanModel> kelurahanList;

    public DesaController() {
        kelurahanList = new ArrayList<>();

        KelurahanModel sukahurip = new KelurahanModel("59febb99-0309-4ad5-8ea2-5e9654e87079", "Sukahurip", "Pamarican");
        KelurahanModel pamarican = new KelurahanModel("59febb99-0309-4ad5-8ea2-5e9654e87080", "Pamarican", "Pamarican");
        KelurahanModel sukajadi = new KelurahanModel("59febb99-0309-4ad5-8ea2-5e9654e87081", "Sukajadi", "Pamarican");

        //warga list
        List<PeopleModel> wargaList = new ArrayList<>();

        //rt list
        List<RTModel> rtList = new ArrayList<>();

        //rw list
        List<RWModel> rwList = new ArrayList<>();

        //dusun list
        List<DusunModel> dusunList = new ArrayList<>();

        //dusun
        DusunModel ciparakan = new DusunModel("59febb99-0309-4ad5-8ea2-5e9654e87073", "Ciparakan", "Nurdin", sukahurip);
        ciparakan.setRwModels(rwList);
        dusunList.add(ciparakan);
        DusunModel citundun = new DusunModel("59febb99-0309-4ad5-8ea2-5e9654e87074", "Citundun", "Jaka", sukahurip);
        dusunList.add(citundun);
        DusunModel cigaleh = new DusunModel("59febb99-0309-4ad5-8ea2-5e9654e87075", "Cigaleh", "Dimas", sukahurip);
        dusunList.add(cigaleh);

        //rw
        RWModel tori = new RWModel("59febb99-0309-4ad5-8ea2-5e9654e87076", "RW 01", "Tori", sukahurip, ciparakan);
        tori.setRtModels(rtList);
        rwList.add(tori);
        RWModel joyo = new RWModel("59febb99-0309-4ad5-8ea2-5e9654e87077", "RW 02", "Joyo", sukahurip, ciparakan);
        rwList.add(joyo);
        RWModel ade = new RWModel("59febb99-0309-4ad5-8ea2-5e9654e87078", "RW 03", "Ade", sukahurip, ciparakan);
        rwList.add(ade);

        //rt
        RTModel ridwan = new RTModel("462af9d5-6087-4d56-9101-af1cca5d2a28", "RT 01", "Ridwan");
        rtList.add(ridwan);
        RTModel hamzah = new RTModel("59febb99-0309-4ad5-8ea2-5e9654e87071", "RT 02", "Hamzah");
        rtList.add(hamzah);
        RTModel ocen = new RTModel("618b3f1c-b92d-4cb1-bb06-c502b0db37b4", "RT 03", "Ocen");
        ocen.setPeopleModel(wargaList);
        rtList.add(ocen);

        //warga list
        PeopleModel malik = new PeopleModel("618b3f1c-b92d-4cb1-bb06-c502b0db37b5", 111, "Malik", "Pria", "30");
        wargaList.add(malik);
        PeopleModel jaki = new PeopleModel("59febb99-0309-4ad5-8ea2-5e9654e87072", 222, "Jaki", "Pria", "40");
        wargaList.add(jaki);
        PeopleModel afik = new PeopleModel("462af9d5-6087-4d56-9101-af1cca5d2a29", 333, "Afik", "Wanita", "50");
        wargaList.add(afik);

        sukahurip.setDusunModels(dusunList);

        //generate data
        kelurahanList.add(sukahurip);
        kelurahanList.add(pamarican);
        kelurahanList.add(sukajadi);
    }

    @GetMapping()
    public ModelAndView get() {
        ModelAndView view = new ModelAndView("kelurahan/dashboard/index");
        view.addObject("data", kelurahanList);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView desaDetail(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("kelurahan/detail/desa");
        view.addObject("id", id);

        Optional<KelurahanModel> kelurahan = kelurahanList.stream().filter(x -> x.getId().equals(id)).findFirst();
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
        ModelAndView view = new ModelAndView("kelurahan/detail/dusun");
        view.addObject("id", id);
        view.addObject("dusunId", dusunId);

        Optional<KelurahanModel> kelurahan = kelurahanList.stream().filter(x -> x.getId().equals(id)).findFirst();
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
        ModelAndView view = new ModelAndView("kelurahan/detail/rw");
        view.addObject("desaId", desaId);
        view.addObject("dusunId", dusunId);
        view.addObject("rwId", rwId);

        Optional<KelurahanModel> kelurahan = kelurahanList.stream().filter(x -> x.getId().equals(desaId)).findFirst();
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
        ModelAndView view = new ModelAndView("kelurahan/detail/rt");
        view.addObject("desaId", desaId);
        view.addObject("dusunId", dusunId);
        view.addObject("rwId", rwId);
        view.addObject("rtId", rtId);

        Optional<KelurahanModel> kelurahan = kelurahanList.stream().filter(x -> x.getId().equals(desaId)).findFirst();
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
        ModelAndView view = new ModelAndView("kelurahan/add/list");

        KelurahanModel kelurahan = new KelurahanModel();

        List<DusunModel> dusunList = new ArrayList<>();

        //warga
        ArrayList<PeopleModel> warga1 = new ArrayList<>();
        warga1.add(new PeopleModel( 0, "", "", ""));
        warga1.add(new PeopleModel( 0, "", "", ""));

        //rt
        ArrayList<RTModel> rt1 = new ArrayList<>();
        rt1.add(new RTModel( "", "", warga1));

        //rw
        ArrayList<RWModel> rw1 = new ArrayList<>();
        rw1.add(new RWModel( "", "", rt1));

        //dusun
        DusunModel dusun1 = new DusunModel( "", "", rw1);
        dusunList.add(dusun1);

        //add to kelurahan
        kelurahan.setDusunModels(dusunList);

        view.addObject("desa", kelurahan);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute KelurahanModel kelurahan) {
        generateId(kelurahan);
        kelurahanList.add(kelurahan);
        return new ModelAndView("redirect:/desa");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView add(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("kelurahan/edit/list");

        for (KelurahanModel kelurahan : kelurahanList) {
            if (kelurahan.getId().equals(id)) {
                view.addObject("desa", kelurahan);
                return view;
            }
        }
        return new ModelAndView("redirect:/desa");
    }

    @PostMapping("/update/{id}")
    public ModelAndView update(@PathVariable("id") String id, @ModelAttribute("desa") KelurahanModel kelurahan) {
        for (int i = 0; i < kelurahanList.size(); i++) {
            if (kelurahanList.get(i).getId().equals(id)) {
                kelurahanList.set(i, kelurahan);
                return new ModelAndView("redirect:/desa");
            }
        }
        return new ModelAndView("redirect:/desa");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("kelurahan/delete/list");

        for (KelurahanModel kelurahan : kelurahanList) {
            if (kelurahan.getId().equals(id)) {
                view.addObject("desa", kelurahan);
                return view;
            }
        }
        return new ModelAndView("redirect:/desa");
    }

    @PostMapping("/remove/{id}")
    public ModelAndView remove(@PathVariable("id") String id, @ModelAttribute KelurahanModel kelurahan) {
        for (int i = 0; i < kelurahanList.size(); i++) {
            if (kelurahanList.get(i).getId().equals(id)) {
                kelurahanList.remove(i);
                return new ModelAndView("redirect:/desa");
            }
        }
        return new ModelAndView("redirect:/desa");
    }

    private void generateId(KelurahanModel kelurahan) {
        // Generate ID for KelurahanModel
        kelurahan.setId(UUID.randomUUID().toString());

        // Generate IDs for all nested entities
        for (DusunModel dusun : kelurahan.getDusunModels()) {
            dusun.setId(UUID.randomUUID().toString());
            for (RWModel rw : dusun.getRwModels()) {
                rw.setId(UUID.randomUUID().toString());
                for (RTModel rt : rw.getRtModels()) {
                    rt.setId(UUID.randomUUID().toString());
                    for (PeopleModel people : rt.getPeopleModel()) {
                        people.setId(UUID.randomUUID().toString());
                    }
                }
            }
        }
    }
}
