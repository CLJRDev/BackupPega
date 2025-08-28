public class Multithreading implements Runnable{

    private final String text;

    Multithreading(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(this.text);
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
    }
}
