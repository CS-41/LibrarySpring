/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.LibraryRecord;


@Repository
public interface RecordRepository extends JpaRepository<LibraryRecord, Long>{	}
