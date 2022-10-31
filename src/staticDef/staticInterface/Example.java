package staticDef.staticInterface;

//public class Example implements BaseInterface{
public class Example extends BaseInterface {
    public static void main(String[] args) {
        Example example = new Example();
        example.toOverride();

//    example.print();
//        BaseInterface.print();
        example.print();
    }

    @Override
    public void toOverride() {
        System.out.println("to Override");
    }

//    @Override  //nie da się użyć override na metodzie statycznej
//    public void print() {
//        System.out.println("Example printing");
//    }
}
