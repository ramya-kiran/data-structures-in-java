public class CustomQueue {
    int capacity;
    int indexToEnqueue;
    int indexToDequeue;
    int[] array;
    int size;

    public CustomQueue(int capacity){
        this.capacity = capacity;
        this.array = new int[this.capacity];
        this.indexToDequeue = 0;
        this.indexToEnqueue = 0;
        this.size = 0;
    }

    public boolean isEmpty(){
        if(this.size == 0)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(this.size == this.capacity)
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
        this.size += 1;
        return true;

    }

    public int dequeue(){
        if(isEmpty())
            return Integer.MIN_VALUE;

        if(this.indexToDequeue == this.capacity)
            this.indexToDequeue = 0;

        int value = this.array[this.indexToDequeue];
        this.indexToDequeue += 1;
        this.size -= 1;
        return value;
    }

}
