package com.code4ro.catalogpolitic.model.persistence.satellites.profiles;

import com.code4ro.catalogpolitic.model.persistence.atoms.Suspendare;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PresidentProfile {
    private String procentCoabitare;
    private String numiriMinistri;
    private String refusariMinistri;
    private String nrLegiRetrimise;
    private String nrLegiAtacateCCR;
    private String procentVoturi;
    private String numarVoturi;
    private String nrParticipariSedinteGuvern;
    private String nrParticipariConsiliuEuropean;
    private String sedinteCSAT;
    private String nrReferendumuri;
    private String nrSituatiiMediere;
    private String nrConsultari;
    private List<String> rapoartePresedinte;
    private Suspendare suspendare;
    private String nrMesajeParlament;
}
