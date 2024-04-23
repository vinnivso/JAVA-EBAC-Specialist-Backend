# CONSISTÊNCIA FORTE X CONSISTÊNCIA EVENTUAL
- A diferença entre consistência forte e eventual está relacionada à forma como os sistemas distribuídos lidam com a consistência dos dados entre diferentes nós ou componentes.

1. **Consistência Forte (Strong Consistency):**
   - Na consistência forte, todos os nós em um sistema distribuído concordam com o estado mais recente dos dados em todos os momentos.
   - Quando um dado é atualizado ou inserido em um nó, essa alteração é imediatamente refletida e visível para todos os outros nós.
   - Os sistemas que requerem consistência forte garantem que todos os usuários vejam os mesmos dados no mesmo estado, independentemente do nó ao qual se conectam.
   - Exemplo de aplicação: Um sistema de banco de dados transacional onde é fundamental que todas as transações sejam aplicadas e refletidas consistentemente em todos os locais. Aplicações financeiras, reservas de passagens aéreas e sistemas de inventário são exemplos de sistemas que geralmente precisam de consistência forte para garantir a integridade dos dados.

2. **Consistência Eventual (Eventual Consistency):**
   - Na consistência eventual, após uma atualização nos dados, a propagação dessas mudanças pode levar algum tempo para se propagar por todos os nós do sistema distribuído.
   - Os sistemas com consistência eventual aceitam que pode haver um período de tempo durante o qual diferentes nós podem ter versões ligeiramente diferentes dos dados.
   - Com o tempo, todos os nós eventualmente convergem para o mesmo estado de dados.
   - Exemplo de aplicação: Sistemas de cache distribuídos ou redes sociais onde uma pequena inconsistência temporária nos dados (como o número de curtidas em uma postagem) não é crítica e pode ser tolerada. Nesses casos, a latência é preferível à consistência imediata.

Em resumo, a escolha entre consistência forte e eventual depende das necessidades do sistema e das tolerâncias em relação à consistência dos dados versus a latência de atualização. Sistemas críticos, como sistemas bancários e de reservas, normalmente optam por consistência forte para garantir a integridade dos dados em tempo real, enquanto outros sistemas menos críticos podem se beneficiar de uma abordagem de consistência eventual para obter melhor desempenho e escalabilidade.