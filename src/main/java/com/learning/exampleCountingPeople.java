public class exampleCountingPeople{
	public static void main(String[] args){
		int peopleInRoom = 0;

		// 3 people enter
		peopleInRoom++;
		peopleInRoom++;
		peopleInRoom++;

		Sysmtem.out.println(peopleInRoom); //3

		// 1 person leaves
		peopleInRoom--;

		Sysmtem.out.println(peopelInRoom); //2
}
