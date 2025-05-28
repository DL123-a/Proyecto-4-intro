import greenfoot.*;

public class Hongo extends Actor {
    public Hongo() {
        GreenfootImage img = new GreenfootImage("hongo.png");
        img.scale(32, 32);
        setImage(img);
    }
    
    public void act(){
        verificarColision();
    }
    
    private void verificarColision() {
        Actor robot;
        robot = getOneObjectAtOffset(0,0,Robot.class);
        if (robot != null) {
            ((MundoJuego)getWorld()).getContador().quitarMitadPuntos();
            getWorld().removeObject(robot);
            ((MundoJuego)getWorld()).programarReinicio(30); // 3 segundos
        }
    }
}

