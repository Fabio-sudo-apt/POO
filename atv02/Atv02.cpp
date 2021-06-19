#include <iostream>

using namespace std;

int main()
{
    int A, B, C, D, E, F, G, H, I, J, K, L, ano, mes, dia;

    cout << "Digite o Ano: ";
    cin >> ano;

    A = ano % 19;
    B = ano / 100;
    C = ano % 100;
    D = B / 4;
    E = B % 4;
    F = (B + 8) / 25;
    G = (B - F + 1) / 3;
    H = (19 * A + B - D - G + 15) % 30;
    I = C / 4;
    J = C % 4;
    K = (35 + 2 * E + 2 * I  - H - J) % 7;
    L = (A + 11 * H + 22 * K) / 451;
    mes = (H + K - 7 * L + 114) / 31;
    dia = ((H + K - 7 * L + 114) % 31) + 1;

    cout << " Dia: " << dia << " Mes: " << mes << " Ano: " << ano;
}