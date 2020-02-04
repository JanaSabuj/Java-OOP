class Room {
    int height;
    int width;
    int breadth;

    Room(int h, int w, int b){
        height = h;
        width = w;
        breadth = b;
    }

    int volume(){
        return height * width * breadth;
    }
}

class RoomDemo {
    public static void main(String args[]){
        Room r1 = new Room(1,2,3);
        Room r2 = new Room(4,5,6);

        System.out.println("The volume of room 1 is " + r1.volume());
        System.out.println("The volume of room 2 is " + r2.volume());

    }
}

