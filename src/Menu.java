import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String valasztott="";

        do{
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("1) Program inditása");
           
            System.out.println("2) Névjegy");
            
            System.out.println("3) Kilépes");
    
            
            System.out.println();
            System.out.print("Választás:");
            valasztott =sc.nextLine();
            switch(valasztott){
                case "1":
                System.out.print("Program...");

                double szam=0;
                do{
                    System.out.print("szam");
                    szam = sc.nextDouble();
                    if(szam !=0){
                        double ngyok=Math.sqrt(szam);
                        System.out.printf("Negyzetgyök: %.2f\n",ngyok
                        );
                    }
                }while(szam!=0);
                System.out.println("Folytatashoz enter");
                sc.nextLine();//Enter olvasása
                sc.nextLine();//várás az enterre

                break;
    
                case "2":
                System.out.print("Nevjegy...");
                System.out.println("Baráth Dávid");
                System.out.println("Szoft1/N");
                System.out.println("gyökszamitó");
                System.out.println("folytatáshoz enter");
                sc.nextLine();
                break;
    
                case "3":
                System.out.println("Kilepes...");
                break;
            }
        } 

while(!valasztott.equals("3"));

       
      
    }
}

