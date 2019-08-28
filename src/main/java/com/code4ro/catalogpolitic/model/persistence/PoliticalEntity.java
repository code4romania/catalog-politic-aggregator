package com.code4ro.catalogpolitic.model.persistence;

import com.code4ro.catalogpolitic.model.persistence.satellites.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PoliticalEntity {
    private ProfilPersonal profile;
    private Traseism politicalParties;
    private List<ProfilPolitic> politicalProfile;
    private Avere wealth;
    private Dna dnaData;
}
