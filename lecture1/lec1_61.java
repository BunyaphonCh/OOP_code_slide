public class lec1_61 {
    public static void main(String args[]) {
        long longData = 10;
        int intData = 5;
        double doubleData = 2;
        float floatData = 4f;
        
        System.out.println("long + long = " + ((Object) (longData+longData)).getClass());
        System.out.println("long + int = " + ((Object) (longData+intData)).getClass());
        System.out.println("long + double = " + ((Object) (longData+doubleData)).getClass());
        System.out.println("long + float = " + ((Object) (longData+floatData)).getClass());
        
        System.out.println("int + long = " + ((Object) (intData+longData)).getClass());
        System.out.println("int + int = " + ((Object) (intData+intData)).getClass());
        System.out.println("int + double = " + ((Object) (intData+doubleData)).getClass());
        System.out.println("int + float = " + ((Object) (intData+floatData)).getClass());
        
        System.out.println("double + long = " + ((Object) (doubleData+longData)).getClass());
        System.out.println("double + int = " + ((Object) (doubleData+intData)).getClass());
        System.out.println("double+double = " + ((Object) (doubleData+doubleData)).getClass());
        System.out.println("double+float = " + ((Object) (doubleData+floatData)).getClass());
        
        System.out.println("float + long = " + ((Object) (floatData+longData)).getClass());
        System.out.println("float + int = " + ((Object) (floatData+intData)).getClass());
        System.out.println("float + double = " + ((Object) (floatData+doubleData)).getClass());
        System.out.println("float + float = " + ((Object) (floatData+floatData)).getClass());
    }
}
