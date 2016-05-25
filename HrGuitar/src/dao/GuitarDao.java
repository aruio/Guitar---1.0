package dao;

import java.sql.*;
import java.util.List;

import beans.Guitar;
import util.Util;

public interface GuitarDao {
	
	public void addGuitar(Guitar guitar);

	public List<Guitar> search(String model);
}