package sudokugui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import sudokusolver.Sudoku;
import func.LayoutFunc;

/**
 * A graphical representation of a Sudoku puzzle
 */
@SuppressWarnings("serial")
public class SudokuGrid extends JPanel{
	public SudokuGrid(){
		super();
		createPanel();
	}
	
	private void createPanel(){
		setLayout(new GridBagLayout());
		GridBagConstraints bag = new GridBagConstraints();
		bag.anchor = GridBagConstraints.NORTHWEST;
		bag.fill = GridBagConstraints.BOTH;
		LayoutFunc.setGridBagConstraints(bag, 0, 0, 1, 1, 1.0, 1.0);
		
		int dimension = (int) Math.sqrt(Sudoku.BOX_SIZE);
		int currentBox = 0;
		
		//Populate JPanel with Boxes
		for(bag.gridy = 0; bag.gridy < dimension; bag.gridy++){
			for(bag.gridx = 0; bag.gridx < dimension; bag.gridx++){
				Box aBox = new Box(currentBox);
				add(aBox, bag);
				currentBox++;
			}
		}
	}
}
