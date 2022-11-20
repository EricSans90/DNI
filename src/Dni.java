public class Dni {
    int number;
    char letter;

    public Dni (){
        this.number=0;
        this.letter='0';
    }
    public Dni (int n, char c){
        this.number=n;
        this.letter=c;
    }
    public Dni (int n){
        this.number=n;
        this.letter='0';
    }
    public char getLetterFromString (String s){
        return s.charAt(8);
    }

    public Dni (String s){
        String aux = new String();
        aux= s.replaceAll("[^0-9]","");
        this.number=Integer.parseInt(aux);
        this.letter=s.charAt(8);
    }
    public int getNumber() {
        return number;
    }
    public char getLetter() {
        if (letterForDni(this.number)!=letter){
            number = -number;
        } return letter;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return ""+number + letter;
    }

    public String toFormattedString() {
        String auxDNI = (String.valueOf(number));
        return ""+auxDNI.charAt(0)+auxDNI.charAt(1)+'.'+auxDNI.charAt(2)+auxDNI.charAt(3)+auxDNI.charAt(4)+
                '.'+auxDNI.charAt(5)+auxDNI.charAt(6)+auxDNI.charAt(7)+'-'+letter;
    }

    public boolean correctDNI(){
        if (letterForDni(this.number)!=letter){
            number = -number;
        }
        if (number<0){
            return false;
        } else return true;
    }

    public static char letterForDni(int number){
        char[] arrayLetters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char trueLetter='.';
        int remainder;
        remainder = number % 23;
        for (int i = 0; i < 23; i++) {
            if (i == remainder)
                trueLetter = arrayLetters[i];
        }return trueLetter;
    }

    public static String NifForDni(int number){

        return ""+number+letterForDni(number);
    }
    //Testing NifForDNI
    //String D = NifForDni(20474501);

}
