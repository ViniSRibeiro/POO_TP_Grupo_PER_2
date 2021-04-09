import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Timer;

public class personagemJogador {
    private int idJogador;
    private int x,y;
    private int dx,dy;
    private String nome;

    private Image imagePlayer;
    private int larguraPlayer,alturaPlayer;
    private boolean isDormindo;
    private boolean isDefendendo;
    private Timer timer;

    //player
    public personagemJogador(){
        this.x = 5; //Tamanho do Player
        this.y = 10;
        isDormindo = false;
        isDefendendo = false;

    }

    //load
    public void carregaImagemPersonagem(){
        ImageIcon referencia = new ImageIcon();//TODO: Colocar link da imagem
        imagePlayer = referencia.getImage();

        alturaPlayer = imagePlayer.getHeight(null);
        larguraPlayer = imagePlayer.getWidth(null);
    }

    //update move o player nas coordenadas x e y
    public void mover(){
        x+=dx;
        y+=dy;
    }

    //K maiúsculo
    //Função responsavél por receber os comandos pelo teclado
    //Nessas funções estrou implementado o movimento para baixo,
    // no entanto, ele terá que ser setado como um método sempre
    //em execução para simular a gravida no jogo
    public void KeyPressed(KeyEvent tecla){
        int codigoTecla = tecla.getKeyCode();

        if(codigoTecla == KeyEvent.VK_UP) {
            this.dy = -3;
        }else if(codigoTecla == KeyEvent.VK_DOWN){
            this.dy = 3;
        }else if(codigoTecla == KeyEvent.VK_LEFT){
            this.dx = -3;
        }else if(codigoTecla == KeyEvent.VK_RIGHT){
            this.dx  = 3;
        }
    }

    //Para manter o player parado após clicar uma tecla
    //Ou seja, quando não tiver precionando ele não se moverá

    public void KeyRelease(KeyEvent tecla){
        int codigoTecla = tecla.getKeyCode();

        if(codigoTecla == KeyEvent.VK_UP){
            this.dy = 0;
        }else if(codigoTecla == KeyEvent.VK_DOWN){
            dy = 0;
        }else if(codigoTecla == KeyEvent.VK_LEFT){
            dx = 0;
        }else if(codigoTecla == KeyEvent.VK_RIGHT){
            dx = 0;
        }
    }

    public void defender(){
        isDefendendo = true;
        ImageIcon referencia = new ImageIcon();//TODO
    }


    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Image getImagePlayer() {
        return imagePlayer;
    }

    public void setImagePlayer(Image imagePlayer) {
        this.imagePlayer = imagePlayer;
    }

    public int getLargura() {
        return larguraPlayer;
    }

    public void setLargura(int largura) {
        this.larguraPlayer = largura;
    }

    public boolean isDormindo() {
        return isDormindo;
    }

    public void setDormindo(boolean dormindo) {
        isDormindo = dormindo;
    }

    public boolean isDefendendo() {
        return isDefendendo;
    }

    public void setDefendendo(boolean defendendo) {
        isDefendendo = defendendo;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

}
