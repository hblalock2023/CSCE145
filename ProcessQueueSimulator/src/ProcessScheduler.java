/*
 * Lab 04
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 02.12.2020
 */

public class ProcessScheduler {
	
	// attributes
	private LinkedListQueue<Process> processes;
	private Process currentProcess;
	
	// default constructor
	public ProcessScheduler()
	{
		processes = new LinkedListQueue<Process>();
		currentProcess = null;
	}
	
	// accessor
	public Process getCurrentProcess()
	{
		return currentProcess;
	}
	
	// adds process using enqueue
	public void addProcess(Process process)
	{
		if (currentProcess == null) 
		{
			currentProcess = process;
		}
		else
		{
			processes.enqueue(process);
		}
	}
	
	// moves to next process using dequeue
	public void runNextProcess()
	{
		currentProcess = processes.dequeue();
		
	}
	
	// cancels current process using runNextProcess
	public void cancelCurrentProcess()
	{
		runNextProcess();
	}
	
	// prints processes
	public void printProcessQueue()
	{
		processes.print();
	}
}
