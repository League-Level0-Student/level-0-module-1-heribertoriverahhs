
void setup() {
  size(500,500);
PImage face = loadImage("european-grey-wolf.jpeg");
face.resize(500, 500);
image (face, 0, 0);
}
void draw() {
  fill(#CEE80E);
ellipse(350, 250, 75, 75);
ellipse(120, 210, 75, 75);
fill(#030303);
ellipse(100, 200, 25, 25);
ellipse(360, 270, 25, 25);
}
