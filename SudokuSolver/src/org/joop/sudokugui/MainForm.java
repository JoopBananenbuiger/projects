package sudokugui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import func.LayoutFunc;

/**
 * The main GUI window.
 */
@SuppressWarnings("serial")
public class MainForm extends JFrame{
	public static final int WINDOW_WIDTH = 1280;
	public static final int WINDOW_HEIGHT = 960;
	
	MenuMain menu;
	SudokuGrid grid;

	public MainForm(){
		super("Sudoku");
		setLayout(new GridBagLayout());
		createFrame();
		setFrame();
	}
	
	private void createFrame(){
		menu = new MenuMain();
		setJMenuBar(menu);
		
		GridBagConstraints bag = new GridBagConstraints();
		LayoutFunc.setGridBagConstraints(bag, 0, 0, 1, 1, 1.0, 1.0);
		bag.fill = GridBagConstraints.BOTH;
		
		grid = new SudokuGrid();
		add(grid, bag);
	}
	
	private void setFrame(){
		Dimension windowSize = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
		setMinimumSize(windowSize);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}
}
