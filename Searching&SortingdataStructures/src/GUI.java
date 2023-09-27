import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JButton wordCountButton;
    private JButton wordsToArrayButton;
    private JButton wordSelectionButton;
    private JButton wordSortButton;
    private JButton wordSearchButton;
    private JButton programRuntimeButton;

    public GUI() {
        setContentPane( contentPane );
        setModal( true );

    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JButton getWordCountButton() {
        return wordCountButton;
    }

    public void setWordCountButton(JButton wordCountButton) {
        this.wordCountButton = wordCountButton;
    }


    public JButton getWordsToArrayButton() {
        return wordsToArrayButton;
    }

    public void setWordsToArrayButton(JButton wordsToArrayButton) {
        this.wordsToArrayButton = wordsToArrayButton;
    }

    public JButton getWordSelectionButton() {
        return wordSelectionButton;
    }

    public void setWordSelectionButton(JButton wordSelectionButton) {
        this.wordSelectionButton = wordSelectionButton;
    }

    public JButton getWordSortButton() {
        return wordSortButton;
    }

    public void setWordSortButton(JButton wordSortButton) {
        this.wordSortButton = wordSortButton;
    }

    public JButton getWordSearchButton() {
        return wordSearchButton;
    }

    public void setWordSearchButton(JButton wordSearchButton) {
        this.wordSearchButton = wordSearchButton;
    }

    public JButton getProgramRuntimeButton() {
        return programRuntimeButton;
    }

    public void setProgramRuntimeButton(JButton programRuntimeButton) {
        this.programRuntimeButton = programRuntimeButton;
    }

    {
        wordCountButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WordCount();
            }
        }  );

        wordsToArrayButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WordsToArray();
            }
        } );

        wordSelectionButton.addActionListener( new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {
                WordSelection selection = new WordSelection();
            }
        } );
        wordSortButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                new WordBubbleSort();
            }
        } );


        wordSearchButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FileWordSearch();
            }
        }  );

        programRuntimeButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ProgramRuntime();
            }
        }  );

    }
    public static void main(String[] args) {
        GUI dialog = new GUI();
        dialog.pack();
        dialog.setVisible( true );
        //System.exit( 0 );
    }

}
