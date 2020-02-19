public class GameOfLife{
	int size;
	int [][] previous;
	int [][] board;
	
	public GameOfLife(){
	
	}
	
	public GameOfLife(int size){
		this.size=size;
		this.board=new int[size][size];
		this.previous=new int[size][size];
	}
	
	public GameOfLife(int[][] board){
		this.size=board.length;
		this.previous=new int[this.size][this.size];
		for(int i=0; i<this.board.length; i++){
			for(int j=0; j<this.board[i].length;j++){
			this.previous[i][j]=this.board[i][j];
			}
		}
		for(int i=0; i<this.board.length; i++){
			for(int j=0; j<this.board[i].length;j++){
			this.board[i][j]=board[i][j];
			}
		}
	}
	public void onestep(){//implements rules
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				previous[i][j]=board[i][j];
			}
		}
		for(int m=0;m<previous.length;m++) {
			for(int n=0;n<previous.length;n++) {
				if(previous[m][n]==1) {
					if(neighbors(m,n)<2) {
						previous[m][n]=0;
					}
					else if(neighbors(m,n)>=2||neighbors(m,n)<=3) {
						previous[m][n]=1;
					}
					else if(neighbors(m,n)>3) {
						previous[m][n]=0;
					}
					else if(neighbors(m,n)==3) {
						previous[m][n]=1;
					}
				}
			}
		}
	}
	public int neighbors(int row, int col){
		int neighbors=0;
		if((row-1)>=0&&(col-1)>=0&&board[row-1][col-1]==1){
		neighbors++;
		}
		if((row-1)>=0&&board[row-1][col]==1){
		neighbors++;
		}
		if((col-1)>=0&&board[row][col-1]==1){
		neighbors++;
		}
		if((row+1)<board.length&&board[row+1][col+1]==1){
		neighbors++;
		}
		if((row+1)<board.length&&board[row+1][col]==1){
		neighbors++;
		}
		if((col+1)<board.length&&board[row][col+1]==1){
		neighbors++;
		}
		if((row-1)>=0&&(col+1)<board.length&&board[row-1][col+1]==1){
		neighbors++;
		}
		if((row+1)<board.length&&(col-1)>=0&&board[row+1][col-1]==1){
		neighbors++;
		}
		return neighbors;
	}
	
	public void evolution(int n){
	for(int i=0; i<n; i++){
		onestep();}
	}
}