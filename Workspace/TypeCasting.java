class Main{
    public static void main (String[] args) {
        int i = 300;
        long l = i;     //implicit type casting
        double d = l;    //implicit type casting
        float f = (float) d;    //explicit type casting
        System.out.println("int value " + i);
        System.out.println("long value " + l);
        System.out.println("Double value "+d);
        System.out.println("float value " + f);
    }
}
