package pyramid_maslow_inheritance;

public class Main {

    public static void main(String[] args) {
        PhysiologicalRequirements pr = new SelfActualizationRequirement();
        AestheticRequirements ar = new SelfActualizationRequirement();
        System.out.println(pr.require());
        System.out.println("////////////////////////////////");
        System.out.println(ar.require());
    }
}
