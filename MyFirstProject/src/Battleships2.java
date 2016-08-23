import java.util.Random;

public class Battleships2 {

	public static void main(String[] args) {

		int[][] board = new int[5][5];
		int[][] ships = new int[3][2];
	
		boardLayout(board);
		initialiseShip(ships, board);
		showBoard(board);

	}

	public static void boardLayout(int[][] board){       // Specifies the size of the board
		for(int row=0 ; row < 3 ; row++ )
			for(int column=0 ; column < 3 ; column++ )
				board[row][column]=-1;
	}

	public static void showBoard(int[][] board){         // Adds a gap between each column and row
		System.out.println("\t1 \t2 \t3");
		System.out.println();

		for(int row=0 ; row < 3 ; row++ ){                    // Prints the board and the status of each space (Space, Miss, Hit, Ship)
			System.out.print((row+1)+"");
			for(int column=0 ; column < 3 ; column++ ){
				if(board[row][column]==-1){
					System.out.print("\t"+"~");
				}else if(board[row][column]==0){
					System.out.print("\t"+"*");
				}else if(board[row][column]==1){
					System.out.print("\t"+"X");
				}else if(board[row][column]==2){
					System.out.print("\t"+"S");
				}

			}
			System.out.println();
		}

	}

	public static void initialiseShip(int[][] ships, int[][] board){
		Random random = new Random();

		for(int ship=0 ; ship < 3 ; ship++){								// Assign a random row and column to place the ship.
			ships[ship][0]=random.nextInt(3);			
			ships[ship][1]=random.nextInt(3);
			
			if (board[ships[ship][0]][ships[ship][1]]==2){                 // If the spot is already taken, place in another spot.
				ship--;
			}
			else board[ships[ship][0]][ships[ship][1]]=2;					// Otherwise place the ship there.
			}

		}
	}
