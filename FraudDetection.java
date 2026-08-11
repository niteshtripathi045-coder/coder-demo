import java .util.Scanner;
public class FraudDetection {      
public static void main(String [] args){
Scanner sc =new Scanner (System.in);
System.out.println("=== Fraud Detection System v2===");

System .out.println("Amount:");
int amount =sc.nextInt();

System.out.print("(0-23):");
int time =sc.nextInt();

System.out.print("country");
String country = sc.next ();

boolean isFraud = false;
//rule 1: Amount 5000 se jayda
if (amount > 5000) {
    isFraud = true;
System.out.println("Reason: Amount bhaut jyada hain");
}
//rule 2:Raat 12 se subh 6 bje tak 
if(time >= 0 && time <= 6){
    isFraud = true;
    System.out.println("Reason:Raat ke time transaction");
}
// Final Decision
if (isFraud) {
    System.out.println("fraud Alert! tracation Blocked ");
} else { 
    System.out.println("Transaction safe");
}
sc.close();
} 
}

