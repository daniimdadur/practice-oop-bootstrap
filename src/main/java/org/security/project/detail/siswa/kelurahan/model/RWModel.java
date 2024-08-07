package org.security.project.detail.siswa.kelurahan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RWModel {
    private Integer id;
    private String name;
    private String rwLeader;
    private List<RTModel> rtModels = new ArrayList<>();

    public RWModel(Integer id, String name, String rwLeader) {
        this.id = id;
        this.name = name;
        this.rwLeader = rwLeader;
    }
}
