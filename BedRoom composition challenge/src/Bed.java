
    public class Bed{
        // write code here
        private String style;
        private int pillows;
        private int height;
        private int sheets;
        private int quilt;

        public Bed(String a, int b, int c, int d, int e){
            this.style=a;
            this.pillows=b;
            this.height=c;
            this.sheets=d;
            this.quilt=e;
        }
        public void make(){
            System.out.print("Bed -> Making | ");
        }
        public String getStyle(){
            return style;
        }
        public int getPillows(){
            return pillows;
        }
        public int getHeight(){
            return height;
        }
        public int getSheets(){
            return sheets;
        }
        public int getQuilt(){
            return quilt;
        }

    }

