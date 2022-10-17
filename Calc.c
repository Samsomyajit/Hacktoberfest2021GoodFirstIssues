#include <stdio.h>

int main() {

  char operator;
  double firstone, secondone;
  printf("Enter an operator (+, -, *, /): ");
  scanf("%c", &operator);
  printf("Enter two operands: ");
  scanf("%lf %lf", &firstone, &secondone);

  switch (operator) {
    case '+':
      printf("%.1lf + %.1lf = %.1lf", firstone, secondone, firstone + secondone);
      break;
    case '-':
      printf("%.1lf - %.1lf = %.1lf", firstone, secondone, firstone - secondone);
      break;
    case '*':
      printf("%.1lf * %.1lf = %.1lf", firstone, secondone, firstone * secondone);
      break;
    case '/':
      printf("%.1lf / %.1lf = %.1lf", firstone, secondone, firstone / secondone);
      break;
    // operator doesn't match any case constant here !
    default:
      printf("Error! operator is not correct !");
  }

  return 0;
}
