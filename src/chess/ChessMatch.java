package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				matrix[r][c] = (ChessPiece) board.piece(r, c);
			}
		}
		return matrix;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column,row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('b',6, new Rook(board, Color.WHITE));
		placeNewPiece('e',8, new King(board, Color.BLACK));
		placeNewPiece('e',1, new King(board, Color.WHITE));
	}
}
