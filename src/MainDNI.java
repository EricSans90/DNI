public class MainDNI {
    public static void main(String[] args) {
        Dni D1 = new Dni("20474501Q");
        Dni D2 = new Dni();
        System.out.println(D1.getNumber());
        System.out.println(D1.getLetter());
        D2.setNumber(20474501);
        System.out.println(D1);
        System.out.println(D2);
        if(D1.correctDNI()==true){
            System.out.println("Correct DNI");
        } else {
            System.out.println("Incorrect DNI");
        }

        if(D2.correctDNI()==true){
            System.out.println("Correct DNI");
        } else {
            System.out.println("Incorrect DNI");
        }
        System.out.println(D1.toString());
        System.out.println(D1.toFormattedString());

        System.out.println();

    }
}
