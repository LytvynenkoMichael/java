package pyramid_maslow_inheritance;

public class AestheticRequirements extends CognitiveRequirements {
    @Override
    public String require() {
        return super.require() +
                "\nharmony, order, beauty";
    }
}
