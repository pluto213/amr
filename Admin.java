package cn.mldn.vo;
import java.io.*;
public class Admin implements Serializable{
	private String aid;
	private String password;
	private Groups groups;
	private List<Role> roles;
}