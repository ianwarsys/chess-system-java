package application;

import chess.ChessMatch;

class Program {

	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
	}

}
