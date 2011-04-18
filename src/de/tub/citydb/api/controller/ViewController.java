package de.tub.citydb.api.controller;

import javax.swing.JFrame;

public interface ViewController {
	public JFrame getTopFrame();
	public void clearConsole();
	public void setStatusText(String statusText);
	public void setDefaultStatus();
}
