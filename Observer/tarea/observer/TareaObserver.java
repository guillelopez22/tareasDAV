/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.observer;

/**
 *
 * @author Guillermo
 */
public class TareaObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HeadHunter hh = new HeadHunter();
		hh.registerObserver(new JobSeeker("Mike"));
		hh.registerObserver(new JobSeeker("Chris"));
		hh.registerObserver(new JobSeeker("Jeff"));
 
		//Each time, a new job is added, all registered job seekers will get noticed.
		hh.addJob("Google Job");
		hh.addJob("Yahoo Job");
    }
    
}
