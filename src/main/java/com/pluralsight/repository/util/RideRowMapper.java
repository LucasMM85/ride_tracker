package com.pluralsight.repository.util;

import com.pluralsight.model.Ride;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Lucas Mussi
 * date: 28/11/2018
 */

public class RideRowMapper implements RowMapper<Ride> {

    @Override
    public Ride mapRow(ResultSet resultSet, int i) throws SQLException {
        Ride ride = new Ride();
        ride.setId(resultSet.getInt("id"));
        ride.setName(resultSet.getString("name"));
        ride.setDuration(resultSet.getInt("duration"));
        return ride;
    }
}
