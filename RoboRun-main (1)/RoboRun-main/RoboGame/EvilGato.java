import greenfoot.*;

public class EvilGato extends Actor {
    public EvilGato() {
        
        GreenfootImage img = new GreenfootImage("evilgato.png");
        img.scale(32, 32);
        setImage(img);
    }

    public void act() {
        perseguirRobot();
        verificarColision();
    }

    private void perseguirRobot() {
        Actor robot = getOneObjectAtOffset(0, 0, Robot.class);
        if (robot == null) {
            robot = getClosestRobot();
        }

        if (robot != null) {
            turnTowards(robot.getX(), robot.getY());
            move(1);
        }
    }

    private Actor getClosestRobot() {
        return getWorld().getObjects(Robot.class).isEmpty() ? null : getWorld().getObjects(Robot.class).get(0);
    }

    private void verificarColision() {
        Actor robot;
        robot = getOneObjectAtOffset(0,0,Robot.class);
        if (robot != null) {
            robot.act();
            ((MundoJuego)getWorld()).getContador().quitarMitadPuntos();
            getWorld().removeObject(robot);
            ((MundoJuego)getWorld()).programarReinicio(30); // 3 segundos
        }
    }
}
