package Homework2;

public class Room implements IRoom {
    private Queue<String> queue;
    public Room(){
        this.queue = new Queue<>();
    }
    @Override
    public boolean dequeueAny(){
        boolean result = true;
        if (queue.isEmpty()){
            result = false;
        }
        queue.dequeue();
        return result;
    }
    @Override
    public boolean dequeueDog(){
        boolean result = true;
        if (queue.isEmpty()){
            result = false;
        }
        else {
            try{
                Queue<String> tempQueue = new Queue<>();
                while (true) {
                    if (queue.getFront().equals("dog")) {
                        queue.dequeue();
                        while (!queue.isEmpty()){
                            String front = queue.dequeue();
                            tempQueue.enqueue(front);
                        }
                        break;
                    }
                    else{
                        String front = queue.dequeue();
                        tempQueue.enqueue(front);
                        if (queue.isEmpty()) {
                            result = false;
                            queue = tempQueue;
                            break;
                        }
                    }
                }
                queue = tempQueue;
                return result;
            } catch (NullPointerException ex){}
        }
        return result;
    }
    @Override
    public boolean dequeueCat(){
        boolean result = true;
        if (queue.isEmpty()){
            result = false;
        }
        else{
            try{
                Queue<String> tempQueue = new Queue<>();
                while (true){
                    if (queue.getFront().equals("cat")){
                        queue.dequeue();
                        while (!queue.isEmpty()){
                            String front = queue.dequeue();
                            tempQueue.enqueue(front);
                        }
                        break;
                    }
                    else{
                        String front = queue.dequeue();
                        tempQueue.enqueue(front);
                        if (queue.isEmpty()){
                            result = false;
                            queue = tempQueue;
                            break;
                        }
                    }
                }
                queue = tempQueue;

            }catch (NullPointerException ex){}
        }

        return result;
    }
    @Override
    public boolean enqueueDog(){
        boolean result = true;
        if (queue.isFull()){
            result = false;
        }
        else{
            queue.enqueue("dog");
        }
        return result;

    }

    @Override
    public boolean enqueueCat(){
        boolean result = true;
        if (queue.isFull()){
            result = false;
        }
        else{
            queue.enqueue("cat");
        }
        return result;
    }

    public int size(){
        return queue.size();
    }

}
