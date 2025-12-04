import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    public void initalize() {
        setTitle("Welcome");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 30));
        
        JPanel topPanel = new JPanel();
        JLabel lbFirstName = new JLabel("Enter your first name: ");
        topPanel.add(lbFirstName);
 
        JPanel centerPanel = new JPanel();
        JTextField tfFirstName = new JTextField(10);

        JPanel buttonPanel = new JPanel();
        JButton buttonOk = new JButton("OK");
        buttonPanel.add(buttonOk);
        buttonOk.setPreferredSize(new Dimension(75, 15));
        buttonOk.addActionListener(new ActionListener());
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                lbFirstName.getText("Hello" + firstName);
            }

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);


        setVisible(true);
    }

}
