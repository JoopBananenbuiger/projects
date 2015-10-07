package sudokugui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JPanel;

import func.LayoutFunc;

/**
 * A static class for receiving user input and updating cells
 */
@SuppressWarnings("serial")
public class SelectionPanel extends JPanel{
	/**
	 * Maps <code>JButton</code>s to their integer representation.
	 */
	private static Map<Integer, JButton> mapSelection;
	
	/**
	 * A list of objects subscribed to receive <code>broadcast</code> events.
	 */
	private final static Set<SelectionListener> listeners = new HashSet<>();
	
	public SelectionPanel(){
		super();
		mapSelection = new TreeMap<Integer, JButton>();
		setLayout(new GridBagLayout());
		createPanel();
	}
	
	private void createPanel(){
		GridBagConstraints bag = new GridBagConstraints();
		bag.anchor = GridBagConstraints.NORTHWEST;
		bag.fill = GridBagConstraints.BOTH;
		LayoutFunc.setGridBagConstraints(bag, 0, 0, 1, 1, 1.0, 1.0);
		
		ButtonHandler btnHandler = new ButtonHandler();
		int currentCell = 0;
		
		/*
		 * TODO Add logic to allow for more/less numbers to be used based on how large the grid is.
		 * For example, if the grid is 16x16 then allow for higher numbers or letters to be used.
		 */
		for(bag.gridy = 0; bag.gridy < 3; bag.gridy++){
			for(bag.gridx = 0; bag.gridx < 3; bag.gridx++){
				currentCell = (bag.gridy * 3) + (bag.gridx + 1);
				JButton aBtn = new JButton(String.valueOf(currentCell));
				aBtn.addActionListener(btnHandler);				
				mapSelection.put(currentCell, aBtn);
				add(aBtn, bag);
			}
		}
		/*
		 * TODO Add a clear and cancel button.
		 */
	}
	
	public static void addSelectionListener(SelectionListener listener){
		listeners.add(listener);
	}
	
	public static void removeSelectionListener(SelectionListener listener){
		listeners.remove(listener);
	}
	
	private void broadcast(SelectionEvent e){
		for(SelectionListener listener : listeners){
			listener.stateChanged(e);
		}
	}
	
	private class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			/*
			 * TODO Would prefer to compare the objects for equality 
			 * getSource() == map.getValue(), or .equals do not work.
			*/
			for(Map.Entry<Integer, JButton> map : mapSelection.entrySet()){
				if(e.getActionCommand().equals(map.getKey().toString())){
					broadcast(new SelectionEvent(Integer.parseInt(map.getValue().getText()))); //Updates the value and broadcasts to listening Cell
				}
			}
		}		
	}
}
