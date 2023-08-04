package ke.co.skwaweru254.autoboxing;

public class A {

    public static void main(String[] args) {
        System.out.println("Automatic conversion of the primitive type to an equivalent wrapper class type.");

        int a = 10;

        Integer obj = new Integer(a);

        System.out.println("Integer object a :"+a);

        System.out.println(obj);
    }
}
