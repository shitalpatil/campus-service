package org.campus.repository;

import org.campus.domain.Attendance;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;


/**
 * Created by amey on 26/7/16.
 */

public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
    Attendance findByDateAndStandardAndBranch(Date date, String standard, String branch);
}