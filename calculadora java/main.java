import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println(" Calculadora de fórmulas de Física ");
      System.out.println(" Fórmulas disponíveis:");
      System.out.println("1. Lei de Ohm\n");
      System.out.println("2. Campo elétrico\n");
      System.out.println("3. Carga elétrica \n");
      System.out.println("4. Potencial elétrico \n");
      System.out.println("5. Velocidade média\n");
      System.out.println("6. Aceleração média \n");
      System.out.println("7. Segunda Lei de Newnton \n");
      System.out.println("8. Densidade \n");
      System.out.println("9. Pressão  \n");
      System.out.println("10. Equação Fundamental da Calorimetria\n");
      System.out.println("11. Calor específico \n");
      System.out.println("12. Capacidade térmica \n");
      System.out.println("13. Mudança de estado \n");
      System.out.println("14. velocidade MUV \n");
      System.out.println("15. Trabalho\n");


      System.out.print("Digite o número referente a formula desejada : ");
      int formula = scanner.nextInt();


      switch (formula) {


        case 1:
       
        System.out.println("Lei de Ohm\n");
        System.out.println("fórmula: I = V / R \n");

        System.out.println("Digite o valor da tensão:");
        double tensao = scanner.nextDouble();
        System.out.println("Digite o valor da resistência:");
        double resistencia = scanner.nextDouble();

        if (resistencia == 0) {
            System.out.println("Erro: A resistência não pode ser zero.");
        } else {
            double ohm = tensao / resistencia;
            System.out.println("A corrente é: " + ohm );
        }

        break;
       
        case 2:
       
        System.out.println("Campo elétrico\n");
        System.out.println("fórmula: E = F / q\n");

        System.out.println("Digite a força eletrostática:");
        double forca = scanner.nextDouble();
        System.out.println("Digite a carga elétrica:");
        double carga = scanner.nextDouble();

        
        if (carga == 0) {
            System.out.println("Erro: A carga não pode ser zero.");
        } else {
            double campo = forca / carga;
            System.out.println("O resultado é: " + campo);
        }
       
        break;
       
        case 3:
       
          System.out.println("Carga elétrica: \n");
        System.out.println("fórmula: Q = n * e");

        System.out.println("Digite  o módulo da carga elétrica:");
        double modulo = scanner.nextDouble();
        System.out.println("Digite o número de elétrons:");
        double eletrons = scanner.nextDouble();

        if (modulo == 0) {
            System.out.println("Erro: O modulo não pode ser zero.");
        } else {
            double Q = modulo / eletrons;
            System.out.println("O resultado é: " + Q);
        }

        break;


        case 4:
       
        System.out.println("Potêncial elétrico\n");
        System.out.println("fórmula: V = K * (q / r) \n");

        System.out.println("Digite a constante:");
        double constante = scanner.nextDouble();
        System.out.println("Digite  a carga:");
        double c = scanner.nextDouble();

        System.out.println("Digite  distãncia da separação:");
        double separação = scanner.nextDouble();

        if (constante == 0) {
            System.out.println("Erro: A constante não pode ser zero.");
        } else {
            double potencial = constante *( c / separacao );
            System.out.println("O resultado é :" + potencial);
        }

        break;


        case 5:
       
        System.out.println("Velocidade média\n");
        System.out.println("fórmula: V = Δs / Δt \n");

        System.out.println("Digite a distância percorrida:");
        double distancia = scanner.nextDouble();
        System.out.println("Digite o tempo gasto:");
        double tempo = scanner.nextDouble();

        if (distancia == 0) {
            System.out.println("Erro: A distância não pode ser zero.");
        } else {
            double velocidade = distancia / tempo;

        System.out.println("O resultado é :" + velocidade);
        }

        break;


        case 6:

        System.out.println("Aceleração média\n");
        System.out.println("fórmula: a = Δv / Δt \n");

        System.out.println("Digite a velocidade:");
        double v = scanner.nextDouble();
        System.out.println("Digite o tempo gasto:");
        double t = scanner.nextDouble();

        if (velocidade == 0) {
            System.out.println("Erro: A velocidade não pode ser zero.");
        } else {
            double aceleracao = v / t;

        System.out.println("O resultado é :" + aceleracao);
        }

        break;


        case 7:
       
        System.out.println("Segunda Lei de Newton\n");
        System.out.println("fórmula: F = m * a \n");

        System.out.println("Digite a massa:");
        double massa = scanner.nextDouble();
        System.out.println("Digite a aceleração:");
        double a1 = scanner.nextDouble();

        if (massa == 0) {
            System.out.println("Erro: A massa não pode ser zero.");
        } else {
            double newton = massa *  a1;

        System.out.println("O resultado é :" + newton);
       
        }

        break;


        case 8:

        System.out.println("Densidade\n");
        System.out.println("fórmula: p = m * v \n");

        System.out.println("Digite a massa:");
        double m = scanner.nextDouble();
        System.out.println("Digite a aceleração:");
        double v1 = scanner.nextDouble();

        if (m == 0) {
            System.out.println("Erro: A massa não pode ser zero.");
        } else {
            double densidade = m *  v1;

            System.out.println("O resultado é :" + densidade);
       
        }
       
        break;


        case 9:
       
        System.out.println("Pressão\n");
        System.out.println("fórmula: p = f * a \n");

        System.out.println("Digite a força:");
        double f = scanner.nextDouble();
        System.out.println("Digite a área:");
        double area = scanner.nextDouble();

        if (forca == 0) {
            System.out.println("Erro: A força não pode ser zero.");
        } else {
            double pressao = f *  area;

        System.out.println("O resultado é :" + pressao);
       
        }

        break;


        case 10:
       
        System.out.println("Equação Fundamental da Calorimetria\n");
        System.out.println("fórmula: Q = m * c * ΔT \n");

        System.out.println("Digite a massa:");
        double m1 = scanner.nextDouble();
        System.out.println("Digite a variação de temperatura:");
        double calor = scanner.nextDouble();

        if (m1 == 0) {
            System.out.println("Erro: A massa não pode ser zero.");
        } else {
            double calorimetria = m1 *  calor * temperatura ;

        System.out.println("O resultado é :" + calorimetria);
       
        }

        break;


        case 11:
       
        System.out.println("Calor específico\n");
        System.out.println("fórmula: c = C / m \n");

        System.out.println("Digite a capacidade térmica:");
        double ct = scanner.nextDouble();
        System.out.println("Digite a massa:");
        double massa1 = scanner.nextDouble();

        if (massa1 == 0) {
            System.out.println("Erro: A massa não pode ser zero.");
        } else {
            double especifico = ct *  massa1;

        System.out.println("O resultado é :" + especifico);
       
        }

        break;


        case 12:
       
        System.out.println("Capacidade térmica\n");
        System.out.println("fórmula: C = ΔQ / ΔT  \n");

        System.out.println("Digite a quantidade de calor:");
        double q = scanner.nextDouble();
        System.out.println("Digite a variação de temperatura:");
        double vt = scanner.nextDouble();

        if (q == 0) {
            System.out.println("Erro: A quantidade de calor  não pode ser zero.");
        } else {
            double termica = q *  vt;

        System.out.println("O resultado é :" + termica);

        }
       
        break;


        case 13:
       
        System.out.println("Mudança de estado  \n");
        System.out.println("fórmula: ΔQ = m * L, \n");

        System.out.println("Digite a massa:");
        double massal = scanner.nextDouble();
        System.out.println("Digite o calor latente:");
        double l = scanner.nextDouble();

        if (massal == 0) {
            System.out.println("Erro: A massa não pode ser zero.");
        } else {
            double latente = massal *  l;

        System.out.println("O resultado é :" + latente);
       
        }

        break;


        case 14:
       
        System.out.println("Velocidade MUV\n");
        System.out.println("fórmula: v(t) = v₀ + a * t\n");

        System.out.println("Digite a velocidade inicial:");
        double vi = scanner.nextDouble();
        System.out.println("Digite a aceleração :");
        double ac  = scanner.nextDouble();

        System.out.println("Digite o tempo :");
        double t1  = scanner.nextDouble();

        if (ac == 0) {
            System.out.println("Erro: A aceleração não pode ser zero.");
        } else {
            double velocidademuv = vi + (ac * t1) ;

        System.out.println("O resultado é :" + velocidademuv);
       
        }
       
        break;


        case 15:
       
        System.out.println("Trabalho\n");
        System.out.println("fórmula: W = F* d * cos(θ)\n");

        System.out.println("Digite a força:");
        double f1 = scanner.nextDouble();
        System.out.println("Digite o deslocamento :");
        double deslocamento  = scanner.nextDouble();

        System.out.println("Digite o cos :");
        double cos  = scanner.nextDouble();

        if (f1 == 0) {
            System.out.println("Erro: A força não pode ser zero.");
        } else {
            double trabalho = f1 *  deslocamento * cos ;

            System.out.println("O resultado é :" + trabalho);
        }

        break;
       
        default:

        System.out.println("Nenhuma fórmula foi selecionada");
  
       
    }
    }
  }
