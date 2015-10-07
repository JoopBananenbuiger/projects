package sudokugui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import sudokusolver.GameManager;

/**
 * Contains <code>JMenuItem</code>s for the File menu
 */
@SuppressWarnings("serial")
public class MenuFile extends JMenu{
	private JMenuItem solve;
	private JMenuItem exit;
	
	public MenuFile(){
		super("File");
		setMnemonic('F');
		createMenu();
	}
	
	private void createMenu(){
		MenuListener handler = new MenuListener();
		solve = new JMenuItem("Solve");
		solve.setMnemonic('S');
		solve.addActionListener(handler);
		add(solve);
		
		exit = new JMenuItem("Exit");
		exit.setMnemonic('x');
		exit.addActionListener(handler);
		add(exit);
	}
	
	private class MenuListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == solve){
				GameManager.solvePuzzle();
			}
			else if(e.getSource() == exit){
				if(JOptionPane.showConfirmDialog(null, "Close Application?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
					System.exit(0);
				}
			}
		}
	}
}
