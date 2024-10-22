programa {
  funcao inicio() {
    inteiro hora

    escreva ("Que horas são?")
    leia (hora)

    se (hora == 6) {
      escreva ("Bom dia! É hora de levantar \n")
      escreva ("Lembre-se: \n")
        escreva("1. Desligar o despertador.\n")
        escreva("3. Esticar o corpo.\n")
        escreva("4. Levantar da cama.\n")
        escreva("5. Ir ao banheiro.\n")
        escreva("6. Escovar os dentes.\n")
        escreva("7. Tomar um banho.\n")
        escreva("8. Preparar o café da manhã.\n")
        escreva("9. Vestir-se para o dia.\n")
        escreva("10. Aproveitar o dia!\n")
    } senao {
      se (hora > 6) {
        escreva ("Você está atrasado(a)!")
      } senao { escreva ("Ainda é cedo, pode voltar a dormir!")}
    }
     
  }
}
