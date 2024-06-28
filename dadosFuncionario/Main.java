import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeFuncionario;
        String cargo;
        String localDeTrabalho;
        String registroDeferias;

        int diaAdmissao;
        int mesAdmissao;
        int anoAdmissao;
        int anoAtual = 2024;
        int hora;
        int minuto;

        double salario;


        System.out.print("informe Nome Do Funcionario:");
        nomeFuncionario = sc.nextLine();

        System.out.print("informe Cargo Do Funcionario:");
        cargo = sc.nextLine();

        System.out.print("informe local de trabalho:");
        localDeTrabalho = sc.nextLine();

        System.out.print("informa Hora de entrada:");
        hora = sc.nextInt();

        System.out.print("informa minuto de entrada:");
        minuto = sc.nextInt();

        System.out.print("informa o dia da admissao:");
        diaAdmissao = sc.nextInt();

        System.out.print("informa o mes da admissao:");
        mesAdmissao = sc.nextInt();

        System.out.print("informa o ano da admissao:");
        anoAdmissao = sc.nextInt();

        int calculo = anoAdmissao-anoAtual;

        if (calculo >= 12){
            registroDeferias = "Sim";
        }else {
            registroDeferias = "Não";
        }

        System.out.print("informa salario:");
        salario = sc.nextDouble();

        //System.out.println("informa status");// este comando e usado para valição logica
        //status = sc.nextBoolean();

        System.out.println();
        System.out.println("nome do funcionario e: " +nomeFuncionario);
        System.out.println("cargo e: " +cargo);
        System.out.println("local de trabalho e: " +localDeTrabalho);
        System.out.println("data de admissao e: " +diaAdmissao+"/"+mesAdmissao+"/"+anoAdmissao);
        System.out.println("horario de entrada e: " +hora+":"+minuto);
        System.out.println("salario e R$" +salario+ " de salario");
        System.out.println("O colocabora "+registroDeferias+" tem direito a ferias");








    }
}
