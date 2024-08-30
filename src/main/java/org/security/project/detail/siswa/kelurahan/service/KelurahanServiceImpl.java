package org.security.project.detail.siswa.kelurahan.service;

import lombok.extern.slf4j.Slf4j;
import org.security.project.detail.siswa.kelurahan.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class KelurahanServiceImpl implements KelurahanService{
    public static List<KelurahanModel> kelurahanList;


    private KelurahanServiceImpl() {
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
        DusunModel ciparakan = new DusunModel("59febb99-0309-4ad5-8ea2-5e9654e87073", "Ciparakan", "Nurdin");
        ciparakan.setRwModels(rwList);
        dusunList.add(ciparakan);
        DusunModel citundun = new DusunModel("59febb99-0309-4ad5-8ea2-5e9654e87074", "Citundun", "Jaka");
        dusunList.add(citundun);
        DusunModel cigaleh = new DusunModel("59febb99-0309-4ad5-8ea2-5e9654e87075", "Cigaleh", "Dimas");
        dusunList.add(cigaleh);

        //rw
        RWModel tori = new RWModel("59febb99-0309-4ad5-8ea2-5e9654e87076", "RW 01", "Tori");
        tori.setRtModels(rtList);
        rwList.add(tori);
        RWModel joyo = new RWModel("59febb99-0309-4ad5-8ea2-5e9654e87077", "RW 02", "Joyo");
        rwList.add(joyo);
        RWModel ade = new RWModel("59febb99-0309-4ad5-8ea2-5e9654e87078", "RW 03", "Ade");
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
    @Override
    public List<KelurahanModel> get() {
        if (kelurahanList.isEmpty()) {
            return new ArrayList<>();
        }
        return kelurahanList;
    }

    @Override
    public Optional<KelurahanModel> getById(String id) {
        Optional<KelurahanModel> kelurahan = kelurahanList.stream().filter(k -> k.getId().equals(id)).findFirst();
        return kelurahan;
    }

    @Override
    public KelurahanModel prepareKelurahanData() {
        KelurahanModel kelurahan = new KelurahanModel();

        List<DusunModel> dusunList = new ArrayList<>();

        //warga
        ArrayList<PeopleModel> warga1 = new ArrayList<>();
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
        return kelurahan;
    }

    @Override
    public Optional<KelurahanModel> save(KelurahanModel kelurahanModel) {
        if (kelurahanList.isEmpty()) {
            return Optional.empty();
        }
        kelurahanList.add(kelurahanModel);
        return Optional.of(kelurahanModel);
    }

    @Override
    public Optional<KelurahanModel> update(KelurahanModel kelurahanModel, String id) {
        for (int i = 0; i < kelurahanList.size(); i++) {
            if (kelurahanList.get(i).getId().equals(id)) {
                kelurahanList.set(i, kelurahanModel);
                return Optional.of(kelurahanModel);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<KelurahanModel> remove(String id) {
        for (int i = 0; i < kelurahanList.size(); i++) {
            if (kelurahanList.get(i).getId().equals(id)) {
                KelurahanModel kelurahan = kelurahanList.remove(i);
                return Optional.of(kelurahan);
            }
        }
        return Optional.empty();
    }
}
