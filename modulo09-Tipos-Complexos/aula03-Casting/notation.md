# Casting

## Casting de Primitivos
  - Casting é um recurso, que possibilita mudar o valor de um tipo para o outro. As vezes isso é feito automático, que chamamos de casting IMPLÍCITO e também pode ser feito por você, chamando de casting EXPLÍCITO.

## Casting de Primitivos:
| Tipo  | Tamanho  |
|---|---|
| boolean  | 1 bit  |
| byte  | 8 bits  |
| char  | 16 bits  |
| short  | 16 bits  |
| int  | 32 bits  |
| long  | 32 bits  |
| float  | 64 bits  |
| double  | 64 bits  |

## Castign Explícito
  - int num = 10;
  - short num2 = num; (Erro de Compilação)

  - O erro acontece, porque o JAVA não permite que um tipo maior seja convertido para um tipo menor, no caso num(32 bits) e num2(16 bits), pois num foi declarado como int, enquanto num2 declarado como short. Ele realiza esse processo como uma medida de segurança, logo o casting implícito não é possível, sendo necessário estabelecer um casting explícito.

  - int num = 10;
  - short num2 = (short) num;

  - Nesse código foi realizado a conversão de um tipo maior para um tipo menor, porém você deve ter certeza do que está realizando.

## Observações sobre tipos primitivos
  > boolean - Não pode ser moldado para nenhum outro tipo;
  > char - Nenhum tipo pode ser moldado para char;
  > long - Semelhante ao int, mas com possibilidade de maiores números.

## Casting Implícito
  - byte b = 1;
  - short s = b;

  - Casting implícito, porque byte é menor que short.