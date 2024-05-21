/*package All_Operator;


public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
							int a = 12, b = 5;
							
							
//A.    Arithmetic Operator

							System.out.println("Arithmetic Operators is Given Below");
							System.out.println("**************************");		
		
	    // addition operator(+) Example
	    					int add = a + b;
	    					System.out.println("Addition = " + add);

	    // subtraction operator(-) Example
	    					int sub = a - b;
	    					System.out.println("Subtraction = " + sub);

	    // multiplication operator(*) Example
	    					int mul = a * b;
	    					System.out.println("Multiplication = " + mul);

	    // division operator(/) Example
	    					int div = a / b;
	    					System.out.println("Division = " + div);

	    // modulus operator(%) Example
	    					int mod = a % b;
	    					System.out.println("Modulus = " + mod);
	 
		
		
		
//B. Unary Operator	
	    					int d=11, d1=5;
	    					boolean c=true;
	    					System.out.println("Unary Operators is Given Below");
	    					System.out.println("**************************");		
		
							System.out.println("post-increment=" + d++);
							System.out.println("pre-increment=" + ++d);
							System.out.println("pre-decrement=" + --d);
							System.out.println("post-decrement=" + d--);
							System.out.println("after unary plus=" + +d);
							System.out.println("after unary minus=" + -d);
							System.out.println("bitwise complemet unary= " + ~d1);
							System.out.println("logical complement=" + !c);


							
//C. Logical Operator
							System.out.println("Logical Operators is Given Below");
							System.out.println("**************************");		

		//AND(&&) Operator Example
							int age = 25;
							boolean hasLicense = true;

							if (age > 18 && hasLicense) {
							    System.out.println("Eligible to drive.");
							} else {
							    System.out.println("Not eligible to drive.");
							}

		// OR(||) Operator Example
							boolean Weekend = true;
        					boolean Holiday = false;

        					if (Weekend || Holiday) {
        					    System.out.println("Time to relax!");
        					} else {
        					    System.out.println("Regular workday.");
        					}
		
		//NOT(!) Operator Example
       						 boolean WFH = false;

       						 if (!WFH) {
        						    System.out.println("Let's go for a office!");
        						} else {
        						    System.out.println("Stay indoors, it's WFH.");
        						}

       						 
//D.Ternary Operator
        					System.out.println("Ternary Operators is Given Below");
							System.out.println("**************************");		

        					int x = 10;
        					int y = 11;
        					String message1 = (x % 2 == 0) ? "Even" : "Odd";
        					String message2 = (y % 2 == 0) ? "Even" : "Odd";

        
        					System.out.println("Number " + x + " is " + message1);
        					System.out.println("Number " + y + " is " + message2);
		
        
        
        
//E.Bitwise Operator
        					System.out.println("Bitwise Operators is Given Below");
							System.out.println("**************************");		

        					int num1 = 5;  
        					int num2 = 3;  
            
         // Bitwise AND (&) operator Example
          					int And = num1 & num2;  
          					System.out.println(" bitwise AND: " + And);

         // Bitwise OR (|) operator Example
           					int Or = num1 | num2;   
           					System.out.println(" bitwise OR: " + Or);

            // Bitwise XOR (^) operator Example
            				int Xor = num1 ^ num2;  
            				System.out.println(" bitwise XOR: " + Xor);

            				
 //F. Shift Operator  
            				System.out.println("Shift Operators is Given Below");
    						System.out.println("**************************");		

            				int num3 = 6;  
            				int num4 = 4;  
            				int num5 = -5;  
            
            // Left shift (<<) operator Example
            				int LeftShift = num3 << 2;  
            				System.out.println("left shift for num1: " + LeftShift);

            // Right shift (>>) operator Example
            				int RightShift = num4 >> 1;  
            				System.out.println("right shift for num1: " + RightShift);

            // Unsigned right shift (>>>) operator Example
            				int UnsignedRightShift = num5 >>> 1;  
            				System.out.println("unsigned right shift for num3: " + UnsignedRightShift);

            				
//G. Relational Operator
            
            				System.out.println("Relational Operators is Given Below");
    						System.out.println("**************************");		

    						int g=10;
    						int h=20;
   
            //Equal TO(==) Example
    						System.out.println(g == h);
    		
    		//Not Equal To(!=) Example
    						System.out.println(g != h);
    		
            //Greater Than(>) Example
            				int studentScore = 75;
            				int passingScore = 60;

            				if (studentScore > passingScore) {
            				    System.out.println("Student passed the test.");
            				} else {
            				    System.out.println("Student failed the test.");
            				}
            
            //Less Than(<) Example
            				int number1 = 45;
            				int number2 = 30;

            				if (number1 < number2) {
            				    System.out.println("The smaller number is: " + number1);
            				} else {
            				    System.out.println("The smaller number is: " + number2);
            				}
            
            
            //Greater than or Equal To (>=)Example
            				int age1 = 20;

            				if (age1 >= 18) {
        					System.out.println("Eligible to vote.");
            				} else {
            				System.out.println("Not eligible to vote.");
            				}
            
            //Less Than Or Equal To (<=)Example
            				int temperature = -5; 

            				if (temperature <= 0) {
            				    System.out.println("Water is frozen.");
            				} else {
            				    System.out.println("Water is not frozen.");
            				} 
            
 
            				
//H.Assignment Operator
            			System.out.println("Assignment Operators is Given Below");
    					System.out.println("**************************");		

            
           //Equals (=) Example
            				int num6,num7;
            				num6 = 5;
           				 	System.out.println(num6);
           				 	num7 = num6;
           				 	System.out.println(num7);
            
            
            				int num8 = 20,num9 = 30;
            //Compound Addition Operator (+=) Example
            				num8 += num9;
            				System.out.println("num8 =" + num8);
           
            //Compound Subtraction Operator (-=) Example 
            				num8 -= num9;
            				System.out.println("num8 =" + num8);
            
            //Compound Multiplication Operator (*=) Example 
            				num8 *= num9;
            				System.out.println("num8 =" + num8);
            
            //Compound Division Operator (/=) Example 
            				num8 /= num9;
            				System.out.println("num8 =" + num8);
            
            //Compound Modulus Operator (%=) Example 
            				num8 %= num9;
            				System.out.println("num8 =" + num8);
	}

}



/****************OUTPUT******************
 Arithmetic Operators is Given Below
**************************
Addition = 17
Subtraction = 7
Multiplication = 60
Division = 2
Modulus = 2


Unary Operators is Given Below
**************************
post-increment=11
pre-increment=13
pre-decrement=12
post-decrement=12
after unary plus=11
after unary minus=-11
bitwise complemet unary= -6
logical complement=false


Logical Operators is Given Below
**************************
Eligible to drive.
Time to relax!
Let's go for a office!


Ternary Operators is Given Below
**************************
Number 10 is Even
Number 11 is Odd


Bitwise Operators is Given Below
**************************
 bitwise AND: 1
 bitwise OR: 7
 bitwise XOR: 6
 
 
Shift Operators is Given Below
**************************
left shift for num1: 24
right shift for num1: 2
unsigned right shift for num3: 2147483645


Relational Operators is Given Below
**************************
false
true
Student passed the test.
The smaller number is: 30
Eligible to vote.
Water is frozen.


Assignment Operators is Given Below
**************************
5
5
num8 =50
num8 =20
num8 =600
num8 =20
num8 =20
*/

package All_Operator;

public class Operator_Simple_Assignment {

    public static void main(String[] args) {
        Operator_Simple_Assignment operator = new Operator_Simple_Assignment();
        operator.arithmeticOperations(12, 5);
        operator.unaryOperations(11, 5, true);
        operator.logicalOperations(25, true);
        operator.ternaryOperations(10, 11);
        operator.bitwiseOperations(5, 3);
        operator.shiftOperations(6, 4, -5);
        operator.relationalOperations(10, 20);
        operator.assignmentOperations(5, 20, 30);
    }

    // A. Arithmetic Operator
    public void arithmeticOperations(int a, int b) {
        System.out.println("Arithmetic Operators is Given Below");
        System.out.println("**************************");

        int add = a + b;
        System.out.println("Addition = " + add);

        int sub = a - b;
        System.out.println("Subtraction = " + sub);

        int mul = a * b;
        System.out.println("Multiplication = " + mul);

        int div = a / b;
        System.out.println("Division = " + div);

        int mod = a % b;
        System.out.println("Modulus = " + mod);
    }

    // B. Unary Operator
    public void unaryOperations(int d, int d1, boolean c) {
        System.out.println("Unary Operators is Given Below");
        System.out.println("**************************");

        System.out.println("post-increment=" + (d++));
        System.out.println("pre-increment=" + (++d));
        System.out.println("pre-decrement=" + (--d));
        System.out.println("post-decrement=" + (d--));
        System.out.println("after unary plus=" + (+d));
        System.out.println("after unary minus=" + (-d));
        System.out.println("bitwise complement unary= " + ~d1);
        System.out.println("logical complement=" + !c);
    }

    // C. Logical Operator
    public void logicalOperations(int age, boolean hasLicense) {
        System.out.println("Logical Operators is Given Below");
        System.out.println("**************************");

        if (age > 18 && hasLicense) {
            System.out.println("Eligible to drive.");
        } else {
            System.out.println("Not eligible to drive.");
        }

        boolean Weekend = true;
        boolean Holiday = false;

        if (Weekend || Holiday) {
            System.out.println("Time to relax!");
        } else {
            System.out.println("Regular workday.");
        }

        boolean WFH = false;

        if (!WFH) {
            System.out.println("Let's go for the office!");
        } else {
            System.out.println("Stay indoors, it's WFH.");
        }
    }

    // D. Ternary Operator
    public void ternaryOperations(int x, int y) {
        System.out.println("Ternary Operators is Given Below");
        System.out.println("**************************");

        String message1 = (x % 2 == 0) ? "Even" : "Odd";
        String message2 = (y % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number " + x + " is " + message1);
        System.out.println("Number " + y + " is " + message2);
    }

    // E. Bitwise Operator
    public void bitwiseOperations(int num1, int num2) {
        System.out.println("Bitwise Operators is Given Below");
        System.out.println("**************************");

        int And = num1 & num2;
        System.out.println(" bitwise AND: " + And);

        int Or = num1 | num2;
        System.out.println(" bitwise OR: " + Or);

        int Xor = num1 ^ num2;
        System.out.println(" bitwise XOR: " + Xor);
    }

    // F. Shift Operator
    public void shiftOperations(int num3, int num4, int num5) {
        System.out.println("Shift Operators is Given Below");
        System.out.println("**************************");

        int LeftShift = num3 << 2;
        System.out.println("left shift for num1: " + LeftShift);

        int RightShift = num4 >> 1;
        System.out.println("right shift for num1: " + RightShift);

        int UnsignedRightShift = num5 >>> 1;
        System.out.println("unsigned right shift for num3: " + UnsignedRightShift);
    }

    // G. Relational Operator
    public void relationalOperations(int g, int h) {
        System.out.println("Relational Operators is Given Below");
        System.out.println("**************************");

        System.out.println(g == h);
        System.out.println(g != h);

        int studentScore = 75;
        int passingScore = 60;

        if (studentScore > passingScore) {
            System.out.println("Student passed the test.");
        } else {
            System.out.println("Student failed the test.");
        }

        int number1 = 45;
        int number2 = 30;

        if (number1 < number2) {
            System.out.println("The smaller number is: " + number1);
        } else {
            System.out.println("The smaller number is: " + number2);
        }

        int age1 = 20;

        if (age1 >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        int temperature = -5;

        if (temperature <= 0) {
            System.out.println("Water is frozen.");
        } else {
            System.out.println("Water is not frozen.");
        }
    }

    // H. Assignment Operator
    public void assignmentOperations(int num6, int num8, int num9) {
        System.out.println("Assignment Operators is Given Below");
        System.out.println("**************************");

        System.out.println(num6);
        int num7 = num6;
        System.out.println(num7);

        num8 += num9;
        System.out.println("num8 =" + num8);

        num8 -= num9;
        System.out.println("num8 =" + num8);

        num8 *= num9;
        System.out.println("num8 =" + num8);

        num8 /= num9;
        System.out.println("num8 =" + num8);

        num8 %= num9;
        System.out.println("num8 =" + num8);
    }
}
