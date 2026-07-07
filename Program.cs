
// Parte 1: Estrutura Sequencial
// Exercício 1.1
 
int codigo1 = 0;
int num_peca = 0;
double valor_peca = 0;

int codigo2 = 0;
int num_peca2 = 0;
double valor_peca2 = 0;

Console.WriteLine("Insira as seguintes informações: Código da peça, Número da peça e o valor dela");
codigo1 = int.Parse(Console.ReadLine());
num_peca = int.Parse(Console.ReadLine());
valor_peca = double.Parse(Console.ReadLine());

Console.WriteLine("Insira as seguintes informações: Código da peça 2, Número da peça 2 e o valor dela");
codigo2 = int.Parse(Console.ReadLine());
num_peca2 = int.Parse(Console.ReadLine());
valor_peca2 = double.Parse(Console.ReadLine());

double valor_total = (num_peca * valor_peca) + (num_peca2 * valor_peca2);

Console.WriteLine($"VALOR A PAGAR: R$ {valor_total:F2}");

// Exercício 1.2

double pi = 3.14159;
double raio = 0;
double area = 0;

Console.WriteLine("Insira o valor da área para o cálculo");
raio = double.Parse(Console.ReadLine());

area = pi * Math.Pow(raio, 2);

Console.WriteLine($"A={area:F4}");

// Parte 2: Estrutura Condicional
// Exercicio 2.1

int codigo = 0;
int qtd = 0;
double preco = 0;
double total = 0;

Console.WriteLine("Insira o código do produto");
codigo = int.Parse(Console.ReadLine());
Console.WriteLine("Insira a quantidade do produto");
qtd = int.Parse(Console.ReadLine());

if (codigo == 1)
{
    preco = 4.00;
    total = preco * qtd;
    Console.WriteLine($"Cachorro Quente - Total: R$ {total:F2}");

} else if (codigo == 2)
{
    preco = 4.50;
    total = preco * qtd;
    Console.WriteLine($"X-Salada - Total: R$ {total:F2}");
} else if (codigo == 3)
{
    preco = 5.00;
    total = preco * qtd;
    Console.WriteLine($"X-Bacon - Total: R$ {total:F2}");
} else if (codigo == 4)
{
    preco = 2.00;
    total = preco * qtd;
    Console.WriteLine($"Torrada Simples - Total: R$ {total:F2}");
} else if (codigo == 5)
{
    preco = 1.50;
    total = preco * qtd;
    Console.WriteLine($"Refrigerante - Total: R$ {total:F2}");
} else
{
    Console.WriteLine("Código não encontrado");
}

// Exercicio 2.2

double a = 0;
double b = 0;
double c = 0;

Console.WriteLine("Digite o valor do A");
a = double.Parse(Console.ReadLine());
Console.WriteLine("Digite o valor do B");
b = double.Parse(Console.ReadLine());
Console.WriteLine("Digite o valor do C");
c = double.Parse(Console.ReadLine());

double delta = Math.Pow(b, 2) - (4 * a * c);
double X1 = (-b + Math.Sqrt(delta)) / (2.0 * a);
double X2 = (-b - Math.Sqrt(delta)) / (2.0 * a);

if (a == 0 || delta <= 0)
{
    Console.WriteLine("Impossível calcular");   
} else
{
    Console.WriteLine($@"O resultado do cálculo foi:
X1= {X1:F5}
X2= {X2:F5}");

}

// Parte 3: Estruturas Repetitivas
// Exercício 3.1

int senha = 0;

while (true)
{
    Console.WriteLine("Digite a senha");
    senha = int.Parse(Console.ReadLine());

    if (senha == 2002)
    {
        break;
    }

    Console.WriteLine("Senha Inválida");
}

Console.WriteLine("Acesso permitido");

// Exercício 3.2

int N = 0;
int X = 0;
int In = 0;
int Out = 0;

Console.WriteLine("Valor N");
N = int.Parse(Console.ReadLine());

for (int i = 0; i < N; i++)
{
    X = int.Parse(Console.ReadLine());

    if (X >= 10 && X <= 20)
    {
        In++;
    } else
    {
        Out++;
    }
}

Console.WriteLine($"{In} in");
Console.WriteLine($"{Out} out");