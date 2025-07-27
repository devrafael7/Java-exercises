public class Controller {
    private ScannerInp SI;
    
    public Controller() {
        this.SI = new ScannerInp();
    }

    public void runIt(){
        SI.getNumber();
    }
/* 
    private HelloWorld HW;
    private OiMundo OM;

    public Controller() {
        this.HW = new HelloWorld();
        this.OM = new OiMundo();
    }

    public void runIt(){
        HW.Hello();
        OM.Oi();
    }
 */
}
