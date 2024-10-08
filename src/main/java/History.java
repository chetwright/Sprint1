import java.util.Stack;


public class History
{
	
	Stack<Event> histStack = new Stack<>();
	Stack<Event> undoStack = new Stack<>();
	//NotePad note = new NotePad();
	

    /**
       Notepad will call this function when thier text changes.

       deletion is a boolean that indicates if the action was a deletion of text or the insertion of text.
       position is the postion where the change took place
       Change is the string of characters that is the change.
     */
   public void addEvent(boolean deletion, int position, String Change)
   {
	   Event event = new Event();
	   event.setDeletion(deletion);
	   event.setChange(Change);
	   event.setPosition(position);
	  // if(deletion == false) {
		   //note.insert(position, Change);
		   histStack.push(event);
	  // }
	//   else {
		   //note.remove(position, Change.length());
		
		   
	  // }
}
   


    /**
       Notepad will call this function when it wishes to undo the last event.

       note is a variable to the Notepad that called this function
     */
   public void undoEvent(NotePad note)
   {
	   	if(hasUndoData() == true) {
	   		Event temp;
	   		temp = histStack.pop();
	   		undoStack.push(temp);
	   		note.remove(temp.getPosition(),temp.getChange().length());
	   		
	   		
	   	}
	   	
   }


    /**
       Notepad will call this function when it wishes to redo the last event that was undone.
       Note that new actions should clear out events that can be "redone"
       note is a variable to the Notepad that called this function
     */
   public void redoEvent(NotePad note)
   {
   		if(hasReDoData() == true) {
   			Event temp;
   			temp = undoStack.pop();
   			histStack.push(temp);
   			note.insert(temp.getPosition(),temp.getChange());
   		}
   }

    /**
       returns true if there is undo data in the History
     */
   public boolean hasUndoData()
   {
       if(histStack.isEmpty()) {
    	   return false;
       }
       return true;
	   
   }

    /**
       returns true if there is undo data in the History
     */
   public boolean hasReDoData()
   {
	   if(undoStack.isEmpty()) {
    	   return false;
       }
       return true;
	   
   }
	

}
