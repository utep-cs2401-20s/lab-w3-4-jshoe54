public class TorusGameOfLife extends GameOfLife {
	public TorusGameOfLife(int[][] board){
		super(board);
	}

	public int neighbors(int row, int col){
		int neighbors=0;
		if(board[(row+size-1)%size][(col+size-1)%size]==1){
		neighbors++;
		}
		if(board[(row+size-1)%size][col]==1){
		neighbors++;
		}
		if(board[row][(col+size-1)%size]==1){
		neighbors++;
		}
		if(board[(row+size+1)%size][(col+size+1)%size]==1){
		neighbors++;
		}
		if(board[(row+size+1)%size][col]==1){
		neighbors++;
		}
		if(board[row][(col+size+1)%size]==1){
		neighbors++;
		}
		if(board[(row+size-1)%size][(col+size+1)%size]==1){
		neighbors++;
		}
		if(board[(row+size+1)%size][(col+size-1)%size]==1){
		neighbors++;
		}
		return neighbors;
	}
}
