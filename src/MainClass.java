/**
 *
 * @author Mert
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gezgin_Zeplin().setVisible(true);
            }
        });
    }
}
