package gr.aueb.cf.ch11;

public class ImmutablePoint3d {
    private final ImmutablePoint point;
    private final int z;

    public ImmutablePoint3d(){
        point = new ImmutablePoint();
        z = 0;
    }

    public ImmutablePoint3d(ImmutablePoint point, int z){
        this.point = point;
        this.z = z;
    }

    public int getZ(){
        return z;
    }
}
