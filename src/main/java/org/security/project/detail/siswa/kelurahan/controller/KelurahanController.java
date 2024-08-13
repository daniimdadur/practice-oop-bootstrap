package org.security.project.detail.siswa.kelurahan.controller;

import org.security.project.detail.siswa.kelurahan.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/")
public class KelurahanController {
    private final List<KelurahanModel> kelurahanModels = new ArrayList<>();

    public KelurahanController() {

        //desa satu
        KelurahanModel sukahurip = new KelurahanModel("111", "Sukahurip", "Pamarican");

        //dusun
        DusunModel ciparakan = new DusunModel("111", "Ciparakan", "Nurdin");
        DusunModel citundun = new DusunModel("222", "Citundun", "Umar");

        //rw ciparakan
        RWModel tori = new RWModel("111", "RW 01", "Bpk Tori");
        RWModel fahmi = new RWModel("222", "RW 02", "Bpk Fahmi");
        RWModel amud = new RWModel("333", "RW 03", "Bpk Amud");
        RWModel deddy = new RWModel("444", "RW 04", "Bpk Dedy");

        //rw citundun
        RWModel aldo = new RWModel("555", "RW 05", "Bpk Aldo");
        RWModel tantan = new RWModel("666", "RW 06", "Bpk Tantan");
        RWModel wahyu = new RWModel("777", "RW 07", "Bpk Wahyu");
        RWModel afwa = new RWModel("888", "RW 08", "Bpk Afwa");

        //rt ciparakan
        RTModel mukhlas = new RTModel("111", "RT 01", "Bpk Mukhlas");
        RTModel sujai = new RTModel("222", "RT 02", "Bpk Sujai");
        RTModel samsul = new RTModel("333", "RT 03", "Bpk Samsul");

        //rt citundun
        RTModel munir = new RTModel("444", "RT 04", "Bpk Munir");
        RTModel andi = new RTModel("555", "RT 05", "Bpk Andi");
        RTModel hakim = new RTModel("666", "RT 06", "Bpk Hakim");

        //warga
        PeopleModel naufal = new PeopleModel("111", 1111, "Naufal", "Laki-laki", "20");
        PeopleModel adit = new PeopleModel("222", 2222, "Adit", "Laki-laki", "21");
        PeopleModel mujay = new PeopleModel("333", 3333, "Mujay", "Perempuan", "22");

        //list dusun
        List<DusunModel> sukahuripList = new ArrayList<>();
        sukahuripList.add(ciparakan);
        sukahuripList.add(citundun);
        sukahurip.setDusunModels(sukahuripList);

        //list rw ciparakan
        List<RWModel> ciparakanList = new ArrayList<>();
        ciparakanList.add(tori);
        ciparakanList.add(fahmi);
        ciparakanList.add(amud);
        ciparakanList.add(deddy);
        ciparakan.setRwModels(ciparakanList);

        //list rw citundun
        List<RWModel> citundunList = new ArrayList<>();
        citundunList.add(aldo);
        citundunList.add(tantan);
        citundunList.add(wahyu);
        citundunList.add(afwa);
        citundun.setRwModels(citundunList);

        //list rt tori
        List<RTModel> toriList = new ArrayList<>();
        toriList.add(mukhlas);
        toriList.add(sujai);
        toriList.add(samsul);
        tori.setRtModels(toriList);

        //list rt afwa
        List<RTModel> afwaList = new ArrayList<>();
        afwaList.add(munir);
        afwaList.add(hakim);
        afwaList.add(andi);
        afwa.setRtModels(afwaList);

        //set warga
        List<PeopleModel> mukhlasList = new ArrayList<>();
        mukhlasList.add(naufal);
        mukhlasList.add(adit);
        mukhlasList.add(mujay);
        mukhlas.setPeopleModel(mukhlasList);

        //desa dua
        KelurahanModel pamarican = new KelurahanModel("222", "Pamarican", "Pamarican");

        KelurahanModel sukajadi = new KelurahanModel("333", "Sukajadi", "Pamarican");
        KelurahanModel sukamukti = new KelurahanModel("444", "Sukamukti", "Pamarican");
        KelurahanModel sukajaya = new KelurahanModel("555", "Sukajaya", "Pamarican");

        //generate data
        this.kelurahanModels.add(sukahurip);
        this.kelurahanModels.add(pamarican);
        this.kelurahanModels.add(sukajadi);
        this.kelurahanModels.add(sukamukti);
        this.kelurahanModels.add(sukajaya);
    }

//    @GetMapping
//    public ModelAndView get() {
//        ModelAndView view = new ModelAndView("kelurahan/dashboard/index");
//        view.addObject("data", this.kelurahanModels);
//        return view;
//    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("kelurahan/detail/desa");

        for (KelurahanModel kelurahan : this.kelurahanModels) {
            if (kelurahan.getId().equals(id)) {
                view.addObject("kelurahan", kelurahan);
                return view;
            }
        }
        return new ModelAndView("redirect:/desa");
    }

    @GetMapping("/dusun/detail/{id}")
    public ModelAndView detailDusun(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("kelurahan/detail/dusun");

        for (KelurahanModel kelurahan : this.kelurahanModels) {
            for (DusunModel dusun : kelurahan.getDusunModels()) {
                if (dusun.getId().equals(id)) {
                    view.addObject("kelurahan", kelurahan);
                    view.addObject("dusun", dusun);
                    return view;
                }
            }
        }
        return new ModelAndView("redirect:/desa");
    }

    @GetMapping("/rw/detail/{id}")
    public ModelAndView detailRW(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("kelurahan/detail/rw");

        for (KelurahanModel kelurahan : this.kelurahanModels) {
            for (DusunModel dusun : kelurahan.getDusunModels()) {
                for (RWModel rw : dusun.getRwModels()) {
                    if (rw.getId().equals(id)) {
                        view.addObject("kelurahan", kelurahan);
                        view.addObject("dusun", dusun);
                        view.addObject("rw", rw);
                        return view;
                    }
                }
            }
        }

        return new ModelAndView("redirect:/desa");
    }


    @GetMapping("/rt/detail/{id}")
    public ModelAndView detailRt(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("kelurahan/detail/rt");

        for (KelurahanModel kelurahan : this.kelurahanModels) {
            for (DusunModel dusun : kelurahan.getDusunModels()) {
                for (RWModel rw : dusun.getRwModels()) {
                    for (RTModel rt : rw.getRtModels()) {
                        if (rt.getId().equals(id)) {
                            view.addObject("kelurahan", kelurahan);
                            view.addObject("dusun", dusun);
                            view.addObject("rw", rw);
                            view.addObject("rt", rt);
                            return view;
                        }
                    }
                }
            }
        }
        return new ModelAndView("redirect:/desa");
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView view = new ModelAndView();
        KelurahanModel kelurahan = new KelurahanModel();

        List<DusunModel> dusunList = new ArrayList<>();

        //warga
        ArrayList<PeopleModel> warga1 = new ArrayList<>();
        warga1.add(new PeopleModel("", 0, "", "", ""));
        warga1.add(new PeopleModel("", 0, "", "", ""));

        //rt
        ArrayList<RTModel> rt1 = new ArrayList<>();
        rt1.add(new RTModel("", "", "", warga1));

        //rw
        ArrayList<RWModel> rw1 = new ArrayList<>();
        rw1.add(new RWModel("", "", "", rt1));

        //dusun
        DusunModel dusun1 = new DusunModel("", "", "", rw1);
        dusunList.add(dusun1);

        //add to kelurahan
        kelurahan.setDusunModels(dusunList);

        view.addObject("desa", kelurahan);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("desa") KelurahanModel kelurahan) {
        this.kelurahanModels.add(kelurahan);
        return new ModelAndView("redirect:/desa");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView();

        for (KelurahanModel kelurahan : this.kelurahanModels) {
            if (kelurahan.getId().equals(id)) {
                view.addObject("desa", kelurahan);
                return view;
            }
        }

        // Jika tidak ditemukan, kembali ke halaman utama
        return new ModelAndView("redirect:/desa");
    }

    @PostMapping("/update/{id}")
    public ModelAndView update(@PathVariable("id") Integer id, @ModelAttribute("desa") KelurahanModel kelurahan) {
        for (int i = 0; i < this.kelurahanModels.size(); i++) {
            if (this.kelurahanModels.get(i).getId().equals(id)) {
                // Update existing kelurahan
                this.kelurahanModels.set(i, kelurahan);
                return new ModelAndView("redirect:/desa");
            }
        }

        // Jika tidak ditemukan, tambahkan sebagai data baru (opsional)
//        this.kelurahanModels.add(kelurahan);
        return new ModelAndView("redirect:/desa");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView();

        for (KelurahanModel kelurahan : this.kelurahanModels) {
            if (kelurahan.getId().equals(id)) {
                view.addObject("desa", kelurahan);
                return view;
            }
        }
        return new ModelAndView("redirect:/desa");
    }

    @PostMapping("/remove/{id}")
    public ModelAndView remove(@PathVariable("id") Integer id) {
        for (int i = 0; i < this.kelurahanModels.size(); i++) {
            if (this.kelurahanModels.get(i).getId().equals(id)) {
                this.kelurahanModels.remove(i);
                return new ModelAndView("redirect:/desa");
            }
        }
        return new ModelAndView("redirect:/desa");
    }
}
