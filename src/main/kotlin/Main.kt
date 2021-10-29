fun main(args: Array<String>) {
    val listaConvidados = mutableListOf<String>()
    var resposta: String
    var convidado = ""

        while(true){
            print("Digite o que você quer fazer na sua lista de convidados: ")
            resposta = readLine()!!

            when(resposta){

                "Adicionar" -> {

                    print("Adicione um convidado à lista: ")
                    convidado = readLine()!!
                    listaConvidados.add(convidado)

                }
                "Remover" -> {

                    print("Remova um convidado da lista: ")
                    convidado = readLine()!!
                    listaConvidados.remove(convidado)

                }
                "Mostrar" -> {

                    println("Sua lista é: $listaConvidados")

                }

                else -> break

            }

        }









    }

