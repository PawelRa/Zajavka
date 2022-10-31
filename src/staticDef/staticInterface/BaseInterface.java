package staticDef.staticInterface;

//public interface BaseInterface {
public abstract class BaseInterface {
    static void print(){
        System.out.println("Interface printing");
    }

//    void toOverride();
    abstract void toOverride();
}
