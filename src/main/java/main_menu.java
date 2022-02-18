import javax.swing.*;

public class main_menu {
    public  static void main_menu(){
       int type = Integer.parseInt(JOptionPane.showInputDialog("Please select a number from list below: \n 1: create patient \n 2: create Doctor \n 3: create appointment \n 4: delete patient"));
       switch (type){
           case 1:
               System.out.println("this will be filled");
               break;
           case 2:
               System.out.println("this will be filled");
               break;
           case 3:
               System.out.println("this will be filled");
               break;
           case 4:
               System.out.println("this will be filled");
               break;
           default:
               System.out.println("wrong number!");
               break;
       }
    }
}
