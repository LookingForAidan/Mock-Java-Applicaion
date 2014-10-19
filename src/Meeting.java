/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/*
 *  Meeting.java
 * 
 *  Rev 1
 *
 *  17-4-13

 * @author Kellie Hughes x12388761
 *
 */
public class Meeting {
    private String name;
    private String problem;
    private int number;
    
    public Meeting(){
        name = new String();
        problem = new String();
        number = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
    
    
}
