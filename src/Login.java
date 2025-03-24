//import javax.swing.*;
//
//public class Login {
//    private JPanel panel1;
//    private JCheckBox rememberCheckBox;
//    private JFormattedTextField usernameFormattedTextField;
//    private JPasswordField PasswordField;
//    private JButton loginButton;
//    private JFrame frame;
//    public Login() {
//        frame = new JFrame("User Login Frame");
//        frame.setContentPane(panel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setPreferredSize(new java.awt.Dimension(300, 200));
//        frame.setResizable(false);
//        frame.pack();
//        frame.setVisible(true);
//        //panel
//        frame.add(panel1);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//}


//CODE2
//import java.awt.*;
//import javax.swing.*;
//
//public class Login {
//    private JPanel panel1;
//    private JCheckBox rememberCheckBox;
//
//    // Login button
//    private JButton loginButton;
//    private JPasswordField passwordField1;
//    //Username
//    private JTextField usernameFormattedTextField;
//
//    public Login() {
//        JFrame frame = new JFrame("Facebook Login");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setPreferredSize(new Dimension(400, 350));
//        frame.setResizable(false);
//
//        // Create the main panel
//        //panel1 = new JPanel();
//        panel1.setLayout(new BorderLayout());
//        panel1.setBackground(new Color(240, 242, 245));
//
//        // Create the logo panel
//        JPanel logoPanel = new JPanel();
//        logoPanel.setBackground(new Color(240, 242, 245));
//        JLabel logoLabel = new JLabel(new ImageIcon("C:\\Users\\vivek\\IdeaProjects\\Login\\src\\logo.svg")); // Replace with the path to your Facebook logo image
//        logoPanel.add(logoLabel);
//
//        // Create the form panel
//        JPanel formPanel = new JPanel();
//        formPanel.setLayout(new GridLayout(3, 1, 10, 10));
//        formPanel.setBackground(new Color(240, 242, 245));
//
//        // Username field
//        //noinspection BoundFieldAssignment
//        usernameFormattedTextField = new JTextField();
//        usernameFormattedTextField.setPreferredSize(new Dimension(200, 30));
//        usernameFormattedTextField.setBorder(BorderFactory.createCompoundBorder(
//                usernameFormattedTextField.getBorder(),
//                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
//        formPanel.add(usernameFormattedTextField);
//
//        // Password field
//        JPasswordField passwordField = new JPasswordField();
//        passwordField.setPreferredSize(new Dimension(200, 30));
//        passwordField.setBorder(BorderFactory.createCompoundBorder(
//                passwordField.getBorder(),
//                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
//        formPanel.add(passwordField);
//
//        // Remember me checkbox
//        //noinspection BoundFieldAssignment
//        rememberCheckBox = new JCheckBox("Remember");
//        rememberCheckBox.setBackground(new Color(240, 242, 245));
//        formPanel.add(rememberCheckBox);
//
//        loginButton.setBackground(new Color(24, 119, 242));
//        loginButton.setForeground(Color.WHITE);
//        loginButton.setFocusPainted(false);
//        loginButton.setPreferredSize(new Dimension(200, 30));
//        formPanel.add(loginButton);
//
//        // Add panels to the main panel
//        panel1.add(logoPanel, BorderLayout.NORTH);
//        panel1.add(formPanel, BorderLayout.CENTER);
//
//        // Add the main panel to the frame
//        frame.setContentPane(panel1);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(Login::new);
//    }
//}

//CODE3

//import javax.swing.*;
//import java.awt.*;
//
//public class Login {
//    private JPanel panel1;
//    private JCheckBox rememberCheckBox;
//    private JButton loginButton;
//    private JPasswordField passwordField1;
//    private JTextField usernameFormattedTextField;
//
//    public Login() {
//        JFrame frame = new JFrame("Facebook Login");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setPreferredSize(new Dimension(400, 350));
//        frame.setResizable(false);
//
//        // Create the main panel
//        panel1 = new JPanel();
//        panel1.setLayout(new BorderLayout(10, 10)); // Add some padding
//        panel1.setBackground(new Color(240, 242, 245));
//
//        // Create the logo panel
//        JPanel logoPanel = new JPanel();
//        logoPanel.setBackground(new Color(240, 242, 245));
//        JLabel logoLabel = new JLabel(new ImageIcon("logo.jpg")); // Replace with the path to your Facebook logo image
//        logoPanel.add(logoLabel);
//
//        // Create the form panel
//        JPanel formPanel = new JPanel();
//        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical alignment
//        formPanel.setBackground(new Color(240, 242, 245));
//
//        // Add some rigid area for spacing
//        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
//
//        // Username field
//        usernameFormattedTextField = new JTextField();
//        usernameFormattedTextField.setMaximumSize(new Dimension(250, 30)); // Set maximum size
//        usernameFormattedTextField.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align
//        usernameFormattedTextField.setBorder(BorderFactory.createCompoundBorder(
//                usernameFormattedTextField.getBorder(),
//                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
//        formPanel.add(usernameFormattedTextField);
//
//        // Add some rigid area for spacing
//        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
//
//        // Password field
//        passwordField1 = new JPasswordField();
//        passwordField1.setMaximumSize(new Dimension(250, 30)); // Set maximum size
//        passwordField1.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align
//        passwordField1.setBorder(BorderFactory.createCompoundBorder(
//                passwordField1.getBorder(),
//                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
//        formPanel.add(passwordField1);
//
//        // Add some rigid area for spacing
//        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
//
//        // Remember me checkbox
//        rememberCheckBox = new JCheckBox("Remember me");
//        rememberCheckBox.setBackground(new Color(240, 242, 245));
//        rememberCheckBox.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align
//        formPanel.add(rememberCheckBox);
//
//        // Add some rigid area for spacing
//        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
//
//        // Login button
//        loginButton = new JButton("Log In");
//        loginButton.setBackground(new Color(24, 119, 242));
//        loginButton.setForeground(Color.WHITE);
//        loginButton.setFocusPainted(false);
//        loginButton.setMaximumSize(new Dimension(250, 30)); // Set maximum size
//        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align
//        formPanel.add(loginButton);
//
//        // Add some rigid area for spacing
//        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
//
//        // Add panels to the main panel
//        panel1.add(logoPanel, BorderLayout.NORTH);
//        panel1.add(formPanel, BorderLayout.CENTER);
//
//        // Add the main panel to the frame
//        frame.setContentPane(panel1);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(Login::new);
//    }
//}

//CODE4 Best as far

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Login {
    private JPanel panel1;
    private JCheckBox rememberCheckBox;
    private JButton loginButton;
    private JPasswordField passwordField1;
    private JTextField usernameFormattedTextField;

    public Login() {
        JFrame frame = new JFrame("Facebook Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 350));
        frame.setResizable(false);

        // Create the main panel
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(10, 10)); // Add some padding
        panel1.setBackground(new Color(240, 242, 245));

        // Create the logo panel
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(new Color(240, 242, 245));
        JLabel logoLabel = new JLabel(new ImageIcon("logo.jpg")); // Replace with the path to your Facebook logo image
        logoPanel.add(logoLabel);

        // Create the form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical alignment
        formPanel.setBackground(new Color(240, 242, 245));

        // Add some rigid area for spacing
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Username field with placeholder
        usernameFormattedTextField = new JTextField();
        usernameFormattedTextField.setMaximumSize(new Dimension(250, 30)); // Set maximum size
        usernameFormattedTextField.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align
        usernameFormattedTextField.setBorder(BorderFactory.createCompoundBorder(
                usernameFormattedTextField.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        usernameFormattedTextField.setForeground(Color.GRAY); // Set placeholder text color
        usernameFormattedTextField.setText("Username"); // Set placeholder text
        usernameFormattedTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usernameFormattedTextField.getText().equals("Username")) {
                    usernameFormattedTextField.setText("");
                    usernameFormattedTextField.setForeground(Color.BLACK); // Set text color when typing
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usernameFormattedTextField.getText().isEmpty()) {
                    usernameFormattedTextField.setForeground(Color.GRAY); // Reset placeholder color
                    usernameFormattedTextField.setText("Username"); // Reset placeholder text
                }
            }
        });
        formPanel.add(usernameFormattedTextField);

        // Add some rigid area for spacing
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Password field with placeholder
        passwordField1 = new JPasswordField();
        passwordField1.setMaximumSize(new Dimension(250, 30)); // Set maximum size
        passwordField1.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align
        passwordField1.setBorder(BorderFactory.createCompoundBorder(
                passwordField1.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        passwordField1.setForeground(Color.GRAY); // Set placeholder text color
        passwordField1.setEchoChar((char) 0); // Show placeholder text
        passwordField1.setText("Password"); // Set placeholder text
        passwordField1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(passwordField1.getPassword()).equals("Password")) {
                    passwordField1.setText("");
                    passwordField1.setEchoChar('*'); // Show password characters
                    passwordField1.setForeground(Color.BLACK); // Set text color when typing
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (new String(passwordField1.getPassword()).isEmpty()) {
                    passwordField1.setEchoChar((char) 0); // Show placeholder text
                    passwordField1.setForeground(Color.GRAY); // Reset placeholder color
                    passwordField1.setText("Password"); // Reset placeholder text
                }
            }
        });
        formPanel.add(passwordField1);

        // Add some rigid area for spacing
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Remember me checkbox
        rememberCheckBox = new JCheckBox("Remember me");
        rememberCheckBox.setBackground(new Color(240, 242, 245));
        rememberCheckBox.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align
        formPanel.add(rememberCheckBox);

        // Add some rigid area for spacing
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Login button
        loginButton = new JButton("Log In");
        loginButton.setBackground(new Color(24, 119, 242));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setMaximumSize(new Dimension(250, 30)); // Set maximum size
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align
        formPanel.add(loginButton);

        // Add some rigid area for spacing
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Add panels to the main panel
        panel1.add(logoPanel, BorderLayout.NORTH);
        panel1.add(formPanel, BorderLayout.CENTER);

        // Add the main panel to the frame
        frame.setContentPane(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}