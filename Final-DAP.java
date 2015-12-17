//Dairo Paulino cst final 112
Lobster d, a, p, paul;
float surface;
void setup(){
size(600,580);
surface= random(height/5, height/1);
  reset();}
void draw(){
  scene();
  action();
  show();
}
void scene(){
  background(255,255,255);
  fill(0,255,0);
  stroke(0,230,0);
  rect(0,surface, 
  width, height-surface);
  fill(265,265,0);
  stroke(265,265,0);
  ellipse(40,40,40,40);
  fill(0);
  text("Dairo Paulino", height, width/2+50);
}
void action(){
  d.move();
  a.move();
  p.move();
  paul.move();
}
void show(){
  d.show(); 
  a.show(); 
  p.show();
  paul.show();
}
void reset() {
surface= random(height/4, 
height/2);
d= new Lobster("d", width/3);
a= new Lobster("a", width/2);
p= new Lobster("p", width*1/8);
paul= new Lobster( "paul", width *3/4);}
class Lobster {
  float x,y;
  float dx=0,dy=0;
  float w=60,h=40;
  String name="";
  float r,g,b;
  Lobster( String k, float x ) {
this.name=  k;
this.x=x;
bottom();
r=  random(25, 255);
g=  random(50,70);
b=  random(0,0);
  }
  void bottom() {
    y=height - h*2;
    dy=-random( 0.1, 0.9 );}
  void move(){ x += dx;y += dy;
 if (y<surface) {
 bottom(); }}
  void show() {
    fill(r,g,b);
    stroke(r,g,b);
    ellipse(x,y,w,h);
    rect(x-10,y-10,60,10);
    rect(x+10,y+10,40,10);
    fill(r,g,b);
    text( name, x-w, y+h );
    }
}
