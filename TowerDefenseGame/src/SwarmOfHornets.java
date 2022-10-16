
public class SwarmOfHornets {
	private Hornet[] hornets;
	private int swarmSize;
	private Node front, rear;
	
	public SwarmOfHornets() {
		this.swarmSize = 0;
		front = rear = null;
		this.hornets = new Hornet[this.swarmSize];
	}
	
	public int sizeOfSwarm() {
		return this.swarmSize;
	}
	
	public Hornet[] getHornets() {
		this.hornets = new Hornet[this.swarmSize];
		Node current = front;
		for(int i=0; i<this.swarmSize; i++) {
			this.hornets[i] = current.getData();
			current = current.getNextNode();
		}
		return this.hornets;
	}
	
	public Hornet getFirstHornet() {
		
		if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return front.getData();
        
		/*if(this.swarmSize==0) {
			return null;
		}
		return this.hornets[0];*/
	}
	
	public void addHornet(final Hornet hornet) {
		Node node = new Node(hornet);
        if(isEmpty()){
            front = node;
        }else {
            rear.setNextNode(node);
        }
        rear = node;
        this.swarmSize++;
        /*
		Hornet[] tmpHornets = new Hornet[++this.swarmSize];
		for(int i=0; i<this.swarmSize-1;i++) {
			tmpHornets[i] = this.hornets[i];
		}
		tmpHornets[this.swarmSize-1] = hornet;
		this.hornets = new Hornet[this.swarmSize];
		this.hornets = tmpHornets;*/
	}
	
	
	public boolean removeHornet(final Hornet hornet) {
		
		if(isEmpty()){
            System.out.println("Empty queue");
            return false;
        }
        front = front.getNextNode();
        this.swarmSize--;
        if(isEmpty()){
            rear = null;
            return false;
        }
        return true;
    
		/*boolean isDeleted=false;
		if(this.swarmSize==0) {
			System.out.println("Swarm is empty");
			return isDeleted;
		}
		if(null == hornet) {
			System.out.println("Invalid hornet");
			return isDeleted;
		}
		int indexToBeDeleted = -1;
		for(int i=0; i<this.swarmSize;i++) {
			if(this.hornets[i] == hornet) {
				indexToBeDeleted = i;
				break;
			} 
		}
		if(indexToBeDeleted== -1) {
			System.out.println("Hornet not found in swarm");
			return isDeleted;
		}
		Hornet[] tmpHornets = new Hornet[this.swarmSize-1];
		int k=0;
		for(int j=0; j<this.swarmSize; j++) {
			if(j!=indexToBeDeleted) {
				tmpHornets[k++] = this.hornets[j];
			} else {
				isDeleted = true;
			}
		}
		this.hornets = new Hornet[--this.swarmSize];
		this.hornets = tmpHornets;
		return isDeleted;*/
		
        
	}
	
	
	private  boolean isEmpty(){
        return this.swarmSize == 0;
    }
	
	
	public class Node {
		Hornet data;
		Node next;
		
		public Node(Hornet data) {
		    this.data = data;
		  }

		public Hornet getData() {
			return data;
		}

		public void setData(Hornet data) {
			this.data = data;
		}

		public Node getNextNode() {
			return next;
		}

		public void setNextNode(Node next) {
			this.next = next;
		}

		  
		
	}
}
