package org.security.project.detail.siswa.fakultas.service;

import org.security.project.detail.siswa.fakultas.model.*;
import org.security.project.detail.siswa.util.IdGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FakultasServiceImpl implements FakultasSevice{
    private static List<FakultasModel> fakultasList;

    private FakultasServiceImpl() {
        fakultasList = new ArrayList<>();

        //daftar fakultas
        FakultasModel teknik = new FakultasModel("29d791f8-9e31-4e0f-8432-007d7229b8c2", "FT", "Fakultas Teknik");
        FakultasModel kedokteran = new FakultasModel("030c3be0-19ce-4ddb-91a5-6706309d4e90", "FK", "Fakultas Kedokteran");
        FakultasModel ekonomi = new FakultasModel("0e67a9e4-7f94-4c93-b85f-76db681e5935", "FE", "Fakultas Ekonomi");
        FakultasModel ilmuSosial = new FakultasModel("4ad2de1c-0a54-4914-afda-c5eea35d9b58", "FIS", "Fakultas Ilmu Sosial");

        //daftar jurusan fakultas teknik
        List<JurusanModel> teknikList = new ArrayList<>();
        JurusanModel informatika = new JurusanModel("0f068eb6-a7e5-472f-a732-ccd3f2cb217f","TIF", "Teknik Informatika");
        JurusanModel industri = new JurusanModel("9a64f4cf-68ae-404e-b9bb-17afe1652aed", "TIN", "Teknik Industri");
        JurusanModel elektro = new JurusanModel("c7c4006c-ff0b-4592-b45e-56d34c9bcf1f", "TEL", "Teknik Elektro");
        JurusanModel mesin = new JurusanModel("98c78fec-0fe0-44de-8e40-041e21479c7b", "TME", "Teknik Mesin");
        teknikList.add(informatika);
        teknikList.add(industri);
        teknikList.add(elektro);
        teknikList.add(mesin);

        List<StudentCountModel> informatikaYears = new ArrayList<>();
        StudentCountModel y2024 = new StudentCountModel("e0d0a032-35e1-409a-86ad-d54340f6e958", 2024);
        StudentCountModel y2023 = new StudentCountModel("b6ef5bf0-7538-465f-8c30-86e2ef5134ac", 2023);
        StudentCountModel y2022 = new StudentCountModel("118f5320-de9a-4630-a32d-422fe011f8f9", 2022);
        StudentCountModel y2021 = new StudentCountModel("e03f8c18-4a89-4c93-88da-88aa44d44cef", 2021);
        informatikaYears.add(y2024);
        informatikaYears.add(y2023);
        informatikaYears.add(y2022);
        informatikaYears.add(y2021);

        //daftar mahasiswa jurusan teknik informatika
        List<MahasiswaModel> mahasiswaInformatikaList = new ArrayList<>();
        MahasiswaModel sandi = new MahasiswaModel("d20503b4-52e5-46e6-8e1c-dea5f302a8f5", "2024TIF001", "Sandi");
        MahasiswaModel hani = new MahasiswaModel("7bc77636-94e6-43a7-88c5-056c6a6fa20e", "2024TIF002", "Hani");
        MahasiswaModel budi = new MahasiswaModel("345c28b2-f83f-4d1d-a877-4e8d3f1c0f52", "2024TIF003", "Budi");
        MahasiswaModel dewi = new MahasiswaModel("e47bcedb-2366-46a2-a0b0-7cb9e78c5791", "2024TIF005", "Dewi");
        MahasiswaModel eko = new MahasiswaModel("920bae37-7f84-4f5a-9735-92118bfc05f4", "2024TIF006", "Eko");
        MahasiswaModel fajar = new MahasiswaModel("bc2158b4-1a91-4a52-bef9-67f61b5e61d1", "2024TIF007", "Fajar");
        MahasiswaModel gita = new MahasiswaModel("6e4e1e3d-686f-42d6-9d77-8c1f8985c6f1", "2024TIF008", "Gita");
        MahasiswaModel hari = new MahasiswaModel("1e2b5b0a-4e4a-4b8f-97ec-7db4786b1c45", "2024TIF009", "Hari");
        MahasiswaModel indah = new MahasiswaModel("bc8f1d4e-2f7d-4ff2-b67e-065a21b1c871", "2024TIF010", "Indah");
        MahasiswaModel citra = new MahasiswaModel("d74f7fd3-ef5a-42a0-9e5e-3e38c87a0a98", "2024TIF004", "Citra");
        mahasiswaInformatikaList.add(sandi);
        mahasiswaInformatikaList.add(hani);
        mahasiswaInformatikaList.add(budi);
        mahasiswaInformatikaList.add(dewi);
        mahasiswaInformatikaList.add(eko);
        mahasiswaInformatikaList.add(fajar);
        mahasiswaInformatikaList.add(gita);
        mahasiswaInformatikaList.add(hari);
        mahasiswaInformatikaList.add(indah);
        mahasiswaInformatikaList.add(citra);

        //daftar matkul mahasiswa budi
        List<MataKuliahModel> matkulInformatikaList = new ArrayList<>();
        MataKuliahModel pemrogramanDasar = new MataKuliahModel("1", "TIF101", "Pemrograman Dasar", "Dr. Andi", "A");
        MataKuliahModel strukturData = new MataKuliahModel("2", "TIF102", "Struktur Data", "Dr. Budi", "B+");
        MataKuliahModel algoritmaPemrograman = new MataKuliahModel("3", "TIF103", "Algoritma Pemrograman", "Dr. Citra", "A-");
        MataKuliahModel basisData = new MataKuliahModel("4", "TIF104", "Basis Data", "Dr. Dewi", "B");
        MataKuliahModel jaringanKomputer = new MataKuliahModel("5", "TIF105", "Jaringan Komputer", "Dr. Eko", "B+");
        MataKuliahModel sistemOperasi = new MataKuliahModel("6", "TIF106", "Sistem Operasi", "Dr. Fajar", "A");
        MataKuliahModel pemrogramanBerorientasiObjek = new MataKuliahModel("7", "TIF107", "Pemrograman Berorientasi Objek", "Dr. Gita", "A-");
        MataKuliahModel rekayasaPerangkatLunak = new MataKuliahModel("8", "TIF108", "Rekayasa Perangkat Lunak", "Dr. Hari", "B+");
        MataKuliahModel manajemenProyek = new MataKuliahModel("9", "TIF109", "Manajemen Proyek", "Dr. Indah", "A");
        MataKuliahModel kecerdasanBuatan = new MataKuliahModel("10", "TIF110", "Kecerdasan Buatan", "Dr. Joko", "A-");
        MataKuliahModel sistemInformasi = new MataKuliahModel("11", "TIF111", "Sistem Informasi", "Dr. Kamal", "B+");
        MataKuliahModel pemrogramanWeb = new MataKuliahModel("12", "TIF112", "Pemrograman Web", "Dr. Laila", "A");
        MataKuliahModel desainInterface = new MataKuliahModel("13", "TIF113", "Desain Interface", "Dr. Miko", "B");
        MataKuliahModel keamananSistem = new MataKuliahModel("14", "TIF114", "Keamanan Sistem", "Dr. Nanda", "B+");
        MataKuliahModel cloudComputing = new MataKuliahModel("15", "TIF115", "Cloud Computing", "Dr. Oka", "A");
        matkulInformatikaList.add(pemrogramanDasar);
        matkulInformatikaList.add(strukturData);
        matkulInformatikaList.add(algoritmaPemrograman);
        matkulInformatikaList.add(basisData);
        matkulInformatikaList.add(jaringanKomputer);
        matkulInformatikaList.add(sistemOperasi);
        matkulInformatikaList.add(pemrogramanBerorientasiObjek);
        matkulInformatikaList.add(rekayasaPerangkatLunak);
        matkulInformatikaList.add(manajemenProyek);
        matkulInformatikaList.add(kecerdasanBuatan);
        matkulInformatikaList.add(sistemInformasi);
        matkulInformatikaList.add(pemrogramanWeb);
        matkulInformatikaList.add(desainInterface);
        matkulInformatikaList.add(keamananSistem);
        matkulInformatikaList.add(cloudComputing);

        //generate data fakultas teknik
        budi.setMataKuliah(matkulInformatikaList);
        y2024.setMahasiswa(mahasiswaInformatikaList);
        informatika.setStudentCountModels(informatikaYears);
        teknik.setJurusanModels(teknikList);
        fakultasList.add(teknik);


        //generate fakultas
        fakultasList.add(kedokteran);
        fakultasList.add(ekonomi);
        fakultasList.add(ilmuSosial);
    }

    @Override
    public List<FakultasModel> getAllFakultas() {
        if (fakultasList.isEmpty()) {
            System.err.println("Error: fakultasList is not initialized.");
            return new ArrayList<>();
        }
        return fakultasList;
    }

    @Override
    public Optional<FakultasModel> getFakultasById(String id) {
        Optional<FakultasModel> fakultas = fakultasList.stream().filter(f -> f.getId().equals(id)).findFirst();
        return fakultas;
    }

    @Override
    public FakultasModel prepareFakultasData() {
        FakultasModel fakultas = new FakultasModel();

        List<JurusanModel> jurusanList = new ArrayList<>();

        //matkul
        ArrayList<MataKuliahModel> mataKuliahList = new ArrayList<>();
        MataKuliahModel matkul = new MataKuliahModel("", "", "", "");
        mataKuliahList.add(matkul);

        //mahasiswa
        ArrayList<MahasiswaModel> mahasiswaList = new ArrayList<>();
        MahasiswaModel mahasiswa = new MahasiswaModel("", "");
        mahasiswa.setMataKuliah(mataKuliahList);
        mahasiswaList.add(mahasiswa);

        //year
        ArrayList<StudentCountModel> yearList = new ArrayList<>();
        StudentCountModel year = new StudentCountModel(null);
        year.setMahasiswa(mahasiswaList);
        yearList.add(year);

        //majors
        JurusanModel jurusan = new JurusanModel("", "");
        jurusan.setStudentCountModels(yearList);
        jurusanList.add(jurusan);

        //fakultas
        fakultas.setJurusanModels(jurusanList);
        return fakultas;
    }

    @Override
    public Optional<FakultasModel> save(FakultasModel fakultasModel) {
        if (fakultasModel == null) {
            return Optional.empty();
        }
//        IdGenerator.generateIdFakultas(fakultasModel);
        fakultasList.add(fakultasModel);
        return Optional.of(fakultasModel);
    }

    @Override
    public Optional<FakultasModel> update(FakultasModel fakultasModel, String id) {
        return null;
    }

    @Override
    public Optional<FakultasModel> delete(String id) {
        return null;
    }
}
