
public abstract class ChangeTire {

    final void template(){
        park();
        stop();
        if(hasMoreTires()){
            lift2meters();
        }
        else{
            lift1meter();
        }
    }
    public abstract void park();
    public final void stop(){
        System.out.println("Stop vehicle");
    }

    protected boolean hasMoreTires(){
        return true;
    }
    protected abstract void lift2meters();
    protected abstract void lift1meter();
}