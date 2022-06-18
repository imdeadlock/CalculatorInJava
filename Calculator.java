
/*Calculater Program of Java Language*/
/*Author - Rahul Arya (imdeadlock) */
/*Created on 2022*/
//Improvement to the previous one made in C language
import java.util.Scanner;
import java.lang.Math;

class Calculation {
    int shape;
    float pie = (float) 3.141592653589793238;
    float length, edge, height, breadth, area = 0, radius;
    static Scanner obj = new Scanner(System.in);

    // Input for single number calculation like square/power etc.
    static int singleNumber() {
        int n;
        System.out.println("Enter a number: ");
        n = obj.nextInt();
        return n;
    }

    // for multiple number of elements
    static int numberOfElements() {
        System.out.print("How many numbers? : ");
        int size = obj.nextInt();
        return size;
    }

    // to take input from the user
    static float[] elementsInput(int size) {
        float ar[] = new float[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " Number : ");
            ar[i] = obj.nextFloat();
        }
        return ar;// returning the array of the elements
    }

    // addition function to calculate the addition of the numbers given by the user
    static float additionFunc(int size, float arp[]) {
        float res = 0;
        for (int i = 0; i < size; i++) {
            res = res + arp[i];
        }
        return res;
    }

    /* Have to figure out how to subtract from 1st element the 2nd number */
    static float subtractionFunc(int size, float[] aq) {
        float temp = 0, res = 0;
        temp = aq[0];
        res = temp;
        for (int i = 1; i < size; i++) {
            if (aq[i] < 0 || res < 0) {
                res = res + aq[i];
            }
            res = res - aq[i];
        }
        return res;
    }

    // multiplication function to calculate multiplication of the numbers given by
    // the user
    static float multiplyFunc(int size, float ar[]) {
        float res = 1;
        for (int i = 0; i < size; i++) {
            res = res * ar[i];
        }
        return res;
    }

    /* Have to figure out this divide function */
    static float divisonFunc(int size, float ar[]) {
        float temp = 0, res = 0;
        temp = ar[0];
        res = temp;
        for (int i = 1; i < size; i++) {
            res = (res / ar[i]);
        }
        return res;
    }

    // calculate the percentage
    static float percentageFunc() {
        float result;
        System.out.print("Enter the total number: ");
        // taking elements inside the array
        float total = obj.nextFloat();
        System.out.print("Enter the numebr out of which you want to calculate the percentage: ");
        float outof = obj.nextFloat();
        System.out.print("Enter what percentage you want to calculate: ");
        float percentage = obj.nextFloat();
        result = ((total / outof) * percentage);
        return result;
    }

    // calculate the factorial of given number
    static int factorialFunc(int num) {
        int f = 1, result = 0;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        result = f;
        return result;
    }

    // function to check if the given array is A.P
    static float[] arithmeticProgressinCheck(float[] aq, int size) {
        float ap[] = new float[3];
        float difference[] = new float[size];
        ap[0] = aq[0];
        ap[2] = size;
        try {
            for (int i = 0; i < size; i++) {
                if (i + 1 > size) {
                    break;
                } else if (i + 2 > size) {
                    break;
                }

                difference[i] = aq[i + 1] - aq[i];
                difference[i + 1] = aq[i + 2] - aq[i + 1];
                if (difference[i + 1] == difference[i]) {
                    ap[1] = difference[i];
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return ap;

    }

    void surfaceArea() {

        System.out.println(" Surface Area of 3D Shapes");
        System.out.println(
                "Enter 1 Cube\nEnter 2 for Rectangluar Prism\nEnter 3 for Cylinder\nEnter 4 for Cone\nENter 5 for Sphere\nEnter 6 for Hemisphere");

        shape = obj.nextInt();
        switch (shape) {
            case 1:
                System.out.print("Length of the edge: ");
                edge = obj.nextFloat();
                area = 6 * (edge * edge);
                System.out.println("Surface are of Cube: " + area);
                break;
            case 2:
                System.out.print("Length: ");
                length = obj.nextFloat();
                System.out.print("Width: ");
                breadth = obj.nextFloat();
                System.out.print("Height: ");
                height = obj.nextFloat();
                area = 2 * ((length * breadth) + (height * length) + (height * breadth));
                System.out.println("Surface are of Rectangular Prism: " + area);
                break;
            case 3:
                System.out.print("Radius: ");
                radius = obj.nextFloat();
                System.out.print("Height: ");
                height = obj.nextFloat();
                area = (2 * pie * radius * (radius + height));
                System.out.println("Surface are of Cylinder: " + area);
                break;
            case 4:
                System.out.print("Radius: ");
                radius = obj.nextFloat();
                System.out.print("Height: ");
                height = obj.nextFloat();
                area = (pie * radius * (radius + height));
                System.out.println("Surface are of Cone: " + area);
                break;
            case 5:
                System.out.print("Radius: ");
                radius = obj.nextFloat();
                area = (4 * pie * (radius * radius));
                System.out.println("Surface are of Sphere: " + area);
                break;
            case 6:
                System.out.print("Radius: ");
                radius = obj.nextFloat();
                area = (3 * pie * (radius * radius));
                System.out.println("Surface are of Hemisphere: " + area);
            default:
                System.out.println("Please Select A Valid Option");
                break;
        }
    }

    static float meanFunction(float[] a, int size) {
        float total = 0, mean;
        for (int i = 0; i < size; i++) {
            total = total + a[i];
        }
        mean = (total / size);
        return mean;
    }

    static float modeFunction(float a[], int n) {
        float maxValue = 0, maxCount = 0;

        for (int i = 0; i < n; ++i) {
            int count = 0;
            for (int j = 0; j < n; ++j) {
                if (a[j] == a[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }

}

// main class to call the functions
public class Calculator extends Calculation {

    public static void main(String args[]) {
        // Arithematic Calculation
        int op, no, singleNum, shape, base, exponent;
        float pie = (float) 3.14;
        float aq[], result, length, edge, height, breadth, area = 0, side, radius;
        Calculator cal = new Calculator();
        System.out.println("Hello, Welcome to The Calculator");
        System.out.println(
                "Enter 1 Standard Calculation\nEnter 2 for Mensuration\nEnter 3 for Arithmetic Progression (For n number)\nEnter 4 for Mean/Median/Mode");
        System.out.print("Select Operation: ");
        Scanner obj = new Scanner(System.in);
        op = obj.nextInt();
        switch (op) {
            case 1:
                System.out.print("\n\nSelect Operation: ");
                System.out.println(
                        "\nEnter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for multiplication\nEnter 4 for Divison\nEnter 5 to Calculate Percentage\nEnter 6 for Square Root\nEnter 7 for Power\nEnter 8 for Factorial\n");

                op = obj.nextInt();
                switch (op) {
                    case 1:
                        // Addition of numbers
                        no = numberOfElements();// taking the size in different method
                        aq = elementsInput(no);// taking elements of size defined array
                        result = additionFunc(no, aq);
                        System.out.println("Sum: " + result);
                        break;
                    case 2:
                        // Subtraction
                        no = numberOfElements();
                        aq = elementsInput(no);
                        result = subtractionFunc(no, aq);
                        System.out.println("Result :" + result);
                        break;
                    case 3:
                        // Multiplication of numbers
                        no = numberOfElements();
                        aq = elementsInput(no);
                        result = multiplyFunc(no, aq);
                        System.out.println("Multiplication of the given numbers: " + result);
                        break;
                    case 4:
                        // Dividing the numbers
                        no = numberOfElements();
                        aq = elementsInput(no);
                        result = divisonFunc(no, aq);
                        System.out.println("Result: " + result);
                        break;
                    case 5:
                        // Percentage of given number
                        no = numberOfElements();// taking the size in different method
                        result = percentageFunc();
                        System.out.println(result);
                        break;
                    case 6:
                        // Square root
                        singleNum = singleNumber();
                        result = (float) Math.sqrt(singleNum);
                        System.out.println("Square root of the given number: " + result);
                        break;
                    case 7:
                        // Power
                        Scanner ob1 = new Scanner(System.in);
                        System.out.println("Enter the base: ");
                        base = ob1.nextInt();
                        System.out.println("Enter the exponent: ");
                        exponent = ob1.nextInt();
                        result = (float) Math.pow(base, exponent);
                        System.out.println("Result: " + result);
                        break;
                    case 8:
                        // Factorial of given number
                        singleNum = singleNumber();
                        result = factorialFunc(singleNum);
                        System.out.println("Factorial: " + result);
                        break;
                    default:
                        System.out.println("Please Enter a Valid Selection");
                        break;
                }
                break;
            case 2:
                System.out.print("\n\nSelect Operation: ");
                System.out.println(
                        "\nEnter 1 for Area of 2D Shapes\nEnter 2 for Area of 3D Shapes");

                op = obj.nextInt();

                switch (op) {
                    case 1:
                        // Area Calculator
                        System.out.println("Area of 2D Shapes");
                        System.out.println(
                                "Enter 1 Rectangle/Parallelogram\nEnter 2 for Square\nEnter 3 for triangle\nEnter 4 for Circle");
                        shape = obj.nextInt();
                        Scanner obj6 = new Scanner(System.in);
                        switch (shape) {
                            case 1:
                                System.out.print("Length: ");
                                length = obj6.nextFloat();
                                System.out.print("Breadth: ");
                                breadth = obj6.nextFloat();
                                area = length * breadth;
                                System.out.println("Area of Rectangle : " + area);
                                break;
                            case 2:
                                System.out.print("Side: ");
                                side = obj6.nextFloat();
                                area = (side * side);
                                System.out.println("Area of Square : " + area);
                                break;
                            case 3:
                                System.out.print("Length: ");
                                length = obj6.nextFloat();
                                System.out.print("Breadth: ");
                                breadth = obj6.nextFloat();
                                area = (length * breadth);
                                area = (area * 1 / 2);
                                System.out.println("Area of Triangle : " + area);
                                break;
                            case 4:
                                System.out.print("Radius: ");
                                radius = obj6.nextFloat();
                                area = (pie * radius * radius);
                                System.out.println("Area of Circle : " + area);
                                break;
                            default:
                                break;
                        }
                    case 2:
                        // Surface area of 3D Sapes
                        cal.surfaceArea();
                        break;
                }
                break;
            case 3:
                float arithmeticProgressin[] = new float[3];
                System.out.println("Enter the A.P");
                no = numberOfElements();
                aq = elementsInput(no);
                arithmeticProgressin = arithmeticProgressinCheck(aq, no);
                // if (check[]) {
                System.out.println("Enter 1 to find the nth term\nEnter 2 for Sum till nth term\n");
                System.out.println("Select Operation: ");
                op = obj.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Nth term of the A.P: ");
                        result = arithmeticProgressin[0] + ((no - 1) * arithmeticProgressin[1]);
                        System.out.print("Nth term : " + result);
                        break;
                    case 2:
                        System.out.println("Sum of nth term of the A.P: ");
                        System.out.println("First term: " + arithmeticProgressin[0]);
                        System.out.println("Diffrence: " + arithmeticProgressin[1]);
                        System.out.println("Size: " + arithmeticProgressin[2]);
                        result = arithmeticProgressin[2] / 2 * (2 * arithmeticProgressin[0]
                                + ((arithmeticProgressin[2] - 1) * arithmeticProgressin[1]));
                        System.out.print("Sum of Nth term : " + result);
                        break;
                    default:

                        break;

                }
                break;
            case 4:
                System.out.println("Press 1 for Mean\nPress 2 for Median\nPress 3 for Mode");
                System.out.println("Select Operation: ");
                op = obj.nextInt();
                switch (op) {
                    case 1:
                        no = numberOfElements();
                        aq = elementsInput(no);
                        result = meanFunction(aq, no);
                        System.out.println("Mean of Given Numbers : " + result);
                        break;
                    case 2:
                        int median;
                        no = numberOfElements();
                        aq = elementsInput(no);
                        if (no % 2 == 0) {
                            median = no / 2;
                            System.out.println("Median of the given numbers : " + aq[median - 1]);
                        } else {
                            median = ((no / 2) + ((no / 2) + 1)) / 2;
                            System.out.println("Median of the given numbers: " + aq[median - 1]);
                        }
                        break;
                    case 3:
                        no = numberOfElements();
                        aq = elementsInput(no);
                        result = modeFunction(aq, no);
                        System.out.println("Mode: " + result);
                        break;
                }
                break;
        }
    }
}