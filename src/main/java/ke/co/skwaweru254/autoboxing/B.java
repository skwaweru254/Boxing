package ke.co.skwaweru254.autoboxing;

public class B {

    public static void main(String[] args) {
        System.out.println("Automatic conversion of the primitive type to an equivalent wrapper class type.");

        int b = 20;

        Integer obj1 = Integer.valueOf(b);

        System.out.println("Integer object b : "+ obj1);

        System.out.println(obj1);
    }
}
