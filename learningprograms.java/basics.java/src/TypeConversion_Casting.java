public class TypeConversion_Casting {
    public static void main(String[] args) {
        //Type conversion has two types : "Implicit" and "Explicit"

        //Implicit Conversion : "Converting all SMALL values into BIG values"...

        /*
        int num = 100;         //Took number int Integer format
        float n_float = num;   // Converting Integer to Float
        System.out.println(n_float);
        */


        //Explicit Conversion : "Forcefully converting BIG values into SMALL values"..

        float num = 152.78f;
//        int i_num = num;             //It will give error..

        int i_num = (int) num;         //It will type cast float to int..

        System.out.println(i_num);

    }
}
