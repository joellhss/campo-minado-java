package com.github.joellhss.cm;

import com.github.joellhss.cm.model.Tabuleiro;
import com.github.joellhss.cm.view.TabuleiroConsole;

public class MainApp {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}

}
