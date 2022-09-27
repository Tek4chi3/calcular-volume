package Revisão;

import java.util.Scanner;

public class EsferaExecutar {
    public static void main(String[] args) {
        Esfera esfera = new Esfera();
        Scanner raio_scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do raio: ");
        double raio = raio_scanner.nextDouble();
        esfera.sphereVolume(raio);
    }
}
