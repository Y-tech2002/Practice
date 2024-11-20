
class Aaa
{
	void showTheValueBelongsTo()
	{
		System.out.println("in Show A");
	}
}
class Bb extends Aaa
{   @Override             //Annotation
	void showTheValueBelongsTo()
	{
		System.out.println("in show B");
	}
}
public class Annotation
{
	public static void main(String[] args) 
	{
		Bb obj=new Bb();
		obj.showTheValueBelongsTo();
	}

}
