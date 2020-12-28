int x = (int) random(300);
  int y = (int) random(300);
  int num = 300;
  void mousePressed() {
    num+=100;
  }
void setup () {
  size (300, 300);
  background(0, 150, 0);
}
void draw () {
  makeMagical();
  for (int i = 0; i < num; i++) {
      fill(frameCount, i, mouseX);
    ellipse(getWormX(i), getWormY(i), 10, 10);
i+=5;
i+=5;
}
}
float frequency = .01;
    float noiseInterval = .4;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
