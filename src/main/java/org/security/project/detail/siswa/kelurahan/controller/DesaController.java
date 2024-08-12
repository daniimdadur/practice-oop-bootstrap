package org.security.project.detail.siswa.kelurahan.controller;

import org.security.project.detail.siswa.kelurahan.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

        KelurahanModel sukahurip = new KelurahanModel("1", "Sukahurip", "Pamarican");

        //warga list
        List<PeopleModel> wargaList = new ArrayList<>();

        //rt list
        List<RTModel> rtList = new ArrayList<>();

        //rw list
        List<RWModel> rwList = new ArrayList<>();

        //dusun list
        List<DusunModel> dusunList = new ArrayList<>();

        //dusun
        DusunModel ciparakan = new DusunModel("1", "Ciparakan", "Nurdin");
        ciparakan.setRwModels(rwList);
        dusunList.add(ciparakan);
        DusunModel citundun = new DusunModel("2", "Citundun", "Jaka");
        dusunList.add(citundun);
        DusunModel cigaleh = new DusunModel("3", "Cigaleh", "Dimas");
        dusunList.add(cigaleh);

        //rw
        RWModel tori = new RWModel(UUID.randomUUID().toString(), "RW 01", "Tori");
        tori.setRtModels(rtList);
        rwList.add(tori);
        RWModel joyo = new RWModel(UUID.randomUUID().toString(), "RW 02", "Joyo");
        rwList.add(joyo);
        RWModel ade = new RWModel(UUID.randomUUID().toString(), "RW 03", "Ade");
        rwList.add(ade);

        //rt
        RTModel ridwan = new RTModel(UUID.randomUUID().toString(), "RT 01", "Ridwan");
        rtList.add(ridwan);
        RTModel hamzah = new RTModel(UUID.randomUUID().toString(), "RT 02", "Hamzah");
        rtList.add(hamzah);
        RTModel ocen = new RTModel(UUID.randomUUID().toString(), "RT 03", "Ocen");
        ocen.setPeopleModel(wargaList);
        rtList.add(ocen);

        //warga list
        PeopleModel malik = new PeopleModel(UUID.randomUUID().toString(), 111, "Malik", "Pria", "30");
        wargaList.add(malik);
        PeopleModel jaki = new PeopleModel(UUID.randomUUID().toString(), 222, "Jaki", "Pria", "40");
        wargaList.add(jaki);
        PeopleModel afik = new PeopleModel(UUID.randomUUID().toString(), 333, "Afik", "Wanita", "50");
        wargaList.add(afik);

        sukahurip.setDusunModels(dusunList);

        //generate data
        kelurahanList.add(sukahurip);
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

    @GetMapping("/desa/{id}/dusun/{dusunId}")
    public ModelAndView dusunDetail(@PathVariable("id") String id,
                                    @PathVariable("dusunId") String dusunId) {
        ModelAndView view = new ModelAndView("kelurahan/detail/dusun");
        view.addObject("id", id);
        view.addObject("dusunId", dusunId);

        Optional<KelurahanModel> kelurahan = kelurahanList.stream().filter(x -> x.getId().equals(id)).findFirst();
        if (kelurahan.isPresent()) {
            DusunModel dusun = kelurahan.get().getDusunModels().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            view.addObject("dusun", dusun);
            return view;
        } else {
            return new ModelAndView("redirect:/desa");
        }
    }
}
