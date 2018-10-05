interface abc
{
	default String ooo()
	{
		return ("aaa");
	}
}
interface def
{
	default String ooo()
	{
		return ("_");
	}
}

class Student implements abc, def
{
  public String ooo()
  {
    return def.super.ooo();
  }
	public static void main(String... args)
	{
    Student a1 = new Student();
		System.out.print(a1.ooo());
	}
}
