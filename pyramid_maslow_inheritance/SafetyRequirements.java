package pyramid_maslow_inheritance;

public class SafetyRequirements extends PhysiologicalRequirements {
    @Override
    public String require() {
        return super.require() +
                "\nsafety, comfort, constancy of living conditions";
    }
}
