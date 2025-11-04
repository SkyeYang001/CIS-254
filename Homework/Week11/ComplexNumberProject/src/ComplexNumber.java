/**
 * Homework 11
 * Description: Calculates complex numbers in addition, subtraction,
 * multiplication, and divison and also prints the result correctly.
 * 
 * @author Skye Yang
 * @since 10/24/2025
 */

// ** Complex Number class */
public class ComplexNumber {

    private double real; // real number
    private double imag; // imaginary number

    // ** The default constructor method */
    ComplexNumber() {
        real = 0.0;
        imag = 0.0;
    }

    // ** The overloaded constructor method */
    ComplexNumber(double real, double imag) {
        // this.(variable) is the variable inside method
        this.real = real;
        this.imag = imag;
    }

    /**
     * This is the adding method
     * 
     * @param other
     * @return newNumber
     */

    public ComplexNumber add(ComplexNumber other) {
        ComplexNumber newNumber = new ComplexNumber(this.real + other.real, this.imag + other.imag);
        return newNumber;
    }

    /**
     * This is the subtracting method
     * 
     * @param other
     * @return newNumber
     */

    public ComplexNumber subtract(ComplexNumber other) {
        ComplexNumber newNumber = new ComplexNumber(this.real - other.real, this.imag - other.imag);
        return newNumber;
    }

    /**
     * This is the multiplying method
     * 
     * @param other
     * @return newNumber
     */

    public ComplexNumber multiply(ComplexNumber other) {
        double real = ((this.real * other.real) + (this.imag * other.imag * -1));
        double imag = ((this.real * other.imag) + (other.real * this.imag));
        ComplexNumber newNumber = new ComplexNumber(real, imag);
        return newNumber;
    }

    /**
     * This is the dividing method
     * 
     * @param other
     * @return newNumber
     */

    public ComplexNumber divide(ComplexNumber other) {

        double denominator = ((other.real * other.real) + (other.imag * other.imag));
        double real = ((this.real * other.real) + ((this.imag * (-1 * other.imag)) * -1)) / denominator;
        double imag = ((this.real * (-1 * other.imag)) + (other.real * this.imag)) / denominator;

        ComplexNumber newNumber = new ComplexNumber(real, imag);
        return newNumber;
    }

    /**
     * This is correctly prints the result of the calculation
     * 
     * @return string
     */

    public String toString() {
        return String.format("%.1f + %.1fi", this.real, this.imag);
    }

}
