void setup() {
  size(600,600);
  background(255);
  frameRate(2);
} //<>//

void sierpinski(float x1, float y1, float x2, float y2, float x3, float y3, int level) {
  if (level < 1 ) {
     return; 
  }
  fill(255);
  triangle((x1+x2)/2,(y1+y2)/2, (x1+x3)/2,(y1+y3)/2, (x2+x3)/2,(y2+y3)/2);
  level--;
  sierpinski(x1,y1,(x1+x2)/2,(y1+y2)/2,(x1+x3)/2,(y1+y3)/2,level);
  sierpinski((x1+x2)/2,(y1+y2)/2,x2,y2,(x2+x3)/2,(y2+y3)/2,level);
  sierpinski((x1+x3)/2,(y1+y3)/2,(x2+x3)/2,(y2+y3)/2,x3,y3,level);
}

int level = 0;
void draw() { 
  fill(0);
  triangle(width/2,0, 0,height, width,height);
  sierpinski(width/2,0, 0,height, width,height, level);
  level ++;
  if (level > 8)
    level = 0;
}