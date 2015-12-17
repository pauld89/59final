//Dairo Paulino cst final 112


/*
Where was this work done?
Who actually wrote this code?
(And why was it not done in the classroom?)

After we spoke in the hallway, tonight, I thought you said you were going to get a drink of water and return.
When you did not return to the classroom to complete the final exam,
I therefore, assumed that you were withdrawing from the CST 112 class, so I entered a grade of "W".

Since this work was not done in the classroom during the exam that I proctored in Room 209,
I don't think I can count this code as work done for the in-class final exam for this course.

Furthermore, the final exam specified an array of  "Lobster" objects,
plus loops to manipulate each element of the array, but I do not see any arrays in this code (and there is no "report").
The lobster movement is not as specified (to the right and upward, with "bouncing"),
There is no animation (claws closing, as I illustrated in the classroom), and the "lobsters" do not interact with other objects.)

Therefore, your "Final-DAP1.java" code probably would not achieve a passing grade for the final exam.

Since you asked for more time to submit Project 9, I am still willing to accept that code tomorrow afternoon.
Your midterm grades were low (D-minus and C-minus), but a good Project 9 (including arrays, reports, sorting, etc.), 
might be sufficient to overcome the failing grade on the final exam, and earn a (barely) passing grade in the course.

So, please let me know whether or not you still want me to consider this "final-exam" code for grading.
If so, I will grade it then compute your letter-grade (ABCDF) and revise the records accordingly.
Otherwise, I will leave the "W" as your letter-grade for CST 112.

Please email me at "bam@suffolk.li" to let me know whether or not you want me to grade this code as your final exam for CST 112.

 
*/



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
