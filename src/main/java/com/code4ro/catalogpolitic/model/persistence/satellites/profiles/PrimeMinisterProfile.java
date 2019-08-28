package com.code4ro.catalogpolitic.model.persistence.satellites.profiles;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PrimeMinisterProfile {
    private String nrVoturiInvestitura;
    private String procentCoabitare;
    private String nrOrdonanteUrgenta;
    private String nrMotiuniCenzura;
    private String nrAngajariRaspundere;
    private List<String> angajariRaspundere;
    private String nrMinistere;
    private String nrMinistriiRemaniati;
    private List<String> partideSustinere;
    private List<String> mesajeParlament;
    private String programGuvernare;
}
