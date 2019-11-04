public class ActionOpen implements ActionListenerCommand{  
private Document doc;  
public ActionOpen(Document doc) {  
this.doc = doc;  
}  
@Override  
    public void execute() {  
        doc.open();  
    }  
}  

public class ActionSave implements ActionListenerCommand{  
   private Document doc;  
   public ActionSave(Document doc) {  
        this.doc = doc;  
    }  
    @Override  
    public void execute() {  
        doc.save();  
    }  
} 

