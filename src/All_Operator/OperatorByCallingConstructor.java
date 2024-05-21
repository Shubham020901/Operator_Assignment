package All_Operator;
import java.util.Scanner;

public class OperatorByCallingConstructor {

    private int a, b;
    private Scanner scanner;


    public OperatorByCallingConstructor() {
        scanner = new Scanner(System.in);
        System.out.println("Welcome to Operator Menu");
        System.out.println("Enter two numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        displayMenu();
    }

    
    private void displayMenu() {
        int choice;
        do {
            System.out.println("\n Select Operator :");
            System.out.println("1. Arithmetic Operator");
            System.out.println("2. Unary Operator");
            System.out.println("3. Logical Operator");
            System.out.println("4. Ternary Operator");
            System.out.println("5. Bitwise Operator");
            System.out.println("6. Shift Operator");
            System.out.println("7. Relational Operator");
            System.out.println("8. Assignment Operator");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ArithmeticOperations();
                    break;
                case 2:
                    UnaryOperations();
                    break;
                case 3:
                    LogicalOperations();
                    break;
                case 4:
                    TernaryOperations();
                    break;
                case 5:
                    BitwiseOperations();
                    break;
                case 6:
                    ShiftOperations();
                    break;
                case 7:
                    RelationalOperations();
                    break;
                case 8:
                    AssignmentOperations();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 0);
        scanner.close();
    }

    
    private void ArithmeticOperations() {
        System.out.println(" Arithmetic Operations");
        
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        
        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Modulus = " + mod);
    }

    
    private void UnaryOperations() {
        System.out.println(" Unary Operations");
        
        int d = 11;
        int d1 = 5;
        boolean c = true;
        
        System.out.println("post-increment=" + d++);
        System.out.println("pre-increment=" + ++d);
        System.out.println("pre-decrement=" + --d);
        System.out.println("post-decrement=" + d--);
        System.out.println("after unary plus=" + +d);
        System.out.println("after unary minus=" + -d);
        System.out.println("bitwise complement unary= " + ~d1);
        System.out.println("logical complement=" + !c);
    }

    
    private void LogicalOperations() {
        System.out.println(" Logical Operations");
        
        int age = 25;
        boolean hasLicense = true;

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
            System.out.println("Let's go for an office!");
        } else {
            System.out.println("Stay indoors, it's WFH.");
        }
    }

    
    private void TernaryOperations() {
        System.out.println(" Ternary Operations");
        
        int x = 10;
        int y = 11;
        String message1 = (x % 2 == 0) ? "Even" : "Odd";
        String message2 = (y % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number " + x + " is " + message1);
        System.out.println("Number " + y + " is " + message2);
    }

    
    private void BitwiseOperations() {
        System.out.println(" Bitwise Operations");
        
        int num1 = 5;
        int num2 = 3;

        int And = num1 & num2;
        int Or = num1 | num2;
        int Xor = num1 ^ num2;

        System.out.println("bitwise AND: " + And);
        System.out.println("bitwise OR: " + Or);
        System.out.println("bitwise XOR: " + Xor);
    }

    
    private void ShiftOperations() {
        System.out.println(" Shift Operations");
        
        int num3 = 6;
        int num4 = 4;
        int num5 = -5;

        int LeftShift = num3 << 2;
        int RightShift = num4 >> 1;
        int UnsignedRightShift = num5 >>> 1;

        System.out.println("left shift for num1: " + LeftShift);
        System.out.println("right shift for num1: " + RightShift);
        System.out.println("unsigned right shift for num3: " + UnsignedRightShift);
    }

    
    private void RelationalOperations() {
        System.out.println(" Relational Operations");
        
        int g = 10;
        int h = 20;

        System.out.println("g == h: " + (g == h));
        System.out.println("g != h: " + (g != h));
        System.out.println("g > h: " + (g > h));
        System.out.println("g < h: " + (g < h));
        System.out.println("g >= h: " + (g >= h));
        System.out.println("g <= h: " + (g <= h));
    }

    
    private void AssignmentOperations() {
        System.out.println(" Assignment Operations");
        
        int num6, num7;
        num6 = 5;
        System.out.println(num6);
        num7 = num6;
        System.out.println(num7);

        int num8 = 20, num9 = 30;
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OperatorByCallingConstructor(); 
	}
}

/*************OUTPUT*********************
 * Welcome to Operator Menu
Enter two numbers:
12
54

 Select Operator :
1. Arithmetic Operator
2. Unary Operator
3. Logical Operator
4. Ternary Operator
5. Bitwise Operator
6. Shift Operator
7. Relational Operator
8. Assignment Operator
0. Exit
Enter your choice: 1
 Arithmetic Operations
Addition = 66
Subtraction = -42
Multiplication = 648
Division = 0
Modulus = 12

 Select Operator :
1. Arithmetic Operator
2. Unary Operator
3. Logical Operator
4. Ternary Operator
5. Bitwise Operator
6. Shift Operator
7. Relational Operator
8. Assignment Operator
0. Exit
Enter your choice: 2
 Unary Operations
post-increment=11
pre-increment=13
pre-decrement=12
post-decrement=12
after unary plus=11
after unary minus=-11
bitwise complement unary= -6
logical complement=false

 Select Operator :
1. Arithmetic Operator
2. Unary Operator
3. Logical Operator
4. Ternary Operator
5. Bitwise Operator
6. Shift Operator
7. Relational Operator
8. Assignment Operator
0. Exit
Enter your choice: 3
 Logical Operations
Eligible to drive.
Time to relax!
Let's go for an office!

 Select Operator :
1. Arithmetic Operator
2. Unary Operator
3. Logical Operator
4. Ternary Operator
5. Bitwise Operator
6. Shift Operator
7. Relational Operator
8. Assignment Operator
0. Exit
Enter your choice: 4
 Ternary Operations
Number 10 is Even
Number 11 is Odd

 Select Operator :
1. Arithmetic Operator
2. Unary Operator
3. Logical Operator
4. Ternary Operator
5. Bitwise Operator
6. Shift Operator
7. Relational Operator
8. Assignment Operator
0. Exit
Enter your choice: 5
 Bitwise Operations
bitwise AND: 1
bitwise OR: 7
bitwise XOR: 6

 Select Operator :
1. Arithmetic Operator
2. Unary Operator
3. Logical Operator
4. Ternary Operator
5. Bitwise Operator
6. Shift Operator
7. Relational Operator
8. Assignment Operator
0. Exit
Enter your choice: 6
 Shift Operations
left shift for num1: 24
right shift for num1: 2
unsigned right shift for num3: 2147483645

 Select Operator :
1. Arithmetic Operator
2. Unary Operator
3. Logical Operator
4. Ternary Operator
5. Bitwise Operator
6. Shift Operator
7. Relational Operator
8. Assignment Operator
0. Exit
Enter your choice: 7
 Relational Operations
g == h: false
g != h: true
g > h: false
g < h: true
g >= h: false
g <= h: true

 Select Operator :
1. Arithmetic Operator
2. Unary Operator
3. Logical Operator
4. Ternary Operator
5. Bitwise Operator
6. Shift Operator
7. Relational Operator
8. Assignment Operator
0. Exit
Enter your choice: 8
 Assignment Operations
5
5
num8 =50
num8 =20
num8 =600
num8 =20
num8 =20

 Select Operator :
1. Arithmetic Operator
2. Unary Operator
3. Logical Operator
4. Ternary Operator
5. Bitwise Operator
6. Shift Operator
7. Relational Operator
8. Assignment Operator
0. Exit
Enter your choice: 0
Exiting...

 */




