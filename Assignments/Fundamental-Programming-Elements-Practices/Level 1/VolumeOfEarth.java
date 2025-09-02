public class VolumeOfEarth {
    public static void main(String[] args) {
        double r=6378d;
        double r1=r/1.6d;
        double volume=(4.0/3.0)*Math.PI*Math.pow(r,3);
        double volumem=(4.0/3.0)*Math.PI*Math.pow(r1,3);
        System.out.println("The volume of earth in cubic kilometers is "+volume+" and cubic miles is "+volumem);
    }
}
