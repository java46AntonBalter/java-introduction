package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.TictactoeGame;

class TictactoeGameTest {

	@Test
	void tictactoeMoveTest() {
		//check game not over 
		char[][] matrix3 = {
				{'a','a','a'},
				{'0','x','0'},
				{'1','x','0'}
		};
		assertEquals(0, TictactoeGame.tictactoeMove(matrix3, 2, 0, 'x'));
		//check draw
		char[][] matrix = {
				{'x','0','x'},
				{'0','x','0'},
				{'0','x','1'}
		};
		assertEquals(3, TictactoeGame.tictactoeMove(matrix, 2, 2, '0'));
		//check win diagonal 1
		char[][] matrix1 = {
				{'x','0','x'},
				{'0','x','0'},
				{'0','x','1'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix1, 2, 2, 'x'));
		//check win diagonal 2
		char[][] matrix2 = {
				{'x','0','x'},
				{'0','x','0'},
				{'1','x','0'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix2, 2, 0, 'x'));
		//check win vertical
		char[][] matrix4 = {
				{'1','0','x'},
				{'0','x','0'},
				{'0','x','x'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix4, 0, 0, '0'));
		//check win vertical 2
		char[][] matrix5 = {
				{'0','1','x'},
				{'x','x','0'},
				{'0','x','x'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix5, 0, 1, 'x'));
		//check win horizontal 1
		char[][] matrix6 = {
				{'0','0','x'},
				{'x','x','1'},
				{'0','x','x'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix6, 1, 2, 'x'));
		//check win horizontal 2
		char[][] matrix7 = {
				{'0','0','x'},
				{'x','0','0'},
				{'1','x','x'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix7, 2, 0, 'x'));
	}

}
