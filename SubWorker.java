abstract class Worker{
    
    public abstract  void work();
    
    public void getleave(){
        System.out.println("hi");
    }
    public void gethike(){
        System.out.println("him");
    }
 }
class SubWorker extends Worker{
        @Override   
        public void work(){
        System.out.println("hsrt");
    }
            public static void main(String [] args){
                SubWorker sw = new SubWorker();
                sw.getleave();
                sw.gethike();
                sw.work();
            }
               
    }