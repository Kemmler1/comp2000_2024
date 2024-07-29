
public class Point3D {
    int x;
    int y;
    int z;

    public Point3D(){
        this(0, 0, 0);
    }

    public Point3D(int xPos, int yPos, int zPos){
        x = xPos;
        y = yPos;
        z = zPos;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "x: " + x + " y: " + y + " z: " + z;
    }
}
