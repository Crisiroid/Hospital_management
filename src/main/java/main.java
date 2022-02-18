import javax.swing.*;

public class main {
    public static void main(String[] args){
        main_menu mm = new main_menu();
        int password = Integer.parseInt(JOptionPane.showInputDialog("Please Enter your password"));
        if(password == 123123){
            JOptionPane.showMessageDialog(null, "Wellcome!, click on ok to see the menu! ");
            mm.main_menu();
        }else{
            JOptionPane.showMessageDialog(null, "Sorry your password is wrong!");
        }
    }
}
