package com.code4ro.catalogpolitic.model.persistence.satellites;

import com.code4ro.catalogpolitic.model.persistence.satellites.profiles.*;
import com.code4ro.catalogpolitic.model.statics.ProfileType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfilPolitic {
    private String year;
    private ProfileType profileType;
    private CountyCouncilPresidentProfile countyCouncilPresidentProfile;
    private EUCommissionerProfile euCommissionerProfile;
    private EuroParlamentarianProfile euroParlamentarianProfile;
    private MayorProfile mayorProfile;
    private MinistryProfile ministryProfile;
    private ParliamentarianProfile parliamentarianProfile;
    private PresidentialCounselorProfile presidentialCounselorProfile;
    private PresidentProfile presidentProfile;
    private PrimeMinisterProfile primeMinisterProfile;
    private SenatorProfile senatorProfile;
}
