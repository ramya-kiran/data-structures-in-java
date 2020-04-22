public class Queue {
    int capacity;
    int indexToEnqueue;
    int indexToDequeue;
    int[] array;

    public Queue(int capacity){
        this.capacity = capacity;
        this.array = new int[this.capacity];
        this.indexToDequeue = 0;
        this.indexToEnqueue = 0;
    }

    public boolean isEmpty(){
        if(this.array.length == 0)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(this.array.length == this.capacity)
            return true;
        else
            return false;
    }

    public boolean enqueue(int value){
        if(this.isFull())
            return false;

        if(this.indexToEnqueue == this.capacity)
            this.indexToEnqueue = 0;

        this.array[this.indexToEnqueue] = value;
        this.indexToEnqueue += 1;
        return true;

    }

    public int dequeue(){
        if(isEmpty())
            return Integer.MIN_VALUE;

        if(this.indexToDequeue == this.capacity)
            this.indexToDequeue = 0;

        int value = this.array[this.indexToDequeue];
        this.indexToDequeue += 1;
        return value;
    }

}
