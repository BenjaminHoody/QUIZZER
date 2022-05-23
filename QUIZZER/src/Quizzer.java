import java.util.Scanner;
import java.text.DecimalFormat;

public class Quizzer
	{
		static Scanner userInput = new Scanner(System.in);
		static double score = 0;
		public static void main(String[] args)
		{
//			Car x = new Car();
//			Car x = new Tesla();
//			Tesla x = new Car();
//			Tesla x = new Tesla();
			
//			x.turnOn();
//			x.drive();
//			x.autoPilot();
			
			question1();
			question2();
			question3();
			question4();
			question5();
			question6();
			question7();
			question8();
			question9();
			question10();
			question11();
			question12();
			reportScore();
		}
		
		public static void reportScore()
			{
				DecimalFormat d = new DecimalFormat ("0.00");
				System.out.println("\nYour Score is " + (int)score + "/12!!!");
				double percent = (score * 100)/12;
				System.out.println("You got a %" + d.format(percent) + "!!!");
			}
		
			public static void question1()
				{
					System.out.println("\n1. Car x = new Car();");
					System.out.println("What will  x.turnOn(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: VROOOOMMMM");
					System.out.println("4: Only as fast as the car in front of you!");
					
					int answer = userInput.nextInt();
					
					if(answer == 3)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
				}
			
			public static void question2()
				{
					System.out.println("\n2. Car x = new Tesla();");
					System.out.println("What will  x.turnOn(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: VROOOOMMMM");
					System.out.println("4: No Hands!!!");
					
					int answer = userInput.nextInt();
					
					if(answer == 1)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
				}
						
			public static void question3()
				{
					System.out.println("\n3. Tesla x = new Car();");
					System.out.println("What will  x.turnOn(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: VROOOOMMMM");
					System.out.println("4: Only as fast as the car in front of you!");
					
					int answer = userInput.nextInt();
					
					if(answer == 2)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}

				}
			
			public static void question4()
				{
					System.out.println("\n4. Tesla x = new Tesla();");
					System.out.println("What will  x.turnOn(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: VROOOOMMMM");
					System.out.println("4: No Hands!!!");
					
					int answer = userInput.nextInt();
					
					if(answer == 1)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
	
				}
			
			public static void question5()
				{
					System.out.println("\n5. Car x = new Car();");
					System.out.println("What will  x.drive(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: VROOOOMMMM");
					System.out.println("4: Only as fast as the car in front of you!");
					
					int answer = userInput.nextInt();
					
					if(answer == 4)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
	
				}
			
			public static void question6()
				{
					System.out.println("\n6. Car x = new Tesla();");
					System.out.println("What will  x.drive(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: VROOOOMMMM");
					System.out.println("4: Only as fast as the car in front of you!");
					
					int answer = userInput.nextInt();
					
					if(answer == 4)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
	
				}
				
			public static void question7()
				{
					System.out.println("\n7. Tesla x = new Car();");
					System.out.println("What will  x.drive(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: VROOOOMMMM");
					System.out.println("4: Only as fast as the car in front of you!");
					
					int answer = userInput.nextInt();
					
					if(answer == 2)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
	
				}
			
			public static void question8()
				{
					System.out.println("\n8. Tesla x = new Tesla();");
					System.out.println("What will  x.drive(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: No Hands!!!");
					System.out.println("4: Only as fast as the car in front of you!");
					
					int answer = userInput.nextInt();
					
					if(answer == 4)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
	
				}
			
			public static void question9()
				{
					System.out.println("\n9. Car x = new Car();");
					System.out.println("What will  x.autoPilot(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: No Hands!!!");
					System.out.println("4: Only as fast as the car in front of you!");
					
					int answer = userInput.nextInt();
					
					if(answer == 2)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
	
				}
			
			public static void question10()
				{
					System.out.println("\n10. Car x = new Tesla();");
					System.out.println("What will  x.autoPilot(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: No Hands!!!");
					System.out.println("4: Only as fast as the car in front of you!");
					
					int answer = userInput.nextInt();
					
					if(answer == 2)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
	
				}
			
			public static void question11()
				{
					System.out.println("\n11. Tesla x = new Car();");
					System.out.println("What will  x.autoPilot(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: No Hands!!!");
					System.out.println("4: Only as fast as the car in front of you!");
					
					int answer = userInput.nextInt();
					
					if(answer == 2)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
	
				}
			
			public static void question12()
				{
					System.out.println("\n12. Tesla x = new Tesla();");
					System.out.println("What will  x.autoPilot(); return?");
					System.out.println("\n1: Silence");
					System.out.println("2: Error");
					System.out.println("3: No Hands!!!");
					System.out.println("4: Only as fast as the car in front of you!");
					
					int answer = userInput.nextInt();
					
					if(answer == 3)
					{
						System.out.println("\nCorrect");
						score++;
					}
					
					else
						{
							System.out.println("\nIncorrect");
						}
	
				}
			
			
	}
