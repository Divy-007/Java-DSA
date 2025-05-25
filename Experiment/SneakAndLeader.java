package Experiment;

import java.util.Random;

class Leader {
    private int x, y;

    public Leader(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        Random random = new Random();
        // Random movement: -1, 0, or 1 for both x and y
        x += random.nextInt(3) - 1;
        y += random.nextInt(3) - 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Leader Position: (" + x + ", " + y + ")";
    }
}

class Sneak {
    private int x, y;

    public Sneak(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void follow(Leader leader, int distance) {
        int leaderX = leader.getX();
        int leaderY = leader.getY();

        // Calculate movement to reduce the distance
        if (Math.abs(leaderX - x) > distance) {
            x += Integer.compare(leaderX, x);
        }
        if (Math.abs(leaderY - y) > distance) {
            y += Integer.compare(leaderY, y);
        }
    }

    @Override
    public String toString() {
        return "Sneak Position: (" + x + ", " + y + ")";
    }
}

public class SneakAndLeader {
    public static void main(String[] args) {
        // Initialize leader and sneaks
        Leader leader = new Leader(0, 0);
        Sneak[] sneaks = {
            new Sneak(-2, -2),
            new Sneak(-4, -4)
        };

        // Simulate movements
        for (int step = 1; step <= 10; step++) {
            System.out.println("Step " + step);

            // Move the leader
            leader.move();
            System.out.println(leader);

            // Sneaks follow the leader
            for (int i = 0; i < sneaks.length; i++) {
                sneaks[i].follow(leader, 1);
                System.out.println("Sneak " + (i + 1) + ": " + sneaks[i]);
            }

            System.out.println("--------------------");
        }
    }
}
