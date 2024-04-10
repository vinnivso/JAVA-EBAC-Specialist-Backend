# A importância dos 12 fatores para o contexto de Microserviços.

## Foram selecionados 3 dos 12, sendo:

- Base de Código Única (One Codebase):
  Mantenha uma única base de código versionada e mantenha-a em um sistema de controle de versão (como Git). A base de código deve conter o código fonte da aplicação e todas as suas dependências;
- Backing Services:
  Trate serviços de suporte (como bancos de dados, cache, filas) como recursos externos. Conecte-se a esses serviços por meio de URLs ou outros endereços fornecidos por variáveis de ambiente, permitindo substituição fácil e isolamento;
- Build, Release, Run:
  Separe explicitamente os processos de construção (build), lançamento (release) e execução (run) da aplicação. Mantenha a construção e o lançamento automatizados e independentes do ambiente de execução.

- Esses fatores são projetados para ajudar a criar aplicações resilientes, escaláveis, e fáceis de manter em ambientes modernos baseados em nuvem e arquiteturas de microserviços. Ao seguir essas práticas, os desenvolvedores podem aproveitar ao máximo os benefícios das arquiteturas distribuídas e escaláveis.