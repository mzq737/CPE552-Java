/**
 *
 * @author Zhenqing Mao
 */
public class Complex {
	public final double real;
	public final double imag;
	
	public Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public Complex add(Complex a) {
		return new Complex(real + a.real, imag + a.imag);
	}
	
	public String toString() {
		return "(" + real + "," + imag + ")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex a = new Complex(1.5, 2.1);
        Complex b = new Complex(-1.2, 3.3);
        Complex c = a.add(b); // should be (0.3, 5.4)
        System.out.println(a.toString() + " + " + b.toString() + " = " + c.toString());
        // (1.5,2.1) + (-1.2,3.3) = (0.3,5.4)
	}

}
