public class Gen3 {
public static void main(String[] args) {
int a = Integer.parseInt(args[0]);
int b  = Integer.parseInt(args[1]);

int firstNum = (int)(Math.random()*(b-a)+1)+a;
int secondNum =(int)(Math.random()*(b-a)+1)+a;
int thirdNum =(int)(Math.random()*(b-a)+1)+a;
int minNum= Math.min(firstNum,Math.min(secondNum,thirdNum));



System.out.println(firstNum);
System.out.println(secondNum);
System.out.println(thirdNum);

System.out.println("The minimal generated number was "+ minNum);

System.out.println("The minimal generated number was "+ minNum);




}}