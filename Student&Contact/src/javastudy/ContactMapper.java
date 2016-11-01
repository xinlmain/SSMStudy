package javastudy;

public interface ContactMapper {

	public void add(Contact contact);
	public Contact get(int id);
	public void delete(int id);
	public void update1(Contact contact);
	public void update2(Contact contact);
}
