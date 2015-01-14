
public class MyThread extends Thread {
    Thread thread;
    
    public MyThread(String name) {
        super(name);
        System.out.println("constructor 1 before start : Thread name -> " +  this.getName() + ", state -> " + this.getState());
        this.start();
        System.out.println("constructor 1 after start : Thread name -> " +  this.getName() + ", state -> " + this.getState());
    }
    
    public MyThread(String name, Thread thread) {
        super(name);
        this.thread = thread;
        System.out.println("constructor 2 before start : Thread name -> " +  this.getName() + ", state -> " + this.getState());
        this.start();
        System.out.println("constructor 2 after start : Thread name -> " +  this.getName() + ", state -> " + this.getState());
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run " + i + " : Thread name -> " + this.getName() + ", state -> " + this.getState());
            if (thread != null) {
                System.out.println("statut de " + thread.getName() + " pendant l'execution du  thread " + this.getName() +" = " +thread.getState());
            }
        }
    }
    
    
}
