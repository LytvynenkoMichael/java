package litvinenko.pyramid_maslow_inheritance;

public class SocialRequirements extends SafetyRequirements {
    @Override
    public String require() {
        return super.require() +
                "\ncommunication, attachment, love, cooperation";
    }
}
