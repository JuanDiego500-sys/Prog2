

package co.edu.umanizales.tads.tads.service;

import lombok.Data;
import model.Kid;
import model.ListSe;
import model.Node;
import org.springframework.stereotype.Service;

@Service
@Data
public class ListSeService {
    //creation of kids list
    private ListSe kids;

    public ListSeService() {//creation of new objects and
        kids = new ListSe();
    }

    //end of the constructors---------------------------------------------------------------------------
    public void addKid(Kid kid) {
        kids.add(kid);
    }
    //end of method to add the kid
    public void addKidToStart(Kid kid) {
        kids.addToStart(kid);//this is to fill this kid in the beginning
    }
    //end of method to add a kid to the start of the list
    public void addKidInPos(Kid kid, int pos) {
        kids.addInPos(kid, pos);
    }
    //end of method to add the kid in position
    public void deleteKid(String id) {
        kids.deleteKid(id);
    }
    //end of method to delete a kid by his id
    public Node getKids() {
        return kids.getHead();
    }//end of method to get the list with the head, I only have to call the head


}//end of the listseservice---------------------------------------------------------------------------
