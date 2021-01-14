package pyramid_maslow_inheritance;

public class CognitiveRequirements extends NeedAndRespectRequirements {
    @Override
    public String require() {
        return super.require() +
                "\nknow, understand, be able to, discover";
    }
}
