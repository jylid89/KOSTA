package io.objectstream;

//###직렬화

public class Record implements java.io.Serializable									//스트림을 통과하는 클래스는 반드시 직렬화 해줘야 함
{
	private String 	name;
	private int		age;
	private double	height;
	private char	bloodType;
	
	
	public Record( String _name, int _age, double _height, char _bloodType)
	{
		name 	= _name;
		age		= _age;
		height	= _height;
		bloodType = _bloodType;	
	}
	
	public String getName()
	{	return name;	}
	
	public int	getAge()
	{	return age;		}
	
	public double getHeight()
	{	return height;	}
	
	public char	getBloodType()
	{	return bloodType;}
			
}