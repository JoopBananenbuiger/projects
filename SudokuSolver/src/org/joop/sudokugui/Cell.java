package sudokugui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import sudokusolver.Field;
import sudokusolver.GameManager;
import func.LayoutFunc;

/**
 * Displays the current value of a cell
 */
@SuppressWarnings("serial")
public class Cell extends JPanel implements SelectionListener{		
	private int value; 
	private int x;
	private int y;
	private SelectionPanel pnlSelection;
	private JButton btnCell;
	
	public Cell(int x, int y){
		super();
		this.x = x;
		this.y = y;		
		createPanel();
	}
	
	private void createPanel(){
		setLayout(new GridBagLayout());
		GridBagConstraints bag = new GridBagConstraints();
		bag.anchor = GridBagConstraints.NORTHWEST;
		bag.fill = GridBagConstraints.BOTH;
		LayoutFunc.setGridBagConstraints(bag, 0, 0, 1, 1, 1.0, 1.0);		
		
		pnlSelection = new SelectionPanel();
		
		btnCell = new JButton();
		btnCell.setFont(new Font("Serif", Font.BOLD, 40));
		add(btnCell, bag);		
		btnCell.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				 * TODO Needs logic to ensure the user doesn't select other cells before input is received or canceled. 
				 */
				
				//Clear the JPanel and update with SelectionPanel, wait for user input (logic handled in stateChanged).				
				if(e.getSource() == btnCell){		
					LayoutFunc.setGridBagConstraints(bag, 0, 0, 1, 1, 1.0, 1.0);	
					removeAll();
					add(pnlSelection, bag);
					validate();
					repaint();
					SelectionPanel.addSelectionListener(Cell.this); //Listens to the SelectionPanel for input
				}
			}			
		});
		
	}

	/**
	 * Receives a broadcast event from SelectionPanel containing value to update
	 * 
	 * @param	e	An object that implements SelectionEvent 
	 */
	@Override
	public void stateChanged(SelectionEvent e) {
		SelectionPanel.removeSelectionListener(Cell.this); //<--Important: Must stop listening for input (SelectionPanel is static)
		if(!(e.getValue() == value)){ 
			value = e.getValue();
			btnCell.setText(String.valueOf(value));
			Field aField = new Field(x, y, value);
			GameManager.getSudoku().setFieldValue(aField, value);
		}
		GridBagConstraints bag = new GridBagConstraints();
		bag.anchor = GridBagConstraints.NORTHWEST;
		bag.fill = GridBagConstraints.BOTH;
		LayoutFunc.setGridBagConstraints(bag, 0, 0, 1, 1, 1.0, 1.0);
		
		removeAll();
		add(btnCell, bag);
		validate();
		repaint();
	}
	
	public void setValue(int value){
		this.value = value;
		btnCell.setText(String.valueOf(value));
	}
}
