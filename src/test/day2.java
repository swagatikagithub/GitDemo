package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
	@Test
	public void myGit()
	{
		System.out.println("My git");
		System.out.println("My execution");
	}
	@Test
	public void myGitx()
	{
		System.out.println("my merge");
		}
	@Test
	public void myGitxDevelop()
	{
		System.out.println("my develop gitx");
		}
}
