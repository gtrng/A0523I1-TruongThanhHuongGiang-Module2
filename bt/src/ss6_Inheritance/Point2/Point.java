package ss6_Inheritance.Point2;

public class Point {

    private float x=0.0f;
    private float y=0.0f;

    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public Point(){

    }

    public float getX(){
        return this.x;
    }

    public void setX(float x){
        this.x=x;
    }

    public float getY(){
        return this.y;
    }

    public void setY(float y){
        this.y=y;
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[] arr=new float[2];
        arr[0]=this.x;
        arr[1]=this.y;
        return arr;
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }

}
