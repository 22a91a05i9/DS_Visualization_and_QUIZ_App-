package treesAndGraphs.binaryTrees.binarySearchTrees;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class InsertOperation extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel workingLabel,algorithmLabel;
    public InsertOperation(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Insert Operation", 350, 10, 400, 50);
        add(heading);
        
        workingLabel = algorithmSetter("Images/Trees and Graphs/Trees/Binary Trees/Binary Search Trees/Insert/BST insert.gif", 270,60, 450,250);
        add(workingLabel);
        algorithmLabel = algorithmSetter("Images/Trees and Graphs/Trees/Binary Trees/Binary Search Trees/Insert/Algorithm.jpg", 200, 300, 570, 450);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("BSTInsert");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new BinarySearchTree("Data Structures/Trees and Graphs/Binary Trees/Binary Search Trees");
        }  
        dispose();
    }
}
