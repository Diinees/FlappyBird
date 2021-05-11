package com.mygdx.game.flappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class game extends ApplicationAdapter {

    private SpriteBatch batch;
    private Texture passaro;
    private Texture fundo;
    //definindo variavel para movimentacao//

    private int moveY = 0;
    private int moveX = 0;


    //variavel para cada dispositivo//
    private float larguraDispositivo;
    private float alturaDispositivo;

    @Override
    public void create() {

        //definindo as imagens com os assets definidos
        batch = new SpriteBatch();
        passaro = new Texture("passaro1.png");
        fundo = new Texture("fundo.png");

        //buscando o tamnho do dispositivo e inserindo nas variaveis//
        larguraDispositivo = Gdx.graphics.getWidth();
        alturaDispositivo = Gdx.graphics.getHeight();

    }

    @Override
    public void render() {

        batch.begin();
        //criando fundo. passando altura, largura e diametro para a imagem, incrmentando para adaptacao//
        batch.draw(fundo, 0, 0, larguraDispositivo, alturaDispositivo);
        batch.draw(passaro, 50, 50, moveX, moveY);
        moveX++;
        moveY++;

        batch.end();
    }

}
