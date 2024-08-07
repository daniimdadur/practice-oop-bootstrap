package org.security.project.detail.siswa.kelurahan.controller;

import org.security.project.detail.siswa.kelurahan.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/desa")
public class KelurahanController {
    private final List<KelurahanModel> kelurahanModels = new ArrayList<>();

    public KelurahanController() {

        List<DusunModel> dusunModels = new ArrayList<>();
        //dusun satu
        dusunModels.add(
                new DusunModel(1, "Ciparakan", "Nurdin",
                        Arrays.asList(
                                new RWModel(1, "RW 01", "Bpk Tori",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Mukhlas",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Sujai",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Samsul",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                ),
                                new RWModel(2, "RW 02", "Bpk Fahmi",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Mukhlas",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Sujai",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Samsul",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                ),
                                new RWModel(3, "RW 03", "Bpk Amud",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Mukhlas",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Sujai",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Samsul",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                ),
                                new RWModel(4, "RW 04", "Bpk Dedy",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Mukhlas",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Sujai",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Samsul",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Naufal", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Adit", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Mujay", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
        //dusun dua
        dusunModels.add(
                new DusunModel(2, "Cikuya", "Ngasiman",
                        Arrays.asList(
                                new RWModel(1, "RW 01", "Bpk Rayhan",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Andi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Ijad",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Hilmi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                ),
                                new RWModel(2, "RW 02", "Bpk Teguh",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Andi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Ijad",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Hilmi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                ),
                                new RWModel(3, "RW 03", "Bpk Irsyad",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Andi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Ijad",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Hilmi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                ),
                                new RWModel(4, "RW 04", "Bpk Eri",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Andi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Ijad",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Hilmi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Agung", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Rizki", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Dila", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
        //dusun tiga
        dusunModels.add(
                new DusunModel(3, "Citundun", "Djudju",
                        Arrays.asList(
                                new RWModel(1, "RW 01", "Bpk Jaka",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Opik",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Anton",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Yedi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                ),
                                new RWModel(2, "RW 02", "Bpk Sendy",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Opik",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Anton",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Yedi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                ),
                                new RWModel(3, "RW 03", "Bpk Ari",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Opik",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Anton",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Yedi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                ),
                                new RWModel(4, "RW 04", "Bpk Sahrul",
                                        Arrays.asList(
                                                new RTModel(1, "RT 01", "Bpk Opik",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(2, "RT 02", "Bpk Anton",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                ),
                                                new RTModel(3, "RT 03", "Bpk Yedi",
                                                        Arrays.asList(
                                                                new PeopleModel(1, 1111, "Sabil", "Laki-laki", "20"),
                                                                new PeopleModel(2, 2222, "Trica", "Laki-laki", "21"),
                                                                new PeopleModel(3, 3333, "Hani", "Perempuan", "22")
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        KelurahanModel sukahurip = new KelurahanModel(1, "Sukahurip", "Pamarican");
        sukahurip.setDusunModels(dusunModels);

        //generate data
        this.kelurahanModels.add(sukahurip);
    }

    @GetMapping
    public ModelAndView get() {
        ModelAndView view = new ModelAndView("kelurahan/index");
        view.addObject("kelurahan", kelurahanModels);
        return view;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("kelurahan/detail");

        Optional<KelurahanModel> detail = kelurahanModels.stream()
                .filter(desa -> desa.getId() == id)
                .findFirst();

        if (detail.isPresent()) {
            view.addObject("data", detail.get());
        } else {
            return new ModelAndView("redirect:/desa");
        }
        return view;
    }

    @GetMapping("/dusun/detail/{id}")
    public ModelAndView detailDusun(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("kelurahan/dusun");

        Optional<DusunModel> dusunModel = this.kelurahanModels.stream()
                .flatMap(kelurahan-> kelurahan.getDusunModels().stream())
                .filter(dusun -> dusun.getId() == id)
                .findFirst();

        if (dusunModel.isPresent()) {
            DusunModel dusun = dusunModel.get();
            System.out.println("Dusun: " + dusun);
            System.out.println("Kelurahan: " + dusun.getKelurahan());
            view.addObject("dusun", dusunModel.get());
//            view.addObject("kelurahan", dusunModel.get().getKelurahan().getName());
        } else {
            return new ModelAndView("redirect:/desa");
        }
        return view;
    }

    @GetMapping("/rw/detail/{id}")
    public ModelAndView detailRW(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("kelurahan/rw");

        Optional<RWModel> rwModel = this.kelurahanModels.stream()
                .flatMap(kelurahan -> kelurahan.getDusunModels().stream())
                .flatMap(dusun -> dusun.getRwModels().stream())
                .filter(rw -> rw.getId() == id)
                .findFirst();

        if (rwModel.isPresent()) {
            view.addObject("rw", rwModel.get());
        } else {
            return new ModelAndView("redirect:/dusun/detail/{id}");
        }
        return view;
    }

    @GetMapping("/rt/detail/{id}")
    public ModelAndView detailRt(@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("kelurahan/rt");

        Optional<RTModel> rtModel = this.kelurahanModels.stream()
                .flatMap(kelurahan -> kelurahan.getDusunModels().stream())
                .flatMap(dusun -> dusun.getRwModels().stream())
                .flatMap(rw -> rw.getRtModels().stream())
                .filter(rt -> rt.getId() == id)
                .findFirst();

        if (rtModel.isPresent()) {
            view.addObject("rt", rtModel.get());
        } else {
            return new ModelAndView("redirect:/rw/detail/{id}");
        }
        return view;
    }
}
