import javax.swing.*;
import java.awt.event.*;

public class QuizBattleGUI extends JFrame implements ActionListener {

    JLabel lblQuestion;
    JLabel lblResult;

    JButton btn1;
    JButton btn2;

    Questions question = new Questions();

    public QuizBattleGUI() {
        // Frame setup
        setTitle("Programming Quiz Battle");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // GUI Components Setup
        lblQuestion = new JLabel(question.getQuestion());
        lblQuestion.setBounds(50, 20, 320, 30);

        btn1 = new JButton(question.getOption1());
        btn1.setBounds(50, 90, 120, 40);
        btn1.addActionListener(this);

        btn2 = new JButton(question.getOption2());
        btn2.setBounds(200, 90, 120, 40);
        btn2.addActionListener(this);

        lblResult = new JLabel("Answer the question!");
        lblResult.setBounds(50, 150, 300, 30);

        // Add components to the frame
        add(lblQuestion);
        add(btn1);
        add(btn2);
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        if (question.isCorrect(button.getText())) {
            lblResult.setText("Correct! You defeated the Code Boss!");
        } else {
            lblResult.setText("Wrong! Try Again!");
        }
    }

    public static void main(String[] args) {
        new QuizBattleGUI(); // Run the application
    }
}