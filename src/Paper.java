//8 kyu
//Série Iniciante #1 Papelada Escolar

//Seus colegas pediram que você copiasse alguma papelada para eles. Você sabe que há 'n' colegas de classe e a papelada tem 'm' páginas.
//
//Sua tarefa é calcular quantas páginas em branco você precisa. Se n < 0 ou m < 0 retorno 0.
//
//Exemplo:
//n= 5, m=5: 25
//n=-5, m=5:  0

public class Paper
{
    public static int paperWork(int n, int m)
    {
        if (n < 0 || m < 0){
        return 0;
    }else{
            return n * m;
    }

    }
}