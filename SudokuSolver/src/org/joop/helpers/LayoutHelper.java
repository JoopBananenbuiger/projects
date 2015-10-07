package helpers;

import java.awt.GridBagConstraints;

public abstract class LayoutHelper{
	public static void setGridBagConstraints(GridBagConstraints bag, int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty){
		bag.gridx = gridx;
		bag.gridy = gridy;
		bag.gridwidth = gridwidth;
		bag.gridheight = gridheight;
		bag.weightx = weightx;
		bag.weighty = weighty;
	}
	
	public static void setGridBagConstraints(GridBagConstraints bag, int gridwidth, int gridheight, double weightx, double weighty){
		bag.gridwidth = gridwidth;
		bag.gridheight = gridheight;
		bag.weightx = weightx;
		bag.weighty = weighty;
	}
}