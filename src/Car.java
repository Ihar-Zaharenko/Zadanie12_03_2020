public class Car implements Comparable<Car> {
    private  int maxSpeed;
    private int start;
    private int distance;
    public int time;
    private String name;
    public Car ( String name,int maxSpeed, int start, int distance){
        this.name=name;
        this.maxSpeed=maxSpeed;
        this.start=start;
        this.distance=distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", start=" + start +
                ", distance=" + distance +
                ", time=" + time +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.getTime()-o.getTime();
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void vremia (){
        time=((getDistance()-getStart())/getMaxSpeed());
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
