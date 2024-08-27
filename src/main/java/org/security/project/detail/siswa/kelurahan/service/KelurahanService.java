package org.security.project.detail.siswa.kelurahan.service;

import org.security.project.detail.siswa.kelurahan.model.KelurahanModel;

import java.util.List;
import java.util.Optional;

public interface KelurahanService {
    List<KelurahanModel> get();
    Optional<KelurahanModel> getById(String id);
    KelurahanModel prepareKelurahanData();
    Optional<KelurahanModel> save(KelurahanModel kelurahanModel);
    Optional<KelurahanModel> update(KelurahanModel kelurahanModel, String id);
    Optional<KelurahanModel> remove(String id);
}
