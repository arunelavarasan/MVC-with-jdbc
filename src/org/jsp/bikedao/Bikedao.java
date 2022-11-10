package org.jsp.bikedao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.jsp.bikedto.Bike;
import org.jsp.database.DBconnection;

public class Bikedao {
	List<Bike> bikes = new ArrayList<>();
	public List<Bike> retrive() throws SQLException
	{
		String Qry = "select * from bike_wala.bike";
		DBconnection bconnection = new DBconnection();
		Statement stmt = bconnection.getDataBase();
		ResultSet rs = stmt.executeQuery(Qry);
		List<Bike> bikes = new ArrayList<>();
		while(rs.next())
		{
			Bike bike = new Bike();
			bike.setId(rs.getInt(1));
			bike.setColor(rs.getString(2));
			bike.setName(rs.getString(3));
			bike.setPrice(rs.getDouble(4));
			Arrays.asList(bikes.add(bike));
		}
		return bikes;
	}
}
