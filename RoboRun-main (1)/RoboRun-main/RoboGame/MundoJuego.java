import greenfoot.*;

public class MundoJuego extends World {
    private Contador contador;
    private int tiempoReinicio = -1;

    public MundoJuego() {
        super(800, 600, 1); // por ejemplo, 800x600 píxeles
        
        // Crear imagen de fondo vacía
        GreenfootImage fondo = new GreenfootImage(getWidth(), getHeight());
        // Cargar bloque de arena (imagen existente en la carpeta images)
        GreenfootImage arena = new GreenfootImage("sand.png");
        // Dibujar la arena repetidamente para cubrir todo el fondo
        for(int x = 0; x < fondo.getWidth(); x += arena.getWidth()) {
            for(int y = 0; y < fondo.getHeight(); y += arena.getHeight()) {
                fondo.drawImage(arena, x, y);
            }
        }
        // Asignar la imagen mosaico como fondo estático del mundo
        setBackground(fondo);
        

        prepare();
    }

    public void programarReinicio(int frames) {
        Greenfoot.delay(frames);
        Greenfoot.setWorld(new MundoJuego());
    }

    public Contador getContador() {
        return contador;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Crear y agregar el contador
        contador = new Contador();
        addObject(contador, 70, 30); // Puedes ajustar la posición

        // Resto de los objetos
        Robot robot = new Robot();
        addObject(robot, 99, 215);

        Gato gato = new Gato();
        addObject(gato, 422, 124);
        Pared pared = new Pared();
        addObject(pared,784,344);
        Pared pared2 = new Pared();
        addObject(pared2,752,352);
        pared2.setLocation(755,344);
        Pared pared3 = new Pared();
        addObject(pared3,730,348);
        pared3.setLocation(719,346);
        pared3.setLocation(724,344);
        Pared pared4 = new Pared();
        addObject(pared4,675,340);
        pared4.setLocation(695,349);
        pared4.setLocation(698,346);
        pared4.setLocation(696,344);
        Pared pared5 = new Pared();
        addObject(pared5,644,265);
        pared5.setLocation(697,315);
        GemaRoja gemaRoja = new GemaRoja();
        addObject(gemaRoja,732,307);
        gemaRoja.setLocation(728,311);
        pared5.setLocation(700,312);
        pared5.setLocation(697,312);
        GemaAzul gemaAzul = new GemaAzul();
        addObject(gemaAzul,172,216);
        Pared pared6 = new Pared();
        addObject(pared6,389,145);
        pared6.setLocation(376,125);
        Pared pared7 = new Pared();
        addObject(pared7,701,272);
        pared7.setLocation(700,277);
        pared7.setLocation(697,282);
        Pared pared8 = new Pared();
        addObject(pared8,664,274);
        pared8.setLocation(667,287);
        pared8.setLocation(665,283);
        GemaRoja gemaRoja2 = new GemaRoja();
        addObject(gemaRoja2,184,268);
        GemaAzul gemaAzul2 = new GemaAzul();
        addObject(gemaAzul2,184,315);
        Hongo hongo = new Hongo();
        addObject(hongo,137,404);
        horizontal horizontal = new horizontal();
        addObject(horizontal,579,282);
        horizontal.setLocation(576,281);
        vertical vertical = new vertical();
        addObject(vertical,523,184);
        vertical.setLocation(504,177);
        vertical.setLocation(502,161);
        GemaVerde gemaVerde = new GemaVerde();
        addObject(gemaVerde,564,224);
        GemaRoja gemaRoja3 = new GemaRoja();
        addObject(gemaRoja3,645,338);
        vertical vertical2 = new vertical();
        addObject(vertical2,686,432);
        vertical2.setLocation(700,463);
        horizontal horizontal2 = new horizontal();
        addObject(horizontal2,400,384);
        horizontal2.setLocation(520,417);
        horizontal horizontal3 = new horizontal();
        addObject(horizontal3,703,76);
        horizontal3.setLocation(673,156);
        horizontal3.setLocation(700,159);
        gemaRoja.setLocation(738,304);
        GemaAzul gemaAzul3 = new GemaAzul();
        addObject(gemaAzul3,772,108);
        vertical vertical3 = new vertical();
        addObject(vertical3,632,582);
        vertical3.setLocation(370,241);
        vertical3.setLocation(379,249);
        vertical vertical4 = new vertical();
        addObject(vertical4,198,188);
        vertical4.setLocation(255,196);
        vertical vertical5 = new vertical();
        addObject(vertical5,298,391);
        vertical5.setLocation(251,373);
        vertical5.setLocation(256,392);
        vertical vertical6 = new vertical();
        addObject(vertical6,117,192);
        vertical6.setLocation(13,104);
        vertical vertical7 = new vertical();
        addObject(vertical7,28,205);
        vertical7.setLocation(34,314);
        vertical7.setLocation(21,356);
        vertical7.setLocation(12,303);
        vertical vertical8 = new vertical();
        addObject(vertical8,32,415);
        vertical8.setLocation(24,499);
        vertical8.setLocation(10,506);
        vertical8.setLocation(13,500);
        horizontal horizontal4 = new horizontal();
        addObject(horizontal4,258,537);
        horizontal4.setLocation(142,582);
        horizontal4.setLocation(132,582);
        horizontal horizontal5 = new horizontal();
        addObject(horizontal5,268,577);
        horizontal5.setLocation(336,568);
        horizontal5.setLocation(332,586);
        horizontal horizontal6 = new horizontal();
        addObject(horizontal6,472,579);
        horizontal6.setLocation(527,584);
        horizontal horizontal7 = new horizontal();
        addObject(horizontal7,515,521);
        horizontal7.setLocation(517,528);
        horizontal7.setLocation(525,536);
        vertical2.setLocation(705,482);
        Pared pared9 = new Pared();
        addObject(pared9,185,119);
        pared9.setLocation(203,115);
        pared9.setLocation(207,122);
        Pared pared10 = new Pared();
        addObject(pared10,152,151);
        pared10.setLocation(155,112);
        pared10.setLocation(162,120);
        Fake fake = new Fake();
        addObject(fake,124,121);
        fake.setLocation(119,131);
        fake.setLocation(117,119);
        Fake fake2 = new Fake();
        addObject(fake2,143,107);
        fake.setLocation(66,136);
        fake2.setLocation(71,120);
        pared10.setLocation(157,144);
        Fake fake3 = new Fake();
        addObject(fake3,157,144);
        fake3.setLocation(42,127);
        fake3.setLocation(42,118);
        GemaAzul gemaAzul4 = new GemaAzul();
        addObject(gemaAzul4,141,51);
        GemaAzul gemaAzul5 = new GemaAzul();
        addObject(gemaAzul5,380,76);
        GemaAzul gemaAzul6 = new GemaAzul();
        addObject(gemaAzul6,524,369);
        GemaAzul gemaAzul7 = new GemaAzul();
        addObject(gemaAzul7,547,489);
        GemaRoja gemaRoja4 = new GemaRoja();
        addObject(gemaRoja4,775,397);
        GemaRoja gemaRoja5 = new GemaRoja();
        addObject(gemaRoja5,753,550);
        GemaRoja gemaRoja6 = new GemaRoja();
        addObject(gemaRoja6,675,96);
        Gato gato2 = new Gato();
        addObject(gato2,780,209);
        Gato gato3 = new Gato();
        addObject(gato3,477,360);
        fake2.setLocation(127,125);
        pared10.setLocation(165,127);
        fake2.setLocation(130,124);
        fake.setLocation(89,119);
        pared10.setLocation(159,116);
        pared10.setLocation(134,119);
        pared10.setLocation(171,120);
        Fake fake4 = new Fake();
        addObject(fake4,621,98);
        fake4.setLocation(637,119);
        fake4.setLocation(624,113);
        Fake fake5 = new Fake();
        addObject(fake5,646,75);
        fake5.setLocation(625,67);
        Fake fake6 = new Fake();
        addObject(fake6,618,28);
        fake6.setLocation(625,24);
        Hongo hongo2 = new Hongo();
        addObject(hongo2,766,28);
        Hongo hongo3 = new Hongo();
        addObject(hongo3,782,500);
        vertical2.setLocation(693,458);
        vertical2.setLocation(694,464);
        vertical2.setLocation(696,367);
        gemaRoja5.setLocation(776,584);
        Gato gato4 = new Gato();
        addObject(gato4,200,439);
        Gato gato5 = new Gato();
        addObject(gato5,95,524);
        Hongo hongo4 = new Hongo();
        addObject(hongo4,267,528);
        Pared pared11 = new Pared();
        addObject(pared11,137,426);
        pared11.setLocation(151,455);
        pared11.setLocation(138,447);
        gemaAzul2.setLocation(60,284);
        gemaAzul.setLocation(108,159);
        gemaRoja2.setLocation(197,204);
        GemaVerde gemaVerde2 = new GemaVerde();
        addObject(gemaVerde2,162,260);
        GemaVerde gemaVerde3 = new GemaVerde();
        addObject(gemaVerde3,67,435);
        pared6.setLocation(364,132);
        pared6.setLocation(376,133);
        fake2.setLocation(130,108);
        fake2.setLocation(130,119);
        pared9.setLocation(210,115);
        pared9.setLocation(210,121);
        pared6.setLocation(369,115);
        pared6.setLocation(381,132);
        pared6.setLocation(379,133);
        GemaRoja gemaRoja7 = new GemaRoja();
        addObject(gemaRoja7,258,77);
        GemaRoja gemaRoja8 = new GemaRoja();
        addObject(gemaRoja8,504,36);
        GemaRoja gemaRoja9 = new GemaRoja();
        addObject(gemaRoja9,376,371);
        GemaRoja gemaRoja10 = new GemaRoja();
        addObject(gemaRoja10,300,521);
        GemaAzul gemaAzul8 = new GemaAzul();
        addObject(gemaAzul8,435,249);
        GemaVerde gemaVerde4 = new GemaVerde();
        addObject(gemaVerde4,712,48);
        contador.setLocation(88,22);
        contador.setLocation(88,22);
        GemaVerde gemaVerde5 = new GemaVerde();
        addObject(gemaVerde5,316,252);
        GemaVerde gemaVerde6 = new GemaVerde();
        addObject(gemaVerde6,320,143);
        GemaVerde gemaVerde7 = new GemaVerde();
        addObject(gemaVerde7,316,375);
    }

}
