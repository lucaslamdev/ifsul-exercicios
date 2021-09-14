
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class TesteSeteHashSet {
       
    public static void exibirStr(HashSet<String> HashSetStr) {
     for (String nomeEmpresa : HashSetStr) {
           System.out.println("Nome empresa : " + nomeEmpresa);
        }
    }

    public static HashSet<String> entradaStr(HashSet<String> HashSetStr) {
        Scanner entrada = new Scanner(System.in);
        String auxiliar;

        System.out.println("Digite nome de 5 empresas de tecnologia!");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da empresa (" + (i + 1) + "): ");
            auxiliar = entrada.next();
            HashSetStr.add(auxiliar);
        }
        return HashSetStr;
    }

    public static void main(String[] args) {
        
        Set<String> strHashSet = new HashSet<String>();
        strHashSet.add("Microsoft");
        strHashSet.add("Facebook");
        strHashSet.add("Valve");
        strHashSet.add("Oracle");
        strHashSet.add("Canonical");
        strHashSet.add("Apple");
        strHashSet.add("Mojang");
        strHashSet.add("Riot Games");
        strHashSet.add("Tencent");
        strHashSet.add("AMD");
        strHashSet.add("NVIDIA");
        strHashSet.add("IBM");

        System.out.println("Atualmente temos estas empresas adicionada na lista: ");
        exibirStr((HashSet<String>) strHashSet);

        strHashSet = entradaStr((HashSet<String>) strHashSet);
        
        System.out.println("Mostrando todas empresas novamente com as adicionadas (mostrando a não ordenação)");
        exibirStr((HashSet<String>) strHashSet);

    }
}
