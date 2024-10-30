Ciclo de Vida de uma Activity no Android
Este projeto é uma aplicação simples em Android que explora o ciclo de vida de uma Activity usando mensagens de Logcat e Toast. O objetivo é demonstrar como o Android gerencia diferentes estados de uma Activity, como criação, parada e destruição, com base nas interações do usuário e mudanças de configuração.

Funcionalidades
Exibição de Logs e Toasts: Em cada método do ciclo de vida (onCreate, onStart, onResume, onPause, onStop, onDestroy, onRestart), a aplicação exibe uma mensagem de log no Logcat e uma mensagem Toast na tela.
Exploração do Ciclo de Vida: Observação do comportamento dos métodos do ciclo de vida durante ações como:
Abrir o aplicativo
Minimizar e restaurar o aplicativo
Mudar a orientação da tela
Fechar o aplicativo
Estrutura do Projeto
MainActivity.kt: O código principal da Activity, onde os métodos do ciclo de vida foram sobrescritos para registrar mensagens.
activity_main.xml: Um layout básico para a interface da Activity.
Código do Ciclo de Vida
Cada método do ciclo de vida foi sobrescrito para exibir mensagens usando Log.d e Toast. Exemplo de como está implementado:

https://github.com/JOSEEUSTAQUIOSILVERI0/app-lifecycle.git 

Como Testar
Abra o aplicativo: Ao iniciar o aplicativo, observe as mensagens onCreate, onStart, e onResume.
Minimize o aplicativo: Pressione o botão "Home" e observe as mensagens onPause e onStop.
Restaure o aplicativo: Abra o aplicativo a partir dos recentes, e observe onRestart, onStart, e onResume.
Feche o aplicativo: Pressione o botão "Voltar" para fechar o app, e observe onPause, onStop, e onDestroy.
Mude a orientação da tela: Gire o dispositivo para observar a recriação da Activity (onPause, onStop, onDestroy, onCreate, onStart, e onResume).
Executando o Projeto
Clone o repositório:

Abra o projeto no Android Studio.
Conecte um dispositivo ou use o emulador para rodar o aplicativo.
Abra o Logcat para ver as mensagens de log com a tag "CicloDeVida".
Tecnologias Utilizadas
Kotlin: Linguagem de programação usada para desenvolvimento do app.
Android Studio: IDE para desenvolvimento Android.
XML: Para definir o layout básico da interface.
![image](https://github.com/user-attachments/assets/b3c57730-5843-43ea-9eda-571af9032fcb)
