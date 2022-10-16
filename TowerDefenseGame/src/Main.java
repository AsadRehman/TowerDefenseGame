
public class Main {
    public static void main(String[] args) {
    	SwarmOfHornets s = new SwarmOfHornets();
    	Hornet hornet = new Hornet(null, 2, 3);
    	Hornet hornet1 = new Hornet(null, 2, 4);

    	s.addHornet(hornet);
    	s.addHornet(hornet1);

    	System.out.println("Successfully added!!");
    	if(s.removeHornet(hornet)) {
        	System.out.println("Successfully removed!!");

    	}
    	System.out.println(s.getHornets());
    	
    }
}
