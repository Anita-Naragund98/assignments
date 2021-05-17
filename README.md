Pattern Program

In this patter program we are printing names with in square pattern using + and - symbols. First it will take the input from the user that is name as the input then it will displayed in the square formated pattern that was made by using + and - .

I set one property that is name 

String name;

Again I have set some more properties, so that I can use it in future.

int num;
		num = name.length();
		int val = num + 3;
		int n = 22 - val;

Names can be taking inputs from user by using a Scanner class

Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name to be displayed");
		name = sc.next();
    
After that I have used a for loop. If we have a fixed number of iterations we are using the for loop.So here I know how many iteration are there so I am using it. Here with in for loop I have used if() condition .To check the condition we are using a if and it will take boolean as the input. If the condition is true it will enter into the loop and executes the code with in it other wise it will not enter the loop. If the condition is false if we have else condition that will be executed other wise not.

With in if I am printing the patter using System.out.println() so that it will print the pattern on console.In else part again I am using another for loop here I am taking j for columns dispaly. Here for checking some conditions again I am using if() condition. In this case it will checking that the 2 values are same or not by using equals operator.Equal operators are used to check the 2 values are same or not.

After in final else part I have one more if condition to check if (i == 3 && j == n + 1) it is true or not .If true it will enter the loop and executes the body of if other wise space will be printed. Here I am using only print it means it will continue to display in a same line. If we used println in the program means it will move and display the content in next line.

After the condition is false in if conditon it will come out of the loop. And after the completion of given number of iterations it will come out of the loop and displayes the others contents.

for (int i = 9; i > 0; i--) {
			if (i == 1 || i == 9) {
				System.out.println("+------------------+");
			} else {
				for (int j = 1; j < 23; j++) {
					if (j == 1 || j == 22) {
						System.out.print("|");
					} else {
						if (i == 3 && j == n + 1) {
							System.out.print(name + "  " + "|");
							break;
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}
 
 Output:
 
 To execute the program in command prompt we have to use the command that is 
 
 javac filename.java
 
 This command will compile your program.
 
 After that you have to use the command that is
 
 java filename
 
 This command helps to run our program. After using this command the output displayed like this.
 
 First it will take the name as the input from user.

F:\prodapt>javac Space.java

F:\prodapt>java Space

Enter the name to be displayed

Anita

After user entering the name through it will displayed with in patter like this

+--------------------+
|                    |
|                    |
|                    |
|                    |
|                    |
|             Anita  |
|                    |
+--------------------+


 
  
    
    
