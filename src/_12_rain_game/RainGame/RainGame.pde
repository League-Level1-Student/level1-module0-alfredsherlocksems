int bob = 0;
int number = (int) random(500);
   int score = 0;
void setup() {
  size(800, 500);
bob = 0;
}
void draw() {
  background(#07B9F7);
  fill(#CBCBCB);
  rect(mouseX, 400, 150, 100);
  fill(#EAF3FF);
stroke(#8AEBF5);
ellipse(number, bob, 10, 20);
bob+=2;
if (bob >= 500) {
 checkCatch(number);
  bob = 0;
  number = (int) random(500);
}
fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
