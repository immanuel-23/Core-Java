package com.aurionpro.model;

import java.util.ArrayList;

import com.aurionpro.model.Player;

public class ClassifyPlayers {
	
	
	ArrayList<Player> players;

	public ClassifyPlayers(ArrayList<Player> p) {
		this.players = p;
	}

	public ArrayList<Player> getAlister() {
		ArrayList<Player> aLister = new ArrayList<Player>();

		for (Player a : players) {
			if (a.getMatches() > 100 && a.getRuns() > 5000 && a.getWickets() > 150) {
				aLister.add(a);
			}

		}
		return aLister;
	}

	public ArrayList<Player> getBlister() {
		ArrayList<Player> bLister = new ArrayList<Player>();

		for (Player b : players) {
			if ((b.getMatches() > 50 && b.getMatches() < 100)
					&& (b.getRuns() > 3000 && b.getRuns() < 5000 && b.getWickets() > 75 && b.getWickets() < 150)) {
				bLister.add(b);
				// count++;
			}
		}
		return bLister;

	}

	public ArrayList<Player> getClister() {
		ArrayList<Player> cLister = new ArrayList<Player>();

		for (Player c : players) {
			if ((c.getMatches() > 0 && c.getMatches() < 50)
					&& (c.getRuns() > 0 && c.getRuns() < 3000 && c.getWickets() > 0 && c.getWickets() < 75)) {
				cLister.add(c);
				// count++;
			}
		}
		return cLister;

	}

//	public int getMax() {
//		int max = 0;
//		int index = 0;
//		for (int i = 0; i < players.size() i++) {
//			if (players.getRuns() > max) {
//				max = players[i].getRuns();
//				index=i;
//
//			}
//		}
//		return index;
//	}
//
//	public int getMin() {
//		int min=players[0].getRuns();
//		int index=0;
//		
//		for(int i=0;i< players.length;i++) {
//			if(players[i].getRuns()<min) {
//				min=players[i].getRuns();
//				index=i;
//			}
//		}
//		return index;
//	}

}
