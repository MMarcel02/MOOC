public class Fitbyte {
   private int age;
   private int heartRate;
   
   public Fitbyte(int age, int heartRate) {
        this.age = age;
        this.heartRate = heartRate;
   }
   
   public double maximumHeartRate() {
        return 206.3 - (0.711 * age);
   }

   public double targetHeartRate(double percentageOfMaximum) {
        return (maximumHeartRate() - heartRate) * (percentageOfMaximum) + heartRate;
   }
}
