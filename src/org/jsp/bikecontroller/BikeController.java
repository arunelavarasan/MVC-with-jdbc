package org.jsp.bikecontroller;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.jsp.bikedao.Bikedao;
import org.jsp.bikedto.Bike;

public class BikeController {

	public static void main(String[] args) throws SQLException {
		Bikedao bikedao = new Bikedao();
		List<Bike> bikes= bikedao.retrive();
		System.out.println(bikes);
	}
}
