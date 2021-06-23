package application;

import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		for(int r = 0; r < pieces.length; r++) {
			System.out.print(pieces.length - r + " ");
			for (int c = 0; c < pieces[0].length; c++) {
				printPiece(pieces[r][c]);
			}
			System.out.println();
		}
	    System.out.println("  A B C D E F G H");
	}
    
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
