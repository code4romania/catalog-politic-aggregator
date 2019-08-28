package com.code4ro.catalogpolitic.model.persistence.atoms;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Suspendare {
    private String nrDeschidereProcedura;
    private String nrConcretizari;
    private String nrZileSuspendat;
    private String rezultatReferendum;
    private String nrVoturiReferendum;
}
