package techproed.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day12_TestNGAnnotations {
/*
@BeforeMethod
@AfterMethod
@Ignore
Test (enabled=false)
Test (priority =1 )


Test Annotation : Imported from Test NG , This is used to create and run our test cases
If there is no priority the test will be running as alphabetical order
@BeforeMethod : Runs before every method and we generally use as setUp method to create driver - maximise it - implicitly wait etc.
It is like precondition .
@AfterMethod  : Runs after every test method . We can name it as tearDown method to quit the driver - to take screenshots .
ignore annotation : If we want to ignore some tests- methods (there can be some unstable issues ) we can skip our tests with ignore
Test (enabled=false)  is nearly same with ignore
Test (priority =1 ) is used to prioritise our cases.


 */

    @BeforeMethod
    public void setUp(){
        System.out.println("Before is running");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After is running");
    }

    @Test (priority = 2)
    public void test01(){
        System.out.println("Test 1 is running");

    }

    @Test(enabled = false)
    public void test02(){
        System.out.println("Test 2 is running");
    }


    @Test
    @Ignore
    public void test03(){
        System.out.println("Test 3 is running");
    }

    @Test (priority = 1)
    public void test05(){
        System.out.println("Test 5 is running ");
    }

    @Test (priority = 3)
    public void test04(){
        System.out.println("Test 4 is running");
    }




}