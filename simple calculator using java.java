import java.util.*;
public class simplecalculator {
    public static void main(String[] args) {
        int value1;
        int value2;
        int result;
        int option;
        System.err.println("welcome the my simple calculator");
        System.out.println("_________________________________");
        do 
        {

        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("5.exit");
        Scanner sc = new Scanner(System.in);
        option=sc.nextInt();

        switch (option) {
            case 1:
              System.out.println("enter value:");
              value1=sc.nextInt();

              System.out.println("enter value:");
              value2=sc.nextInt();

              result=value1+value2;
              System.out.println("the sum of"+ " " +value1+" " +"and"+" "+value2 +" "+"is:"+result);
             break;

             case 2:
             System.out.println("enter value:");
             value1=sc.nextInt();

             System.out.println("enter value:");
             value2=sc.nextInt();

             result=value1-value2;
             System.out.println("the sub of"+ " " +value1+" " +"and"+" "+value2 +" "+"is:"+result);
            break;

            case 3:
            System.out.println("enter value:");
            value1=sc.nextInt();

            System.out.println("enter value:");
            value2=sc.nextInt();

            result=value1*value2;
            System.out.println("the multiplication of"+ " " +value1+" " +"and"+" "+value2 +" "+"is:"+result);
           break;

           case 4:
           System.out.println("enter value:");
           value1=sc.nextInt();

           System.out.println("enter value:");
           value2=sc.nextInt();

           result=value1/value2;
           System.out.println("the division of"+ " " +value1+" " +"and"+" "+value2 +" "+"is:"+result);
          break;
          

          case 5:
          System.out.println("exit");
          System.out.println("thankyou for using me>>>");
        break;

    }
       
      } 
      while(true);
 }

}

    
}
