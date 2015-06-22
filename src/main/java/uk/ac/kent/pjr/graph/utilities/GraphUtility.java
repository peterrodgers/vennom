package uk.ac.kent.pjr.graph.utilities;

import uk.ac.kent.pjr.apCircles.APCirclePanel;
import uk.ac.kent.pjr.graph.*;


/**
 * This is a way of passing graph modifications methods to
 * the GraphPanel class.
 * Any such modification algorithm should be implemented by
 * extending this class and overloading the {@link #apply} method.
 * <p>
 * The acceleratorKey is the key that when pressed in the GraphPanel
 * calls the apply method.
 *
 * @author Peter Rodgers
 */


public abstract class GraphUtility {

/** the associated GraphPanel */
	protected APCirclePanel graphPanel = null;
/** the key that should be pressed to start the graph drawing method. Codes can be found in the KeyEvent class. */
	protected int acceleratorKey = 0;
/** the message that should appear in menu options to start the graph drawing method */
	protected String menuText;
/** the menu mnemonic for initiating the layout. Codes can be found in the KeyEvent class. */
	protected int mnemonicKey = 0;

/** Minimal constructor. */
	public GraphUtility(String inMenuText) {
		menuText = inMenuText;
	}

/** Trivial constructor. */
	public GraphUtility(int inAccelerator, String inMenuText) {
		acceleratorKey = inAccelerator;
		menuText = inMenuText;
	}

/** Trivial constructor. */
	public GraphUtility(int inAccelerator, String inMenuText, int inMnemonic) {
		acceleratorKey = inAccelerator;
		menuText = inMenuText;
		mnemonicKey = inMnemonic;
	}

/** Trival accessor. */
	public APCirclePanel getGraphPanel() {return graphPanel;}
/** Returns the graph of graphPanel, as this is the one that is drawn. */
	public Graph getGraph() {return graphPanel.getGraph();}
/** Trival accessor. */
	public int getAcceleratorKey() {return acceleratorKey;}
/** Trival accessor. */
	public String getMenuText() {return menuText;}
/** Trival accessor. */
	public int getMnemonicKey() {return mnemonicKey;}

/** This modifier should only be used by GraphPanel. */
	public void setGraphPanel(APCirclePanel inGraphPanel) {graphPanel=inGraphPanel;}
/** Trivial modifier. */
	public void setAcceleratorKey(int inKey) {acceleratorKey=inKey;}
/** Trivial modifier. */
	public void setMenuText(String inMenuText) {menuText=inMenuText;}
/** Trivial modifier. */
	public void setMnemonicKey(int inKey) {mnemonicKey=inKey;}

/** Overwrite this with the modification to the graph. */
	public abstract void apply();

}



