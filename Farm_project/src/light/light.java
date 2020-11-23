package light;

public class light {
    private int inputLightquantity;
   final private int Middle_lightquantity =50;
   private boolean current_state ;
   
   

    public light(int intPut) {
        this.inputLightquantity = intPut;
    }

    public int getInputLightquantity() {
        return inputLightquantity;
    }
    public void analysis(){
    if(this.inputLightquantity <= this.Middle_lightquantity) this.current_state = true; 
    else if(this.inputLightquantity > this.Middle_lightquantity)this.current_state =false;
        
    }
    public boolean getCurrent_state(){
     return this.current_state;
    }

    @Override
    public String toString() {
        return "ระบบแสง{" + "ปริมาณแสง=" + inputLightquantity + ", สถานะแสงไฟ =" + current_state + '}';
    }

   
    
}
