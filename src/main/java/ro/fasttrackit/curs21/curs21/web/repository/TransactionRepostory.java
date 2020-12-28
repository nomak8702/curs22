package ro.fasttrackit.curs21.curs21.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21.curs21.web.model.Transaction;

public interface TransactionRepostory extends JpaRepository<Transaction, Integer> {
}
