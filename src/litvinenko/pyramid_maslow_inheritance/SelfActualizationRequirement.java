package litvinenko.pyramid_maslow_inheritance;

public class SelfActualizationRequirement extends AestheticRequirements {
    @Override
    public String require() {
        return super.require() +
                "\nself-expression, realization of goals, development of abilities";
    }
}
