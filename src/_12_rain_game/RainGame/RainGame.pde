int bob = 0;
int number = (int) random(500);
void setup() {
  size(800, 500);
}
void draw() {
  background(#07B9F7);
  fill(#EAF3FF);
stroke(#8AEBF5);
ellipse(number, bob, 10, 20);
bob+=2;
if (bob == 500) {
  int number = (int) random(500);
  bob = 0;
}
}
