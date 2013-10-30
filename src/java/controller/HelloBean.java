package controller;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Mark
 */
@Named
@RequestScoped
public class HelloBean {
    private String name;
    private String knotNumber;
    private String outMessage;
        
    public String processRequest() {
        setOutMessage("Hello " + name + ".  " + this.getKnotMessage() );
        return "page2";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKnotNumber() {
        return knotNumber;
    }

    public void setKnotNumber(String knotNumber) {
        this.knotNumber = knotNumber;
    }

    public String getOutMessage() {
        return outMessage;
    }

    public void setOutMessage(String outMessage) {
        this.outMessage = outMessage;
    }
    
    
    
    public String getKnotMessage() {
        String message = "";
        switch (this.knotNumber){
            case "1":
                message = "A Square Knot is used to join two pieces of rope.";
                break;
            case "2":
                message = "A Bowline is a non-slip loop that is used by climbers.";
                break;
            case "3":
                message = "A Taut Line Hitch is an adjustable loop that " 
                        + "slips when the rope is slack, but holds tight when"
                        + "the rope is taut.  It is often used on tent lines.";
                break;
            case "4":
                message = "A Figure Eight knot is used at the end of a rope a " 
                        + "stopper to prevent the rope from slipping through a hole.";
                break;
            default:
                message = "An unknown knot was selected";
                break;
        }
        return message;
    }
    
        
        
        
    
    
}
