package litvinenko.pyramid_maslow_inheritance;

public class NeedAndRespectRequirements extends SocialRequirements {
    @Override
    public String require() {
        return super.require() +
                "\nknow, understand, be able to, discover";
    }
}
