package org.security.project.detail.siswa.util;

import org.security.project.detail.siswa.fakultas.model.*;
import org.security.project.detail.siswa.kelurahan.model.*;

import java.util.UUID;

public class IdGenerator {
    public static void generateIdsForKelurahan(KelurahanModel kelurahan) {
        // Generate ID for KelurahanModel
        kelurahan.setId(UUID.randomUUID().toString());

        // Generate IDs for all nested entities
        for (DusunModel dusun : kelurahan.getDusunModels()) {
            generateIdsForDusun(dusun);
        }
    }

    private static void generateIdsForDusun(DusunModel dusun) {
        dusun.setId(UUID.randomUUID().toString());
        for (RWModel rw : dusun.getRwModels()) {
            generateIdsForRw(rw);
        }
    }

    private static void generateIdsForRw(RWModel rw) {
        rw.setId(UUID.randomUUID().toString());
        for (RTModel rt : rw.getRtModels()) {
            generateIdsForRt(rt);
        }
    }

    private static void generateIdsForRt(RTModel rt) {
        rt.setId(UUID.randomUUID().toString());
        for (PeopleModel people : rt.getPeopleModel()) {
            people.setId(UUID.randomUUID().toString());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            String id = UUID.randomUUID().toString();
            System.out.println(id);
        }
    }

    public static void generateIdFakultas(FakultasModel fakultasModel) {
        fakultasModel.setId(UUID.randomUUID().toString());
        for (JurusanModel jurusan : fakultasModel.getJurusanModels()) {
            jurusan.setId(UUID.randomUUID().toString());
            for (StudentCountModel year : jurusan.getStudentCountModels()) {
                year.setId(UUID.randomUUID().toString());
                for (MahasiswaModel mahasiswa : year.getMahasiswa()) {
                    mahasiswa.setId(UUID.randomUUID().toString());
                    for (MataKuliahModel matkul : mahasiswa.getMataKuliah()) {
                        matkul.setId(UUID.randomUUID().toString());
                    }
                }
            }
        }
    }
}
