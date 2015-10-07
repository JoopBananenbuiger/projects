package sudokugui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import sudokusolver.GameManager;
import sudokusolver.Sudoku;
import func.LayoutFunc;


/**
 * Representation of a Sudoku box.
 */
@SuppressWarnings("serial")
public class Box extends JPanel{	
	/** 
	 * @param	boxID		Used in conjunction with assigned CellID to extrapolate proper xy coordinates. Discarded after initialization. 
	 */
	public Box(int boxID){
		super();
		setLayout(new GridBagLayout());
		createPanel(boxID);
	}
	
	private void createPanel(int boxID){
		GridBagConstraints bag = new GridBagConstraints();
		bag.anchor = GridBagConstraints.NORTHWEST;
		bag.fill = GridBagConstraints.BOTH;
		LayoutFunc.setGridBagConstraints(bag, 0, 0, 1, 1, 1.0, 1.0);
		
		int boxLength = (int) Math.sqrt(Sudoku.BOX_COUNT); 
		int cellID = 0;
		
		for(bag.gridy = 0; bag.gridy < boxLength; bag.gridy++){
			for(bag.gridx = 0; bag.gridx < boxLength; bag.gridx++){
				/* Calculate array index using box and cell IDs. 
				 * Construction process of SudokuGrid does not allow for them to be ordered properly.
				*/
				int bs = (int) Math.sqrt(Sudoku.BOX_SIZE);
				int bc = (int) Math.sqrt(Sudoku.BOX_COUNT);				
				int x = (cellID % bs) + (boxID % bc) * bs;
				int y = (cellID / bs) + (boxID / bc) * bs;
				
				Cell aCell = new Cell(x, y);				
				GameManager.addCell(x, y, aCell);
				add(aCell, bag);
				cellID++;
			}
		}
		setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLUE));
	}
}
