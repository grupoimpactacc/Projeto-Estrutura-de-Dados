package exceptions;


public class FullPriorityQueueException extends RuntimeException
{
	public FullPriorityQueueException()
	{
		super("Queue is full.");
	}
	
}
