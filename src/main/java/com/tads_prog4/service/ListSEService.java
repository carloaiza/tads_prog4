package com.tads_prog4.service;

import com.tads_prog4.model.Kid;
import com.tads_prog4.model.ListSE;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ListSEService {
    private ListSE kids;

    public ListSEService() {
        // simular que lei un archivo o una base de datos
        kids = new ListSE();
        kids.add(new Kid("1005085752","Valeria Osorio"
        , (byte) 20));
        kids.add(new Kid("356373763","Jhair Torres"
                , (byte) 18));
        kids.add(new Kid("4554544554","Sergio Núñez"
                , (byte) 19));

    }
}
