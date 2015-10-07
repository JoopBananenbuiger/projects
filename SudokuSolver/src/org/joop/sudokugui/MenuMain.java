package sudokugui;

import javax.swing.JMenuBar;

/**
 * Contains <code>JMenu</code>s that populate the <code>JMenuBar</code>
 */
@SuppressWarnings("serial")
public class MenuMain extends JMenuBar{
	MenuFile menuFile;
	
	public MenuMain(){
		super();
		createMenuBar();
	}
	
	private void createMenuBar(){
		menuFile = new MenuFile();
		add(menuFile);
	}
}
