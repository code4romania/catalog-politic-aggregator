package com.code4ro.catalogpolitic.model.persistence.satellites.profiles;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SenatorProfile {
    private String prezentaLaVot;
    private String nrInitiativeLegislative;
    private String procentInitiativeDeveniteLegi;
    private String nrLuariDeCuvant;
    private String durataLuariDeCuvant;
    private String nrDeclaratiiPolitice;
    private String nrInterpelari;
    private List<String> functiiDeConducere;
    private List<String> initiativeLegislativeRetrase;
    private String procentVoturiLiniePartid;
}
