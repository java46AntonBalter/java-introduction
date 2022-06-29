package telran.numbers;

public class TictactoeGame {
	public static int tictactoeMove(char matrix[][], int nRow, int nCol, char symb) {
		matrix[nRow][nCol] = symb;
		return checkStatus(matrix);
	}

	public static int checkStatus(char[][] matrix) {
		
		return checkifSquare(matrix) == 0 ? 
			((checkGameOver(matrix) == 0 && checkWin(matrix) == 3) ? 0 : checkWin(matrix)) : -1 ;
	}
	
	public static int checkifSquare(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix.length != matrix[i].length)
				return -1;
		}
		return 0;
	}

	public static int checkGameOver(char[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] != 'x' && matrix[i][j] != '0') {
					return 0;
				}
			}
		}
		return 1;
	}

	public static int checkWin(char[][] matrix) {
		return (checkWinRow(matrix) == 1 || checkWinCollumn(matrix) == 1 || checkWinDiagonal1(matrix) == 1
				|| checkWinDiagonal2(matrix) == 1) ? 1 : 3;
	}

	public static int checkWinRow(char[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			int countMatch = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == matrix[i][0]) {
					++countMatch;
				}
			}
			if (countMatch == matrix[i].length) {
				return 1;
			}
		}
		return 3;
	}

	public static int checkWinCollumn(char[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			int countMatch = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[j][i] == matrix[0][i]) {
					++countMatch;
				}
			}
			if (countMatch == matrix[i].length) {
				return 1;
			}
		}
		return 3;
	}

	public static int checkWinDiagonal1(char[][] matrix) {
		int countMatch = 0;
		for (int i = 0, j = 0; i < matrix[0].length - 1; i++, j++) {

			if (matrix[i][j] == matrix[i + 1][j + 1]) {
				++countMatch;
			}
		}
		return (countMatch == matrix[0].length - 1) ? 1 : 3;
	}

	public static int checkWinDiagonal2(char[][] matrix) {
		int countMatch = 0;
		for (int i = matrix[0].length - 1, j = 0; j < matrix[0].length - 1; i--, j++) {
			if (matrix[i][j] == matrix[i - 1][j + 1]) {
				++countMatch;
			}
		}
		return (countMatch == matrix[0].length - 1) ? 1 : 3;
	}
}
