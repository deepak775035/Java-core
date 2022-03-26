package classFolder.session14;

class IAmImutable{

    private final int x;

    public IAmImutable(int x) {
        this.x = x;
    }

    public final int getX() {
        return x;
    }

    public final IAmImutable setX(int x){
        return new IAmImutable(x);
    }

    @Override
    public String toString() {
        return "IAmImutable [x=" + x + "]";
    }

}


public class IAmImutableDriver {
    public static void main(String[] args) {

        IAmImutable yo = new IAmImutable(5);
        System.out.println(yo + " Hashcode="+yo.hashCode());
        yo=yo.setX(99);
        System.out.println(yo + " Hashcode="+yo.hashCode());
        
    }
}
