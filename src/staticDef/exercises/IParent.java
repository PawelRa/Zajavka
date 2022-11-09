package staticDef.exercises;

public interface IParent {
    static String getClassName() {
        return "Parent";
    }

    default String getName() {
        return "Parent name";
    }

    ;
}
