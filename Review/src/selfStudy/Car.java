package selfStudy;

public class Car extends Vehicle{
	int y;

   Car(int y){
	   super(y);
	   this.y=y;
   }
@Override
public String toString() {
	return super.x+":"+this.y;
}
   
}
