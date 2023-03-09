package co.edu.umanizales.tads.tads.controller;

import co.edu.umanizales.tads.tads.controller.dto.ListSeDTO;
import co.edu.umanizales.tads.tads.controller.dto.ResponseDTO;
import co.edu.umanizales.tads.tads.service.ListSeService;
import model.Kid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "listse")
public class ListSeController {
    @Autowired
    private ListSeService listSeService;
    //configuration to connect the services with the list se controller--------
    public ResponseEntity<ResponseDTO> createKid(@RequestBody Kid kid){
        return new ResponseEntity<>(new ResponseDTO(200,
                listSeService.addKid(kid),null), HttpStatus.OK);
    }
    //end of the method to add a kid--------------------------------------------
    public ResponseEntity<ResponseDTO> addKidToStart(@PathVariable Kid kid){
        return new ResponseEntity<>(new ResponseDTO(200,
                listSeService.addKid(kid),null), HttpStatus.OK);
    }


}//end of the list se controller------------------------------------------------
