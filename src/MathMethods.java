class MathMethods {

    boolean isEven(int number){
        return !(number % 2 > 0);
    }

    boolean isOdd(int number){
        return (number % 2 > 0);
    }

    double circleField(double radius){
        return (radius*radius)*Math.PI;
    }

    int power(int number){
        return (number*number);
    }

}
