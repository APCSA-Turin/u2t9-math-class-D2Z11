public class CrazyMath {
    public static void main(String[] args) {
        // This program could be used in games to calculate how a projectile should move to go in a certain direction
        int degrees = 90;
        int speed = 5;
        //yToMove = O/H if H is 1, it gives the y or opposite side
        double yToMove = Math.sin(degrees) * speed;
        //xToMove = A/H if H is 1, it gives the x or adjacent side
        double xToMove = Math.cos(degrees) * speed;
    }
}
