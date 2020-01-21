void setup() {
size(500,500);    
}
void draw() {
   fill(#FAE592);
   ellipse(250, 250, 100, 80);
   PImage pepperoni = loadImage("pepperoni.png");
   pepperoni.resize(30, 50);
  image(pepperoni, 220, 220); 
  image(pepperoni, 230, 250);
  image(pepperoni, 250, 230);
  image(pepperoni, 260, 260);
  image(pepperoni, 280, 220);
}
