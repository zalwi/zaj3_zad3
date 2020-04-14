class TestMathMethods {
    public static void main(String[] args) {

        MathMethods math = new MathMethods();
        int liczbaCalkowita = 3;
        double liczbaZmiennoprzecinkowa = 5.14;

        System.out.println("Czy liczba " + liczbaCalkowita + " jest parzysta? : " + math.isEven(liczbaCalkowita));
        System.out.println("Czy liczba " + liczbaCalkowita + " jest nieparzysta? : " + math.isOdd(liczbaCalkowita));
        System.out.println("Pole powierzchni koła o średnicy " + liczbaZmiennoprzecinkowa +
                            " jest równe " + math.circleField(liczbaZmiennoprzecinkowa));
        System.out.println(liczbaCalkowita + " podniesione do kwadratu wynosi " + math.power(liczbaCalkowita));
    }
}
