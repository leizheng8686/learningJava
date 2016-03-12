void setup() {
  size(760,760);
  BOX = width/N;
}

final int N = 19;
int BOX;
int currentColor = 1;

int[] board = new int[N*N];
// EMPTY = 0
// BLACK = 1
// WHITE = 2
void draw() {
  background(255,200,0);
  for (int i = 0; i < N; i++) {
    line(BOX/2, i*BOX+BOX/2, width-BOX/2, i*BOX+BOX/2);
    line(i*BOX+BOX/2, BOX/2, i*BOX+BOX/2, height-BOX/2);
  }
  for (int i = 0; i < board.length; i++) {

    int x = i % N;
    int y = i / N;
    
    switch (board[i]) {
      case 0:
          break;
      case 1:
          fill(0);
          ellipse(x * BOX+ BOX/2, y * BOX + BOX/2, BOX-BOX/10, BOX-BOX/10);
          break;
      case 2:
          fill(255);
          ellipse(x * BOX+ BOX/2, y * BOX + BOX/2, BOX-BOX/10, BOX-BOX/10);
          break;
    }
    
  }
}

void mousePressed() {
  int x = mouseX / BOX, y = mouseY / BOX;
  if(board[y * N  + x] == 0){
  board[y * N  + x] = currentColor;  
  currentColor = 3 - currentColor; 
  }
}