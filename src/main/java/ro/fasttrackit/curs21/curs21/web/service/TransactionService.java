package ro.fasttrackit.curs21.curs21.web.service;

import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;
import ro.fasttrackit.curs21.curs21.web.model.Transaction;
import ro.fasttrackit.curs21.curs21.web.model.Type;
import ro.fasttrackit.curs21.curs21.web.repository.TransactionRepostory;

import java.util.List;

@Service
public class TransactionService {
     private final TransactionRepostory repostory;

    public TransactionService(TransactionRepostory repostory) {
        this.repostory = repostory;
    }

    public List<Transaction> getAll(){
        return repostory.findAll();

    }
}
