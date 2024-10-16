package pe.upc.learningcenterplatform.profiles.domain.model.commands;

import pe.upc.learningcenterplatform.profiles.domain.model.aggregates.Profile;

public record CreateProfileCommand() {
    public Profile profile() {
        return new Profile();
    }
}
