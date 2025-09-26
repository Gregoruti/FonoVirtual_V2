# RULES_FILE.md

Este arquivo centraliza todas as regras, contextos e estruturas de documentação que devem ser seguidas pelos assistentes de IA e desenvolvedores que trabalham neste projeto.

## Regras Gerais

*   **Consistência:** Sempre consulte e atualize os arquivos auxiliares no diretório `/docs` para manter a consistência do projeto.
*   **Linguagem:** Todo o código e documentação devem ser escritos em Português do Brasil (PT-BR).

## Documentação

*   **Comentários:** Comente o código de forma clara e objetiva.
*   **KDocs:** Utilize KDocs para documentar todas as classes, funções públicas e seus parâmetros em código Kotlin.
*   **Atualização:** Qualquer alteração no código que impacte a estrutura, estado ou fluxo da aplicação deve ser refletida nos seguintes arquivos:
    *   `CONTEXT.md`: Para o estado geral do projeto.
    *   `PATHS_FILES.md`: Se novos diretórios ou arquivos forem criados/movidos.
    *   `PATHS_SCREENS.md`: Se novas telas ou fluxos de navegação forem criados/alterados.
    *   `VALIDATION_STATUS.md`: Para atualizar o status de validação do módulo modificado.
    *   `CHANGELOG.md`: Para registrar a alteração (se habilitado).

## Validação

*   **Testes Individuais:** Todos os módulos devem ser projetados para permitir testes individuais.
*   **Status:** Cada módulo ou tela deve ter seu status de validação documentado em `VALIDATION_STATUS.md` e, quando aplicável, no KDoc com a tag `@validationStatus [Validado | Em Teste | Falha | Pendente]`.

## Navegação e Estrutura

*   **Fluxo:** Preserve sempre o fluxo de navegação descrito em `PATHS_SCREENS.md`.
*   **Divergência:** Se for encontrada uma divergência entre o código e a documentação, alerte o usuário e sugira a correção.

## Tarefas da IA

*   **Implementação:** Implemente o código seguindo estritamente estas regras.
*   **Automação:** Atualize automaticamente a documentação relevante sempre que fizer alterações no código.
*   **Iniciativa:** Se a informação fornecida for insuficiente, proponha um rascunho ou uma solução inicial para aprovação antes de prosseguir.
