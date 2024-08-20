package org.security.project.detail.siswa.fakultas.service;

import org.security.project.detail.siswa.fakultas.model.FakultasModel;

import java.util.List;
import java.util.Optional;

public interface FakultasSevice {
    List<FakultasModel> getAllFakultas();
    Optional<FakultasModel> getFakultasById(String id);
    FakultasModel prepareFakultasData();
    Optional<FakultasModel> save(FakultasModel fakultasModel);
    Optional<FakultasModel> update(FakultasModel fakultasModel, String id);
    Optional<FakultasModel> delete(String id);
}
