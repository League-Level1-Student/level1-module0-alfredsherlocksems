int x = (int) random(300);
  int y = (int) random(300);
void setup () {
  size (300, 300);
  background(0, 150, 0);
}
void draw () {
  fill(#F00A7D);
  for (int i = 0; i < 300;) {
    ellipse(x, y, 10, 10);
x+=5;
y+=5;
}
}
