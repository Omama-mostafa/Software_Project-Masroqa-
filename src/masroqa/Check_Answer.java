
package masroqa;


public class Check_Answer {
    private String OriginalAnswer;
	private String Answer;
        
	FormAnswer formAnswer = new FormAnswer();
	Communication communication = new Communication();
	Post_Database post_Database = new Post_Database();
        
	public boolean CheckValidate(String OriginalAnswer, String Answer)
	{
		return ((OriginalAnswer == Answer));
		
	}
	
	public void set_OriginalAnswer(String n)
	{
		OriginalAnswer = n;
	}
	
	public void set_Answer(String n)
	{
		Answer = n;
	}
	
	public String get_OriginalAnswer()
	{
		return OriginalAnswer;
	}
	
	public String get_Answer()
	{
		return Answer;
	}
}
