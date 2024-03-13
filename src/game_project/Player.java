package game_project;

public class Player {
	public static void main(String[] args) {
		Game g=new Game();
		Weapon w=g.pressButton();
		try{
			w.use();
		}
		catch (Exception e) {
			System.out.println("by default you get knife!!!");
			Knife k = new Knife();
			k.use();
		}
		}

}
