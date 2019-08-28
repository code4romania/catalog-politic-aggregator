package com.code4ro.catalogpolitic.model.persistence.sattelites.profiles;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EuroParlamentarianProfile {
    private String prezenta;
    private String procentInitiativeDeveniteLegi;
    private List<String> functiiDeConducere;
    private String aliantaPoliticaEuropeana;
}
