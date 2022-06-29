package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.TictactoeGame;

class TictactoeGameTest {

	@Test
	void tictactoeMoveTest() {
		//check if matrix is square
		char[][] matrix = {
				{'a','a','a'},
				{'0','x'},
				{'1','x','0'}
		};
		assertEquals(-1, TictactoeGame.tictactoeMove(matrix, 2, 0, 'x'));
		
		//check game not over 
		char[][] matrix1 = {
				{'a','b','c'},
				{'0','x','0'},
				{'1','x','0'}
		};
		assertEquals(0, TictactoeGame.tictactoeMove(matrix1, 2, 0, 'x'));
		//check draw
		char[][] matrix2 = {
				{'x','0','x'},
				{'0','x','0'},
				{'0','x','1'}
		};
		assertEquals(3, TictactoeGame.tictactoeMove(matrix2, 2, 2, '0'));
		//check win diagonal 1
		char[][] matrix3 = {
				{'x','0','x'},
				{'0','x','0'},
				{'0','x','1'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix3, 2, 2, 'x'));
		//check win diagonal 2
		char[][] matrix4 = {
				{'x','0','x'},
				{'0','x','0'},
				{'1','x','0'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix4, 2, 0, 'x'));
		//check win vertical
		char[][] matrix5 = {
				{'1','0','x'},
				{'0','x','0'},
				{'0','x','x'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix5, 0, 0, '0'));
		//check win vertical 2
		char[][] matrix6 = {
				{'0','1','x'},
				{'x','x','0'},
				{'0','x','x'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix6, 0, 1, 'x'));
		//check win horizontal 1
		char[][] matrix7 = {
				{'0','0','x'},
				{'x','x','1'},
				{'0','x','x'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix7, 1, 2, 'x'));
		//check win horizontal 2
		char[][] matrix8 = {
				{'0','0','x'},
				{'x','0','0'},
				{'1','x','x'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix8, 2, 0, 'x'));
	}

}
