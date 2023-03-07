public class MyWindow implements MyMouseListener {    
    @Override
    public void mouseEntered() {
        System.out.println("Entered");
    }

    @Override
    public void mouseExited() {
        System.out.println("Exited");
    }
}