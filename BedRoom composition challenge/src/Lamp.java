
    public class Lamp {
        // write code here
        private String style;
        private boolean battery;
        private int globRating;
        public Lamp(String a,boolean b,int  c){
            this.style=a;
            this.battery=b;
            this.globRating=c;
        }
        public void turnOn(){
            System.out.print("Lamp -> Turning on");
        }
        public String getStyle(){
            return this.style;
        }
        public boolean isBattery(){
            return this.battery;
        }
        public int getGlobRating(){
            return this.globRating;
        }
    }

